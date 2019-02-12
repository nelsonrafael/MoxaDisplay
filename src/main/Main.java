package main;

import display.SimpleWindow;
import tcp.Server;

public class Main {
	
	private Thread thread1;
	private Thread thread2;
	
	public Main() {
		SimpleWindow sw = new SimpleWindow();	
		thread1 = new Thread(sw);
		
		thread2 = new Thread() {
			public void run() {
				new Server(sw);
			}
		};

		thread1.start();
		thread2.start();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
