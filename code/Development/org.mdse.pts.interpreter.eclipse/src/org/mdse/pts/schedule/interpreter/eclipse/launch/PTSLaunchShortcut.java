package org.mdse.pts.schedule.interpreter.eclipse.launch;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.MessageConsole;
import org.mdse.pts.common.util.EclipseUtil;
import org.mdse.pts.common.util.EcoreIOUtil;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.interpreter.ScheduleInterpreter;
import org.mdse.pts.schedule.interpreter.eclipse.PTSEclipseUtil;
import org.mdse.pts.timetable.Timetable;

public class PTSLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		IFile scheduleFile = PTSEclipseUtil.getFirstIFileFromSelectionWithExtension("schedule", selection);
		EObject eObject = PTSEclipseUtil.loadModel(scheduleFile);
		ResourceSet rs = EcoreIOUtil.getDefaultResourceSet(eObject);
		IProject project = EclipseUtil.resolveProjectFromResource(rs.getResources().get(0));
		Schedule scheduleModel = (Schedule) eObject;
		Collection<Timetable> timetables = interpretScheduleModel(scheduleModel);

		for (Timetable timetable : timetables) {
			IFile file = project.getFile(removeWhitespace(timetable.getStationName()) + ".timetable");
			EcoreIOUtil.saveModelAs(scheduleModel, file);
		}
	}

	private static String removeWhitespace(String stringValue) {
		return stringValue.replace(' ', '-').toLowerCase();
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		EObject eObject = getModelFromEditor(editor);
		ResourceSet rs = EcoreIOUtil.getDefaultResourceSet(eObject);
		IProject project = EclipseUtil.resolveProjectFromResource(rs.getResources().get(0));

		if (eObject instanceof Schedule) {
			Schedule scheduleModel = (Schedule) eObject;
			Collection<Timetable> timetables = interpretScheduleModel(scheduleModel);
			for (Timetable timetable : timetables) {
				IFile file = project.getFile(removeWhitespace(timetable.getStationName()) + ".timetable");
				EcoreIOUtil.saveModelAs(scheduleModel, file);
			}

			return;
		}

		String title = "Error";
		String message = "The file cannot be interpreted as a Schedule model.";
		MessageDialog.openError(null, title, message);
	}

	protected EObject getModelFromEditor(IEditorPart editor) {
		if (editor instanceof IEditingDomainProvider) {
			IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider) editor;
			EditingDomain editingDomain = editingDomainProvider.getEditingDomain();

			Resource resource = editingDomain.getResourceSet().getResources().get(0);
			EObject model = resource.getContents().get(0);

			return model;
		}

		return null;
	}
//	
//	protected void interpretScheduleModel(Schedule scheduleModel) {
//		String interpreterInputPath = askForInterpreterPath();
//		
//		if (interpreterInputPath != null) {
//			interpretScheduleModel(scheduleModel, interpreterInputPath);
//		}
//	}

	protected String askForInterpreterPath() {
		InputDialog inputDialog = new InputDialog(null, "Schedule Interpreter Input",
				"Please provide the path to your Schedule path", null, null);

		int returnCode = inputDialog.open();

		if (returnCode == InputDialog.OK) {
			return inputDialog.getValue();
		}

		return null;
	}

	protected Collection<Timetable> interpretScheduleModel(Schedule scheduleModel) {
		ScheduleInterpreter interpreter = new ScheduleInterpreter();

		MessageConsole console = PTSEclipseUtil.findOrCreateConsole("Schedule Interpreter");
		console.clearConsole();
		console.activate();
		Collection<Timetable> timetables = interpreter.interpret(scheduleModel);

		return timetables;

	}

}
