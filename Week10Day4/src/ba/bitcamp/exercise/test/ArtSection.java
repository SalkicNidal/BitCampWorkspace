package ba.bitcamp.exercise.test;

/**
 * This class present the art section with specified attributes which extends
 * class Showpiece
 * 
 * @author nidal.salkic
 *
 */
public class ArtSection extends Showpiece {

	// Attributes of art section
	private String name;
	private PeriodDetails period;

	/**
	 * Declaration of constructor
	 * 
	 * @param name
	 *            - String name of showpiece
	 * @param id
	 *            - String id
	 * @param description
	 *            - String description
	 * @param name2
	 *            - name of art section
	 * @param period
	 *            - enum of period
	 */
	public ArtSection(String name, String id, String description, String name2,
			PeriodDetails period) {

		super(name, id, description);
		name = name2;
		this.period = period;
	}

	// //////////////////////////

	// Get and set method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PeriodDetails getPeriod() {
		return period;
	}

	public void setPeriod(PeriodDetails period) {
		this.period = period;
	}

	// /////////////////////////////

	// Enum with specified constants
	public enum PeriodDetails {

		RENAISSANCE, CLASSICISTS, MODERN, CONTEMPORARY
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
		ArtSection other = (ArtSection) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (period != other.period)
			return false;
		return true;
	}

	/**
	 * Method for print enum information
	 * 
	 * @return - string
	 */
	public String printEnum() {

		String tmp = "";

		if (period.equals(PeriodDetails.MODERN)) {

			tmp += "modern";
		} else if (period.equals(PeriodDetails.CLASSICISTS)) {

			tmp += "classic";
		} else if (period.equals(PeriodDetails.CONTEMPORARY)) {

			tmp += "contemporary";
		} else if (period.equals(PeriodDetails.RENAISSANCE)) {

			tmp += "renaissance";
		}

		return tmp;
	}

	/**
	 * To string method
	 */
	@Override
	public String toString() {
		return "Art section name is: " + name + ", period is: " + printEnum()
				+ ".";
	}

}
