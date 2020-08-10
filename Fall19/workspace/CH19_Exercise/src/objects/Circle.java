package objects;

public class Circle {
	
	public int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int area() {
		return (int) Math.PI * radius * radius;
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Circle) {
			Circle other = (Circle) obj;
			return radius == other.radius;
		}
		return false;
	}

	public int perimeter() {
		return (int) Math.round(2 * Math.PI * radius);
	}
	
	public String toString() {
		return String.format("[%d]", radius);
	}
	
}
