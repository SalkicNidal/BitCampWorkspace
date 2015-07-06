package ba.bitcamp.gui.exercise.tasks;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Task1 extends JFrame {

	private JButton button = new JButton("Button 1");
	private JButton button1 = new JButton("Button 2");

	public Task1() {

		setLayout(new FlowLayout());
		add(button);
		add(button1);

		button.addActionListener(new Action());
		button1.addActionListener(new Action());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setLocationRelativeTo(null);
		setTitle("TwoJDialogs");
		setVisible(true);

	}

	private class dialog extends JDialog {

		private static final long serialVersionUID = -2671408421086678333L;

		public dialog() {

			setModalityType(ModalityType.MODELESS);
			setSize(300, 100);
			setLocationRelativeTo(null);
			setTitle("Dialog 1");
			setVisible(true);

		}

	}

	private class dialog1 extends JDialog {

		private static final long serialVersionUID = -5352147341726810090L;

		public dialog1() {

			setModalityType(ModalityType.APPLICATION_MODAL);
			setSize(300, 100);
			setLocationRelativeTo(null);
			setTitle("Dialog 2");
			setVisible(true);

		}
	}

	public class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == button) {

				new dialog();
			}

			if (e.getSource() == button1) {

				new dialog1();
			}

		}

	}

	private static final long serialVersionUID = 1137621841523622419L;

	public static void main(String[] args) {

		new Task1();
	}

}
