package ba.bitcamp.interfaces.exercise.tasks;

public class Line implements Shape, Drawable {

	private int length;

	/**
	 * Constructor for specified attributes
	 * 
	 * @param length
	 *            length of line
	 */
	public Line(int length) {
		super();
		this.length = length;
	}

	@Override
	public int getCircumference() {

		return length;
	}

	@Override
	public int getArea() {

		return 0;
	}

	@Override
	public void drawOnConsole() {

		for (int i = 0; i < length; i++) {

			System.out.print("*");
		}
		System.out.println();
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
		Line other = (Line) obj;
		if (length != other.length)
			return false;
		return true;
	}

	/**
	 * Method toString for print information to console
	 */
	@Override
	public String toString() {
		return "Line length is" + length + ".";
	}

}
