package ba.bitcamp.lectures.task;

import java.util.LinkedList;

import ba.bitcamp.lectures.task.Country.sortDetails;

public class Main {

	public static void main(String[] args) {
	
		Country c = new Country("BiH", 1045560, 300000);
		Country c1 = new Country("CRO", 6560000, 33243000);
		Country c2 = new Country("SLO", 569000, 33230000);
		Country c3 = new Country("SRB", 70000, 3440000);
		Country c4 = new Country("CGR", 1540000, 440000);
		
		
		LinkedList<Country> list = new LinkedList<Country>();
		list.add(c4);
		list.add(c3);
		list.add(c2);
		list.add(c1);
		
		
		c.sort(list, sortDetails.BY_AREA );
		System.out.println(list);

	}

}
