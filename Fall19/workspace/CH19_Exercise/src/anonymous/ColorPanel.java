package anonymous;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class ColorPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public ColorPanel() {
		JButton yellowButton = new JButton("Yellow");
		JButton greenButton  = new JButton("Green");
		add(yellowButton);
		add(greenButton);
		
		yellowButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				setBackground(Color.YELLOW);
			}
		});
		
		greenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				setBackground(Color.GREEN);
			}
		});
		
	}
	
}
