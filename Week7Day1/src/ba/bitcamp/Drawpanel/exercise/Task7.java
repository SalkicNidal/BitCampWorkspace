package ba.bitcamp.Drawpanel.exercise;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task7 extends JFrame {

	private int[] values = { 100, 20, 1, 40, 50, 60, 70, 80, 90, 85 };

	JPanel panel = new myPanel();

	public Task7() {

		add(panel);

		setSize(700, 500);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class myPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			Graphics2D g2D = (Graphics2D) g;

			g2D.setStroke(new BasicStroke(10));
			g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			int tmp = 25;
			for (int i = 0; i < values.length; i++) {

				g2D.fillRect(tmp, 200 - values[i], 25, values[i]);
				tmp += 26;
			}

		}

	}

	public static void main(String[] args) {
		new Task7();
	}

}
