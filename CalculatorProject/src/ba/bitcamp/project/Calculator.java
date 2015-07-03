package ba.bitcamp.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private static final long serialVersionUID = -2055799360270358389L;

	private String s = " ";
	private String s1 = " ";
	private double first = 0;
	private boolean check = true;
	private char tmp;
	private int counter;
	private JPanel display = new JPanel();
	private JPanel numPad = new JPanel();
	private JPanel operation = new JPanel();
	private JPanel remove = new JPanel();
	private JTextField info = new JTextField(s);
	private JTextField info1 = new JTextField(s1);
	private JButton[] buttons = new JButton[12];
	private char characters[] = { '+', '-', '/', 'x' };
	private JButton[] buttons1 = new JButton[characters.length];
	private String symbols[] = { "AC", " C ", " ON/OFF " };
	private JButton[] buttons2 = new JButton[symbols.length];
	private Font f = new Font("Serif", Font.BOLD, 25);

	public Calculator() {

		setLayout(new BorderLayout());

		add(display, BorderLayout.NORTH);
		add(numPad, BorderLayout.CENTER);
		add(operation, BorderLayout.EAST);
		add(remove, BorderLayout.WEST);

		display.setBorder(BorderFactory.createTitledBorder("Display"));
		numPad.setBorder(BorderFactory.createTitledBorder("Num Pad"));
		operation.setBorder(BorderFactory.createTitledBorder("Operation"));
		remove.setBorder(BorderFactory.createTitledBorder("Casio"));

		// Set buttons for numeric pad
		numPad.setLayout(new GridLayout(4, 4));
		for (int i = 0; i < 10; i++) {
			buttons[i] = new JButton("" + (9 - i));
			buttons[i].setPreferredSize(new Dimension(10, 20));
			buttons[i].setFont(f);
			buttons[i].setBackground(Color.DARK_GRAY);
			buttons[i].setOpaque(true);
			buttons[i].setBorderPainted(true);
			buttons[i].addActionListener(new ActionNum());
			numPad.add(buttons[i]);
		}

		// Set assist buttons
		buttons[10] = new JButton(".");
		buttons[10].addActionListener(new ActionNum());
		buttons[10].setFont(f);
		buttons[10].setBackground(Color.GRAY);
		buttons[10].setOpaque(true);
		buttons[10].setBorderPainted(true);
		buttons[10].setForeground(Color.RED);
		numPad.add(buttons[10]);
		buttons[11] = new JButton(" = ");
		buttons[11].setFont(f);
		buttons[11].setBackground(Color.GRAY);
		buttons[11].setOpaque(true);
		buttons[11].setBorderPainted(true);
		buttons[11].setForeground(Color.RED);
		buttons[11].addActionListener(new ActionNum());
		numPad.add(buttons[11]);

		// Set buttons for operation
		operation.setLayout(new GridLayout(5, 5));
		
		for (int i = 0; i < characters.length; i++) {
			buttons1[i] = new JButton("" + characters[i]);
			buttons1[i].setPreferredSize(new Dimension(100, 50));
			buttons1[i].setFont(f);
			buttons1[i].setForeground(Color.RED);
			buttons1[i].setBackground(Color.GRAY);
			buttons1[i].setOpaque(true);
			buttons1[i].setBorderPainted(true);
			buttons1[i].addActionListener(new ActionNum());
			operation.add(buttons1[i]);

		}

		// Set buttons for delete input

		remove.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < symbols.length; i++) {
			buttons2[i] = new JButton("" + symbols[i]);
			buttons2[i].setPreferredSize(new Dimension(70, 30));
			buttons2[i].addActionListener(new ActionNum());
			buttons2[i].setForeground(Color.BLUE);
			buttons2[i].setBackground(Color.GRAY);
			buttons2[i].setOpaque(true);
			buttons2[i].setBorderPainted(true);
			buttons2[i].addActionListener(new ActionNum());
			remove.add(buttons2[i]);

		}

		// Set label for display
		display.setLayout(new GridLayout(2, 2));
		info.setFont(f);
		info.setForeground(Color.BLUE);
		info1.setFont(f);
		info1.setForeground(Color.DARK_GRAY);
		display.add(info);
		display.add(info1);

		setSize(500, 500);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public class ActionNum implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for (int i = 0; i < 10; i++) {

				if (e.getSource() == buttons[i]) {
					s += buttons[i].getText();
					info.setText(s);
					s1 += buttons[i].getText();
					info1.setText(s1);

					if (check == true) {
						first = Double.parseDouble(info.getText());
					}
				}
			}
			if (e.getSource() == buttons[10]) {
				s += buttons[10].getText();
				info.setText(s);
				s1 += buttons[10].getText();
				info1.setText(s1);
				buttons[10].setEnabled(false);

			}
			if (e.getSource() == buttons1[0]) {
				counter++;
				tmp = '+';
				s = "";
				info.setText(s);
				s1 += buttons1[0].getText();
				info1.setText(s1);
				check = false;
				buttons[10].setEnabled(true);
			}
			if (e.getSource() == buttons1[1]) {
				tmp = '-';
				s = "";
				info.setText(s);
				s1 += buttons1[1].getText();
				info1.setText(s1);
				check = false;
				buttons[10].setEnabled(true);
			}
			if (e.getSource() == buttons1[2]) {
				tmp = '/';
				s = "";
				info.setText(s);
				s1 += buttons1[2].getText();
				info1.setText(s1);
				check = false;
				buttons[10].setEnabled(true);
			}
			if (e.getSource() == buttons1[3]) {
				tmp = '*';
				s = "";
				info.setText(s);
				s1 += buttons1[3].getText();
				info1.setText(s1);
				check = false;
				buttons[10].setEnabled(true);

			}

			if (e.getSource() == buttons2[0]) {

				s = "";
				s1 = "";
				info.setText(s);
				info1.setText(s1);
				check = true;
				first = 0;

			}
			if (e.getSource() == buttons2[1]){
				
				s1 = " ";
				s = " ";
			    info1.setText(s);
			    info1.setText(s1);
			    check = true;
			    first = 0;
			}
			
			if (e.getSource() == buttons[11]) {

				switch (tmp) {

				case '+':
					first = first + Double.parseDouble(info.getText());
					info.setText(String.valueOf(first));
					break;
				case '-':
					first = first - Double.parseDouble(info.getText());
					info.setText(String.valueOf(first));
					break;
				case '/':
					first = first / Double.parseDouble(info.getText());
					info.setText(String.valueOf(first));
					break;
				case '*':
					first = first * Double.parseDouble(info.getText());
					info.setText(String.valueOf(first));
					break;

				default:

					info.setText(String.valueOf(first));

				}

			}

		}

	}

	public static void main(String[] args) {

		new Calculator();

	}

}
