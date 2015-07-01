package ba.bitcamp.lectures.works;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorMix extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2673968178655675068L;

	private int red;
	private int green;
	private int blue;
	private JButton click;

	public ColorMix(int width, int height) {

		initButton(width, height);
		updateButton();

		int sliderHeight = height / 12;
		Dimension sliderDimension = new Dimension(width - 50, sliderHeight);

		// Sliders
		JSlider redSlider = new JSlider(0, 255);
		intiSlider(redSlider, "red", sliderDimension);

		JSlider greenSlider = new JSlider(0, 255);
		intiSlider(greenSlider, "green", sliderDimension);

		JSlider blueSlider = new JSlider(0, 255);
		intiSlider(blueSlider, "blue", sliderDimension);

		// labels
		JLabel redLabel = new JLabel("Red");
		redLabel.setForeground(Color.RED);
		JLabel greenLabel = new JLabel("Green");
		greenLabel.setForeground(Color.GREEN);
		JLabel blueLabel = new JLabel("Blue");
		blueLabel.setForeground(Color.BLUE);

		add(click);
		add(redLabel);
		add(redSlider);
		add(greenLabel);
		add(greenSlider);
		add(blueLabel);
		add(blueSlider);

	}

	private void intiSlider(JSlider slider, String name, Dimension d) {

		slider.setName(name);
		slider.setPreferredSize(d);
		slider.setValue(0);
		slider.setMinorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				JSlider changed = (JSlider)e.getSource();
				
				//String name = changed.getName();
				
				switch( name){
				
				case "red":
					red = changed.getValue();
					break;
				case "green":
					green = changed.getValue();
					break;
				case "blue":
					blue = changed.getValue();
					break;
					
				}
				updateButton();
			}
		});

	}

	private void initButton(int width, int height) {
		
		
		click = new JButton("Click me");
		click.setFont(new Font("Serif", Font.BOLD, 25));
		click.setPreferredSize(new Dimension(width, height / 2));
		click.setOpaque(true);
		click.setBorderPainted(false);

		click.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Clipboard clip = Toolkit.getDefaultToolkit()
						.getSystemClipboard();
				String copy = String.format("%d,%d,%d", red, green, blue);
				clip.setContents(new StringSelection(copy), null);

			}
		});

	}

	private void updateButton() {

		click.setBackground(new Color(red, green, blue));
		click.setForeground(new Color(255 - red, 255 - green, 255 - blue));

	}

	public static void main(String[] args) {

		JFrame window = new JFrame("Picker");

		ColorMix cm = new ColorMix(500, 600);

		window.add(cm);
		window.setSize(500, 500);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
