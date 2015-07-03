package ba.bitcamp.layouts.exercise.works;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Task1 extends JFrame {

	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JButton[] buttons = new JButton[9];

	public Task1() {
		setLayout(new BorderLayout());
		setName("Frame 1");
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.EAST);

		panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));

		panel2.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton("" + i);
			buttons[i].setPreferredSize(new Dimension(100, 50));
			panel2.add(buttons[i]);
		}

		panel1.setLayout(new BorderLayout());
		panel1.add(new JLabel("Label 1"), BorderLayout.SOUTH);
		panel1.add(new JTextArea(" Text area "), BorderLayout.CENTER);
		panel1.add(new JLabel("Label 2"), BorderLayout.NORTH);

		setSize(700, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new Task1();

	}

}
