package com.dengjian.dpd.creational.singleton;

/**
 * 任务管理器-单例实现
 * @author 邓键
 *
 */
public class TaskManager {
	private static TaskManager taskManager = null;

	private TaskManager() {}
	
	public static TaskManager getInstance() {
		if(taskManager != null) {
			return taskManager;
		}
		return new TaskManager();
	}
	
	public void displayProcess() {
		System.out.println("some processes");
	}
	
	public void displayService() {
		System.out.println("some services");
	}
	
}
