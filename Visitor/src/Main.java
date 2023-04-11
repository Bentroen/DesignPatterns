import node.AssignmentNode;
import node.VariableRefNode;
import visitor.CompilationVisitor;
import visitor.NodeVisitor;
import visitor.TypeCheckingVisitor;

public class Main {

	public static void main(String[] args) {
		
		AssignmentNode n1 = new AssignmentNode();
		n1.setLeftHandVarType("String");
		n1.setRightHandExprType("String");
		
		VariableRefNode n2 = new VariableRefNode();
		n2.setVarName("myVar");
		
		NodeVisitor v1 = new TypeCheckingVisitor();
		NodeVisitor v2 = new CompilationVisitor();
		
		// Run type-checking
		n1.accept(v1);
		n2.accept(v1);
		
		// Run code generation
		n1.accept(v2);
		n2.accept(v2);
		
	}
	
}
