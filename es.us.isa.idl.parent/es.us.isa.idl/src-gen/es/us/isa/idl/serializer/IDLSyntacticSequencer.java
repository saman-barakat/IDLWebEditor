/*
 * generated by Xtext 2.25.0
 */
package es.us.isa.idl.serializer;

import com.google.inject.Inject;
import es.us.isa.idl.services.IDLGrammarAccess;
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

@SuppressWarnings("all")
public class IDLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected IDLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Dependency_NLTerminalRuleCall_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (IDLGrammarAccess) access;
		match_Dependency_NLTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getDependencyAccess().getNLTerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getNLRule())
			return getNLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal NL:
	 * 	('\r'? '\n')+
	 * ;
	 */
	protected String getNLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Dependency_NLTerminalRuleCall_2_q.equals(syntax))
				emit_Dependency_NLTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     NL?
	 *
	 * This ambiguous syntax occurs at:
	 *     dep=ArithmeticDependency ';' (ambiguity) (rule end)
	 *     dep=ConditionalDependency ';' (ambiguity) (rule end)
	 *     dep=PredefinedDependency ';' (ambiguity) (rule end)
	 *     dep=RelationalDependency ';' (ambiguity) (rule end)
	 */
	protected void emit_Dependency_NLTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}