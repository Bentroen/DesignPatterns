import iterator.AbstractList;
import iterator.ReverseList;

public class Main {

	public static void main(String[] args) {
		AbstractList list = new ReverseList();
		list.append(100);
		list.append(200);
		list.append(300);
		list.append("A");
		list.append("B");
		list.append("C");
		list.append("D");
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
	}
	
}
