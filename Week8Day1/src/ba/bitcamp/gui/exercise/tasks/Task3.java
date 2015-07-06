package ba.bitcamp.gui.exercise.tasks;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Task3 extends JFrame {

	private static final long serialVersionUID = -6838641897244204191L;

	JTextArea area = new JTextArea();
	JMenuBar bar = new JMenuBar();
	JMenu menu1 = new JMenu("Insert");
	JMenuItem item1 = new JMenuItem("Insert text");

	public Task3() {

		setJMenuBar(bar);
		bar.add(menu1);
		add(area);
		menu1.add(item1);
		area.setEditable(false);

		item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new dialog();

			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setTitle("Mini text editor");
		setVisible(true);

	}

	private class dialog extends JDialog {

		private static final long serialVersionUID = -2671408421086678333L;

		JTextField input = new JTextField();
		JTextField index = new JTextField();
		JLabel info = new JLabel("Input string");
		JLabel infoOfIndex = new JLabel("Input index");

		public dialog() {

			setLayout(new GridLayout(4, 1));
			add(info);
			add(input);
			add(infoOfIndex);
			add(index);

			index.addKeyListener(new KeyListener() {

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyPressed(KeyEvent e) {

					if (e.getKeyCode() == KeyEvent.VK_ENTER) {

						try {
							String tmp = "";
							int index1 = Integer.parseInt(index.getText());

							tmp = area.getText().substring(0, index1)
									+ input.getText()
									+ area.getText().substring(index1,
											area.getText().length());

							area.setText(tmp);
							dispose();
						} catch (StringIndexOutOfBoundsException g) {
							JOptionPane.showMessageDialog(null, "Wrong input");
						} catch (NumberFormatException g) {
							JOptionPane.showMessageDialog(null, "Wrong input");
						}
					}

				}
			});

			setModalityType(ModalityType.APPLICATION_MODAL);
			setSize(400, 200);
			setLocationRelativeTo(null);
			setTitle("Dialog 1");
			setVisible(true);

		}

	}

	public static void main(String[] args) {
		new Task3();
	}

}
