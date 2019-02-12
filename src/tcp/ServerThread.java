package tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread {
	private Server server = null;
	private Socket socket = null;
	private DataInputStream streamIn = null;
	private DataOutputStream streamOut = null;

	public ServerThread(Server _server, Socket _socket) {
		super();
		server = _server;
		socket = _socket;
	}

	@SuppressWarnings("deprecation")
	public void run() {
		System.out.println("Server Thread running.");
		while (true) {
			try {
				server.handle(streamIn.readUTF());
			} catch (IOException ioe) {
				System.out.println("ERROR reading: " + ioe.getMessage());
				interrupt();
				stop();
			}
		}
	}

	public void open() throws IOException {
		streamIn = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		streamOut = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
	}

	public void close() throws IOException {
		if (socket != null)
			socket.close();
		if (streamIn != null)
			streamIn.close();
		if (streamOut != null)
			streamOut.close();
	}
}