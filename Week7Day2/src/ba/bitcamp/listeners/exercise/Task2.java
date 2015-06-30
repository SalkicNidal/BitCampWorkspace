package ba.bitcamp.listeners.exercise;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame {

	private String s = "";
	JLabel label = new JLabel();
	int num = 1;

	public Task2() {
		add(label);
		label.setFont(new Font("Sans Serif", Font.PLAIN, 35));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(s);
		addKeyListener(new Key());

		setTitle("FocusListener example");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {

			if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
				
				if ( s.length() == 0){
					s = "";
				}else{
				s = s.substring(0,
						s.length() -1);
				label.setText(s);
				}
				
				}else{
			
			s += e.getKeyChar();
			label.setText(s);
				}

		}
	

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		new Task2();

	}

}
