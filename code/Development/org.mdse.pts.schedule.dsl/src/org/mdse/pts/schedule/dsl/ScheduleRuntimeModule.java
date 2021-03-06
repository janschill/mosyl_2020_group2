/*
 * generated by Xtext 2.20.0
 */
package org.mdse.pts.schedule.dsl;

import org.eclipse.xtext.linking.ILinkingService;
import org.mdse.pts.schedule.dsl.linking.ScheduleLinkingService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ScheduleRuntimeModule extends AbstractScheduleRuntimeModule {
	@Override
	public Class<? extends ILinkingService> bindILinkingService() {
		return ScheduleLinkingService.class;
	}
}
