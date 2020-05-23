package org.mdse.pts.schedule.dsl.linking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.mdse.pts.common.util.EcoreIOUtil;
import org.mdse.pts.network.Network;
import org.mdse.pts.schedule.SchedulePackage;

public class ScheduleLinkingService extends DefaultLinkingService {

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node) throws IllegalNodeException {
		//Resolves network references
		if (reference.equals(SchedulePackage.eINSTANCE.getNetworkReference_Network())) {
			final String crossRefNode = getCrossRefNodeAsString(node).replaceAll("\"", "");
			
			Network network = loadModelFromSameFolder(context, crossRefNode + ".network");
			
			if (network != null) {
				return Collections.singletonList(network);
			}
		} 
		
		//Resolves depot references
		if (reference.equals(SchedulePackage.eINSTANCE.getDepotReference_Depot())) {
			final String crossRefNode = getCrossRefNodeAsString(node).replaceAll("\"", "");
			
			List<EObject> depots = new ArrayList<EObject>();
			depots.add(loadModelFromSameFolder(context, crossRefNode + ".depot"));
			
			if (!depots.isEmpty()) {
				return depots;
			}
		}
		
		//Resolves train references
//				if (reference.equals(SchedulePackage.eINSTANCE.getTrainReference_Train())) {
//					final String crossRefNode = getCrossRefNodeAsString(node).replaceAll("\"", "");
//					
//					List<EObject> trains = new ArrayList<EObject>();
//					trains.add();
//					
//					if (!trains.isEmpty()) {
//						return trains;
//					}
//				}
		
		//Default
		return super.getLinkedObjects(context, reference, node);
	}
	
	
	protected <T> T loadModelFromSameFolder(EObject modelElement, String fileName) {
		IFile originalFile = EcoreIOUtil.resolveRelativeFileFromEObject(modelElement);
		IFile accompanyingFile = getFileInSameFolder(originalFile, fileName);
		
		if (accompanyingFile == null || !accompanyingFile.exists()) {
			return null;
		}
		
		return EcoreIOUtil.loadModel(accompanyingFile);
	}
	
	protected IFile getFileInSameFolder(IFile originalFile, String filename) {
		IContainer parent = originalFile.getParent();
		IPath path = new Path(filename);
		return parent.getFile(path);
	}
}
