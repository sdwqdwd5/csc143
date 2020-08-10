package modules;

public class RecModule {

	public static int binarySearch(int[] list, int target) {
		return binarySearch(list, target, 0, list.length - 1);
	}
	
	private static int binarySearch(int[] list, int target, int min, int max) {
		int mid;
		
		if(min > max) {
			return -1;
		}else {
			
			mid = (min + max) / 2;
			
			if(list[mid] < target){
				return binarySearch(list, target, mid + 1, max);
				
			}else if(list[mid] > target) {
				return binarySearch(list, target, min, mid - 1);
				
			}else {
				return mid;
			}
			
		}
	}
	
	
	public static void selectionSort(int[] list) {
		selectionSort(list, 0);			//sort entire data
	}
	

	private static void selectionSort(int[] list, int start) {
		
		if (start < list.length - 1) {
			int minIndex = start;					// current lowest index

			for(int i = start + 1; i < list.length; i++) {
				
				if(list[i] < list[minIndex]){
					minIndex = i;
				}
			}	
			
			swap(list, start, minIndex);

			selectionSort(list, start + 1);
		}
		
	}
	
	public static void swap(int[] list, int first, int second) {
		int temp 		= list[first];
		list[first] 	= list[second];
		list[second] 	= temp;
	}
	
}
