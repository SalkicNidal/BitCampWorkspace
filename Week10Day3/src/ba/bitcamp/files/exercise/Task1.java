package ba.bitcamp.files.exercise;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class Task1 {

	public static void main(String[] args) {

		JFileChooser jfc = new JFileChooser(System.getProperty("user.desktop"));
		File f = null;
		int tmp = jfc.showOpenDialog(null);
		if (tmp == JFileChooser.APPROVE_OPTION) {
			f = jfc.getSelectedFile();
		}
		BufferedReader bf = null;
        ArrayList<Employee> names = new ArrayList<Employee>();
		try {
			bf = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			bf.readLine();

			while (bf.ready()) {

				String line = bf.readLine();
				StringTokenizer st = new StringTokenizer(line, ",");

				String name = st.nextToken();
				String surname = st.nextToken();
				String gender = st.nextToken();
				String position = st.nextToken();
				String salary = st.nextToken();

				names.add(new Employee(name, surname, gender, position, salary));

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Collections.sort(names);
		System.out.println(names);
	}

}
