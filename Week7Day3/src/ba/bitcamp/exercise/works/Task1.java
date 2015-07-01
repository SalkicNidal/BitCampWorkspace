package ba.bitcamp.exercise.works;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task1  extends JFrame{
	
	private int size = 0;
	JLabel label = new JLabel(" Example ");
	JSlider slider = new JSlider(0 , 100 , 0);
	BorderLayout window = new BorderLayout();
	public Task1(){
		
		
		
	    add( label, BorderLayout.CENTER);
	    label.setHorizontalAlignment(JLabel.CENTER);
	    label.setForeground(Color.RED);
		label.setFont( new Font("Serif", Font.BOLD, size));
		
		
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(20);
		add( slider, BorderLayout.SOUTH);
		
		
		
		
		slider.addChangeListener( new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				size = slider.getValue();
				label.setFont(new Font( "Serif", Font.BOLD , size));
				
				
			}
		});
		
		
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		new Task1();

	}

}
