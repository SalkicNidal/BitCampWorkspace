package ba.bitcamp.lectures.task2;

import ba.bitcamp.lectures.task1.User;

public class Point {

	private static int counter = 0;
	private int x;
	private int y;
	private int rb;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.rb = ++counter;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "Point "+ rb + " (x = " + x + ",  y = " + y + ").";
	}

	public boolean equals(Point second) {
		if (this.x == second.x && this.y == second.y) {
			return true;
		} else {
			return false;

		}
	}

	public double getDistance(Point other) {
		if (other.equals(Point.this) == true) {
			return other.x;
		} else

			return Math.sqrt((this.x - other.x) * (this.x - other.x)
					+ (this.y - other.y) * (this.y - other.y));

	}

}