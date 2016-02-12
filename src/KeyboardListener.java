import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {

	private ThreadsController controller;

	public KeyboardListener(ThreadsController controller) {
		this.controller = controller;
	}

	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
		case 39: // -> Right
					// if it's not the opposite direction
			if (controller.getDirectionSnake() != 2) {
				controller.setDirectionSnake(1);
			}
			break;
		case 38: // -> Top
			if (controller.getDirectionSnake() != 4) {
				controller.setDirectionSnake(3);
			}
			break;

		case 37: // -> Left
			if (controller.getDirectionSnake() != 1) {
				controller.setDirectionSnake(2);
			}
			break;

		case 40: // -> Bottom
			if (controller.getDirectionSnake() != 3) {
				controller.setDirectionSnake(4);
			}
			break;

		default:
			break;
		}
	}

}
