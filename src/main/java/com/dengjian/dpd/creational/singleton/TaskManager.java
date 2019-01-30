package com.dengjian.dpd.creational.singleton;

/**
 * 任务管理器-单例实现
 * 懒汉模式：单例对象的生成在第一次调用时
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
		// 通常单例模式的对象初始化需要进行大量初始化工作，在多线程场景下可能会生成多个对象
		return new TaskManager();
	}
	
	public void displayProcess() {
		System.out.println("some processes");
	}
	
	public void displayService() {
		System.out.println("some services");
	}
	
}
