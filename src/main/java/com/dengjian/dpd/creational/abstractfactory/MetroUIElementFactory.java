package com.dengjian.dpd.creational.abstractfactory;

public class MetroUIElementFactory implements UIElementFactory {

	@Override
	public Button getButton() {
		return new MetroButton();
	}

	@Override
	public TextField getTextField() {
		return new MetroTextField();
	}

}
