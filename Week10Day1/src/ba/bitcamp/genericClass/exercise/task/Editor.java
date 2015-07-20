package ba.bitcamp.genericClass.exercise.task;

public class Editor extends Application {

	
	private boolean isFreeware;
	private Type type;

	public Editor(String name, Integer year, Double version, Integer size,
			boolean isFreeware, Type type) {
		
		super(name, year, version, size);
		this.isFreeware = isFreeware;
		this.type = type;
	}
	
	public  enum Type{
		TEXT , PHOTO, VIDEO ;
		
	}

	public boolean isFreeware() {
		return isFreeware;
	}

	public void setFreeware(boolean isFreeware) {
		this.isFreeware = isFreeware;
	}

	@Override
	public String toString() {
		return "Editor FREEWARE is: " + isFreeware + ".";
	}
	
	
	
	
	

}
