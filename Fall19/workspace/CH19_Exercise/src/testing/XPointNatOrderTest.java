package testing;

import lists.LinkedList;
import objects.Point;
import sort.DataModule;

public class XPointNatOrderTest {

	public static void main(String[] args) {
		
		LinkedList<Point> list = new LinkedList<Point>();
		list.add(new Point(6, 5));
		list.add(new Point(8, 6));
		list.add(new Point(3, 7));
		list.add(new Point(7, 9));
		list.add(new Point(2, 5));
		list.add(new Point(5, 4));
		list.add(new Point(5, 6));
		list.add(new Point(1, 8));
		list.add(new Point(7, 5));
		list.add(new Point(4, 8));

		System.out.println("------- dimensions: before sorting --------");
		for(int i = 0; i < list.size(); i++) {
			System.out.println("element " + i + ": " + list.get(i));
		}
		System.out.println();
		
		System.out.println("------- dimensions: natural ordering --------");
		DataModule.bubbleSort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("element " + i + " : " + list.get(i));
		}
		
	}

}
