package display;

import java.awt.Dimension;
import javax.swing.JFrame;

public class SimpleWindow implements Runnable {

	private static JFrame frame;
	public SimplePanel panel;

	public SimpleWindow() {
		frame = new JFrame("MoxaDisplay");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(800, 600));
		panel = new SimplePanel();
		frame.getContentPane().add(panel);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setLocation(0, 0);
		frame.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
