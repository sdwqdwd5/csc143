package utility;

import college.Student;


public class Batch {
	public static <T extends Comparable<T>> int binarySearch(List<T> list, T key) {
		int min  = 0;
		int max  = list.size() - 1;
		int mid;
		while (min <= max) {
			mid = (min + max) / 2; 
			if( list.get(mid).compareTo(key) == 0 ) {
				return mid;
			}else if( list.get(mid).compareTo(key) < 0 ) {
				min = mid + 1; 
			}else {
				max = mid - 1;
			}
		}
		return -1;
	}
	
	public static int indexOf(List<Student> list, String nameKey) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name().equals(nameKey)) {
				return i;
			}
		}
		return -1;
	}
	
	private static <T extends Comparable<T>> int partition(List<T> list, int left, int right) {
		  int l;
	      int h;
	      int midpoint;
	      T pivot;
	      T temp;
	      boolean done;

	      /* Pick middle element as pivot */
	      midpoint = left + (right - left) / 2;
	      pivot = list.get(midpoint);

	      done = false;
	      l = left;
	      h = right;

	      while (!done) {
	         /* Increment l while data of index l < pivot */
	         while (list.get(l).compareTo(pivot) < 0) {
	            ++l;
	         }

	         /* Decrement h while pivot < data of index h */
	         while (list.get(h).compareTo(pivot) > 0) {
	            --h;
	         }

	         /* If there are zero or one items remaining,
	            all numbers are partitioned. Return h */
	         if (l >= h) {
	            done = true;
	         } 
	         else {
	            /* Swap index l and index h,
	               update l and h */
	            temp = list.get(l);
	            list.set(l, list.get(h));
	            list.set(h, temp);

	            ++l;
	            --h;
	         }
	      }
	      return h;
	   }
	
	public static <T extends Comparable<T>> void quickSort(List<T> list) {
		quickSort(list, 0, list.size()-1);
	}
	
	private static <T extends Comparable<T>> void quickSort(List<T> list, int left, int right) {
		int j;
	      /* Base case: If there are 1 or zero entries to sort,
	       partition is already sorted */
		  if (left >= right) {
		     return;
		  }
		  
		  /* Partition the data within the array. Value j returned
		     from partitioning is location of last item in low partition. */
		  j = partition(list, left, right);
		  
		  /* Recursively sort low partition (left to j) and
		     high partition (j + 1 to right) */
		  quickSort(list, left, j);
		  quickSort(list, j + 1, right);
	}
	
	public static <T> void selectionSort(List<T> list, Comparator<T> key) {
		T 	min; 
		int minIndex; 
		for (int i = 0; i < list.size() - 1; i++) {
			min 	 = list.get(i);
			minIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (key.compare(min, list.get(j)) > 0) {
					min		 = list.get(j);
					minIndex = j;
				} 
			}
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			}
		}
	}
}
