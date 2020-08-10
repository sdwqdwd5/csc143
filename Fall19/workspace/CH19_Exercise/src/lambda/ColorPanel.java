package lambda;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;

public class ColorPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public ColorPanel() {
		JButton redButton = new JButton("Red");
		JButton blueButton = new JButton("Blue");
		add(redButton);
		add(blueButton);
		
		// lambda : set background color to RED/BLUE
		redButton.addActionListener(e -> System.out.println(Color.RED));
		blueButton.addActionListener(e -> System.out.println(Color.BLUE));
		
	}
	
}
