package components;

import templates.Observer;

public class BarChartObserver extends Observer {

	@Override
	public void update(String value) {
		System.out.println("Updating bar chart; received value \"" + value + "\"");
	}
	
}
