package circular;

import utility.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add(0, "E");
		System.out.println(list.size());
		System.out.println(list);
		list.remove("s");
		System.out.println(list);
		
		System.out.println(list.size());
	
	}
	

}
