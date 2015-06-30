import java.awt.Color;
import java.awt.Graphics;


public class Vehicle {
	
	private static final int STEP = 5;
	public int x;
	public int y;
	public Color c;
	public Vehicle( int x, int y, Color c){
		
		this.x = x;
		this.y = y;
		this.c = c;
	}
	
	public void draw(Graphics g){
		
		g.setColor(c);
		g.drawRect(x, y, 40, 60);
		
	}

	public void moveLeft() {
		x -= STEP;
		
	}

	public void moveRight() {
		x += STEP;
	}
}
