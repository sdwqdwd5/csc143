package anonymous;
import javax.swing.JFrame;

public class ColorDisplay {

	private static final int WIDTH  = 400;
	private static final int HEIGHT = 250;
	private static final int LEFT_X = 750;
	private static final int TOP_Y  = 100;
		
	public static void main(String[] args) {
		ColorPanel panel = new ColorPanel();
		JFrame frame  = new JFrame("Vote Display");
		frame.add(panel);
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(LEFT_X, TOP_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
