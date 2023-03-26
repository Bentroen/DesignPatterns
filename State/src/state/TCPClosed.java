package state;

public class TCPClosed extends TCPState {

	@Override
	public void open() {
		System.out.println("Cannot open already closed connection");	
	}

	@Override
	public void close() {
		System.out.println("Cannot close already closed connection");
	}

	@Override
	public void acknowledge() {
		System.out.println("Cannot acknowlegde already closed connection");
	}

}
