package ba.bitcamp.exercise.tasks;

/**
 * This class present the Stationary Computer with specified attributes and
 * extends with class PersonalComputer
 * 
 * @author nidal.salkic
 *
 */
public class StationaryComputer extends PersonalComputer {

	private Integer speedOfProcesor;
	private Integer powerSupply;
	private Integer capacityOfHardDisk;

	public StationaryComputer(String operatingSystem, Integer ram,
			Integer value, Integer speedOfProcesor, Integer powerSupply,
			Integer capacityOfHardDisk) {
		super(operatingSystem, ram, value);
		this.speedOfProcesor = speedOfProcesor;
		this.powerSupply = powerSupply;
		this.capacityOfHardDisk = capacityOfHardDisk;
	}

	public Integer getSpeedOfProcesor() {
		return speedOfProcesor;
	}

	public void setSpeedOfProcesor(Integer speedOfProcesor) {
		this.speedOfProcesor = speedOfProcesor;
	}

	public Integer getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(Integer powerSupply) {
		this.powerSupply = powerSupply;
	}

	public Integer getCapacityOfHardDisk() {
		return capacityOfHardDisk;
	}

	public void setCapacityOfHardDisk(Integer capacityOfHardDisk) {
		this.capacityOfHardDisk = capacityOfHardDisk;
	}

	@Override
	public void printTypeOfInfo() {
		super.printTypeOfInfo();
		System.out.println("Stationary computer speed of procesor is "
				+ speedOfProcesor + " ,power supply is " + powerSupply
				+ " , capacity of ram is " + capacityOfHardDisk);
	}
}
