package ba.bitcamp.lectures.task;

import java.util.HashMap;

public class Task4 {

	public static void main(String[] args) {

		String test = "Komšić  putovanje je na službeno putovanje poveo Amira Ibrovića, šefa svog kabineta, Damira Bećirovića - savjetnika za unutrašnju politiku i pitanja mladih, Vanju Filipovića - tadašnjeg savjetnika za vanjsku politiku, te svog vozača Šefku Lobića. ";

		String [] s = test.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for ( int i = 0; i < s.length; i ++){
			
			if ( map.containsKey(s[i])){
				map.put(s[i], map.get(s[i])+ 1);
			}else{
				
				map.put(s[i], 1);
			}
			
			
		}
		
		System.out.println(map);
		
	}
}
