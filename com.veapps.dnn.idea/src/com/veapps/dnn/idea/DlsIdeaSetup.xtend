/*
 * generated by Xtext 2.10.0
 */
package com.veapps.dnn.idea

import org.eclipse.xtext.ISetup
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries

class DlsIdeaSetup implements ISetup {

	override createInjectorAndDoEMFRegistration() {
		EcoreGlobalRegistries.ensureInitialized
		new DlsStandaloneSetupIdea().createInjector
	}

}