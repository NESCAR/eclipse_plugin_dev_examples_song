package com.nescar.examples.helloworld.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

public class SampleHandler extends AbstractHandler {

	/**
	 * һ��ͨ��windows shell���titleΪHelloworld����ϢΪHello World, I am NESCAR!�Ĵ���
	 * @author Neyzoter Song
	 * @date 2019/9/11
	 * @return null
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Helloworld",
				"Hello World, I am NESCAR!");
		return null;
	}
}
