package node;

import visitor.NodeVisitor;

public class VariableRefNode extends Node {

	private String varName;
	
	public String getVarName() {
		return varName;
	}

	public void setVarName(String varName) {
		this.varName = varName;
	}

	@Override
	public void accept(NodeVisitor v) {
		v.visitVariableRef(this);
	}

}
