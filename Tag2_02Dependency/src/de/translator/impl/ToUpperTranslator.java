package de.translator.impl;

import de.translator.Translator;

public class ToUpperTranslator implements Translator{

	@Override
	public String translate(String message) {
		
		return message.toUpperCase();
	}
	@Override
	public String getType() {
		
		return "upper";
	}
}
