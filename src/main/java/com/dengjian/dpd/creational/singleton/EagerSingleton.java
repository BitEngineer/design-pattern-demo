package com.dengjian.dpd.creational.singleton;

/**
 * 单例模式：饿汉模式
 * 类加载时，单例对象被创建
 * 优点：在多线程下，也能保证对象唯一
 * 缺点：如果单例对象是耗费大量系统资源的对象，那么在对象不会被使用时，就耗费了资源；
 * 这对于系统必须的对象来说无所谓，但是如果是系统可选功能的对象，就浪费了系统资源
 * @author Administrator
 *
 */
public class EagerSingleton {
	
	private static final EagerSingleton singleton = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public EagerSingleton getInstance() {
		return singleton;
	}

}
