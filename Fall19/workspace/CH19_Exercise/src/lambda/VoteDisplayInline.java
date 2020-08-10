package lambda;

import javax.swing.JFrame;

public class VoteDisplayInline {
	
	private static final int WIDTH  = 300;
	private static final int HEIGHT = 100;
	private static final int LEFT_X = 750;
	private static final int TOP_Y  = 100;
		
	public static void main(String[] args) {
		VotePanelInline panel = new VotePanelInline();
		JFrame frame  	  = new JFrame("Vote Display");
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(LEFT_X, TOP_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}