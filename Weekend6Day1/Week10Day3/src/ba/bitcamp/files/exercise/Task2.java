package ba.bitcamp.files.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException {
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		JFileChooser jfc = new JFileChooser(System.getProperty("user.desktop"));
		File f = null;
		int tmp = jfc.showOpenDialog(null);
		if (tmp == JFileChooser.APPROVE_OPTION) {
			f = jfc.getSelectedFile();
		}
		try {

			BufferedReader bf = new BufferedReader(new FileReader(f));

			while (bf.ready()) {

				String line = bf.readLine();

				if (line.charAt(line.length() - 1) == '1')

					count++;

				if (line.charAt(line.length() - 1) == '2')

					count1++;

				if (line.charAt(line.length() - 1) == '3')

					count2++;

				if (line.charAt(line.length() - 1) == '4')

					count3++;

				if (line.charAt(line.length() - 1) == '5')

					count4++;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("One pair: " + count);
		System.out.println("Two pairs: " + count1);
		System.out.println("Three of a kind: " + count2);
		System.out.println("Straight " + count3);
		System.out.println("Flush " + count4);

	}

}
