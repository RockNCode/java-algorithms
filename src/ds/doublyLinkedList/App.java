package ds.doublyLinkedList;

public class App extends DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();

		//list.insertFirst(3);
		//list.insertFirst(2);
		//list.insertFirst(1);
		//list.displayList();

		list.insertLast(3);
		list.insertLast(2);
		list.insertLast(1);
		list.insertAfter(1, 4);
		list.deleteKey(2);
//		list.deleteLast();
//		list.deleteFirst();
		list.displayList();


	}

}
