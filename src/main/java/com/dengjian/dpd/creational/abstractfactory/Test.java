package com.dengjian.dpd.creational.abstractfactory;

public class Test {

	public static void main(String[] args) {
		UIElementFactory elementFactory = new MetroUIElementFactory();
		Button button = elementFactory.getButton();
		button.display();
	}
}
