package ServerGame;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.Socket;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiClient extends JFrame {

	private static final long serialVersionUID = -335769207719036905L;
	private int x = 0;
	private int y = 0;
	private Socket socket;
	JLabel label[][] = new JLabel[10][10];

	public GuiClient(Socket socket) {
		this.setSocket(socket);

		setLayout(new GridLayout(10, 10));

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				label[i][j] = new JLabel();
				label[i][j].setHorizontalAlignment(JLabel.CENTER);
				label[i][j].setSize(40, 40);
				label[i][j]
						.setBorder(BorderFactory.createLineBorder(Color.RED));
				label[i][j].setOpaque(true);
				label[0][0].setBackground(Color.BLACK);

				add(label[i][j]);

			}
		}
		addKeyListener(new MyListener());

		setSize(500, 300);
		setTitle("   Client Game  ");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public class MyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_W) {
				try {

					label[x - 1][y].setBackground(Color.BLACK);
					label[x][y].setBackground(Color.WHITE);

					x--;

					Client.write("W");

				} catch (IndexOutOfBoundsException g) {

				}

			}
			if (e.getKeyCode() == KeyEvent.VK_S) {

				try {

					label[x + 1][y].setBackground(Color.BLACK);
					label[x][y].setBackground(Color.WHITE);
					x++;

					Client.write("S");

				} catch (IndexOutOfBoundsException g) {

				}

			}
			if (e.getKeyCode() == KeyEvent.VK_D) {

				try {

					label[x][y + 1].setBackground(Color.BLACK);
					label[x][y].setBackground(Color.WHITE);
					y++;

					Client.write("D");

				} catch (IndexOutOfBoundsException g) {

				}

			}
			if (e.getKeyCode() == KeyEvent.VK_A) {

				try {

					label[x][y - 1].setBackground(Color.BLACK);
					label[x][y].setBackground(Color.WHITE);
					y--;
					Client.write("A");

				} catch (IndexOutOfBoundsException g) {

				}

			}

		}

	}


}
