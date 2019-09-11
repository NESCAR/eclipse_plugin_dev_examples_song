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
	 * ���������һ����̬�ֶΣ������������Ψһ��ʵ�����������ʶ
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
	 * �������ʱ����start
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * ж�ز��ʱ����stop
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * ��øò��ʵ��
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 * ��ò����ͼ��������������ݴ˱�ʶ������ʹ��ͼ����Դ�������ڱ���ַ���
	 * ��ʹ�ô˲����iconsĿ¼�µ�sample.gifͼ��
	 * eg. AbstractUIPlugin.getImageDescriptor(icon.sample.gif).createImage();
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
