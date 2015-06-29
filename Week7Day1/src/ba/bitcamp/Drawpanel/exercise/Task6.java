package ba.bitcamp.Drawpanel.exercise;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;





public class Task6   extends JFrame{
	
	
	private String s = "X: " + "Y:";
	JPanel panel = new myPanel();
	private Font f = new Font("Monospaced", Font.BOLD, 25);
	
public Task6() {
		
		setLayout(new BorderLayout());
		add(panel);
		panel.addMouseListener(new Mouse());
		panel.addMouseMotionListener(new Mouse());
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

	public class Mouse implements MouseListener , MouseMotionListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
		
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			s = "X:" + e.getX() + " Y:" +e.getY();
			repaint();
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			s = "X:" + e.getX() + " Y:" +e.getY();
			repaint();
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			s = "X:" + e.getX() + " Y:" +e.getY();
			repaint();
			
		}
		
	}
	
	

	public static void main(String[] args) {
		
		new Task6();

	}

}
