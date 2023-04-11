package node;

import visitor.NodeVisitor;

public abstract class Node {

	public abstract void accept(NodeVisitor v);
	
}
