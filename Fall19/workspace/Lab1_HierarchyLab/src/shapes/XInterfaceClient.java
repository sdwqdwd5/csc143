package shapes;



public class XInterfaceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapeable shape = new Interface_Circle(1);
		
		  print(shape);
		  shape = new Interface_Triangle(2,3,4);
		  
		  print(shape);
		  shape = new Interface_Rectangle(3,5);

		  print(shape);
	
		Shapeable s1 = new Interface_Circle (4);
		Shapeable s2 = new Interface_Rectangle(6,9);
		Shapeable s3 = new Interface_Triangle (2,6,6);
		Shapeable s4 = new Interface_Rectangle(7,2);
		Shapeable s5 = new Interface_Circle (5);
		Shapeable shapeArr[] = {s1,s2,s3,s4,s5};
		
		Shapeable shapee = new Interface_Circle(1);
		((Interface_Circle) shapee).getRadius();
	
		
		equalArea(s1,s2);
		
		printShapes(shapeArr);
}
		public static void print(Shapeable shape) {
		System.out.println("Class    : "  + shape.getClass());
		System.out.print(shape.toString());
		if (shape instanceof Interface_Circle) {
			Interface_Circle circle = (Interface_Circle) shape;
			System.out.println("Radius   : " + circle.getRadius()+"\n");
		}else System.out.print("\n");
	}
		
		public static void equalArea(Shapeable s1, Shapeable s2) {
			if (s1.area() == s2.area()) {
				System.out.println("Area is equal, first  shape's area: " + s1.area() + '\n' +
								   "               second shape's area: " + s2.area());
			}else	System.out.println("Area is not equal, first  shape's area: " +s1.area() + '\n' +
								"               	   second shape's area: " + s2.area() +"\n");
			
		}
		public static void printShapes(Shapeable[] shape) {
			for (int i = 0; i < shape.length; i++) {
				System.out.print(shape[i].toString());
				if (shape[i] instanceof Interface_Circle) {
					Interface_Circle circle = (Interface_Circle) shape[i];
					System.out.println("Radius   : " + circle.getRadius()+"\n");
				}else System.out.print("\n");
			}
		}
		
}
