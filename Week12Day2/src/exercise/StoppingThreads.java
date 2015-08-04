package exercise;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StoppingThreads extends JFrame {
	private static final long serialVersionUID = 7027063745161425220L;
	MyThread t;
	ArrayList<MyThread> list = new ArrayList<StoppingThreads.MyThread>();

	public StoppingThreads() {

		setLayout(new FlowLayout());

		JButton add = new JButton("ADD");
		JButton stop = new JButton("STOP");

		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				t = new MyThread();
				t.start();
				list.add(t);

			}
		});
		stop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < list.size(); i++) {

					list.get(i).interrupt();
					try {
						list.get(i).join();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println(list.get(i).isAlive());
				}

			}
		});

		add(add);
		add(stop);

		setSize(500, 300);
		setTitle(" Task1 ");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public class MyThread extends Thread {

		@Override
		public void run() {
			for (int i = 1; i < 101; i++) {

				System.out.println(i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					
					break;

				}

			}

		}
	}

	public static void main(String[] args) {

		new StoppingThreads();

	}

}
