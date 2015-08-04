package exercise;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Background extends JFrame {
	JLabel info;
	boolean startCheck = true;

	public Background() {

		setLayout(new BorderLayout());

		JButton start = new JButton("Start");
		info = new JLabel();
		
		start.addActionListener(new ActionListener() {
			
		
			@Override
			public synchronized void actionPerformed(ActionEvent e) {
				
				MyThread t1 = new MyThread();
			
				t1.start();
			
			}
			
		});
	

		add(start, BorderLayout.SOUTH);
		add(info);

		setSize(500, 300);
		setTitle(" Task3 ");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private class MyThread extends Thread {

		int count = 0;

		@Override
		public void run() {

			for (int i = 1; i < 100000; i++) {

				if (isPrime(i))

					count++;
				System.out.println(count);
			}

			info.setText( count + "");
		}
	}

	public static void main(String[] args) {

		new Background();

	}

}
