/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.R2RMLGrammarAccess;

@SuppressWarnings("all")
public class R2RMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected R2RMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Class_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_Column_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_Constant_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_Datatype_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_LogicalTable_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_ObjectMap_SemicolonKeyword_9_q;
	protected AbstractElementAlias match_PredicateObjectMap_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_Predicate_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_SubjectMap_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_Template_SemicolonKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (R2RMLGrammarAccess) access;
		match_Class_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getClassAccess().getSemicolonKeyword_3());
		match_Column_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getColumnAccess().getSemicolonKeyword_3());
		match_Constant_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getConstantAccess().getSemicolonKeyword_3());
		match_Datatype_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getDatatypeAccess().getSemicolonKeyword_3());
		match_LogicalTable_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getLogicalTableAccess().getSemicolonKeyword_5());
		match_ObjectMap_SemicolonKeyword_9_q = new TokenAlias(false, true, grammarAccess.getObjectMapAccess().getSemicolonKeyword_9());
		match_PredicateObjectMap_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getPredicateObjectMapAccess().getSemicolonKeyword_6());
		match_Predicate_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getPredicateAccess().getSemicolonKeyword_3());
		match_SubjectMap_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getSubjectMapAccess().getSemicolonKeyword_6());
		match_Template_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getTemplateAccess().getSemicolonKeyword_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getPrefixNameRule())
			return getPrefixNameToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * PrefixName returns ecore::EString:
	 * 	ID? ':'
	 * ;
	 */
	protected String getPrefixNameToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Class_SemicolonKeyword_3_q.equals(syntax))
				emit_Class_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Column_SemicolonKeyword_3_q.equals(syntax))
				emit_Column_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Constant_SemicolonKeyword_3_q.equals(syntax))
				emit_Constant_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Datatype_SemicolonKeyword_3_q.equals(syntax))
				emit_Datatype_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LogicalTable_SemicolonKeyword_5_q.equals(syntax))
				emit_LogicalTable_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectMap_SemicolonKeyword_9_q.equals(syntax))
				emit_ObjectMap_SemicolonKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PredicateObjectMap_SemicolonKeyword_6_q.equals(syntax))
				emit_PredicateObjectMap_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Predicate_SemicolonKeyword_3_q.equals(syntax))
				emit_Predicate_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SubjectMap_SemicolonKeyword_6_q.equals(syntax))
				emit_SubjectMap_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Template_SemicolonKeyword_3_q.equals(syntax))
				emit_Template_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     className=Qname (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Class_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QuotedString (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Column_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     constName=iResource (ambiguity) (rule end)
	 *     constStr=QuotedString (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Constant_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     dtName=Qname (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Datatype_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     query=SimpleSelectStatement ']' (ambiguity) (rule end)
	 *     tableName=STRING ']' (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_LogicalTable_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) PrefixName 'objectMap' '[' ']' (ambiguity) (rule start)
	 *     column=Column ']' (ambiguity) (rule end)
	 *     constant=Constant ']' (ambiguity) (rule end)
	 *     datatype=Datatype ']' (ambiguity) (rule end)
	 *     template=Template ']' (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_ObjectMap_SemicolonKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     objectMap=ObjectMap ']' (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_PredicateObjectMap_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     predicateName=Qname (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Predicate_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     class=Class ']' (ambiguity) (rule end)
	 *     template=Template ']' (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_SubjectMap_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QuotedString (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_Template_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
