package ba.bitcamp.exercise.project.chat;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyChat extends JFrame{
	
	public MyChat(){
		
		setLayout(new BorderLayout());
		JTextField chat = new JTextField();
		JButton send = new JButton("SEND");
		
		chat.setBorder(BorderFactory.createTitledBorder("  Chat Window "));
		
		
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Socket socket = new Socket("10.0.82.98", 77777);
					BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
							socket.getOutputStream()));
					writer.write(chat.getText());
					writer.newLine();
					writer.flush();
				} catch (UnknownHostException g) {
					// TODO Auto-generated catch block
					g.printStackTrace();
				} catch (IOException g) {
					// TODO Auto-generated catch block
					g.printStackTrace();
				}

				chat.setText("");
			}
	
		});
		
		
		add(chat, BorderLayout.CENTER);
		add(send, BorderLayout.SOUTH);
		
		setSize(400, 250);
		setTitle("   CHAT   ");
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		
		new MyChat();
		
		
	}

}
