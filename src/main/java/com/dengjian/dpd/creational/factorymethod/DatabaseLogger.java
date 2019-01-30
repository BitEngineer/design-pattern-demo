package com.dengjian.dpd.creational.factorymethod;

public class DatabaseLogger implements Logger{

	@Override
	public void info() {
		System.out.println("database logger write info log");
	}

}
