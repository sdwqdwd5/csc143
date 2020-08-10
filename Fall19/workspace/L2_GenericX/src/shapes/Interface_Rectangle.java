package shapes;

public class Interface_Rectangle implements Shapeable {
	
	private int height;
	private int width;
	
	public Interface_Rectangle() {
		this.height = 1;
		this.width = 1;
	}
	
	public Interface_Rectangle(Interface_Rectangle other) {
		this.height = other.height;
		this.width = other.width;
	}
	
	public Interface_Rectangle(int x, int y) {
		
		this.height = x;
		this.width = y;
	}
	public int area() {
		
		return height * width;
		
	}
	
	public boolean equals(Object object) {

		if (object instanceof Interface_Rectangle) {
			Interface_Rectangle other = (Interface_Rectangle) object;
			return height == other.height && width == other.width;
			
		}return false;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	public int perimeter() {
		
		
		return 2 * (height + width);
		
	}
	
	public String toString() {
		return "[" + height +", " + width + "]" ;
	}
	
}

