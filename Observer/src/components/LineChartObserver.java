package components;

import templates.Observer;

public class LineChartObserver extends Observer {

	@Override
	public void update(String value) {
		System.out.println("Updating line chart; received value \"" + value + "\"");
	}
	
}
