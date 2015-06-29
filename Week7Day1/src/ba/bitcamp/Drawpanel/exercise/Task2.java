package ba.bitcamp.Drawpanel.exercise;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task2 extends JFrame {

	private boolean isDraw = false;

	/**
	 * 
	 */
	private static final long serialVersionUID = 5816284894210856081L;
	JPanel panel = new myPanel();

	public Task2() {

		setLayout(new BorderLayout());
		add(panel);
		panel.addMouseListener(new Mouse());

		setSize(700, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private class myPanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = -2365592662838380736L;

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub

			if (isDraw == true) {
				
				super.paintComponent(g);
				Graphics2D g2D = (Graphics2D) g;

				g2D.setStroke(new BasicStroke(10));
				g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);
				g2D.drawLine(0, 0, getWidth(), getHeight());
				g2D.drawLine(0, getHeight(), getWidth(), 0);
			}
		}
	}

	public class Mouse implements MouseListener {


		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			isDraw = true;
			repaint();

		}

		@Override
		public void mouseExited(MouseEvent e) {
			isDraw = false;
			repaint();

		}

	}

	public static void main(String[] args) {

		new Task2();

	}

}
