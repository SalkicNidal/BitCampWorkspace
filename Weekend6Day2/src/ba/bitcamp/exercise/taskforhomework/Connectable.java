package ba.bitcamp.exercise.taskforhomework;

/**
 * Interface connectable
 * @author nidal.salkic
 *
 */
public interface Connectable {

	void connect (Computer c);
	void connect (Network n);
	void disconnect();
}
