/*
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.de.htwg.parser.antlr.internal.InternalSetParser;
import org.xtext.de.htwg.services.SetGrammarAccess;

public class SetParser extends AbstractAntlrParser {

	@Inject
	private SetGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSetParser createParser(XtextTokenStream stream) {
		return new InternalSetParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "PACK";
	}

	public SetGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SetGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
