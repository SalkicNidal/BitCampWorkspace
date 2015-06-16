package ba.bitcamp.lectures.task1;

public class User {

	private static int userCount = 0;

	private String name;
	private String surname;
	private Integer age;
	private Integer id;

	public User(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = 0;
		this.id = ++userCount;
	}

	public User(String name, String surname, Integer age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.id = ++userCount;
	}

	// Konstruktor koji zove gornji konstruktor
	public User(User other) {
		this(other.name, other.surname, other.age);
		userCount--;
		this.id = other.id;
	}

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

	public int getId() {
		return id;
	}

	public String toString() {
		String output = String.format("Name: %s, Surname: %s, ID: %d", name,
				surname, id);
		return output;
	}

	public boolean equals(User other) {
		if (this.name.equals(other.name) && this.surname.equals(other.surname)
				&& this.age.equals(other.age) && this.id.equals(other.id)) {
			return true;
		} else {
			return false;
		}
	}
}
