package ba.bitcamp.exercise.test;

/**
 * This class present employee with specified attributes
 * 
 * @author nidal.salkic
 *
 */
public class Employee {

	private String name;
	private String surname;
	private Integer age;
	private String gender;
	private Integer salary;
	private PositionDetails position;

	/**
	 * Declaration of employee constructor
	 * 
	 * @param name
	 *            - string name
	 * @param surname
	 *            - string surname
	 * @param age
	 *            - integer age
	 * @param gender
	 *            - string gender
	 * @param salary
	 *            - integer salary
	 * @param position
	 *            - enum of position details
	 */
	public Employee(String name, String surname, Integer age, String gender,
			Integer salary, PositionDetails position) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.position = position;
	}

	/**
	 * Enum with specified s
	 * 
	 * @author nidal.salkic
	 *
	 */
	public enum PositionDetails {

		BOS, MANAGER, SECRETARY, WORKER
	}

	// ///////////////////////////////////

	// Get and set methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public PositionDetails getPosition() {
		return position;
	}

	public void setPosition(PositionDetails position) {
		this.position = position;
	}

	// /////////////////////////////////////////////

	/**
	 * To string method
	 */
	@Override
	public String toString() {
		return "Employee name is " + name + " surname is " + surname
				+ ",\nage is " + age + ", gender: " + gender + ", \nsalary is "
				+ salary + ", position is " + position + "\n";
	}

}
