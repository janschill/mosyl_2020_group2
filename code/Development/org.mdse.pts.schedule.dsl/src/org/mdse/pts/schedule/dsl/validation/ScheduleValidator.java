/*
 * generated by Xtext 2.20.0
 */
package org.mdse.pts.schedule.dsl.validation;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import org.mdse.pts.schedule.Date;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.SchedulePackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class ScheduleValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		//Install validator
		EValidator.Registry.INSTANCE.put(SchedulePackage.eINSTANCE, new ScheduleValidator());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}
	
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		this.diagnostics = diagnostics;
		
		if(SchedulePackage.eINSTANCE.getSchedule().equals(eClass)) {
			Date date = (Date) eObject;
			modelIsValid &= validateDate(date);
		}
		
		return modelIsValid;
	}
	
	protected boolean validateDate(Date date) {
		boolean modelIsValid = true;
		
		modelIsValid &= validateTime(date);
		
		return modelIsValid;
	}
	
	protected boolean validateTime(Date date) {
		boolean constraintViolated = false;
		
		if(date.getHour()<0 && date.getHour()>23 && date.getMinute()<0 && date.getMinute()>59) { 
		constraintViolated = true;
		}
		
		if(constraintViolated) {
			return constraintViolated(date, date.getDay()+" has inappropriate time. (Hours should be 00-23 and minutes 00-59");
		}
	
		return true;
	}
	
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		
		diagnostics.add(diagnostic);
		return false;
	}
}
