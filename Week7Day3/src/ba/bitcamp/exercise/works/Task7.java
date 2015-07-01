package ba.bitcamp.exercise.works;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task7 extends JFrame {

	int x ;
	int y ;
	int r = 0;

	JPanel panel = new myPanel();
	JSlider size = new JSlider(0, 5000, 0);

	public Task7() {

		setLayout(new BorderLayout());
		panel.add(size);
		size.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				r = size.getValue();
				repaint();

			}
		});
		add(panel);
		panel.addMouseListener(new Mouse());

		setSize(700, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private class myPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);

			g.drawOval(x - r / 2, y - r / 2, r, r);
			repaint();
		}

	}

	private class Mouse extends  MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			x = e.getX();
			y = e.getY();
		}
		
		

		
	}

	public static void main(String[] args) {
		new Task7();

	}

}
