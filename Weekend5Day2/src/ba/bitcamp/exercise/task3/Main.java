package ba.bitcamp.exercise.task3;

public class Main {

	public static void main(String[] args) {
		// Declaration new printer
		Printers p1 = new Printers("HP");
		// Print information of printer
		System.out.println(p1);
		System.out.println("Ink exist is " + p1.inkExist());
		System.out.println("Paper exist is " + p1.paperExist());

		// Set the amount of ink to max with method
		p1.maxInk();
		System.out.println("Ink exist is " + p1.inkExist());
		// Set the paper in the printer with method
		p1.addPaper(100);
		System.out.println("Paper exist is " + p1.paperExist());
		// Print the entered number of papers
		p1.printPaper(45);
		System.out.println("Number of printed paper is: "
				+ Printers.numberOfPrintPapers());
		System.out.println("Ink exist is " + p1.inkExist());
		System.out.println("Paper exist is " + p1.paperExist());
		System.out.println(p1);

	}

}
