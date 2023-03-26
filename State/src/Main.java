import state.TCPClosed;
import state.TCPEstablished;

public class Main {

	public static void main(String[] args) {
		TCPConnection tc = new TCPConnection();
		tc.open();
		tc.setState(new TCPEstablished());
		tc.open();
		tc.acknowledge();
		tc.close();
		tc.setState(new TCPClosed());
		tc.acknowledge();
	}

}
