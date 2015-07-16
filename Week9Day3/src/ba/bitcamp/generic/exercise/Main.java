package ba.bitcamp.generic.exercise;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Planet p = new Planet("Jupiter", 20056.32, 13.2, 0.9);
		Planet p1 = new Planet("Mars", 3040.32, 6.2, 5.9);
		Planet p2 = new Planet("Venera", 23453.32, 1.2, 2.45);
		Planet p3 = new Planet("Pluton", 2054.32, 7.2, 0.3);
		Planet p4 = new Planet("Neptun", 2434000.32, 1.2, 2.9);

		Planet[] pp = new Planet[5];
		pp[0] = p;
		pp[1] = p1;
		pp[2] = p2;
		pp[3] = p3;
		pp[4] = p4;

		Arrays.sort(pp);
		Planet.sortByDiameter(pp);
		Planet.sortByAU(pp);
		System.out.println(Arrays.toString(pp));

	}

}
