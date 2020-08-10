package abstraction;

public class Abstract_Rectangle extends AbstractShape {
	
	private int height;
	private int width;
	
	public Abstract_Rectangle() {
		this.height = 1;
		this.width = 1;
	}
	
	public Abstract_Rectangle(Abstract_Rectangle other) {
		this.height = other.height;
		this.width = other.width;
	}
	
	public Abstract_Rectangle(int x, int y) {
		
		this.height = x;
		this.width = y;
	}
	public int area() {
		
		return height * width;
		
	}
	
	public boolean equals(Object object) {

		if (object instanceof Abstract_Rectangle) {
			Abstract_Rectangle other = (Abstract_Rectangle) object;
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
		return  "Coordinate   : " + super.toString() +
				"Shape        : Rectangle" + "\n" +
				"Height       : " + height + "\n" +
				"Wideth       : " + width + "\n" +
				"Area         : " + area() + "\n" +
				"Perimeter    : " + perimeter() + "\n" ;
	}
	
}

