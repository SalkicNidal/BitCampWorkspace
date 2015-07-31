package ServerGame;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ServerGui extends JFrame {

	private static final long serialVersionUID = -5068659314310963285L;
	private int x = 0;
	private int y = 0;
	private JLabel label[][] = new JLabel[10][10];

	public ServerGui() {

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
	
		setSize(500, 300);
		setTitle("   Server Game  ");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void move(String command) {

		if (command.equals("W")) {
			try {
				label[x - 1][y].setBackground(Color.BLACK);
				label[x][y].setBackground(Color.WHITE);
				x--;
			} catch (IndexOutOfBoundsException g) {

			}

		} else if (command.equals("A")) {

			try {

				label[x][y - 1].setBackground(Color.BLACK);
				label[x][y].setBackground(Color.WHITE);
				y--;

			} catch (IndexOutOfBoundsException g) {

			}

		} else if (command.equals("S")) {

			try {

				label[x + 1][y].setBackground(Color.BLACK);
				label[x][y].setBackground(Color.WHITE);
				x++;


			} catch (IndexOutOfBoundsException g) {

			}
		} else if (command.equals("D")) {

			try {

				label[x][y + 1].setBackground(Color.BLACK);
				label[x][y].setBackground(Color.WHITE);
				y++;

			

			} catch (IndexOutOfBoundsException g) {

			}
		}
	}

}
