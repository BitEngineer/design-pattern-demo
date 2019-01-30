package com.dengjian.dpd.creational.abstractfactory;

public class IviewUIElementFactory implements UIElementFactory {

	@Override
	public Button getButton() {
		return new IviewButton();
	}

	@Override
	public TextField getTextField() {
		return new IviewTextField();
	}

}
