package ba.bitcamp.interfaces.exercise.tasks;

public class Rectangle implements Drawable, Shape {

	private int length;
	private int weight;

	/**
	 * Constructor for specified attributes
	 * @param length - length of rectangle
	 * @param weigth - weight of rectangles
	 */
	public Rectangle(int length, int weigth) {
		super();
		this.length = length;
		this.weight = weigth;
	}

	@Override
	public int getCircumference() {

		return 2 * (length + weight);
	}

	@Override
	public int getArea() {

		return length * weight;
	}

	@Override
	public void drawOnConsole() {

		for (int i = 0; i < weight; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

	/**
	 * Equal method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (length != other.length)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	/**
	 * Method toString for printing information to console
	 */
	@Override
	public String toString() {
		return "Rectangle length is " + length + ", weigth is " + weight + ".";
	}

}
