package ba.bitcamp.exercise.tasks;

/**
 * This class present the desktop computer with specified attributes extends
 * with class of StationaryComputer
 * 
 * @author nidal.salkic
 *
 */
public class DesktopComputer extends StationaryComputer {

	private Integer freeSpaceForRam;
	private Boolean isOverclock;
	private Boolean hasOpticalDrive;

	public Integer getFreeSpaceForRam() {
		return freeSpaceForRam;
	}

	public void setFreeSpaceForRam(Integer freeSpaceForRam) {
		this.freeSpaceForRam = freeSpaceForRam;
	}

	public Boolean getIsOverclock() {
		return isOverclock;
	}

	public void setIsOverclock(Boolean isOverclock) {
		this.isOverclock = isOverclock;
	}

	public Boolean getHasOpticalDrive() {
		return hasOpticalDrive;
	}

	public void setHasOpticalDrive(Boolean hasOpticalDrive) {
		this.hasOpticalDrive = hasOpticalDrive;
	}

	
	public void printTypeOfInfo() {
		System.out.println("The computer is designed for widespread use"); 
	}

	@Override
	public String toString() {
		return "DesktopComputer. Free space for ram is" + freeSpaceForRam
				+ ", isOverclock " + isOverclock + ", hasOpticalDrive "
				+ hasOpticalDrive + ".";
	}
	
	

}
