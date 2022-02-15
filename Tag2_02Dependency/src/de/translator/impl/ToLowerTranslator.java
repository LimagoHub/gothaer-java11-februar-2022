package de.translator.impl;

import de.translator.Translator;

public class ToLowerTranslator implements Translator {

	@Override
	public String translate(String message) {
		// TODO Auto-generated method stub
		return message.toLowerCase();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "lower";
	}

}
