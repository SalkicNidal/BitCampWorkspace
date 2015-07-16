package ba.bitcamp.generic.lectures;

public class NumberUtils {

	/**
	 * Method for get max number from integer array
	 * 
	 * @param arr
	 *            - integer array
	 * @return = integer value of max element
	 */
	public static Number max(Integer[] arr) {

		if (arr != null && arr.length > 0) {

			int max = arr[0].intValue();

			for (int i = 1; i < arr.length; i++) {

				if (arr[i].intValue() > max) {

					max = arr[i].intValue();
				}
			}
			return max;
		}

		throw new UnsupportedOperationException("Wrong input");
	}

	/**
	 * Universal method for all types of numbers
	 * 
	 * @param arr
	 *            - Array of object Number
	 * @return - max number from array
	 */
	public static Number max(Number[] arr) {

		if (arr != null && arr.length > 0) {

			Number max = arr[0];

			for (int i = 1; i < arr.length; i++) {

				if (arr[i].doubleValue() > max.doubleValue()) {

					max = arr[i];
				}
			}
			return max;
		}

		throw new UnsupportedOperationException("Wrong input");
	}

	public static void main(String[] args) {

		Integer[] array = { 12, 2, 3, 4, 55, 3, 2, 1, 44, 44 };
		System.out.println(max(array));

		Double[] arr = { 1.1, 2.2, 3.3, 4.4 };
		System.out.println(max(arr));
		
		Short[] arr1 = {2,2,2,2,4,4,11,12,3,-5};
		System.out.println(max(arr1));

	}

}
