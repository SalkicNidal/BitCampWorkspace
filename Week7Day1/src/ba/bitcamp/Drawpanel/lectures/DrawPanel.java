package ba.bitcamp.Drawpanel.lectures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class DrawPanel  extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6584973053912276022L;
	
	private Color background = Color.RED;
	
	public DrawPanel( int height, int width){

		setSize(width, height);
		JButton blue = new JButton("Blue");
		
		blue.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				background = Color.BLUE;
			}
			
		});
		
		add(blue);
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseHandler());
	
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		setBackground(background);
		g.fillOval(20,20, 10, 10);
		
		
		
	}
	
	
	public void drawSquare(){
		
		Graphics g = super.getGraphics();
		
		g.setColor(Color.BLUE);
		g.fillRect(50, 50, 100, 100);
		
	}
	
	private class MouseHandler implements MouseListener , MouseMotionListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("Mouse pressed");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("Mouse relased");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(background);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(Color.BLACK);
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
		}
		
	}

}
