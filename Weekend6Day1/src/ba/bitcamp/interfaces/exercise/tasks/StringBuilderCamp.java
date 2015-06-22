package ba.bitcamp.interfaces.exercise.tasks;

public class StringBuilderCamp {

	char[] arr = new char[0];

	void append(Object o) {
		
		char arr1 [] = new char [arr.length + o.toString().length()];
		for ( int i = 0; i < arr.length; i++){
			arr1[i] = arr[i];
		}
		for ( int i = arr.length-1 , j = 0; i < arr1.length; i++ , j++){
			arr1[i] = o.toString().charAt(j);
		}
		arr1 = arr;
	}

	static class InnerClass {

		static char[] increase(int num, char[] arr) {

			return arr = new char[arr.length + num];

		}

		char[] entered(String s, int num, char[] arr) {

			int num1 = s.length();
			char[] arr1 = new char[arr.length + num1];

			for (int i = 0; i < num; i++) {
				arr1[i] = arr[i];
			}
			for (int i = num, j = 0; i < num1 + num; i++, j++) {
				arr1[i] = s.charAt(j);
			}
			for (int i = num1; i < arr.length; i++) {
				arr1[i] = arr[i];
			}
			return arr1;
		}

		char[] shift(char[] arr) {

			arr[0] = arr[arr.length - 1];

			for (int i = 1; i < arr.length; i++) {
				arr[i] = arr[i];
			}
			return arr;
		}

	}
}
