module tag2_02Dependency {
	exports de.dependency;
	exports de.translator;
	exports de.tiere;
	
	opens de.tiere;
	
	provides de.dependency.Dependency with de.dependency.impl.DependencyImpl;
	uses de.dependency.Dependency;
	
	
	provides de.translator.Translator with de.translator.impl.ToUpperTranslator, de.translator.impl.ToLowerTranslator;
	uses de.translator.Translator;
}