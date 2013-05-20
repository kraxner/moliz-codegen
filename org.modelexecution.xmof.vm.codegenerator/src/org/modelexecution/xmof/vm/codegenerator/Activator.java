package org.modelexecution.xmof.vm.codegenerator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {

	private static BundleContext context;
	public static Activator instance;

	private ServiceTracker<Object, Object> logServiceTracker;
	private LogService logService;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		Activator.instance = this;
		logServiceTracker = new ServiceTracker<>(context,
				LogService.class.getName(), null);
		logServiceTracker.open();
		logService = (LogService) logServiceTracker.getService();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		logServiceTracker.close();
		logServiceTracker = null;
	}

	public LogService getLog() {
		return logService;
	}
}
