package anonymous;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VotePanel extends JPanel  {
	
	private static final long serialVersionUID = 1L;
	
	private	int yesVotes;
	private	int noVotes;
	private JButton yesButton;
	private JButton noButton;
	private JLabel yesLabel;
	private JLabel noLabel;
	
	public VotePanel() {
		
		yesVotes 	= 0;
		noVotes 	= 0;
		yesButton 	= new JButton("Yes");
		noButton 	= new JButton("No");
		yesLabel 	= new JLabel("Yes Votes: " + yesVotes);
		noLabel 	= new JLabel("No Votes: "  + noVotes);
		
		yesButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				yesVotes++;
				yesLabel.setText("Yes Votes: " + yesVotes);
			} 
		});
		
		noButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				noVotes++;
				noLabel.setText("No Votes: " + noVotes);
			} });
		
		setBackground(Color.YELLOW);
		add(yesButton);
		add(yesLabel);
		add(noButton);
		add(noLabel);
	}
	
}
