package testing;

import lists.LinkedList;
import objects.Rectangle;
import sort.DataModule;

public class XRectMethodRefTest {
	
	public static void main(String[] args) {
		
		LinkedList<Rectangle> list = new LinkedList<Rectangle>();
		list.add(new Rectangle(6, 5));
		list.add(new Rectangle(5, 4));
		list.add(new Rectangle(7, 9));
		list.add(new Rectangle(3, 7));
		list.add(new Rectangle(8, 6));
		list.add(new Rectangle(1, 8));
		list.add(new Rectangle(7, 5));
		list.add(new Rectangle(5, 9));
		list.add(new Rectangle(2, 5));
		list.add(new Rectangle(4, 8));

		System.out.println("------- dimensions: before sorting --------");
		for(int i = 0; i < list.size(); i++) {
			System.out.println("element " + i + ": " + list.get(i));
		}
		
		System.out.println();
		System.out.println("------- areas: different ordering --------");
		DataModule.bubbleSort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + ": " + list.get(i).area() );
		}
		
		System.out.println();
		System.out.println("------- perimeters: different ordering --------");
		DataModule.bubbleSort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + ": " + list.get(i).perimeter());
		}

	}
	
}
