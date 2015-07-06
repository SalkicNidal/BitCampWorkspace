package ba.bitcamp.arraydetails.lectures.task;

public class Task1 {

	public static boolean isSame(String params) {

		int counter = 0;
		int counter1 = 0;

		char tmp = params.charAt(counter);
		for (int i = counter; i < params.length(); i++) {

			if (tmp != params.charAt(i)) {

				counter1++;
				counter++;
			} else {
				return false;
			}
		}
		if (counter1 == params.length()) {
			return true;
		} else {
			return false;
		}
	}

	// permutation
	public static boolean permutation(String s1, String s2) {

		int[] signs = new int[255];

		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {

			signs[s1.charAt(i)]++;
			signs[s2.charAt(i)]--;
		}

		for (int i = 0; i < signs.length; i++) {

			if (signs[i] != 0) {

				return false;

			}

		}
		return true;

	}
	
	
//	public static boolean isSubstring( String s1, String s2){
//		
//		String s = "";
//		int num;
//		char tmp = s2.charAt(0);
//		
//		for ( int i = 0; i < s1.length(); i++){
//			if ( tmp != s1.charAt(i)){
//				return false;
//			}else{
//				num = s1.indexOf(tmp);
//				s = s1.substring(num, s1.length()) + s1.substring(0, num -1);
//			}
//			
//		}
//		
//		
//	}

	public static void main(String[] args) {

		System.out.println(isSame("ndai"));

		System.out.println(permutation("aaa", "aba"));
	}

}
