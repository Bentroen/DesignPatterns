package visitor;

import node.AssignmentNode;
import node.VariableRefNode;

public class CompilationVisitor extends NodeVisitor {

	@Override
	public void visitAssignment(AssignmentNode n) {
		System.out.println("Compiled assigment: " + n.getLeftHandVarType() + " = " + n.getRightHandExprType());
	}

	@Override
	public void visitVariableRef(VariableRefNode n) {
		System.out.println("Compiled reference: " + n.getVarName());
	}

}
