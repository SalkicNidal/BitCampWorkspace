package ba.bitcamp.exercise.tasks;

/**
 * this class present Laptop with specified attributes and extends with class
 * PortableComputer
 * 
 * @author nidal.salkic
 *
 */
public class Laptop extends PortableComputer {
	
	private Integer numberOfcells;
	private Boolean hasBluetooth;
	private Boolean hasNumeric;
	
	
	
	public Integer getNumberOfcells() {
		return numberOfcells;
	}
	public void setNumberOfcells(Integer numberOfcells) {
		this.numberOfcells = numberOfcells;
	}
	public Boolean getHasBluetooth() {
		return hasBluetooth;
	}
	public void setHasBluetooth(Boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}
	public Boolean getHasNumeric() {
		return hasNumeric;
	}
	public void setHasNumeric(Boolean hasNumeric) {
		this.hasNumeric = hasNumeric;
	}
	
	public void printTypeOfInfo() {
		System.out.println("A computer designed for portability"); 
	}
	

}
