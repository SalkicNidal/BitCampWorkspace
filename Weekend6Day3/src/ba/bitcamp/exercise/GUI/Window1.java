package ba.bitcamp.exercise.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Window1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8817844154455640421L;

	private JLabel text = new JLabel("Hello World");

	private JButton button = new JButton("Hello !!");

	public Window1() {
		
		setVisible(true);
		setTitle("Window1");
		setSize(400, 300);
		setLocation(500, 250);
		
		
		text.setHorizontalAlignment(NORMAL);
		setLayout(new BorderLayout());
		
		
		add(button, BorderLayout.SOUTH);
		add(text, BorderLayout.CENTER);

		button.addActionListener(new Action());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	public static void main(String[] args) {
		new Window1();

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				JOptionPane.showMessageDialog(null, "Hello");
				System.exit(3);

			}
		}

	}

}
