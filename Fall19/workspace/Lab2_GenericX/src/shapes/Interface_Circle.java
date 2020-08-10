package shapes;


public class Interface_Circle implements Shapeable{
	
	private int radius;
	
	public Interface_Circle() {
		this.radius = 1;
	}
	
	public Interface_Circle(Interface_Circle other) {
		this.radius = other.radius;
	}
	
	public Interface_Circle(int radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("Radius cannot be negative");
		}
		
		this.radius = radius;
	}
	public int area() {
		
		int pi = (int) Math.PI;
		return radius * radius * pi;
		
	}
	
	public boolean equals(Object object) {

		if (object instanceof Interface_Circle) {
			Interface_Circle other = (Interface_Circle) object;
			return radius == other.radius;
		}return false;
	}
	
	public int getRadius() {
		return radius;
	}
	public int perimeter() {
		
		int pi = (int) Math.PI;
		return 2 * radius * pi;
		
	}
	
	public String toString() {
		return  "[" + radius +"]";
	}
	
}

