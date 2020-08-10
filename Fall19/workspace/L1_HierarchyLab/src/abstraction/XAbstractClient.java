package abstraction;



public class XAbstractClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractShape shape = new Abstract_Circle(1);
		
					  print(shape);
					  shape = new Abstract_Triangle(2,3,4);
					  
					  print(shape);
					  shape = new Abstract_Rectangle(3,5);
		
					  print(shape);
		
	}
		public static void print(AbstractShape shape) {
			System.out.println("Class        : "  + shape.getClass());
			System.out.println("X Coordinate : " + shape.getX());
			System.out.println("Y Coordinate : " + shape.getY());
			System.out.print(shape.toString());
			if (shape instanceof Abstract_Circle) {
				Abstract_Circle circle = (Abstract_Circle) shape;
				System.out.println("Radius       : " + circle.getRadius()+"\n");
			}else System.out.print("\n");
		}
		
		

	
}
