package abstraction;


public abstract class AbstractShape {
	private int x;
	private int y;
	
	public AbstractShape() {
		this.x = 1;
		this.y = 1;
	}
	
	public AbstractShape(AbstractShape other) {
		
		this.x = other.x;
		this.y = other.y;
		
	}
	
	public AbstractShape Shape(int x, int y) {
		
		AbstractShape a = new Abstract_Circle();
		return a;
	}
	
	public boolean equals(Object object) {
		if (object instanceof AbstractShape) {
			AbstractShape other = (AbstractShape) object;
			return x == other.x && y == other.y;
		}
		return false;
	}
	
	public int getX() {
		
		return x;
	}
	
	public int getY() {
		
		return y;
		
	}
	public abstract int area();
	
	public abstract int perimeter();
	
	public String toString() {
		return "(" + x + ", " + y + ")" + "\n";
	}
}
