package ba.bitcamp.exercise.tasks;

/**
 * This class present the personal computer with specified attributes and thez
 * are super class
 * 
 * 
 * @author nidal.salkic
 *
 */
public abstract class PersonalComputer {

	private String operatingSystem;
	private Integer ram;
	private Integer value;

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	public void printTypeOfInfo(){
		
	
	}

}
