package parseTree.nodeTypes;

import parseTree.ParseNode;
import parseTree.ParseNodeVisitor;
import lexicalAnalyzer.Keyword;
import tokens.LextantToken;
import tokens.Token;

public class BooleanConstantNode extends ParseNode {
	public BooleanConstantNode(Token token) {
		super(token);
		assert(token.isLextant(Keyword.TRUE, Keyword.FALSE));
	}
	
	public BooleanConstantNode(ParseNode node) {
		super(node);
	}

	////////////////////////////////////////////////////////////
	// ATTRIBUTES
	////////////////////////////////////////////////////////////
	
	public boolean getValue() {
		return token.isLextant(Keyword.TRUE);
	}

	public LextantToken lextantToken() {
		return (LextantToken)token;
	}	

	////////////////////////////////////////////////////////////
	// ACCEPT A VISITOR
	////////////////////////////////////////////////////////////
	
	public void accept(ParseNodeVisitor visitor) {
		visitor.visit(this);
	}
}
