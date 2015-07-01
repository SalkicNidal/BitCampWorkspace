package ba.bitcamp.exercise.works;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task2 extends JFrame{
	
	private String s;
	
	JCheckBox box1 = new JCheckBox(" Bold ");
	JCheckBox box2 = new JCheckBox(" Italic");
	
	JButton button = new JButton( " Apply");
	
	JPanel window = new JPanel( new GridLayout(4, 1 , 2 ,2));
	JLabel text = new JLabel("Example font");
	Font f = new Font("Serif", Font.PLAIN, 25);
	
	public Task2(){
		
		
		window.add(text);
		text.setHorizontalAlignment(JLabel.CENTER);
		window.add(box1);
		window.add(box2);
		window.add(button);
	
		
		add(window);
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				 if ( box1.isSelected() == true && box2.isSelected() == true){
					 text.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 25));
				 }else if( box2.isSelected() == true){
					 text.setFont(new Font("Serif", Font.ITALIC, 25));
				 }else if (box1.isSelected() == true ){
					 text.setFont(new Font("Serif", Font.BOLD , 25));
				 }else{
					 text.setFont(f);
				 }
					 
	
	
			}
		});
		
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
	
		new Task2();

	}

}
