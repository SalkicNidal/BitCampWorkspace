package ba.bitcamp.listeners.exercise;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Task3 extends JFrame {
	
	JPanel panel = new myPanel();
	int x, y = 0;
	int x1 = 600;
	int y1 = 500;
	int size = 50;
	int tmpy = 10;
	int tmpx = 10;
	
	public Task3() {
		
		
		
	    Timer t = new Timer(50, new Action());
		t.start();
		setTitle("Aplication example");
		setSize(x1, y1);
		add(panel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	
	
	private class myPanel extends JPanel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 7395977734144908007L;

		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(x, y, size, size);
			g.fillRect(x + 20, y +20,size, size);

			
		}

		
	}
	
	
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			 
			 
			 
			if ( y + size >= panel.getHeight()){
				tmpy = -5;
	
			}
			else if ( x + size >= panel.getWidth()){
				tmpx = -5;
			}
			
			else if ( y  <= 0){
				tmpy = 5;
				
			}else if ( x  <= 0){
				tmpx = 5;
			}
			x = x + tmpx;
			 y = y + tmpy;
			repaint();
			
		}
		
	}
	
	

	public static void main(String[] args) {
		
		new Task3();

	}

}
