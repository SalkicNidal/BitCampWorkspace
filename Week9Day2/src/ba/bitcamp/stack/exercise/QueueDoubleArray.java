package ba.bitcamp.stack.exercise;

import java.util.Arrays;
import java.util.EmptyStackException;

public class QueueDoubleArray {

	private Double[] array;

	public QueueDoubleArray() {

		array = new Double[0];
	}

	/**
	 * Method for add new double element to array
	 * 
	 * @param num
	 *            - Double value of add element
	 * @return added element
	 */
	public boolean add(Double num) {

		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = num;
		return true;
	}

	/**
	 * Method for get first added element to array
	 * 
	 * @throws EmptyStackException
	 */
	public Double peek() {

		if (array.length > 0) {

			return array[0];

		} else {

			return null;
		}
	}

	/**
	 * Method for remove first element from double array
	 * 
	 * @return removed element
	 */
	public Double poll() {

		if (array.length > 0) {

			double temp = array[0];
			array = Arrays.copyOfRange(array, 1, array.length);
			return temp;

		} else {

			return null;
		}
	}

	/**
	 * toString method
	 */
	public String toString() {

		return Arrays.toString(array);
	}

}
