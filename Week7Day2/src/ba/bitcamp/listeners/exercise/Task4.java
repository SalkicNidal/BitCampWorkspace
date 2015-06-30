package ba.bitcamp.listeners.exercise;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Task4 extends JFrame {

	JLabel label = new JLabel();
	
	long start = 0;
	long end = 0;

	public Task4() {

		
		
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("Get ready");
		add(label);

		Timer t = new Timer((int) (Math.random() * 10000 + 1), new Action());
		t.start();
		addKeyListener(new MyClass());

		setSize(700, 500);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	}

	private class MyClass implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			if ( label.getText().equals("Get ready")){
				label.setText("Too early");
			}
			else if ( label.getText().equals("Pres a key now")){
				
				end = System.currentTimeMillis();
				label.setText(end - start+ "ms");
				
			}
			
			

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
         
			label.setText("Pres a key now");
			start = System.currentTimeMillis();
		}
		
	}

	public static void main(String[] args) {

		new Task4();

	}

}
