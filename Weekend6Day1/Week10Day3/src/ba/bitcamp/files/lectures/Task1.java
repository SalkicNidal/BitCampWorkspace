package ba.bitcamp.files.lectures;
import java.io.File;

public class Task1 {

	public static void main(String[] args) {

		String line = System.getProperty("user.home");
		System.out.println(line);

		String[] test;
		File file = new File(System.getProperty("user.home"));
		
		if (file.exists() && file.isDirectory()) {
			test = file.list();
			for (int i = 0; i < test.length; i++) {
				System.out.println(test[i]);
			}
		} else {
			System.out.println("Error");
		}

	}

}
