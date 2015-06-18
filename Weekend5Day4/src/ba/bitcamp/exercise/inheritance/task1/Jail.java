package ba.bitcamp.exercise.inheritance.task1;

public class Jail extends Building{

	public Integer numberOfCells;
	public Integer numberOfFreeCells;
	public String securityLevel;
	public Boolean hasGym;
	
	public int getNumberOfOcupiedCells(){
		return numberOfCells - numberOfFreeCells;
	}
}
