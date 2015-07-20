package ba.bitcamp.genericClass.exercise.task;

public class Application {

	private String name;
	private Integer year;
	private Double version;
	private Integer size;

	public Application(String name, Integer year, Double version, Integer size) {
		super();
		this.name = name;
		this.year = year;
		this.version = version;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Application information is: " + name + " " + year
				+ ", version: " + version + ", " + size + " MB.";
	}

}
