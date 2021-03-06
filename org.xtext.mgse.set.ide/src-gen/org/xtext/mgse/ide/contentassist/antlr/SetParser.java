/*
 * generated by Xtext 2.11.0
 */
package org.xtext.mgse.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.mgse.ide.contentassist.antlr.internal.InternalSetParser;
import org.xtext.mgse.services.SetGrammarAccess;

public class SetParser extends AbstractContentAssistParser {

	@Inject
	private SetGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSetParser createParser() {
		InternalSetParser result = new InternalSetParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTYPE_FORMSAccess().getAlternatives(), "rule__TYPE_FORMS__Alternatives");
					put(grammarAccess.getURL_TYPESAccess().getAlternatives(), "rule__URL_TYPES__Alternatives");
					put(grammarAccess.getPACKAccess().getGroup(), "rule__PACK__Group__0");
					put(grammarAccess.getPACKTYPEAccess().getGroup(), "rule__PACKTYPE__Group__0");
					put(grammarAccess.getFORMSAccess().getGroup(), "rule__FORMS__Group__0");
					put(grammarAccess.getURLAccess().getGroup(), "rule__URL__Group__0");
					put(grammarAccess.getPACKAccess().getNameAssignment_1(), "rule__PACK__NameAssignment_1");
					put(grammarAccess.getPACKAccess().getTypeAssignment_3(), "rule__PACK__TypeAssignment_3");
					put(grammarAccess.getPACKTYPEAccess().getFormsAssignment_0(), "rule__PACKTYPE__FormsAssignment_0");
					put(grammarAccess.getPACKTYPEAccess().getUrlAssignment_1(), "rule__PACKTYPE__UrlAssignment_1");
					put(grammarAccess.getFORMSAccess().getNameAssignment_0(), "rule__FORMS__NameAssignment_0");
					put(grammarAccess.getFORMSAccess().getTypeAssignment_2(), "rule__FORMS__TypeAssignment_2");
					put(grammarAccess.getURLAccess().getNameAssignment_0(), "rule__URL__NameAssignment_0");
					put(grammarAccess.getURLAccess().getTypeAssignment_2(), "rule__URL__TypeAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SetGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SetGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
