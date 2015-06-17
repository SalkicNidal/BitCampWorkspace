package ba.bitcamp.exercise.task2;

public class Main {

	public static void main(String[] args) {
		
		// Declaration new glass
		Glass g1 = new Glass(200);
		System.out.println(g1);
		// Print max place in the glass
		System.out.println("Maximum place in thee glass is: "
				+ g1.getMaxAmount());
		// Set new type of liquid
		g1.setType("Cola");
		g1.addLiquid("Cola", 40);
		// print the free space in the glass
		System.out.println("Empty space in the glass is: "
				+ g1.getCurrentlyAmount());
		g1.addLiquid("Pepsi", 30);
	}

}
