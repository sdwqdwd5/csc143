package fills;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SierpinskiPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public static final int WIDTH  = Display.WIDTH - 25;
	public static final int HEIGHT = Display.HEIGHT - 75;
	
	private int level;		//set beginning level
	private JButton plusButton;
	private JButton minusButton;
	private JLabel label;
	public  JPanel subPanel;
	private Point p1, p2, p3;
	
	public SierpinskiPanel() {
		
		level = 1;
		
		subPanel = new JPanel();
		
		plusButton = new JButton("+");
		minusButton = new JButton("-");
		label = new JLabel("n: " + level);

		plusButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				level++;
				label.setText("n: " + level);
			} 
		});
		
		minusButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (level != 1) {
					level--;
					label.setText("n: " + level);
				}
			} 
		});
		
		subPanel.add(plusButton);
		subPanel.add(minusButton);
		subPanel.add(label);
		setPoints();
		
	}

	public void drawTriangle(Graphics pen, int level, Point p1, Point p2, Point p3) {
		
		//end case: triangle level 1
		if( level == 1) {

			Polygon triangle = new Polygon();
			triangle.addPoint(p1.x, p1.y);
			triangle.addPoint(p2.x, p2.y);
			triangle.addPoint(p3.x, p3.y);
			pen.setColor(Color.RED);
			pen.fillPolygon(triangle);
			
		}else {
			
			Point p4 = midPoint(p1, p2);
			Point p5 = midPoint(p2, p3);
			Point p6 = midPoint(p1, p3);
			
			//recursively draw the three triangles
			drawTriangle(pen, level - 1, p1, p4, p6);
			drawTriangle(pen, level - 1, p4, p2, p5);
			drawTriangle(pen, level - 1, p6, p5, p3);
			
		}
		repaint();
	}
	
	//****************************************************
	//*	midpoint of two points
	//****************************************************
	public Point midPoint(Point p1, Point p2) {
		return new Point( (p1.x + p2.x ) / 2 , (p1.y + p2.y) / 2 );
	}
	
	
	//****************************************************
	//*	Select three points in proportion to the pane size
	//* some computers need the parent panel reset with:
	//* super.paintComponent(pen); 
	//****************************************************
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);    
		drawTriangle(pen, level, p1, p2, p3);
	}
	
	//****************************************************
	//*	Helper Method: Sets the three vertices
	//*                of the first order Triangle
	//****************************************************	
	public void setPoints() {
		p1 = new Point(WIDTH / 2, 10);
		p2 = new Point(25, HEIGHT - 25);
		p3 = new Point(WIDTH - 25, HEIGHT - 25);
	}

}

