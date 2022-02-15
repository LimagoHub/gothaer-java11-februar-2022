package de.dependency.impl;

import de.dependency.Dependency;

public class DependencyImpl implements Dependency {

	@Override
	public void foo() {
		System.out.println("Hier ist Foo");

	}

	@Override
	public void bar() {
		System.out.println("Hier ist Bar");

	}

}
