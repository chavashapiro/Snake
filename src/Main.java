import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		// Creating the window with all its awesome snaky features
		SnakeGameFrame f1 = new SnakeGameFrame();

		// Setting up the window settings
		f1.setTitle("Snake");
		f1.setSize(300, 300);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
