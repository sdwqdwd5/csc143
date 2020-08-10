package abstraction;


public class Abstract_Circle extends AbstractShape {
	
	private int radius;
	
	public Abstract_Circle() {
		this.radius = 1;
	}
	
	public Abstract_Circle(Abstract_Circle other) {
		this.radius = other.radius;
	}
	
	public Abstract_Circle(int radius) {
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

		if (object instanceof Abstract_Circle) {
			Abstract_Circle other = (Abstract_Circle) object;
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
		
		return  "Coordinate   : " + super.toString() +
				"Shape        : Circle" + "\n" +
				"Area         : " + area() + "\n" +
				"Perimeter    : " + perimeter() + "\n" ;
	}
	
}

