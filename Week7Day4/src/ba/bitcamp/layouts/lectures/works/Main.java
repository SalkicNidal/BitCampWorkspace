package ba.bitcamp.layouts.lectures.works;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {

		JFrame window = new JFrame("Layouts");
		JPanel container = new JPanel();

		container.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

		JButton[] buttons = new JButton[50];

		for (int i = 0; i < buttons.length; i++) {
			int num = (int) (Math.random() * 256);
			int num1 = (int) (Math.random() * 256);
			int num2 = (int) (Math.random() * 256);
			buttons[i] = new JButton("Button" + i);
			buttons[i].setPreferredSize(new Dimension(100, 100));
			buttons[i].setBackground(new Color(num, num1, num2));
			buttons[i].setForeground(new Color(255 - num, 255 - num1,
					255 - num2));
			buttons[i].setOpaque(true);
			// buttons[i].setBorder(BorderFactory.createEmptyBorder(20, 0 , 0
			// ,0));
			 buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK,
			 5, true));
			//buttons[i].setBorder(BorderFactory.createMatteBorder(5, 5, 10,
			// 10, Color.BLACK));
			//buttons[i].setBorder(BorderFactory.createEtchedBorder());
			if ( i % 2  ==0)
			buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
			else
				buttons[i].setBorder(BorderFactory.createLoweredBevelBorder());
			container.add(buttons[i]);
		}

		// container.add(buttons[0], BorderLayout.EAST);
		// container.add(buttons[1], BorderLayout.WEST);
		// container.add(buttons[2], BorderLayout.SOUTH);
		// container.add(buttons[3], BorderLayout.NORTH);

		window.add(container);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600, 600);
		window.setVisible(true);

	}

}
