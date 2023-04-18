package iterator;
public abstract class AbstractList implements Iterable<Object> {

	public abstract void append(Object o);
	
	public abstract int size();
	
	public abstract Object get(int i);
	
}
