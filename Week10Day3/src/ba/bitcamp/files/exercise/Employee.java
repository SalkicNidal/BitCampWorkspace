package ba.bitcamp.files.exercise;

public class Employee implements Comparable<Employee> {

	private String name;
	private String surname;
	private String gender;
	private String position;
	private String salary;

	public Employee(String name, String surname, String gender,
			String position, String salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Employee name: " + name + "\nsurname: " + surname
				+ "\ngender: " + gender + "\nposition: " + position
				+ "\nsalary: " + salary + ".";
	}

}
