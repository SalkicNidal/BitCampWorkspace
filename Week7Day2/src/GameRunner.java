import javax.swing.JFrame;


public class GameRunner {

	public static void main(String[] args) {
	
		RacingGame racinGame = new RacingGame(600,400);
		JFrame window = new JFrame("Racing game");
		window.setSize(600, 400);
		window.setLocation(350,100);
		window.setContentPane(racinGame);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
