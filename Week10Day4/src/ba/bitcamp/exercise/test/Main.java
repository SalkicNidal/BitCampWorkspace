package ba.bitcamp.exercise.test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Declaration some of showpieces with attributes
		Showpiece showpiece1 = new Showpiece("Paint", "123",
				"Picture of nature");
		Showpiece showpiece2 = new Showpiece("Axe", "13", "Axe of resolution");
		Showpiece showpiece3 = new Showpiece("Cup", "1", "Cup");

		// Declaration new array list of showpieces
		ArrayList<Showpiece> list = new ArrayList<Showpiece>();

		// Add showpieces to list
		list.add(showpiece1);
		list.add(showpiece2);
		list.add(showpiece3);
		

		// Declaration some of historical showpieces attributes
		HistoricalShowPiece hsp1 = new HistoricalShowPiece("Paint", "West",
				"Pictures of the cave", "1012",
				HistoricalShowPiece.PeriodDetails.RENAISSANCE);
		HistoricalShowPiece hsp2 = new HistoricalShowPiece("Statue", "West",
				"Statue", "12lo",
				HistoricalShowPiece.PeriodDetails.CONTEMPORARY);
		HistoricalShowPiece hsp3 = new HistoricalShowPiece("Monument", "East",
				"Monument of Independence", "1012",
				HistoricalShowPiece.PeriodDetails.MODERN);

		// Declaration new array list of historical showpieces
		ArrayList<HistoricalShowPiece> list1 = new ArrayList<HistoricalShowPiece>();
		// Ading element to list
		list1.add(hsp3);
		list1.add(hsp2);
		list1.add(hsp1);
		

		// Declaration some of art section with specified attributes
		ArtSection as1 = new ArtSection(
				"Paint",
				"125",
				"The Mona Lisa or La Gioconda is a half-length portrait of a woman by the Italian artist Leonardo da Vinci",
				"Mona Lisa", ArtSection.PeriodDetails.RENAISSANCE);
		ArtSection as2 = new ArtSection(
				"Paint",
				"2547",
				"The Persistence of Memory is a 1931 painting by artist Salvador Dalí",
				"The Persistence of Memory",
				ArtSection.PeriodDetails.CLASSICISTS);

		// Declaration new array list of art section
		ArrayList<ArtSection> list2 = new ArrayList<ArtSection>();
		// Adding element to list
		list2.add(as2);
		list2.add(as1);
		

		// Declaration of employees with attributes
		Employee employee1 = new Employee("Nidal", "Salkic", 23, "male", 2500,
				Employee.PositionDetails.BOS);
		Employee employee2 = new Employee("Adis", "Cehajic", 25, "male", 2500,
				Employee.PositionDetails.MANAGER);
		Employee employee3 = new Employee("Thomas", "Smith", 29, "male", 1400,
				Employee.PositionDetails.WORKER);
		Employee employee4 = new Employee("Julia", "Dali", 21, "female", 2500,
				Employee.PositionDetails.SECRETARY);

		// Declaration new array list of employee
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		// Adding element to list
		list3.add(employee4);
		list3.add(employee3);
		list3.add(employee2);
		list3.add(employee1);
		
		

		// Declaration new museum
		Museum WorldMuseum = new Museum("World Museum", list, list2, list1,
				list3);

		// Testing fits search method and print information of museum
		System.out.println(WorldMuseum);
		System.out.println(WorldMuseum.fitsSearch("Paint"));

	}
}
