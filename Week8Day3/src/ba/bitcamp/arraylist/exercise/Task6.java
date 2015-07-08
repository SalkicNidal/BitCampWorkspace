package ba.bitcamp.arraylist.exercise;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task6 extends JFrame {
	String s =" Example";
	
	
	public Task6(){
		setLayout(new GridLayout(40,1));
		
		for ( int i = 1; i < 40; i++){
			
			JLabel text = new JLabel(s);
			text.setFont(new Font("SERIF", Font.BOLD, i));
			add(text);
		}
		
	
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Task6();

	}

}
