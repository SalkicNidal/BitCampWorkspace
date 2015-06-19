package ba.bitcamp.exercise.tasks;

/**
 * This class present the Work Station with specified attributes and extend with
 * class StationaryComputer
 * 
 * @author nidal.salkic
 *
 */
public class Workstation extends StationaryComputer {

	private Integer numberOfDisplay;
	private Integer numberOfprocessorCores;
	private Boolean hasECCmemory;

	public Workstation(String operatingSystem, Integer ram, Integer value,
			Integer speedOfProcesor, Integer powerSupply,
			Integer capacityOfHardDisk, Integer numberOfDisplay,
			Integer numberOfprocessorCores, Boolean hasECCmemory) {
		super(operatingSystem, ram, value, speedOfProcesor, powerSupply,
				capacityOfHardDisk);
		this.numberOfDisplay = numberOfDisplay;
		this.numberOfprocessorCores = numberOfprocessorCores;
		this.hasECCmemory = hasECCmemory;
	}

	public Integer getNumberOfDisplay() {
		return numberOfDisplay;
	}

	public void setNumberOfDisplay(Integer numberOfDisplay) {
		this.numberOfDisplay = numberOfDisplay;
	}

	public Integer getNumberOfprocessorCores() {
		return numberOfprocessorCores;
	}

	public void setNumberOfprocessorCores(Integer numberOfprocessorCores) {
		this.numberOfprocessorCores = numberOfprocessorCores;
	}

	public Boolean getHasECCmemory() {
		return hasECCmemory;
	}

	public void setHasECCmemory(Boolean hasECCmemory) {
		this.hasECCmemory = hasECCmemory;
	}

	public void printTypeOfInfo() {
		super.printTypeOfInfo();
		System.out.println("Number of display is " + this.numberOfDisplay
				+ " number of procesor is " + this.numberOfprocessorCores
				+ " has ECC:" + this.hasECCmemory);
	}

	@Override
	public String toString() {
		return "Workstation [numberOfDisplay=" + numberOfDisplay
				+ ", numberOfprocessorCores=" + numberOfprocessorCores
				+ ", hasECCmemory=" + hasECCmemory + "]";
	}

}
