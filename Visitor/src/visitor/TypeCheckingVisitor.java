package visitor;

import node.AssignmentNode;
import node.VariableRefNode;

public class TypeCheckingVisitor extends NodeVisitor {

	@Override
	public void visitAssignment(AssignmentNode n) {
		if (n.getLeftHandVarType().equals(n.getRightHandExprType())) {
			System.out.println("Types match (" + n.getLeftHandVarType() + " and " + n.getRightHandExprType() + ")");
		} else {
			System.out.println("Types do not match (" + n.getLeftHandVarType() + " and " + n.getRightHandExprType() + ")");
		}		
	}

	@Override
	public void visitVariableRef(VariableRefNode n) {
		System.out.println("Type-checking not available for variable reference " + n.getVarName());
		// No-op
	}

}
