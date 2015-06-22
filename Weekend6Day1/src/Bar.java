public class Bar implements Compare {

	private String name;

	public Bar(String name) {
		super();
		this.name = name;
	}

	// public int compare(Bar other) {
	//
	// if (this.name.length() > other.name.length()) {
	// return 1;
	// } else if (this.name.length() == other.name.length()) {
	// return 0;
	// } else if (this.name.length() < other.name.length()) {
	// return -1;
	// }
	// return 0;
	//
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "This name is longer " + name + ".";
	}

	public int comapre(Object o) {

		if (o instanceof Bar) {
			Bar other = (Bar) o;
			if (this.name.length() > other.name.length()) {
				return 1;
			} else if (this.name.length() == other.name.length()) {
				return 0;
			} else if (this.name.length() < other.name.length()) {
				return -1;
			}
			return 0;

		} else {
			throw new IllegalArgumentException();
		}
	}

}
