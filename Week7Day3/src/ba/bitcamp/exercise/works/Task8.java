package ba.bitcamp.exercise.works;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Task8  extends JFrame{
	
	JTextField username = new JTextField();
	JPasswordField password = new JPasswordField();
	JPasswordField password1 = new JPasswordField();
	JLabel text1 = new JLabel("Enter Username");
	JLabel text2 = new JLabel(" Enter Password");
	JLabel text3 = new JLabel(" Repeat Password");
	JPanel window = new JPanel(new GridLayout(6,1, 5, 5));

	
	public Task8(){
		
	window.add(text1);	
	window.add(username);
	window.add(text2);
	window.add(password);
	window.add(text3);
	window.add(password1);
	
	
	password.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String s = String.valueOf(password.getPassword());
			String n = username.getText();
			
			if ( n.equals("Mujo") && s.equals("1234")){
				System.exit(3);
			}else{
				JOptionPane.showMessageDialog(null, "Wrong ussername or pasword");
			}
			
		}
	});
	add(window);
	setSize(400, 200);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		new Task8();
	}

}
