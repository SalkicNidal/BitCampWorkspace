package ba.bitcamp.lectures.task;

import java.util.Comparator;
import java.util.LinkedList;

public class Country {

	private String name;
	private Integer population;
	private Integer area;

	public Country(String name, Integer population, Integer area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public enum sortDetails {

		BY_NAME, BY_POPULATION, BY_AREA
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public  void sort(LinkedList<Country> c, sortDetails sd) {

		if (sd == sortDetails.BY_NAME) {

			c.sort(new Comparator<Country>() {

				@Override
				public int compare(Country o1, Country o2) {

					return o1.name.compareTo(o2.name);
				}
			});
		}
		if (sd == sortDetails.BY_AREA) {

			c.sort(new Comparator<Country>() {

				@Override
				public int compare(Country o1, Country o2) {

					return o1.area.compareTo(o2.area);
				}

			});
		}
		if (sd == sortDetails.BY_POPULATION) {

			c.sort(new Comparator<Country>() {

				@Override
				public int compare(Country o1, Country o2) {

					return o1.population.compareTo(o2.population);
				}

			});
		}

	}

	@Override
	public String toString() {
		return name + "," + population
				+ ", area=" + area + "";
	}
	

}
