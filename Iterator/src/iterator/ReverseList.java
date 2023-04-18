package iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ReverseList extends AbstractList {

	private ArrayList<Object> list = new ArrayList<>();

	@Override
	public Iterator<Object> iterator() {
		return new ReverseIterator(this);
	}

	@Override
	public void append(Object o) {
		list.add(o);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public Object get(int i) {
		return list.get(i);
	}
	
	
	
}
