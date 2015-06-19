package ba.bitcamp.exercise.tasks;

/**
 * This class present portable computer with specified attributes extends with
 * class PersonalComputer
 * 
 * @author nidal.salkic
 *
 */
public abstract class PortableComputer extends PersonalComputer {

	private Integer weightOfComputer;
	private Integer sizeOfDisplay;
	private Boolean hasWiFi;

	public PortableComputer(String operatingSystem, Integer ram, Integer value,
			Integer weightOfComputer, Integer sizeOfDisplay, Boolean hasWiFi) {
		super(operatingSystem, ram, value);
		this.weightOfComputer = weightOfComputer;
		this.sizeOfDisplay = sizeOfDisplay;
		this.hasWiFi = hasWiFi;

	}

	public Integer getWeightOfComputer() {
		return weightOfComputer;
	}

	public void setWeightOfComputer(Integer weightOfComputer) {
		this.weightOfComputer = weightOfComputer;
	}

	public Integer getSizeOfDisplay() {
		return sizeOfDisplay;
	}

	public void setSizeOfDisplay(Integer sizeOfDisplay) {
		this.sizeOfDisplay = sizeOfDisplay;
	}

	public Boolean getHasWiFi() {
		return hasWiFi;
	}

	public void setHasWiFi(Boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

	public void printTypeOfInfo() {
		super.printTypeOfInfo();
		System.out.println(" Weight of computer is " + this.weightOfComputer
				+ " size of display is " + this.sizeOfDisplay + " has WiFi:"
				+ this.hasWiFi);
	}

}
