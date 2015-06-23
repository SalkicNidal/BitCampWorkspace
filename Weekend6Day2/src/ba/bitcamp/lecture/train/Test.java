package ba.bitcamp.lecture.train;

public class Test {

	public static void main(String[] args) {
		
		ITijelo [] testTIjela = new ITijelo[]{ new Krug(1) , new Pravouganik(2 ,3 ), new Kvadrat(3)}; 
			
		

		
		Krug k = new Krug(1);
		System.out.println("Povrsina: " + k.povrsina());
		System.out.println("Obim: "+ k.obim());
		
		Kvadrat kv = new Kvadrat(3);
		System.out.println("Povrsina: " + kv.povrsina());
		System.out.println("Obim: "+ kv.obim());
		System.out.println();
		
		for (ITijelo tijelo:testTIjela){
			System.out.println(tijelo.toString());
			System.out.println("Povrsina: " + tijelo.povrsina());
			System.out.println("Obim: "+ tijelo.obim());
			
		}
	}

}
