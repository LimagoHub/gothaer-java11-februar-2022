package de.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.http.HttpRequest;
import java.util.List;
import java.util.Map;

import de.dependency.Dependency;
import de.tiere.Schwein;
import de.translator.Translator;

public class Main {

	public static void main(String[] args) throws Exception{
		Dependency dependency = Dependency.create();
		dependency.foo();
		
		
		Translator translator =Translator.create("lower").get();
		System.out.println(translator.translate("Hallo Welt"));
		
		
		
		var clazz = Class.forName("de.tiere.Schwein");
		var constructor = clazz.getConstructor(String.class, int.class);
		Object object = constructor.newInstance("Piggy",10);
		System.out.println(object);
		
		Method m = clazz.getMethod("fressen");
		m.invoke(object);
		System.out.println(object);
		
		var alle = clazz.getDeclaredMethods();
		for (var method : alle) {
			System.out.println(method.getName());
		}
		
		m = clazz.getDeclaredMethod("setGewicht", int.class);
		m.setAccessible(true);
		m.invoke(object, -10);
		System.out.println(object);
		
		HttpRequest h;
	}

}
