package ba.bitcamp.exercise.taskforhomework;

public abstract class Network {

	private String name;
	private Computer[] comp;

	public Network(String name) {
		super();
		this.name = name;
		this.comp = new Computer[0];

	}
	

	public Computer[] getComp() {
		return comp;
	}


	public void setComp(Computer[] comp) {
		this.comp = comp;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public abstract void addComputer(Computer c);

	public abstract void removeComputer(Computer c);

}
