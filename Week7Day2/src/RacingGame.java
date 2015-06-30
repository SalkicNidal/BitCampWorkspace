import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class RacingGame extends JPanel implements ActionListener {

	private int x;
	private int y;
	private Vehicle myVehicle;
	private Vehicle newVehicle;
	private int n = 250;
	private Timer timer;

	RacingGame(int x, int y) {
		this.x = x;
		this.y = y;
		this.myVehicle = new Vehicle(x / 2, y - 90, Color.BLUE);
		this.newVehicle = new Vehicle(x / 3, 0, Color.RED);

		addKeyListener(new MyVehicleControl());
		addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				((Component) e.getSource()).requestFocus();

			}

		});

		timer = new Timer(n, this);
		timer.start();
		requestFocus();

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		myVehicle.draw(g);
		newVehicle.draw(g);

	}

	private class MyVehicleControl extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				if (myVehicle.x > 40)
					myVehicle.moveLeft();

			}

			else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				if (myVehicle.x + 80 < x)
					myVehicle.moveRight();

			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				n -= 20;
				if (n < 0) {
					n = 10;
				}
				timer.setDelay(n);

			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

				n += 20;
				timer.setDelay(n);
			}

			if ( newVehicle.x  == myVehicle.x && newVehicle.y == myVehicle.y) {
				myVehicle.c = Color.RED;
			}
			repaint();
			
		

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		newVehicle.y += 5;
		if (newVehicle.y > this.y) {
			newVehicle.y = 0;
			newVehicle.x = (int) (Math.random() * this.x - 20);
		}
		repaint();

	}

}
