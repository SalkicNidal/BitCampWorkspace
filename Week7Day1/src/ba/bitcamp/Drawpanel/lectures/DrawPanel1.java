package ba.bitcamp.Drawpanel.lectures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.ComponentSampleModel;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DrawPanel1  extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Color activeColor;
	private PointArray points;
	private int s;
	
	private static Color[] supportedColors = new Color[] {Color.RED, Color.BLACK, Color.BLUE, Color.MAGENTA, Color.GREEN};
	
	
	
	public DrawPanel1(int height, int width){
		setSize(width, height);
	
		points = new PointArray();
		setSize(500, 500);
		setBackground(Color.WHITE);
		
		for ( int i = 0; i < 3; i++){
			JButton size = new JButton("Size");
			size.setName(Integer.toString((i+1)*10));

			size.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				    JButton clicked = (JButton)e.getSource();
				    
				   String name = clicked.getName();
				   s = Integer.parseInt(name);
				 
					
				}
				
				
				
			});
			
			add(size);
			
		}
	
		
		for ( int i = 0; i < supportedColors.length; i++){
			JButton color = new JButton(" Pick");
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]);
			
			color.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				    JButton clicked = (JButton)e.getSource();
				    
				   String name = clicked.getName();
				   int index = Integer.parseInt(name);
				   activeColor = supportedColors[index];
				
					
				}
				
				
				
			});
					
			add(color);
			
	
		}
		addMouseMotionListener(new MouseHandler());
	}
		@Override
		      protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			for ( int i = 0; i< points.getLength(); i++){
				Point p = points.elementAt(i);
				g.setColor(p.getColor());
				g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
				
				
		}
	}
	
	private class MouseHandler implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			
			Point newPoint = new Point(e.getX(), e.getY(), s, activeColor);
			
			if ( e.isShiftDown() == true){
				newPoint.setColor(Color.WHITE);
			}
			points.AddPoint(newPoint);
	
			repaint();
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}
	

}
