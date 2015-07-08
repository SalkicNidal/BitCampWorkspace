import java.util.Arrays;

public class DynamicDouble {

	private static double myArray[];
	private static int count;

	public DynamicDouble() {
		this(8);
	}

	public DynamicDouble(int num) {
		this(num, 0);
		count = 0;

	}

	public DynamicDouble(int num, double num1) {

		myArray = new double[num];
		count = num;
		for (int i = 0; i < num; i++) {
			myArray[i] = num1;
		}

	}

	public static void addElement(double x) {

		if (count >= myArray.length) {

			double tmp[] = myArray;
			myArray = new double[myArray.length * 2];

			for (int i = 0; i < tmp.length; i++) {
				myArray[i] = tmp[i];
			}
		}
		myArray[count] = x;
		count++;
	}

	public  void addElement(double... x) {

		for (int i = 0; i < x.length; i++) {

			addElement(x[i]);
		}

	}

	public static int size() {

		return count;

	}

	public static int sizeArray() {

		return myArray.length;
	}
	
	
	public  void removeQuick(int index) throws IndexOutOfBoundsException{
		
		myArray[index] = myArray[count -1];
		count--;
		
		if (count <= myArray.length/3){
			
			double tmp[] = new double [sizeArray() / 2];
			for ( int i = 0; i< tmp.length; i++){
				
				tmp[i] = myArray[i];
			}
			myArray = tmp;
		}
	}
	
	public static void removeSlow( int index){
		
		
		
		
	}

	@Override
	public String toString() {

		String s = "";

		s += size() + "\t [ ";

		for (int i = 0; i < count -1; i++) {
			s += myArray[i] + " ";
		}

		s += sizeArray() + " ] \n" + Arrays.toString(myArray);

		return s;
	}

	public static void main(String[] args) {

		DynamicDouble d = new DynamicDouble();
		System.out.println(d.toString());
		d.addElement(45, 56 ,65 ,65 ,65, 65,65, 655 ,65 ,76 ,76, 7,6 ,7,6 ,7,6);
		d.removeQuick(3);
		System.out.println(d.toString());

	}
}
