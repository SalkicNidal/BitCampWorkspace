package ba.bitcamp.arraydetails.lectures.task;

public class Program {
	
	
	public static int sumParams(double... params){
		
		int sum = 0;
		for ( int i = 0; i < params.length; i++){
			sum += params[i];
		}
		return sum;
	}
	
	
	public static String stringfy( Object... params){
		
		StringBuilder sb = new StringBuilder();
		for ( Object s: params){
			sb.append(s);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		System.out.println(sumParams(1,2,3,4,5,6,7));
		System.out.println(sumParams(1,2));
		System.out.println(sumParams());
		System.out.println(sumParams(new double[]{4,5,6}));
		
		System.out.println(stringfy("Neki", "String"));
		System.out.println(stringfy(1,2,3,4,5,6,7,"a",'+'));
		
	}

}
