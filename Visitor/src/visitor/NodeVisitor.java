package visitor;

import node.AssignmentNode;
import node.VariableRefNode;

public abstract class NodeVisitor {
	
	public abstract void visitAssignment(AssignmentNode n);
	public abstract void visitVariableRef(VariableRefNode n); 
	
}
