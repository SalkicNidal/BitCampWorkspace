package ba.bitcamp.interfaces.exercise.tasks;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Line l = new Line(5);

		System.out.println(" Area of line is:" + l.getArea());
		System.out.println(l.getCircumference());
		l.drawOnConsole();

		Rectangle r = new Rectangle(3, 5);
		System.out.println("Area of rectangles is: " + r.getArea());
		System.out.println(r.getCircumference());
		r.drawOnConsole();

		Drawable[] d = new Drawable[50];

		for (int i = 0; i < d.length; i++) {
			if (i % 2 == 0) {
				d[i] = new Line((int) (Math.random() * 5 + 1));
			} else {
				d[i] = new Rectangle((int) (Math.random() * 5 + 2),
						(int) (Math.random() * 5 + 2));

			}
		}
		for (int i = 0, j = 0; i < d.length; i++, j++) {
			d[i].drawOnConsole();
			System.out.println();

		}

//		Clock c = new Clock(18, 54, 52);
//
//		c.addToFile("ZEZA", 1);
		
		
//		StringBuilderCamp.InnerClass sbc = new StringBuilderCamp.InnerClass();
//		 
//		sbc.increase(3);
//		System.out.println(Arrays.toString(sbc.entered("Boki", 2)));
//	    sbc.shift();
//	    System.out.println(Arrays.toString(sbc.shift()));
//	}


