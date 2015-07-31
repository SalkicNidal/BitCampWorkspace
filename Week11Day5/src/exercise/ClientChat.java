package exercise;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ClientChat extends JFrame {

	private static final long serialVersionUID = 8821378403972704576L;
	private static final int CHAT_SIZE = 30;
	private static final int PORT = 8000;

	// Declaration new swing object for this window
	private JPanel input = new JPanel(new FlowLayout(FlowLayout.TRAILING));
	private JTextArea history = new JTextArea();
	private JTextField chat = new JTextField();
	private JButton send = new JButton("SEND");
	private Socket client = null;

	public ClientChat() throws UnknownHostException, IOException {

		// Set window layout to Border layout
		setLayout(new BorderLayout());

		// Add action listener to send button
		send.setSize(getMinimumSize());
		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					BufferedWriter writer = new BufferedWriter(
							new OutputStreamWriter(client.getOutputStream()));
					writer.write(chat.getText());
					writer.newLine();
					writer.flush();

					history.append("Client: " + chat.getText() + "\n");

				} catch (IOException e1) {

					e1.printStackTrace();
				}

				chat.setText("");

			}
		});

		chat.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					BufferedWriter writer = new BufferedWriter(
							new OutputStreamWriter(client.getOutputStream()));
					writer.write(chat.getText());
					writer.newLine();
					writer.flush();

					history.append("Client: " + chat.getText() + "\n");

				} catch (IOException e1) {

					e1.printStackTrace();
				}

				chat.setText("");

			}
		});

		// Add scroll to text area
		history.setEditable(false);
		history.setFont(new Font("Serif", Font.BOLD, 14));
		JScrollPane scroll = new JScrollPane(history);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		// Set the title for text area and text field
		history.setBorder(BorderFactory
				.createTitledBorder("  Chat history... "));
		chat.setBorder(BorderFactory.createTitledBorder(" Chat window "));

		// Set columns for text field
		chat.setColumns(CHAT_SIZE);

		// Adding text field - chat, and button - send to JPanel
		input.add(chat);
		input.add(send);

		// Adding Text area - history, and JPanel input to window
		add(scroll, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);

		// Set some of option for window
		setSize(500, 300);
		setTitle("   Client chat   ");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// Made the new client connected to local host and specified port
		client = new Socket("10.0.82.98", PORT);

		// Set text to text area with method
		// Server.setAreaText(history, client, "Server");

	}

	public static void main(String[] args) {

		try {
			new ClientChat();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
