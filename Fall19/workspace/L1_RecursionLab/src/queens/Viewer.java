package queens;

import javax.swing.JFrame;

public class Viewer {

	private static final int WIDTH  = 400;
	private static final int HEIGHT = 400;
	private static final int LEFT_X = 250;
	private static final int TOP_Y  = 250;
	
	public static void main(String[] args) {
		int startingColumn 	= 4;
		ControlPanel panel 	= new ControlPanel(startingColumn);
		JFrame frame  = new JFrame("Viewer");
		frame.add(panel);
		
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(LEFT_X, TOP_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
