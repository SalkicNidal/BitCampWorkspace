package ba.bitcamp.layouts.exercise.works;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Task3  extends JFrame{
	
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	
	
	
	
	public Task3(){
		
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.EAST);
		setName("Frame3");
		
		panel1.setBorder(BorderFactory.createTitledBorder("Center panel"));
		panel2.setBorder(BorderFactory.createTitledBorder("East panel"));
		panel3.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		panel4.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		
		
		
		panel1.setLayout(new GridLayout(1,1));
		panel1.add( new JTextArea("TextArea"));
		
		panel3.setLayout(new GridLayout(3,1));
		panel3.add(new JLabel(" This seems to be a label 1"));
		panel3.add(new JLabel(" This seems to be a label 2"));
		panel3.add(new JLabel(" This seems to be a label 3"));
		
		
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel4.add(new JButton("Button"+ 1));
		panel4.add(new JButton("Button"+2));
		
		panel2.setLayout(new GridLayout(2,1));
		panel2.add(panel3);
		panel2.add(panel4);
		
		
		
		
		
		
		
		
		setSize(700, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
	
		new Task3();

	}

}
