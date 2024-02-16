package com.service;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * The activator class controls the plug-in life cycle
 */
public class ServiceActivator extends AbstractUIPlugin {

	ServiceRegistration serviceRegistration;
	

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Publisher Start");
		ServicePublish servicePublish=new ServicePublishImpl();
		
		
		serviceRegistration=context.registerService(ServicePublish.class.getName(), servicePublish, null);
		
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Publisher Stop");
		
		serviceRegistration.unregister();
		
	}

	

}
