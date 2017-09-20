import algo.binarySearch.BinarySearch;
import ds.singlylinkedlist.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {1,2,3,4,5,6,7,8,9,10 };
		//System.out.println("Index of 6 is " +  BinarySearch.binary_search(arr,11) );

		SinglyLinkedList list = new SinglyLinkedList();

		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.printList();

	}


}
