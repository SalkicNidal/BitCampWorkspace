package ba.bitcamp.exercise.test;

import java.util.ArrayList;

/**
 * This class present museum with specified attributes
 * 
 * @author nidal.salkic
 *
 */
public class Museum implements searchable {

	// Attributes of museum
	private String name;
	private ArrayList<Showpiece> showpieces;
	private ArrayList<ArtSection> sections;
	private ArrayList<HistoricalShowPiece> historicals;
	private ArrayList<Employee> employees;

	/**
	 * Declaration of constructor
	 * 
	 * @param showpieces
	 *            - array list of showpiece
	 * @param sections
	 *            - array list of art section
	 * @param historicals
	 *            - array list of historical showpiece
	 * @param employees
	 *            - array list of employee
	 */
	public Museum(String name, ArrayList<Showpiece> showpieces,
			ArrayList<ArtSection> sections,
			ArrayList<HistoricalShowPiece> historicals,
			ArrayList<Employee> employees) {
		super();
		this.name = name;
		this.showpieces = showpieces;
		this.sections = sections;
		this.historicals = historicals;
		this.employees = employees;
	}

	/**
	 * Equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Museum other = (Museum) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (historicals == null) {
			if (other.historicals != null)
				return false;
		} else if (!historicals.equals(other.historicals))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sections == null) {
			if (other.sections != null)
				return false;
		} else if (!sections.equals(other.sections))
			return false;
		if (showpieces == null) {
			if (other.showpieces != null)
				return false;
		} else if (!showpieces.equals(other.showpieces))
			return false;
		return true;
	}

	/**
	 * Method for search input string in museum class
	 */
	@Override
	public boolean fitsSearch(String word) {
		try {
			for (int i = 0; i < showpieces.size(); i++) {

				if ((showpieces.get(i).getName().indexOf(word) != -1)
						|| (showpieces.get(i).getDescription().indexOf(word) != -1)
						|| (showpieces.get(i).getId().indexOf(word) != -1)) {

					return true;
				}

			}

			for (int i = 0; i < sections.size(); i++) {

				if ((sections.get(i).getName().indexOf(word) != -1)
						|| (sections.get(i).getDescription().indexOf(word) != -1)
						|| (sections.get(i).getId().indexOf(word) != -1)) {

					return true;
				}
			}

			for (int i = 0; i < historicals.size(); i++) {

				if ((historicals.get(i).getOrigin().indexOf(word) != -1)) {

					return true;
				}
			}

			for (int i = 0; i < employees.size(); i++) {

				if ((employees.get(i).getGender().indexOf(word) != -1)
						|| (employees.get(i).getName().indexOf(word) != -1)
						|| (employees.get(i).getSurname().indexOf(word) != -1)) {

					return true;
				}
			}

		} catch (NullPointerException e) {
			return false;
		}

		return false;
	}

	/**
	 * To string method
	 */
	@Override
	public String toString() {
		return "Museum name is " + name + "\n Showpieces is "
				+ showpieces.toString() + ", \n" + sections.toString() + ", \n"
				+ historicals.toString() + ",\n" + employees + ".";
	}

}
