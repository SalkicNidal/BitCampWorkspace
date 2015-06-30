package ba.bitcamp.listeners.exercise;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task5 extends JFrame {

	private int x;
	private int y;
	private int size = 50;
	JPanel panel = new myPanel();

	public Task5() {

		add(panel);
		addKeyListener(new MyKey());
		requestFocus();
		setSize(700, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private class myPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);

			g.drawRect(x, y, size, size);

		}

	}

	private class MyKey extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {

				x = x - 5;

				if (x < 0) {
					x = 0;

				}
			}

			else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				x = x + 5;
				if (x + size > panel.getWidth()) {
					x = panel.getWidth() - size;
				}

			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				y = y - 5;
				if (y < 0) {
					y = 0;
				}

			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

				y = y + 5;

				if (y + size > panel.getHeight()) {
					y = panel.getHeight() - size;
				}

			}
			repaint();

		}

	}

	public static void main(String[] args) {
		new Task5();

	}

}
