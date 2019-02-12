package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import display.SimpleWindow;
import misc.Constants;

public class Server implements Runnable {
	private ServerSocket server = null;
	private Thread thread = null;
	private SimpleWindow sw;

	public Server(SimpleWindow _sw) {
		this.sw = _sw;
		try {
			System.out.println("Binding to port " + Constants.get_serverPort() + ", please wait  ...");
			server = new ServerSocket(Constants.get_serverPort());
			System.out.println("Server started: " + server);
			start();
		} catch (IOException ioe) {
			System.out.println("Can not bind to port " + Constants.get_serverPort() + ": " + ioe.getMessage());
		}
	}

	public void run() {
		while (thread != null) {
			try {
				//System.out.println("Waiting for a client ...");
				addThread(server.accept());
			} catch (IOException ioe) {
				System.out.println("Server accept error: " + ioe);
				stop();
			}
		}
	}

	public void start() {
		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}
	}

	@SuppressWarnings("deprecation")
	public void stop() {
		if (thread != null) {
			thread.stop();
			thread = null;
		}
	}

	@SuppressWarnings("static-access")
	public synchronized void handle(String input) {
		System.out.println(input);
		sw.panel.parseInfo(input);
	}

	private void addThread(Socket socket) {
		System.out.println("Client accepted: " + socket);
		ServerThread temp = new ServerThread(this, socket);
		try {
			temp.open();
			temp.start();
		} catch (IOException ioe) {
			System.out.println("Error opening thread: " + ioe);
		}
	}
}
