/*
 * generated by Xtext unknown
 */
package org.xtext.example.mydsl.formatting2

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.myDsl.Model
import org.xtext.example.mydsl.myDsl.Network

class MyDslFormatter extends AbstractFormatter2 {

	def dispatch void format(Model model, extension IFormattableDocument document) {
        model.getNetwork.format
	}

}