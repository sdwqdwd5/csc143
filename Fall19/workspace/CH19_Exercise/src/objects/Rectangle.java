package objects;
import utility.Comparable;
public class Rectangle implements Comparable<Rectangle>{
	
	private int height;
	private int width;
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width  = width;
	}
	
	public int area() {
		return width * height;
	}
	
	public static int compareAreas(Rectangle r1, Rectangle r2) {
		return r1.area() - r2.area();
	}
	
	public static int comparePerimeters(Rectangle r1, Rectangle r2) {
		return r1.perimeter() - r2.perimeter();
	}
	
	public int compareTo(Rectangle other) {
		if (width != other.width) {
			return width - other.width;
		}else if (height != other.height ) {
			return height - other.height;
		}
		return 0;
	}
	public boolean equals(Object other) {
		if(other instanceof Rectangle) {
			Rectangle r = (Rectangle) other;
			return width == r.width && height == r.height;
		}
		return false;
	}
	
	public int perimeter() {
		return 2 * width + 2 * height;
	}
	
	@Override
	public String toString() {
		return String.format("[%d, %d]", width, height);
	}

}
