package com.dengjian.dpd.creational.factorymethod;

public class DatabaseLoggerFactory implements LoggerFactory{

	@Override
	public Logger getLogger() {
		return new DatabaseLogger();
	}

}
