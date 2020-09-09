package LinkedList;

import java.util.List;

public class RunnerBasic {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(5);
		list.insert(15);
		list.insert(25);
		list.insert(77);
		list.insert(45);
		list.insertAtStart(1);
		list.insertAt(2, 99);
		int count = list.getCount();
		System.out.println("No of Nodes "+count);
		
		list.deleteAt(4);
		list.show();
	}
}

