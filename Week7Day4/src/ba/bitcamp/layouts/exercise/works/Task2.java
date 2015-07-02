package ba.bitcamp.layouts.exercise.works;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task2  extends JFrame{
	
	
	
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	
	
	public Task2(){
		
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		setName("Frame2");
		
		panel1.setBorder(BorderFactory.createTitledBorder("Center panel"));
		panel2.setBorder(BorderFactory.createTitledBorder("South panel"));
		
		panel1.setLayout(new GridLayout(4,1));
		for ( int i = 0; i < 4; i++){
			panel1.add(new JLabel("Label " + (i + 1)));
			panel1.add(new JButton("" +(i +1)));
		}
		
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel2.add(new JLabel("Label1"));
		panel2.add(new JButton("Button1"));
		
		setSize(700, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		new Task2();

	}

}
