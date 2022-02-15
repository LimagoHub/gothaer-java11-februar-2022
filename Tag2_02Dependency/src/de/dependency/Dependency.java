package de.dependency;

import java.util.ServiceLoader;

public interface Dependency {
	
	void foo();
	void bar();

	static Dependency create() {
		ServiceLoader<Dependency> serviceLoader = ServiceLoader.load(Dependency.class);
		return  serviceLoader.findFirst().get();
	}
}
