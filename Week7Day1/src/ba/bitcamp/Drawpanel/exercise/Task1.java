package ba.bitcamp.Drawpanel.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task1  extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8488019687625921831L;
	
	private JLabel label = new JLabel("Not clicked");
	private Font f = new Font("Monospaced", Font.BOLD, 25);
	private Font f1 = new Font("Monospaced", Font.PLAIN, 15);


	public Task1(){
		
		setLayout(new BorderLayout());
		add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(f1);
		label.setForeground(Color.DARK_GRAY);
		label.addMouseListener(new Mouse());
		
		
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Task1();
	
	}
	
	public class Mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
//			label.setText("It is clicked!");
//			label.setFont(f);
//			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			label.setFont(f);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			label.setFont(f1);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		       label.setForeground(Color.LIGHT_GRAY);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			label.setForeground(Color.DARK_GRAY);
			
		}
		
		
		
	}

}
