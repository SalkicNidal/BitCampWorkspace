package ba.bitcamp.arraylist.lectures;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {

		int[] distribution = new int[13];

		int num = throwDice();

		for (int i = 0; i < 3600000; i++) {

			num = throwDice();
			distribution[num]++;

		}

		for (int i = 2; i < 13; i++) {

			System.out.println(i + " - > " + distribution[i]);
		}

	}

	static Random rnd = new Random();

	private static int throwDice() {

		int diceOne = rnd.nextInt(6) + 1;
		int diceTwo = rnd.nextInt(6) + 1;

		return diceOne + diceTwo;
	}

}
