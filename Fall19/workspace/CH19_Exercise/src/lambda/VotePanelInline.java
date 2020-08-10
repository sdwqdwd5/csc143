package lambda;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class VotePanelInline extends JPanel  {
	
	private static final long serialVersionUID = 1L;
	
	private	int yesVotes;
	private	int noVotes;
	private JButton yesButton;
	private JButton noButton;
	private JLabel yesLabel;
	private JLabel noLabel;
	
	public VotePanelInline() {
		
		yesVotes 	= 0;
		noVotes 	= 0;
		yesButton 	= new JButton("Yes");
		noButton 	= new JButton("No");
		yesLabel 	= new JLabel("Yes Votes: " + yesVotes);
		noLabel 	= new JLabel("No Votes: "  + noVotes);
		
		// lambda : update with yes or no votes
		yesButton.addActionListener( e -> {});
		noButton.addActionListener(e -> {});
		
		setBackground(Color.YELLOW);
		add(yesButton);
		add(yesLabel);
		add(noButton);
		add(noLabel);
	}
		
}
