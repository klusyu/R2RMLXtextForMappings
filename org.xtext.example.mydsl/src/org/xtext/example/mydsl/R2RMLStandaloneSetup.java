/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class R2RMLStandaloneSetup extends R2RMLStandaloneSetupGenerated {

	public static void doSetup() {
		new R2RMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}