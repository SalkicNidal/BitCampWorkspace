package ba.bitcamp.listeners.exercise;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Task6  extends JFrame{
	
	JPanel panel = new myPanel();
	private Font f = new Font("Monospaced", Font.BOLD, 25);
	
	
	public Task6() {
		
		setLayout(new BorderLayout());
		add(panel);
		panel.setFont(f);
		setSize(700, 500);
		addKeyListener(new MyKey());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	private class myPanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			g.fillRect(330, 430, 50, 50);
			
		}
		
		
	}
	
	private class MyKey extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			
			if ( e.getKeyCode() == KeyEvent.VK_SPACE){
				
				
			}
		}
		
		
		
		
	}


	public static void main(String[] args) {
		new Task6();

	}

}
