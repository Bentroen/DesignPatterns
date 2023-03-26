package state;

public class TCPEstablished extends TCPState {

	@Override
	public void open() {
		System.out.println("Cannot open already established connection");	
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
