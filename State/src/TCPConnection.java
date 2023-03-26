import state.TCPListen;
import state.TCPState;

public class TCPConnection {

	private TCPState state = new TCPListen();
	
	public TCPState getState() {
		return state;
	}

	public void setState(TCPState state) {
		this.state = state;
	}

	public void open() {
		state.open();
	}
	
	public void close() {
		state.close();
	}
	
	public void acknowledge() {
		state.acknowledge();
	}
	
}
