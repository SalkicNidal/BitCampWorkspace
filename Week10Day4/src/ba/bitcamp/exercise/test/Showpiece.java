package ba.bitcamp.exercise.test;

/**
 * This class present the showpiece of museum with specified attributes
 * 
 * @author nidal.salkic
 *
 */
public class Showpiece implements Comparable<Showpiece> {

	private String name;
	private String id;
	private String description;

	/**
	 * Declaration of constructor
	 * 
	 * @param name
	 *            String of name
	 * @param id
	 *            - String of id
	 * @param description
	 *            - String of description
	 */
	public Showpiece(String name, String id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}

	/**
	 * Method for get name
	 * 
	 * @return - String name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name
	 * 
	 * @param name
	 *            - string name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method for get id
	 * 
	 * @return - string id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Method for set id
	 * 
	 * @param id
	 *            - string id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Method for get description
	 * 
	 * @return - string of description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Method for set description
	 * 
	 * @param description
	 *            - string description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	// Method with compare object of showpiece order by name
	@Override
	public int compareTo(Showpiece o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.name);
	}

	/**
	 * To string method
	 */
	@Override
	public String toString() {
		return "Name: " + name + ", id: " + id + ", description: "
				+ description + "\n";
	}

}
