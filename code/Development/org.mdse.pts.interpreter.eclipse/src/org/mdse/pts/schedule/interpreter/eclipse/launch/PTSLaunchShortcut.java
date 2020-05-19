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
import org.mdse.pts.schedule.interpreter.ScheduleInterpreter;
import org.mdse.pts.schedule.interpreter.eclipse.PTSEclipseUtil;

public class PTSLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		//Load model
		IFile fsmFile = PTSEclipseUtil.getFirstIFileFromSelectionWithExtension("fsm", selection);
//		FSMModel fsmModel = (FSMModel) FSMEclipseUtil.loadModel(fsmFile);

//		interpretFSMModel(fsmModel);
	}
	
	@Override
	public void launch(IEditorPart editor, String mode) {
		EObject model = getModelFromEditor(editor);
		
//		if (model instanceof FSMModel) {
//			FSMModel fsmModel = (FSMModel) model;
//			interpretFSMModel(fsmModel);
//			return;
//		}
		
		String title = "Error";
		String message = "The file cannot be interpreted as an FSM model.";
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
		
		//TODO: Sirius Editor
		
		return null;
	}
	
	protected void interpretFSMModel() {
		//Ask for input
		String interpreterInput = askForInterpreterInput();
		
		if (interpreterInput != null) {
			//Interpret FSM
//			interpretFSMModel(fsmModel, interpreterInput);
		}
	}
	
	protected String askForInterpreterInput() {
		InputDialog inputDialog = new InputDialog(null, "FSM Interpreter Input", "Please provide input for the FSM interpreter", null, null);
		
		int returnCode = inputDialog.open();
		
		if (returnCode == InputDialog.OK) {
			return inputDialog.getValue();
		}
		
		return null;
	}

	protected void interpretFSMModel(Object model, String interpreterInput) {
		ScheduleInterpreter interpreter = new ScheduleInterpreter();
		
		try {
			//Reroute output to console of runtime instance
			MessageConsole console = PTSEclipseUtil.findOrCreateConsole("FSM Interpreter");
			console.clearConsole();
			console.activate();
			OutputStream consoleOutputStream = console.newOutputStream();
			
//			interpreter.interpret(model, interpreterInput, consoleOutputStream);
		} catch(Exception e) {
			String title = "Error";
			String message = e.getMessage();
			MessageDialog.openError(null, title, message);
		}
	}
	
}
