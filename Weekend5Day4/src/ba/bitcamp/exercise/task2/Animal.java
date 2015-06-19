package ba.bitcamp.exercise.task2;

public abstract class Animal {
	
	private boolean hasFur;
	private boolean isMammal;
	
	

	public Animal(boolean hasFur, boolean isMammal) {
		super();
		this.hasFur = hasFur;
		this.isMammal = isMammal;
	}
	public boolean isHasFur() {
		return hasFur;
	}
	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	public boolean isMammal() {
		return isMammal;
	}
	public void setMammal(boolean isMammal) {
		this.isMammal = isMammal;
	}
	
	
	@Override
	public String toString() {
		return "Animal [hasFur=" + hasFur + ", isMammal=" + isMammal + "]";
	}
	
	
	
	

}
