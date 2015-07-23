package ba.bitcamp.exercise.test;

/**
 * This class present historical showpiece with specified attributes which
 * extends showpiece
 * 
 * @author nidal.salkic
 *
 */
public class HistoricalShowPiece extends Showpiece {

	private String origin;
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
	 * @param origin
	 *            - String of origin
	 * @param period
	 *            - enum of period
	 */
	public HistoricalShowPiece(String name, String id, String description,
			String origin, PeriodDetails period) {
		super(name, id, description);
		this.origin = origin;
		this.period = period;
	}

	// ///////////////////////////

	// Get and set methods
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public PeriodDetails getPeriod() {
		return period;
	}

	public void setPeriod(PeriodDetails period) {
		this.period = period;
	}

	// ///////////////////////////////

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
		HistoricalShowPiece other = (HistoricalShowPiece) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
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
		super.toString();
		return "Historical showpiece origin is: " + origin + ", period: "
				+ printEnum() + "\n";
	}

}
