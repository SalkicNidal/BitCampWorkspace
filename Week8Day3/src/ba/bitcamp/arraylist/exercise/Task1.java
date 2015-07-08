package ba.bitcamp.arraylist.exercise;

public class Task1 {

	public static String day(int num) {

		String[] days = { "Monday", "Thusday", "Wendsday", "Thursday",
				"Friday", "Saturday", "Sunday" };
		
		try {
			
			return days[num - 1].toString();

		} catch (ArrayIndexOutOfBoundsException e) {

			return "Wrong input";
		}

	}

	public static void main(String[] args) {

		System.out.println(day(7));

	}

}
