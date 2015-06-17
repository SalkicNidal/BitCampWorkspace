package ba.bitcamp.lectures.task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee("John", "male");
		System.out.println(e);
		
		SalaryEmployee se = new SalaryEmployee("Sue","Female", 2000);
		System.out.println(se);
		
		HourlyEmployee he = new HourlyEmployee("Joe", "male", 15);
		System.out.println(he);
		
	}

}
