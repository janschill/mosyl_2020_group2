package org.mdse.pts.schedule.dsl.linking;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.mdse.pts.schedule.SchedulePackage;

public class ScheduleLinkingService extends DefaultLinkingService {

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node) throws IllegalNodeException {
		//TODO Implement custom linking service if needed.
		//if(reference == SchedulePackage.eINSTANCE.getSchedule_WithDepot()) {
		
		//}
		
		return super.getLinkedObjects(context, reference, node);
	}
	
}
