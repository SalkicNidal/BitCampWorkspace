package ba.bitcamp.generic.lectures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ColectionUtils {

	public static void print(Collection<String> c) {

		Iterator<String> line = c.iterator();

		while (line.hasNext()) {

			System.out.println(line.next());
		}

	}

	public static String maxString(Collection<String> line) {

		Iterator<String> str = line.iterator();
		String max = null;
		while (str.hasNext()) {

			String current = str.next();
			if (max == null || max.compareTo(current) < 0) {

				max = current;
			}
		}
		return max;
	}
	
	
//	public static <T extends  Comparable<T>> T clean( Collection <T> t){
//		
//		Iterator< T > tmp = t.iterator();
//		
//			
//				
//	
//	}

	public static void main(String[] args) {

		ArrayList<String> s = new ArrayList<String>();
		s.addAll(Arrays.asList("TEST", "ABC",  null, "XYZ"));

		print(s);
//		System.out.println(maxString(s));
//		clean(s);

	}

}
