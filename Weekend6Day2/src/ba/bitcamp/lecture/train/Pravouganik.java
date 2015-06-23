package ba.bitcamp.lecture.train;

public class Pravouganik implements ITijelo {

	private double a;
	private double b;

	public Pravouganik(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double povrsina() {
		
		return a * b;
	}

	@Override
	public double obim() {
		
		return 2 * (a + b);
	}

	@Override
	public String toString() {
		return String.format("Pravouganik ( a = %f, b= %f)", a ,b);
	}

	
	
	

}
