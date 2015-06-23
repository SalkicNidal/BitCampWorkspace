package ba.bitcamp.exercise.taskforhomework;

public abstract class Computer  {

	// Attributes of computer
	private String name;
	private MacAddress Mac;

	/**
	 * Constructor for computer
	 * 
	 * @param name
	 *            - string name of computer
	 * @param mac
	 *            - Mac address
	 */
	public Computer(String name, char[] mac) {
		super();
		this.name = name;
		Mac = new MacAddress(mac);
	}

	/**
	 * Default constructor for computer , name is NoName, Mac address is null;
	 */
	public Computer() {
		super();
		this.name = "NoName";
		Mac = null;

	}

	public String getName() {
		return name;
	}

	public MacAddress getMac() {
		return Mac;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (Mac == null) {
			if (other.Mac != null)
				return false;
		} else if (!Mac.equals(other.Mac))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	

	/**
	 * Inner class which present MacAddress with array of characters
	 * 
	 * @author nidal.salkic
	 *
	 */
	public class MacAddress {

		char[] characters = new char[16];
	
		public MacAddress(char[] characters) {
			super();
			this.characters = characters;
		}

		/**
		 * Remove character ':' from Mac address
		 * 
		 * @return String of Mac address without ':'
		 */
		public String removeChar() {
			String s = " ";
			for (int i = 0; i < characters.length; i++) {
				if (characters[i] != (':')) {
					s += characters[i] + " ";
				} else {
					s += "";
				}
			}
			return s;

		}
		
		@Override
		public String toString() {
			return "Computer MAC Address without ':' is: " + Mac.removeChar() + ".";
		}
	}

}
