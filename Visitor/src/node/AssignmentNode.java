package node;

import visitor.NodeVisitor;

public class AssignmentNode extends Node {

	private String leftHandVarType;
	private String rightHandExprType;


	public String getLeftHandVarType() {
		return leftHandVarType;
	}

	public void setLeftHandVarType(String leftHandVarType) {
		this.leftHandVarType = leftHandVarType;
	}

	public String getRightHandExprType() {
		return rightHandExprType;
	}

	public void setRightHandExprType(String rightHandExprType) {
		this.rightHandExprType = rightHandExprType;
	}

	@Override
	public void accept(NodeVisitor v) {
		v.visitAssignment(this);
	}

}
