package org.mdse.pts.schedule.interpreter.eclipse.launch;

import java.io.OutputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.MessageConsole;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.interpreter.ScheduleInterpreter;
import org.mdse.pts.schedule.interpreter.eclipse.PTSEclipseUtil;

public class PTSLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		//Load model
		IFile scheduelFile = PTSEclipseUtil.getFirstIFileFromSelectionWithExtension("schedule", selection);
		Schedule scheduleModel = (Schedule) PTSEclipseUtil.loadModel(scheduelFile);

		interpretScheduleModel(scheduleModel);
	}
	
	@Override
	public void launch(IEditorPart editor, String mode) {
		EObject model = getModelFromEditor(editor);
		
		if (model instanceof Schedule) {
			Schedule scheduleModel = (Schedule) model;
			interpretScheduleModel(scheduleModel);
			return;
		}
		
		String title = "Error";
		String message = "The file cannot be interpreted as a Schedule model.";
		MessageDialog.openError(null, title, message);
	}
	
	protected EObject getModelFromEditor(IEditorPart editor) {
		//The generated Ecore editor implements this interface.
		if (editor instanceof IEditingDomainProvider) {
			IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) editor;
			EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
			
			//This is how the generated Ecore editor accesses the resource internally.
			//Still seems brittle esp. when there is another model in the editing domain.
			Resource resource = editingDomain.getResourceSet().getResources().get(0);
			EObject model = resource.getContents().get(0);
			
			return model;
		}
		
		return null;
	}
	
	protected void interpretScheduleModel(Schedule scheduleModel) {
		//Ask for input
		String interpreterInputPath = askForInterpreterPath();
		
		if (interpreterInputPath != null) {
			//Interpret FSM
			interpretScheduleModel(scheduleModel, interpreterInputPath);
		}
	}
	
	protected String askForInterpreterPath() {
		InputDialog inputDialog = new InputDialog(null, "Schedule Interpreter Input", "Please provide the path to your Schedule path", null, null);
		
		int returnCode = inputDialog.open();
		
		if (returnCode == InputDialog.OK) {
			return inputDialog.getValue();
		}
		
		return null;
	}

	protected void interpretScheduleModel(Schedule scheduleModel, String interpreterInput) {
		ScheduleInterpreter interpreter = new ScheduleInterpreter();
		
		try {
			//Reroute output to console of runtime instance
			MessageConsole console = PTSEclipseUtil.findOrCreateConsole("FSM Interpreter");
			console.clearConsole();
			console.activate();
//			TODO: Simulate train
//			TODO: Create new timetable model
			OutputStream consoleOutputStream = console.newOutputStream();
			
//			interpreter.interpret(model, interpreterInput, consoleOutputStream);
		} catch(Exception e) {
			String title = "Error";
			String message = e.getMessage();
			MessageDialog.openError(null, title, message);
		}
	}
	
}
