package ba.bitcamp.lectures.task1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8817844154455640421L;

	private int counter = 1;
	private JButton button[] = new JButton[10];
	private JButton button1 = new JButton("PLAY AGAIN");
	private JButton button2 = new JButton("INFO");
	private JButton button3 = new JButton(" EXIT ");

	public Window1() {

		setVisible(true);
		setTitle("Dummy X-O");
		setSize(500, 500);
		setResizable(false);
		setLocation(400, 200);

		Font f = new Font("Cambria", Font.BOLD, 12);
		setLayout(new GridLayout(4, 4));
		for (int i = 0; i < 9; i++) {
			button[i] = new JButton();
			add(button[i]);
			button[i].setFont(f);
			button[i].setBackground(Color.LIGHT_GRAY);
			button[i].setForeground(Color.RED);
			button[i].addActionListener(new Action());

		}
		add(button1);
		button1.setForeground(Color.green);
		button1.setFont(f);
		add(button3);
		button3.setForeground(Color.red);
		button3.setFont(f);
		add(button2);
		button3.setForeground(Color.red);
		button3.setFont(f);

		button1.addActionListener(new Action());
		button3.addActionListener(new Action());
		button2.addActionListener(new Action());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Window1();

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Font f = new Font("Cambria", Font.BOLD, 80);
			for (int i = 0; i < 9; i++) {
				if (e.getSource() == button[i]) {
					if (counter % 2 == 0) {
						button[i].setText("X");
						button[i].setFont(f);
						counter++;
					} else {
						button[i].setText("O");
						button[i].setFont(f);
						button[i].setForeground(Color.BLUE);
						counter++;
					}

				}

			}
			if (e.getSource() == button3) {
				System.exit(3);
			}
			if (e.getSource() == button1) {
				for (int i = 0; i < 9; i++) {
					button[i].setText("");
				}
			}
			if (e.getSource() == button2) {
				JOptionPane.showMessageDialog(null, "Dummy TIC-TAC-TOE game");
			}
		}

	}
}
