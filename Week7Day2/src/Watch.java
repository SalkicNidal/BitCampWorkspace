import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Watch extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4397031546203300520L;

	private int seconds = 0;
	private int minutes;
	private Font f = new Font("Monospaced", Font.BOLD, 25);
	JPanel info = new myPanel();

	public Watch() {

		setLayout(new BorderLayout());
		
		info.setFont(f);
		
		//info.addMouseListener(new Mouse());
		
		
		 Timer time = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				seconds+=1;
				
				if ( seconds > 59){
					seconds = 0;
					minutes++;
				}
				
				
			}
		});
		time.start();
add(info);
		setSize(500, 500);
		setVisible(true);
		setLocation(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

			g.drawString("" +minutes + ":" + seconds, 240, 200);
			repaint();

		}

		
	}
	

	
	
	
		
	

	
	public static void main(String[] args) {

		new Watch();

	}

}
