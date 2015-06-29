package ba.bitcamp.Drawpanel.exercise;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task3 extends JFrame {
	
	private String s = "Last Presed: ";
	JPanel panel = new myPanel();
	private Font f = new Font("Monospaced", Font.BOLD, 25);
	
	
	public Task3() {
		
		setLayout(new BorderLayout());
		add(panel);
		panel.addMouseListener(new Mouse());
		panel.setFont(f);
		setSize(700, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private class myPanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			g.drawString( s, 10, 200);
			
		}
		
		
	}
	
	
	public class Mouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			 if ( e.getButton() == MouseEvent.BUTTON1){
				 
				 s = "Last Presed: left";
			 
			 } else if ( e.getButton() == MouseEvent.BUTTON2){
				 
				 s = "Last Presed: middle";
				 
			 }else if ( e.getButton() == MouseEvent.BUTTON3){
				 
				 s = "Last Presed: right";
			 }
			
			 repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}

	public static void main(String[] args) {
		new Task3();

	}

}
