package ba.bitcamp.arraydetails.exercise.tasks;

public class Task2 {

	private int day;
	private int month;
	private int year;

	public Task2() {
		this.day = 01;
		this.month = 01;
		this.year = 2000;

	}

	public Task2(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		if (day < 10 && month < 10) {

			return "0" + day + " - 0" + month + " - " + year + ".";
		}
		return day + " - " + month + " - " + year + ".";

	}

	public static void printArray(Object... array) {

		for (Object date : array) {

			System.out.println(date);
		}
	}

	public static void main(String[] args) {

		printArray(new Task2(01, 12, 2005), new Task2(02, 03, 2014),
				new Task2());

	}

}
