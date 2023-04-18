package iterator;
import java.util.Iterator;

public class ReverseIterator implements Iterator<Object> {

	private ReverseList list;
	private int currentPos;
	
	public ReverseIterator(ReverseList list) {
		this.list = list;
		this.currentPos = list.size();
	}
	
	@Override
	public boolean hasNext() {
		return currentPos > 0;
	}

	@Override
	public Object next() {
		return list.get(--currentPos);
	}

}
