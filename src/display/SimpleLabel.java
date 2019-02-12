package display;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class SimpleLabel extends JLabel {
	private int x;
	private int y;
	private int width;
	private int height;

	public SimpleLabel(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setBorder(Color c, int size) {
		Border labelBorder = new LineBorder(c, size);
		this.setBorder(labelBorder);
	}

	public void setText(String s, Color c, String font, int size, int horizontal) {
		switch (horizontal) {
		case 1:
			this.setHorizontalAlignment(SwingConstants.LEFT);
			break;
		case 2:
			this.setHorizontalAlignment(SwingConstants.CENTER);
			break;
		case 3:
			this.setHorizontalAlignment(SwingConstants.RIGHT);
			break;
		default:
			break;
		}
		this.setFont(new Font(font, Font.BOLD, size));
		this.setText(s);
		this.setForeground(c);
		this.setBounds(x, y, width, height);
		this.setVisible(true);
	}
}
