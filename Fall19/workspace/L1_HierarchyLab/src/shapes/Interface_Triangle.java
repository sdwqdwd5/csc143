package shapes;

public class Interface_Triangle implements Shapeable {
	
	private int a;
	private int b;
	private int c;
	
	public Interface_Triangle() {
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}
	
	public Interface_Triangle(Interface_Triangle other) {
		this.a = other.a;
		this.b = other.b;
		this.c = other.c;
	}
	
	public Interface_Triangle(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public int area() {
		
		double s = (a+b+c)/2.0;
		double ar = Math.sqrt(s * (s - a) *(s - b) * (s - c));
		return (int) ar;
		
	}
	
	public boolean equals(Object object) {

		if (object instanceof Interface_Triangle) {
			Interface_Triangle other = (Interface_Triangle) object;
			return a == other.a && b == other.b && c == other.c;
			
		}return false;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	public int perimeter() {
		
		return a + b + c;
		
	}
	
	public String toString() {
		return  "Shape    : Triangle" + "\n" +
					
				"Side A   : " + a +"\n" +
				"Side B   : " + b +"\n" +
				"Side C   : " + c +"\n" +
				"Area     : " + area() + "\n" +
				"Perimeter: " + perimeter() + "\n" ;
	}
	
}

