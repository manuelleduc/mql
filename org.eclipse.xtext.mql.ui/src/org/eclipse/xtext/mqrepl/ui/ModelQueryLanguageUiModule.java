/*
 * generated by Xtext
 */
package org.eclipse.xtext.mqrepl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ModelQueryLanguageUiModule extends org.eclipse.xtext.mqrepl.ui.AbstractModelQueryLanguageUiModule {
	public ModelQueryLanguageUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
		public java.lang.ClassLoader bindClassLoaderToInstance() {
			return getClass().getClassLoader();
		}

		// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
		public org.eclipse.xtext.common.types.TypesFactory bindTypesFactoryToInstance() {
			return org.eclipse.xtext.common.types.TypesFactory.eINSTANCE;
		}

		// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
		public Class<? extends org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory> bindIJvmTypeProvider$Factory() {
			return org.eclipse.xtext.common.types.access.ClasspathTypeProviderFactory.class;
		}

		// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
		public Class<? extends org.eclipse.xtext.common.types.xtext.AbstractTypeScopeProvider> bindAbstractTypeScopeProvider() {
			return org.eclipse.xtext.common.types.xtext.ClasspathBasedTypeScopeProvider.class;
		}

		// contributed by org.eclipse.xtext.generator.types.TypesGeneratorFragment
		public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
			return org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider.class;
		}
	
}