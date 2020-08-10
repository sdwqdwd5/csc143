package sort;

import lists.LinkedList;
import utility.Comparable;
import utility.Comparator;

public class DataModule {

	public static <T extends Comparable<T>> void bubbleSort(LinkedList<T> list) {
		T temp;		// temporary storage
		for (int i = 0; i < list.size(); i++) {			// i number of passes 
			for(int j = 1; j < list.size() - i; j++) {	// check each neighbor
				if( list.get(j).compareTo(list.get(j - 1)) < 0) {
					temp        = list.get(j) ;
					list.set(j, list.get(j - 1));
					list.set(j - 1, temp);
				}
			}
		}
	}
	
	public static <T> void bubbleSort(LinkedList<T> list, Comparator<T> key) {
		T temp;											// temporary storage
		for (int i = 0; i < list.size(); i++) {			// i number of passes 
			for(int j = 1; j < list.size() - i; j++) {	// check each neighbor
				if( key.compare(list.get(j), list.get(j - 1)) < 0) {
					temp        = list.get(j) ;
					list.set(j, list.get(j - 1));
					list.set(j - 1, temp);
				}
			}
		}
	}
		
	public static 
	< T extends Comparable<T> > void insertionSort(LinkedList<T> list) {
		T currentElement;
		
	}
	
}
