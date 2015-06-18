package ba.bitcamp.exercise.inheritance.task1;

public class Building {

	public String location;
	public Integer population;
	public Integer area;
	
	
	public double getPopulationDensty(){
		return (double)(population/area);
	}
}
