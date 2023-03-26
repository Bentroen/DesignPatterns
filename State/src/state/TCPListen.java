package state;

public class TCPListen extends TCPState {

	@Override
	public void open() {
		System.out.println("Connection open");	
	}

	@Override
	public void close() {
		System.out.println("Connection closed");
	}

	@Override
	public void acknowledge() {
		System.out.println("ACK");
	}

}
