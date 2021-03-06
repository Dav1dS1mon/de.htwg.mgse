/*
 * generated by Xtext 2.11.0
 */
package org.xtext.mgse.serializer;

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
import org.xtext.mgse.services.SetGrammarAccess;
import org.xtext.mgse.set.FORMS;
import org.xtext.mgse.set.PACK;
import org.xtext.mgse.set.PACKTYPE;
import org.xtext.mgse.set.SetPackage;
import org.xtext.mgse.set.URL;

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
			case SetPackage.FORMS:
				sequence_FORMS(context, (FORMS) semanticObject); 
				return; 
			case SetPackage.PACK:
				sequence_PACK(context, (PACK) semanticObject); 
				return; 
			case SetPackage.PACKTYPE:
				sequence_PACKTYPE(context, (PACKTYPE) semanticObject); 
				return; 
			case SetPackage.URL:
				sequence_URL(context, (URL) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     FORMS returns FORMS
	 *
	 * Constraint:
	 *     (name='FORM' type=TYPE_FORMS)
	 */
	protected void sequence_FORMS(ISerializationContext context, FORMS semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetPackage.Literals.FORMS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetPackage.Literals.FORMS__NAME));
			if (transientValues.isValueTransient(semanticObject, SetPackage.Literals.FORMS__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetPackage.Literals.FORMS__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFORMSAccess().getNameFORMKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFORMSAccess().getTypeTYPE_FORMSEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PACKTYPE returns PACKTYPE
	 *
	 * Constraint:
	 *     (forms=FORMS url=URL)
	 */
	protected void sequence_PACKTYPE(ISerializationContext context, PACKTYPE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetPackage.Literals.PACKTYPE__FORMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetPackage.Literals.PACKTYPE__FORMS));
			if (transientValues.isValueTransient(semanticObject, SetPackage.Literals.PACKTYPE__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetPackage.Literals.PACKTYPE__URL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPACKTYPEAccess().getFormsFORMSParserRuleCall_0_0(), semanticObject.getForms());
		feeder.accept(grammarAccess.getPACKTYPEAccess().getUrlURLParserRuleCall_1_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PACK returns PACK
	 *
	 * Constraint:
	 *     (name=ID type=PACKTYPE)
	 */
	protected void sequence_PACK(ISerializationContext context, PACK semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetPackage.Literals.PACK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetPackage.Literals.PACK__NAME));
			if (transientValues.isValueTransient(semanticObject, SetPackage.Literals.PACK__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetPackage.Literals.PACK__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPACKAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPACKAccess().getTypePACKTYPEParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     URL returns URL
	 *
	 * Constraint:
	 *     (name='URL' type=URL_TYPES)
	 */
	protected void sequence_URL(ISerializationContext context, URL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SetPackage.Literals.URL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetPackage.Literals.URL__NAME));
			if (transientValues.isValueTransient(semanticObject, SetPackage.Literals.URL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SetPackage.Literals.URL__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getURLAccess().getNameURLKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getURLAccess().getTypeURL_TYPESEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
}
