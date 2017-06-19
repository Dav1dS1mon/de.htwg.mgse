/*
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.de.htwg.services.SetGrammarAccess;
import org.xtext.de.htwg.set.PACK;
import org.xtext.de.htwg.set.PACKTYPE;
import org.xtext.de.htwg.set.SetPackage;

@SuppressWarnings("all")
public class SetSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SetGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SetPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SetPackage.PACK:
				sequence_PACK(context, (PACK) semanticObject); 
				return; 
			case SetPackage.PACKTYPE:
				sequence_PACKTYPE(context, (PACKTYPE) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     PACKTYPE returns PACKTYPE
	 *
	 * Constraint:
	 *     (forms=FORMS | url=URL)+
	 */
	protected void sequence_PACKTYPE(ISerializationContext context, PACKTYPE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PACK returns PACK
	 *
	 * Constraint:
	 *     pack=PACKTYPE
	 */
	protected void sequence_PACK(ISerializationContext context, PACK semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetPackage.Literals.PACK__PACK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetPackage.Literals.PACK__PACK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPACKAccess().getPackPACKTYPEParserRuleCall_0(), semanticObject.getPack());
		feeder.finish();
	}
	
	
}
