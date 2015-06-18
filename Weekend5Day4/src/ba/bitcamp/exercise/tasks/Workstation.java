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
		System.out.println("A computer designed for research work");
	}
}
