package ba.bitcamp.exercise.tasks;

/**
 * This class present the pocket PC with specified attributes and extends with
 * class Portable Computer
 * 
 * @author nidal.salkic
 *
 */
public class PocketPC extends PortableComputer {

	private Boolean hasTouchInterface;
	private Boolean supportSIM;
	private Boolean supportMicroSD;

	public PocketPC(String operatingSystem, Integer ram, Integer value,
			Integer weightOfComputer, Integer sizeOfDisplay, Boolean hasWiFi,
			Boolean hasTouchInterface, Boolean supportSIM,
			Boolean supportMicroSD) {
		super(operatingSystem, ram, value, weightOfComputer, sizeOfDisplay,
				hasWiFi);
		this.hasTouchInterface = hasTouchInterface;
		this.supportSIM = supportSIM;
		this.supportMicroSD = supportMicroSD;
	}

	public Boolean getHasTouchInterface() {
		return hasTouchInterface;
	}

	public void setHasTouchInterface(Boolean hasTouchInterface) {
		this.hasTouchInterface = hasTouchInterface;
	}

	public Boolean getSupportSIM() {
		return supportSIM;
	}

	public void setSupportSIM(Boolean supportSIM) {
		this.supportSIM = supportSIM;
	}

	public Boolean getSupportMicroSD() {
		return supportMicroSD;
	}

	public void setSupportMicroSD(Boolean supportMicroSD) {
		this.supportMicroSD = supportMicroSD;
	}

	public void printTypeOfInfo() {
		super.printTypeOfInfo();
		System.out.println("Has touch interface" + this.hasTouchInterface
				+ "suport SIM" + this.supportSIM + " suport MicroSd"
				+ this.supportMicroSD);
	}

	@Override
	public String toString() {
		return "PocketPC [hasTouchInterface=" + hasTouchInterface
				+ ", supportSIM=" + supportSIM + ", supportMicroSD="
				+ supportMicroSD + "]";
	}

}
