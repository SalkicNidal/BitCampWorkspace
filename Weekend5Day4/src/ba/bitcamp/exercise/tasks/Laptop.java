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
	
	
	public Laptop(String operatingSystem, Integer ram, Integer value,
			Integer weightOfComputer, Integer sizeOfDisplay, Boolean hasWiFi,
			Integer numberOfcells, Boolean hasBluetooth, Boolean hasNumeric) {
		super(operatingSystem, ram, value, weightOfComputer, sizeOfDisplay,
				hasWiFi);
		this.numberOfcells = numberOfcells;
		this.hasBluetooth = hasBluetooth;
		this.hasNumeric = hasNumeric;
		
	}
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
	
	@Override
	public void printTypeOfInfo() {
		super.printTypeOfInfo();
		System.out.println("A computer designed for portability"); 
		
	}
	@Override
	public String toString() {
		return "Laptop [numberOfcells=" + numberOfcells + ", hasBluetooth="
				+ hasBluetooth + ", hasNumeric=" + hasNumeric + "]";
	}
	
	
	

}
