package ba.bitcamp.gui.exercise.tasks;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Task2 extends JFrame {

	private JTextField text = new JTextField();
	private JButton button = new JButton("check");
	private String[] mail = { "email1", "email2", "email3" };

	private static final long serialVersionUID = -9178522998721477888L;

	public Task2() {

		setLayout(new GridLayout(2, 2));
		add(text);
		add(button);

		button.addActionListener(new Action());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setLocationRelativeTo(null);
		setTitle("Email available");
		setVisible(true);
	}

	private class dialog extends JDialog {

		private JLabel info = new JLabel(" Email is add");
		private static final long serialVersionUID = -2671408421086678333L;

		public dialog() {

			for (int i = 0; i < mail.length; i++) {
				if (text.getText().equals(mail[i])) {

					info.setText("Email is already use ");

				}
			}

			add(info);
			setModalityType(ModalityType.MODELESS);
			setSize(300, 100);
			setLocationRelativeTo(null);
			setTitle("Dialog 1");
			setVisible(true);

		}

	}

	public class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == button) {

				new dialog();
			}

		}

	}

	public static void main(String[] args) {
		new Task2();

	}

}
