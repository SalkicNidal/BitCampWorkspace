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
		System.out.println("A computer designed for portability and functionality"); 
		
		
	}

}
