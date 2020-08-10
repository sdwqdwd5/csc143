package exercise;
import college.Employee;
import coordinates.Point;
import shapes.Interface_Circle;
import shapes.Interface_Rectangle;
import shapes.Interface_Triangle;
import shapes.Shapeable;
public class GenericClient {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<Point> point1 = new Generic<Point>(new Point(8,5));
		Generic<String> p1 = new Generic<String>("Peter");
		Generic<Double> d1 = new Generic<Double>(4.71);
		
		Employee p2 = new Employee("Peter", 20, "EE", 20,20);
		printGenericType(point1);
		printGenericType(p1);
		printGenericType(d1);
		printAnyType(p2);
		Generic<Shapeable> c1 = new Generic<Shapeable>(new Interface_Circle(5));
		Generic<Shapeable> t1 = new Generic<Shapeable>(new Interface_Triangle(8,15,17));
		Generic<Shapeable> r1 = new Generic<Shapeable>(new Interface_Rectangle(6,9));
		printGenericShape(c1);
		printGenericShape(t1);
		printGenericShape(r1);
	
	}
	public static <T> void printGenericType(Generic<T> object) {
		System.out.println("toString: " + object.toString() + "\n" +
						   "getClass: " + object.getClass() + "\n" +
						   "hashCode: " + object.hashCode() + "\n" +
						   "get     : " + object.get()  + "\n");
	}
	
	public static <T> void printAnyType(T object) {
		System.out.println("toString: " + "\n" + object.toString() + "\n" +
						   "getClass: " + object.getClass() + "\n" +
						   "hashCode: " + object.hashCode() + "\n") ;

	}
	
	public static <T extends Shapeable> void
	printGenericShape(Generic<T> shape) {
		System.out.println("toString : "  + shape.get().toString() + "\n" +
						   "Class    : " + shape.get().getClass()+ "\n" +
						   "Area     : " + shape.get().area() + "\n" +
						   "Perimeter: " + shape.get().perimeter());
	
		
	}
}
	