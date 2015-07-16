package ba.bitcamp.generic.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class Planet implements Comparable<Planet> {

	private final static Double EARTH_WEIGHT = 59721900000000000000000000000000000000000000000000.589;

	private String name;
	private Double diameter;
	private Double weight;
	private Double AU;

	public Planet(String name, Double diameter, Double weight, Double AU) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.weight = weight * EARTH_WEIGHT;
		this.AU = AU;
	}

	@Override
	public String toString() {
		return name + " [" + diameter + "km ] - [" + weight + " KG], AU:" + AU
				+ " \n";
	}

	@Override
	public int compareTo(Planet p) {

		return this.name.compareTo(p.name);

	}

	public static void sortByDiameter(Planet[] arr) {

		Arrays.sort(arr, new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return p1.diameter.compareTo(p2.diameter);
			}

		});
	}

	public static void sortByWeight(Planet[] arr) {

		Arrays.sort(arr, new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return p1.weight.compareTo(p2.weight);
			}

		});
	}

	public static void sortByAU(Planet[] arr) {

		Arrays.sort(arr, new Comparator<Planet>() {

			@Override
			public int compare(Planet p1, Planet p2) {
				return p1.AU.compareTo(p2.AU);
			}

		});
	}

}
