package com.nescar.examples.helloworld;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * @author Neyzoter Song
 * @date 2019/9/11
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	/**
	 * 插件类声明一个静态字段，用于引用这个唯一的实例——插件标识
	 */
	public static final String PLUGIN_ID = "com.nescar.examples.helloworld"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/**
	 * 启动插件时调用start
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * 卸载插件时调用stop
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 获得该插件实例
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 * 获得插件中图像的描述符，依据此标识符可以使用图像资源，例如在本地址插件
	 * 中使用此插件中icons目录下的sample.gif图标
	 * eg. AbstractUIPlugin.getImageDescriptor(icon.sample.gif).createImage();
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
