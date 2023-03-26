import components.BarChartObserver;
import components.LineChartObserver;
import components.TableViewSubject;
import templates.Observer;

public class Main {
	
	public static void main(String[] args) {
		
		TableViewSubject s = new TableViewSubject();
		
		Observer o1 = new BarChartObserver();
		Observer o2 = new LineChartObserver();
		s.attach(o1);
		s.attach(o2);
		
		s.setValue("Hello world");
		s.setValue("New state");
		
	}

}
