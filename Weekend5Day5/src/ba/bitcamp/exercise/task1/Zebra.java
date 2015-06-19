package ba.bitcamp.exercise.task1;

/**
 * This class present animal Zebra with specified attributes. Class is extends
 * with class Animal
 * 
 * @author nidal.salkic
 *
 */
public class Zebra extends Animal {

	public static final int HEALTHY = 0;
	public static final int ILL = 1;
	public static final int DEATHLY = 2;

	private int age;
	private int condition;

	/**
	 * Declaration of constructor of Zebra
	 * 
	 * @param isLive
	 *            - attributes from class LifeForm
	 * @param weigth
	 *            - attributes from class Animal
	 * @param mainFood
	 *            - attributes from class Animal FOOD_ANIMAL = 0, FOOD_PLANT = 1
	 * @param age
	 *            - number of years to month
	 * @param condition
	 *            - EALTHY = 0; ILL = 1; DEATHLY = 2;
	 */
	public Zebra(Boolean isLive, Integer weigth, int mainFood, int age,
			int condition) {

		super(isLive, weigth, mainFood);
		this.age = age;
		this.condition = condition;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public void eat(LifeForm l) {

		if (this.getIsLive().equals(true) && l instanceof Plants) {
			Plants p = (Plants) l;
			if (this.condition == Zebra.HEALTHY && p.getQuantity() == p.MEDIUM
					|| p.getQuantity() == p.LOT) {
					System.out.println("Zao mi je pojela si pogresnu bilju, umiresss");
					this.condition = Zebra.DEATHLY;
			}else if 
		}

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zebra other = (Zebra) obj;
		if (age != other.age)
			return false;
		if (condition != other.condition)
			return false;
		return true;
	}

	@Override
	public String toString() {
		super.toString();
		String l = "";
		if (super.getIsLive().equals(true)) {
			l += super.toString();
			l += "Zebra age is " + age;
			if (condition == HEALTHY) {
				l += "condition of animal is healthy";
			} else if (condition == ILL) {
				l += " condition of animal is ill ";
			} else {
				l += " condition of animal is deathly";
			}
		} else {
			l += "ZEbra is not a live";
		}
		return l;
	}

}
