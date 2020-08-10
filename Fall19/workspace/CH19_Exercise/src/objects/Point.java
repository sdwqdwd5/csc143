package objects;
import utility.Comparable;
public class Point implements Comparable<Point> {

	private int x;
	private int y;
	
	public Point(Point other) {
		x = other.x;
		y = other.y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int compareTo(Point other) {
		if (x != other.x) {
			return x - other.x;
		}else if (y != other.x) {
			return y - other.y;
		}
		return 0;
	}
	public double distance(Point other) {
		int dx = x - other.x;
		int dy = y - other.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	public boolean equals(Object object) {

		if(object instanceof Point) {
			Point other = (Point) object;
			return x == other.x && y == other.y;
		}
		return false;
	}
	
	public double slope(Point other) {
		int dx = x - other.x;
		int dy = y - other.y;
		if(dx == 0) {
			throw new ArithmeticException("division by zero, dx = " + dx );
		}
		return dy/dx;
	}
	
	public String toString() {
		return "(" + x +  ", " + y + ")";
	}
	
}
