package ba.bitcamp.layouts.lectures.works;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorPicker   extends JFrame{
	
	
	private int red;
	private int green;
	private int blue;
	private JButton click;
	private JFrame window = new JFrame();
	private JPanel colormix = new JPanel(new FlowLayout(FlowLayout.LEADING));
	private static Color[] supportedColors = new Color[] {Color.RED, Color.BLACK, Color.BLUE, Color.MAGENTA, Color.GREEN};

	
	
	public ColorPicker(int width, int height){
		
		
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
		JPanel color = new JPanel(new FlowLayout(FlowLayout.LEADING, 0,0));
		
		JButton[] buttons = new JButton[supportedColors.length];
		for ( int i = 0; i < supportedColors.length; i++){
			buttons[i] = new JButton();
			buttons[i].setBackground(supportedColors[i]);
			buttons[i].setPreferredSize(new Dimension(100, 50));
			buttons[i].setOpaque(true);
//			buttons[i].setBorderPainted(false);
			 buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK,
					 5, true));
//			buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					for ( int i = 0; i < supportedColors.length; i++){
					buttons[i].setBorder(BorderFactory.createLoweredBevelBorder());
					buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
				
					}
					
				}
			});
			color.add(buttons[i]);
		}
		
		
		
		JLabel redLabel = new JLabel("Red");
		redLabel.setForeground(Color.RED);
		JLabel greenLabel = new JLabel("Green");
		greenLabel.setForeground(Color.GREEN);
		JLabel blueLabel = new JLabel("Blue");
		blueLabel.setForeground(Color.BLUE);

		
		colormix.add(click);
		colormix.add(redLabel);
		colormix.add(redSlider);
		colormix.add(greenLabel);
		colormix.add(greenSlider);
		colormix.add(blueLabel);
		colormix.add(blueSlider);
		
		
		add(window.add(color));
		add(window.add(colormix));
		
		
	}
	
	private void intiSlider(JSlider slider, String name, Dimension d) {

		slider.setName(name);
		slider.setPreferredSize(d);
		slider.setValue(0);
		slider.setMinorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setOrientation(JSlider.VERTICAL);
		
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
	
	
	private void updateButton() {

		click.setBackground(new Color(red, green, blue));
		click.setForeground(new Color(255 - red, 255 - green, 255 - blue));

	}
	
	public static void main(String[] args) {
		
		
		new ColorPicker(300, 500);
	}
	
	

}
