/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalR2RMLParser;
import org.xtext.example.mydsl.services.R2RMLGrammarAccess;

public class R2RMLParser extends AbstractAntlrParser {

	@Inject
	private R2RMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalR2RMLParser createParser(XtextTokenStream stream) {
		return new InternalR2RMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Mapping";
	}

	public R2RMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(R2RMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
