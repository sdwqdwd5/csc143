package coordinates;

/******************************************************************
 * <p> A point representing a location (x, y) in coordinate space, 
 *     specified in integer precision.
 ******************************************************************/

public class Point {

	/***********************************************
	 * 	data fields
	 * 	stores the (x, y) location of point
	 ***********************************************/
	private int x;
	private int y;
	
	/**********************************************************
	 *	constructs and initializes the current point at the 
	 *  origin (0,0) of the coordinate plane.
	 **********************************************************/
	public Point() {
		x = 0;
		y = 0;
	}
	
	/**********************************************************
	 * 	constructs and initializes the current point to the 
	 *  location specified by other Point passed.
	 * 	@param other point object.
	 **********************************************************/
	public Point(Point other) {
		this.x = other.x;
		this.y = other.y;
	}
	
	/***********************************************************
	 * 	constructs and initializes the current point to the 
	 *  specified (x,y) location.
	 * 	@param x the x coordinate of point to construct.
	 * 	@param y the y coordinate of point to construct.
	 ***********************************************************/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/***********************************************************
	 * 	computes the distance between the current Point and 
	 *  another Point object in coordinate space.
	 *  @param other point object.
	 * 	@return distance between two points.
	 ***********************************************************/
	public double distance(Point other) {
		
		return Math.sqrt(Math.pow(x-other.x,2) + Math.pow(y-other.y,2));
	}
	
	/***********************************************************
	 * 	returns the result of a division of two real numbers/ 
	 *  @param numerator of division.
	 *  @param denominator of division
	 * 	@return result of division
	 ***********************************************************/
	
	public double divide (double num, double denom) {
		
		// validation check
		// precondition: method only accepts non-zero values 
		//               for division (denom).
		
		if( denom == 0 || num == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return num / denom;
	}
	/***************************************************************
	 * 	compares the contents of the current object to the passed
	 *  object. Returns true if they have the same (x,y) position.
	 * 	@return result of content evaluation.
	 ***************************************************************/
	public boolean equals(Object object) {

		if(object instanceof Point) {
			Point other = (Point) object;
			return x == other.x && y == other.y;
		}
		return false;
	}
	
	/***************************************************************
	 * 	returns the x coordinate of the point in integer precision.
	 * 	@return x the x coordinate of point object.
	 ***************************************************************/
	public int getX() {
		return x;
	}
	
	/***************************************************************
	 * 	returns the y coordinate of the point in integer precision.
	 * 	@return y the y coordinate of point object.
	 ***************************************************************/
	public int getY() {
		return y;
	}
	
	
	public boolean isCollinear(Point p1, Point p2) {

		return slope(p1) == slope(p2);
	}
	
	public boolean isVertical(Point p1) {

		return x == p1.x;
	}
	/***************************************************************
	 * 	changes the location of the current point in coordinate 
	 *  space to the location specified by point other. 
	 * 	@param other the specified point .
	 ***************************************************************/
	public void setLocation(Point other) {
		x = other.x;
		y = other.y;
	}
	
	/*****************************************************************
	 * 	changes the location of the point in the coordinate plane to 
	 *  the location specified by the values (x, y). 
	 * 	@param x the specified x coordinate value.
	 * 	@param y the specified y coordinate value.
	 *****************************************************************/
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	public double slope(Point other) {
		double dx = x - other.x;
		double dy = y - other.y;
		if (dx == 0) {
			throw new ArithmeticException("Cannot ");
		}
		return divide(dy, dx);
	}
	
	/***************************************************************
	 * 	returns string representation of a point.
	 * 	@return point (x, y) coordinates.
	 **************************************************************/
	public String toString() {
		return "(" + x +  ", " + y + ")";
	}
	
	/***************************************************************
	 * 	shifts the current point's (x,y) location by dx along the 
	 *  x-axis and dy along the y-axis, giving (x + dx, y + dy).
	 * 	@param dx the specified x coordinate value.
	 * 	@param dy the specified y coordinate value.
	 ***************************************************************/
	public void translate(int dx, int dy) {
		x += dx;			  // x = x + dx
		y += dy;		      // y = y + dy
	}
	
}
