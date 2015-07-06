package ba.bitcamp.gui.exercise.tasks;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Task5 extends JFrame {

	private static final long serialVersionUID = 8558374345490665781L;

	boolean a = false;
	boolean b = false;
	JLabel name = new JLabel(" Insert name");
	JLabel mail = new JLabel(" Insert mail");
	JLabel coments = new JLabel("Inset comments");
	JTextField nameField = new JTextField();
	JTextField mailField = new JTextField();
	JTextField commentsField = new JTextField();
	JButton button = new JButton("Submit");

	public Task5() {

		setLayout(new GridLayout(4, 2));
		add(name);
		add(nameField);
		add(mail);
		add(mailField);
		add(coments);
		add(commentsField);
		add(button);
		// ful
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String tmp = mailField.getText();

				for (int i = 0; i < tmp.length(); i++) {

					if (tmp.charAt(i) == '@') {
						a = true;
					}
				}
				for (int i = 0; i < tmp.length(); i++) {
					if (tmp.charAt(i) == '.') {
						b = true;
					}
				}

				if (a == true && b == true) {
					
					JOptionPane.showMessageDialog(null, "Success input");

				} else {
					JOptionPane.showMessageDialog(null, "Input is not valid");
				}

			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setLocationRelativeTo(null);
		setTitle("Comments page");
		setVisible(true);

	}

	public static void main(String[] args) {
		new Task5();

	}

}
