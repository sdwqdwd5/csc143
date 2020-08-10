package queens;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	private static final long serialVersionUID = 5L;
	private static final int SIZE = 8;
	private String 		imageLocation;
	private ImageIcon 	queenIcon;
	private Image 		queenImage;
	private int[] 		rowPositions;
	private int			startingColumn;
	
	public ControlPanel() {
		this(0);
	}
	
	public ControlPanel(int start) {
		startingColumn 	= start;
		imageLocation 	= "images" + File.separator + "queen.jpg";
		queenIcon 		= new ImageIcon(imageLocation);
		queenImage 		= queenIcon.getImage();
		rowPositions  	= new int[SIZE];
	}
	
	public void draw(Graphics _graphics) {
		if (search(0, startingColumn)) {
			drawQueens(_graphics);
			drawChessBoard(_graphics);
		}
	}
	
	public void drawChessBoard(Graphics _graphics) {
		for (int i = 0; i < SIZE; i++) {
			_graphics.drawLine(0, i * getHeight() / SIZE, getWidth(), i * getHeight() / SIZE);
			_graphics.drawLine(i * getWidth() / SIZE, 0, i * getWidth() / SIZE, getHeight());
		}
	}
	
	public void drawQueens(Graphics _graphics) {
		int j;				// position of queen in row i
		int imageX = 0;
		int imageY = 0;
		int imageWidth = 0;
		int imageHeight = 0;
		
		if(queenImage != null) {
			for (int i = 0; i < SIZE; i++) {
				j =  rowPositions[i];
				imageX = j * getWidth() / SIZE;
				imageY = i * getHeight() / SIZE;
				imageWidth = getWidth()	/ SIZE;
				imageHeight = getHeight() / SIZE;
				_graphics.drawImage(queenImage, imageX, imageY, imageWidth, imageHeight, this);
 			}
		}
	}
	
	/************************************************************
	 * checks if a queen can be placed in row and column
	 * **********************************************************/
	public boolean isSafe(int row, int col) {
		for(int i = 1; i <= row; i++) {
			// There is a conflict
			if( rowPositions[row - i] == col 		|| 			// check column
				rowPositions[row - i] == col - i 	||			// check up-left diagonal
				rowPositions[row - i] == col + i 		) {		// check up-right diagonal
				return false;
			}
		}
		//There is NO conflict
		return true;
	}
	
	
	public void paintComponent(Graphics _graphics) {
		super.paintComponent(_graphics);
		draw(_graphics);
	}
	
	
	/************************************************************
	 * search for a solution starting from a specified column in 
	 * the first row.
	 * **********************************************************/
	public boolean search(int row, int start) {
		
		//end case: a solution found to place 8 queens in 8 rows
		if( row == SIZE) {
			return true;
		}
		
		//set starting column from first row
		rowPositions[0] = start;
		
		for (int col = 0; col < SIZE; col++) {
			if (col != start) {
				// place a queen at (row, col)
				rowPositions[row] = col;
				if ( isSafe(row, col) && search(row + 1, start) ) {
					return true;	// Found a safe location for queen
				}
			}
		}
		// No solution for a queen placed at any column in this row
		return false;
	}

}














