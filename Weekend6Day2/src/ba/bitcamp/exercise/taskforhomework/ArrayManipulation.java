package ba.bitcamp.exercise.taskforhomework;

public class ArrayManipulation {

	public static void extendArray(Computer[] c) {

		Computer[] c1 = new Computer[c.length + 1];
		for (int i = 0; i < c.length - 1; i++) {
			c1[i] = c[i];
		}
		c = c1;

	}

	public static void shrinkArray(Computer[] c, int k) {

		Computer[] c1 = new Computer[c.length - 1];
		for (int i = 0; i < k; i++) {
			c1[i] = c[i];
		}
		for (int i = k + 1; i < c1.length; i++) {
			c1[i] = c[i];
		}

	}

}
