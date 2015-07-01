package ba.bitcamp.lectures.works;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Main  extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9192419510188042445L;
	
	
	int fullWidth = 400;
	int fullHEight = 600;
	
	JLabel name = new JLabel("Name");
	JLabel email = new JLabel("Email");
	
	JTextField nameField = new JTextField(30);
	JTextField emailField = new JTextField(30);
	
	JTextArea terms = new JTextArea(10, 30);
	
	JButton button = new JButton("Submit");
	
	JCheckBox cb = new JCheckBox(" I accept the terms and conditions");
	
	
	
	JPanel container = new JPanel();
	
	public Main(){
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String email = emailField.getText();
				
				if ( cb.isSelected() == false){
				JOptionPane error = new JOptionPane( " You are not accept the terms "+ name + "  " + email);
				error.createDialog(null, " HA HA HA").setVisible(true);
				nameField.setText("");
				emailField.setText("");
				}
				else{
					System.out.println("Name is: "+ name + " " + "Email is : " + email);
				}
			}
		});
		
//		cb.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				  
//				JCheckBox cb = (JCheckBox)e.getSource();
//				
//				
//			}
//		});
		
		
		
		
		
		
		button.setEnabled(true);
		
		name.setForeground(Color.BLUE);
		name.setFont( new Font("Serif", Font.BOLD, 14));

		
		terms.setText("Department  of Economics and Menagment");
		terms.setEditable(false);
		
		container.add(name);
		container.add(nameField);
		container.add(email);
		container.add(emailField);
		container.add(terms);
		container.add(cb);
		container.add(button);
		
		add(container);
		
		setTitle(" New frame");
		setSize(fullWidth, fullHEight);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
		
	}

	public static void main(String[] args) {
	   new Main();

	}

}
