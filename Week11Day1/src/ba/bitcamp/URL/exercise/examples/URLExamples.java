package ba.bitcamp.URL.exercise.examples;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class URLExamples {

	public static void main(String[] args) {
		URL url1 = null;
		try {
			url1 = new URL(
					"http://coolwildlife.com/wp-content/uploads/galleries/post-531/Wolf%20Pictures%20001.jpg");
		} catch (MalformedURLException e) {
			System.out.println("Bad URL");
			e.printStackTrace();
			System.exit(1);
		}

		ImageIcon imageIcon = new ImageIcon(url1);
		JFrame frame = new JFrame();
		frame.add(new JLabel(imageIcon));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);

		// Another example

		try {
			BufferedImage image = ImageIO.read(url1);
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
			System.exit(3);
		}

		try {
			
			URLConnection con = url1.openConnection();
			System.out.println(con.getContent());

			InputStream in = con.getInputStream();
			File file = new File("output.jpg");
			FileOutputStream fileWrite = new FileOutputStream(file);

			byte[] data = new byte[1024];
			int bytesRead;

			// Radi dok ima sta ucitati
			while ((bytesRead = in.read(data, 0, data.length)) > 0) {
				
				fileWrite.write(data, 0, bytesRead);
			}
			
			fileWrite.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
