package com.dengjian.dpd.creational.factorymethod;

public class Test {

	public static void main(String[] args) {
		LoggerFactory fileLoggerFactory = new FileLoggerFactory();
		Logger fileLogger = fileLoggerFactory.getLogger();
		fileLogger.info();
		
		DatabaseLoggerFactory databaseLoggerFactory = new DatabaseLoggerFactory();
		Logger databaseLogger = databaseLoggerFactory.getLogger();
		databaseLogger.info();
	}
}
