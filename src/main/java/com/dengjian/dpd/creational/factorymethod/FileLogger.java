package com.dengjian.dpd.creational.factorymethod;

public class FileLogger implements Logger{

	@Override
	public void info() {
		System.out.println("file logger write info log");
	}

}
