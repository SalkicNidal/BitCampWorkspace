package ba.bitcamp.exercise.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window5 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1773672971798719255L;

	private int counter = 0;
	private JLabel text = new JLabel("Try to delete text");
	private JButton button = new JButton(">");
	private JButton button1 = new JButton("<");
	private JButton button2 = new JButton("REMOVE");

	public Window5() {

		setVisible(true);
		setTitle("Window1");
		setSize(400, 300);
		setLocation(500, 250);

		Font f = new Font("Cambria", Font.BOLD, 25);
		
		text.setHorizontalAlignment(NORMAL);
		setLayout(new BorderLayout());

		add(button, BorderLayout.EAST);
		button.setFont(f);
		button.setForeground(Color.GREEN);
		button.setBackground(Color.BLUE);
		add(button1, BorderLayout.WEST);
		button1.setFont(f);
		button1.setForeground(Color.GREEN);
		add(button2, BorderLayout.SOUTH);
		button2.setForeground(Color.RED);
		add(text, BorderLayout.CENTER);
		

		button.addActionListener(new Action());
		button1.addActionListener(new Action());
		button2.addActionListener(new Action());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Window5();

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String s = text.getName();
			if ( e.getSource() == button){
				counter++;
	            text.setText(s.substring(0, counter) + "_" + s.substring(counter++, s.length()));
				
				
				  	
				
			}
			
			
		}
	}
}
