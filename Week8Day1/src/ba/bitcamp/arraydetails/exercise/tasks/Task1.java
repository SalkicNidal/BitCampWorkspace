package ba.bitcamp.arraydetails.exercise.tasks;

public class Task1 {

	public static void main(String[] args) {
		
		char [] array = {'a', 'b','C', 'd' , 'D', 'R'};
		
		for ( char characters : array){
			
			if (characters >= 65 && characters <=90){
				System.out.print(characters +",");
			}
			
			
		}

	}

}
