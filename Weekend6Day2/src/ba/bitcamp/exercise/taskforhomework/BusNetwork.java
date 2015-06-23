package ba.bitcamp.exercise.taskforhomework;

public class BusNetwork extends Network implements Functionable {

	public BusNetwork(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isFunctionable() {
		
	
		int counter = 0;
		for (int i = 0; i < getComp().length; i++) {
			if (getComp()[i] instanceof Client) {
				Client c1 = (Client) getComp()[i];
				if (c1.isConnect() == true) {
					counter++;
				}
			}
		}
		if (counter >= 2) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void addComputer(Computer c) {

		ArrayManipulation.extendArray(super.getComp());
		super.getComp()[super.getComp().length - 1] = c;

		if (c instanceof Client) {
			Client c1 = (Client) (c);
			c1.connect(this);

		} else {
			throw new ClassCastException();

		}

	}

	@Override
	public void removeComputer(Computer c) {

		if (c instanceof Client) {
			Client c1 = (Client) c;
			for (int i = 0; i < getComp().length; i++) {
				if (c.equals(getComp()[i])) {
					ArrayManipulation.shrinkArray(getComp(), i);
					c1.disconnect();
					return;

				} else {
					throw new UnsupportedOperationException();
				}
			}
			throw new UnsupportedOperationException();

		}
	}

	@Override
	public String toString() {
		return "BusNetwork []";
	}
	
	

	
	
	
}
