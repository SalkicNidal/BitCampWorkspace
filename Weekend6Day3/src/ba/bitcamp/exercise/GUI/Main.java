package ba.bitcamp.exercise.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7344749257944359105L;

	private JLabel text = new JLabel("Text");
	private JButton dugme= new JButton("OK");
	private JButton dugme1= new JButton("Left");
	private JButton dugme2= new JButton("Right");
	
	
	
	public Main() {
		
		
		setLayout ( new BorderLayout());
		add(dugme, BorderLayout.SOUTH);
		add(dugme1, BorderLayout.EAST);
	
		
		
	
		dugme.addActionListener(new Action());
		
//		JLabel text = new JLabel("Hello Wolrd");
//		text.setText("EJ ");
		
//		add(text);
		add(dugme);

		setVisible(true);
		setTitle("Prozor");
		setSize(400, 300);
	}

	public static void main(String[] args) {
		   new Main();
	
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == dugme){
				System.out.println("Dugme Pritisnuto");
			}
			

		}

	}
}
