import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;


public class SnakeGameFrame extends JFrame {
	
	private static final long serialVersionUID = -2542001418764869760L;
	private ArrayList<ArrayList<DataOfSquare>> Grid;
	private int width = 20;
	private int height = 20;

	public SnakeGameFrame() {

		// Creates the arraylist that'll contain the threads
		Grid = new ArrayList<ArrayList<DataOfSquare>>();
		ArrayList<DataOfSquare> data;

		// Creates Threads and its data and adds it to the arrayList
		for (int i = 0; i < width; i++) {
			data = new ArrayList<DataOfSquare>();
			for (int j = 0; j < height; j++) {
				DataOfSquare c = new DataOfSquare(2);
				data.add(c);
			}
			Grid.add(data);
		}

		// Setting up the layout of the panel
		getContentPane().setLayout(new GridLayout(20, 20, 0, 0));

		// Start & pauses all threads, then adds every square of each thread to
		// the panel
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				getContentPane().add(Grid.get(i).get(j).getSquare());
			}
		}

		// initial position of the snake
		Tuple position = new Tuple(10, 10);
		// passing this value to the controller
		ThreadsController c = new ThreadsController(Grid, position);
		// Let's start the game now..
		c.start();

		// Links the window to the keyboardlistenner.
		this.addKeyListener((KeyListener) new KeyboardListener(c));

		// To do : handle multiplayers .. The above works, test it and see what
		// happens

		// Tuple position2 = new Tuple(13,13);
		// ControlleurThreads c2 = new ControlleurThreads(position2);
		// c2.start();

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ArrayList<ArrayList<DataOfSquare>> getGrid() {
		return Grid;
	}

}
