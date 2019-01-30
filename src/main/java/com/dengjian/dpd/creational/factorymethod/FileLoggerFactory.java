package com.dengjian.dpd.creational.factorymethod;

public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger getLogger() {
		return new FileLogger();
	}

}
