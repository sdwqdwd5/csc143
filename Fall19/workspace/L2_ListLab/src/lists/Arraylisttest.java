package lists;

import utility.Iterator;

public class Arraylisttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>(4);
		//String[] arr2 = new String[] {"d", "c", "b", "a"};
		//ArrayList <String>arr3 = new ArrayList<String>();
		arr.add("one");
		arr.add("two");
		arr.add("three");
		arr.add(2,"four");
		System.out.println(arr);
	//	arr.add(2,"five");
		System.out.println(arr);
	//	arr.add(2,"six"); 
		arr.add(0,"seven");
	//	arr.add(2,"eight");
		arr.add(2,"nine");
		System.out.println(arr);
		arr.add(2,"nine");
		arr.add(2,"nwe");
		arr.add(2,"nine");
		System.out.println(arr);
		System.out.println(arr.size());
		if(arr.remove("seven")) {
		System.out.println("YES");	
		}
		//Iterator<String> it = arr.iterator();
//		
//		
//		System.out.println(arr.iterator())
		System.out.println(arr);
		//it.next();
		//it.remove();
		
		
//		if(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//System.out.println(it.getIndex());
//		if(arr.add("d")) {
//			System.out.println("true");
//		}
//		//arr.add("e");
//		System.out.println(arr);
//		
//		System.out.println(arr);
	}

}
