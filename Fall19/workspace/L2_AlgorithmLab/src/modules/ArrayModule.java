package modules;

public class ArrayModule {
	
	public static int binarySearch(int[] list, int target) {
		
		int min  = 0;						// min. index to search
		int max  = list.length - 1;			// max. index to search
		int mid;							// middle index
		
		while (min <= max) {
			
			mid = (min + max) / 2;		   //  set middle index 
			
			if( list[mid] == target ){
				return mid;
				
			}else if( list[mid] < target ){
				min  = mid + 1;				
				
			}else {
				max = mid - 1;			
			}
		}
		
		return -1;		 
	}

	public static  void bubbleSort(int[] list) {
		
		for (int i = 0; i < list.length; i++) {							// i number of passes 
			for(int j = 1; j < list.length - i; j++) {			
				if( list[j] < list[j - 1]) {							// check each neighbor
					swap(list, j, j - 1);
				}
			}
		}
	}
	
	public static boolean contains(int[] list, int target) {
		return indexOf(list, target) != -1;
	}
	
	public static int indexOf(int[] list, int target) {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void insertionSort(int[] list) {
		int current;								//temporary variable for storage
		int j;
		
		for (int i = 1; i < list.length; i++) {
			
			current = list[i];

			for (j = i; j > 0 && current < list[j - 1]; j--) {
				list[j] = list[j - 1];
			}
			list[j] = current;			
			
		}
	}

	
	private static void merge(int[] list, int[] firstHalf, int[] secondHalf) {
		
		int fhIndex 	= 0;						// 	index of firstHalf list
		int shIndex 	= 0;						// 	index of secondHalf list
		int index  		= 0;						//	current merged list index
		
		while( fhIndex < firstHalf.length && shIndex < secondHalf.length ) {
			
			if(firstHalf[fhIndex] < secondHalf[shIndex]) {
				
				list[index++] = firstHalf[fhIndex++];	
			}else {
				list[index++] = secondHalf[shIndex++];
			}
		}
		
		while(fhIndex <  firstHalf.length ) {
			list[index++] = firstHalf[fhIndex++];
		}
		
		while(shIndex <  secondHalf.length ) {
			list[index++] = secondHalf[shIndex++];
		}
		
	}
	
	public static void mergeSort(int[] list) {
		
		//RECURSIVE CASE
		if (list.length > 1) {
			
			int[] firstHalf  = splitFirstHalf(list);
			int[] secondHalf = splitSecondHalf(list);	
			
			mergeSort(firstHalf);				//recursive case
			mergeSort(secondHalf);				//recursive case
			
			merge(list, firstHalf, secondHalf);
			
		}
		
		// END CASE
		// end case: else if list.length = 1, return;
	}
	
	private static int partition(int[] list, int low, int high) {

		boolean done = false;
		int mid      = (low + high) / 2; 	// pick middle element as pivot
		int pivot    = list[mid];			// choose middle location as pivot
		
		while(!done) {
			
			while(list[low] < pivot) {	
				low++;
			}
			
			while(pivot < list[high]) {	
				high--;
			}
			
			if (low >= high) {
				done = true;
				
			}else {
				swap(list, low, high);
				low++;
				high--;
			}
		}
		return high;
	}
	
	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);	
	}
	
	private static void quickSort(int[] list, int left, int right) {
		
		int mid;				// mid item in lower partition
		
		if (left >= right) {
			return;
		}
		
		mid = partition(list, left, right);
		
		quickSort(list, left, mid);
		quickSort(list, mid + 1, right);
	}
	

	
	public static void selectionSort(int[] list) {
		
		int minIndex;			// current min index
		
		for (int i = 0; i < list.length - 1; i++) {
			minIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				
				if (list[j] < list[minIndex]) {
					minIndex = j;
				}	
			}
			
			if (minIndex != i) {
				swap(list, i, minIndex);
			}
			
		}
	}
	
	private static int[] splitFirstHalf(int[] list) {
		int size        = list.length / 2;
		int[] firstHalf  = new int[size];
		
		for(int i = 0; i < size; i++) {
			firstHalf[i] = list[i];
		}
		return firstHalf;
	}
	
	private static int[] splitSecondHalf(int[] list) {
		int halfSize    	= list.length / 2;			// half of size
		int size        	= list.length - halfSize;	// the rest
		int[] secondHalf 	= new int[size];
		
		for(int i = 0; i < size; i++) {
			secondHalf[i] = list[halfSize + i];
		}
		return secondHalf;
	}
	
	public static void swap(int[] list, int first, int second) {
		int temp 		= list[first];
		list[first] 	= list[second];
		list[second] 	= temp;
	}
	
}
