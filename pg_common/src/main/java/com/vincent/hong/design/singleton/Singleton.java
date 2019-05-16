package com.vincent.hong.design.singleton;

/**
 * 饿汉模式
 * 说明: 天生的线程安全. 但对象被创建则一直在内存中.适用情况: 作为公共组件,长期被持续调用.
 * @author Administrator
 *
 */
public class Singleton {
	private static final Singleton INSTANCE = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

}

/**
 * 懒汉模式
 * 说明: 延迟加载, 在需要用到的时候创建对象,且可被回收.适用场景: 作为公用组件,偶尔调用的情况. 持续调用则和饿汉模式性能差不多
 * @author Administrator
 *
 */
class LazySingleton {

	private static LazySingleton singleton = null;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (singleton == null) {
			synchronized (LazySingleton.class) {
				if (singleton == null) {
					singleton = new LazySingleton();
				}
			}
		}
		return singleton;

	}

}