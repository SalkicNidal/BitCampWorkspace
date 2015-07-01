package ba.bitcamp.exercise.works;

import javax.swing.JOptionPane;

public class Task4 {

	public Task4() {

	}

	public static void main(String[] args) {

		Integer num = 0;
		int sum = 0;
		boolean s = true;
		while (s) {
			try {

				String s1 = JOptionPane.showInputDialog("Enter the number");
				if (s1.equals(null)) {
					throw new NullPointerException("");

				} else {
					num = Integer.parseInt(s1);
					sum += num;

					if (num == JOptionPane.CANCEL_OPTION) {
						JOptionPane.showMessageDialog(null, "" + sum);
					} else {
						int choice = JOptionPane.showConfirmDialog(null,
								"Enter again");
						if (choice == JOptionPane.YES_OPTION) {
							s = true;
						} else if (choice == JOptionPane.NO_OPTION) {
							JOptionPane.showMessageDialog(null, "" + sum);
							s = false;
						} else if (choice == JOptionPane.CANCEL_OPTION) {
							System.exit(3);
							s = false;
							JOptionPane.showMessageDialog(null,
									"Okay, you canceled.");
						}
					}
				}
			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, "Wrong input");
				System.exit(3);

			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "" + sum);
				System.exit(3);
			}
		}
	}

}
