package ba.bitcamp.files.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JFileChooser;

public class Task3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		
		JFileChooser jfc = new JFileChooser("user/desktop");
		File f = null;
		int tmp = jfc.showOpenDialog(null);
		if (tmp == JFileChooser.APPROVE_OPTION) {
			f = jfc.getSelectedFile();
		}

		try {
			BufferedReader bf = new BufferedReader(new FileReader(f));

			while (bf.ready()) {

				String line = bf.readLine();
				line = line.replace("-", " ");
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					String test = st.nextToken();

					if (test.length() > 3 && test.length() < 6) {

						test = test.replace(".", "");
						test = test.replace(",", "");
						test = test.replace(":", "");
						test = test.replace("s", "");

						try {
							int a = Integer.parseInt(test);
							if (a <= 2015) {

								nums.add(a);

							}
						} catch (NumberFormatException e) {

						}
					}
				}

			}

		} catch (IOException | NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(nums);

	}
}
