package ba.bitcamp.exercise.works;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Task6 extends JFrame {

	int n;

	JPanel window = new JPanel(new GridLayout(4, 4, 1, 5));
	JButton button = new JButton("Start");
	JLabel info = new JLabel();
	JTextField number = new JTextField();
	Timer start = new Timer(1000, new Action());

	public Task6() {

		window.add(info);
		info.setHorizontalAlignment(JLabel.CENTER);
		window.add(number);
		window.add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				n = Integer.parseInt(number.getText());
				start.start();
			}
		});

		add(window);

		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (n >= 0)
				info.setText(String.valueOf(n));
			n--;
		}

	}

	public static void main(String[] args) {
		new Task6();
	}

}
