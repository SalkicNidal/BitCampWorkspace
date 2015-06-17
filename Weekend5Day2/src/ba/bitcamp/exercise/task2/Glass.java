package ba.bitcamp.exercise.task2;

public class Glass {

	private String types;
	private int amount;
	private int max;

	// Declaration of constructor with parameters max amount of water
	public Glass(int max) {
		super();
		this.types = "";
		this.amount = 0;
		this.max = max;
	}

	/**
	 * Method for get type of liquid
	 * 
	 * @return - String type
	 */
	public String getTypeOfLiquid() {
		return types;

	}

	/**
	 * Method for get maxAmount
	 * 
	 * @return - max amount
	 */
	public int getMaxAmount() {
		return max;
	}

	/**
	 * Get the currently amount
	 * 
	 * @return
	 */
	public int getCurrentlyAmount() {
		return max -= amount;
	}
	
	public void setType(String a){
		this.types = a;
	}

	/**
	 * Method for add liquid type and liquid amount
	 * 
	 * @param a
	 *            - Type of liquid
	 * @param b
	 *            - Amount of liquid
	 */
	public void addLiquid(String a, int b) {
		if (!a.equals(this.types)) {
			System.out.println("Types of liquid is diffrent");;
		} else {
			this.types.equals(a);
			this.amount += b;
			if (this.amount > max) {
				this.amount = max;
			}
		}
	}
 
	/**
	 * Method which empty glass
	 */
	public void emptyGlass() {
		this.types.equals(null);
		this.amount = 0;
	}

	
	public String toString() {
		return "Glass types is " + types + ", amount is " + amount + ", max is " + max
				+ ".";
	}
	

}
