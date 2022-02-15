package de.translator;

import java.util.Optional;
import java.util.ServiceLoader;

import de.dependency.Dependency;

public interface Translator {
	
	String getType();
	String translate(String message);
	
	static Optional<Translator> create(final String type) {
		ServiceLoader<Translator> serviceLoader = ServiceLoader.load(Translator.class);
		return serviceLoader.stream().map(p->p.get()).filter(f->f.getType().equals(type)).findFirst();
	}

}
