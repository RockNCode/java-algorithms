package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	private Node last;

	public SinglyLinkedList() {

	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
		if(first.next == null)
			last = first;
	}

	public void printList() {
		Node p = first;
		while(p != null) {
			p.displayNode();
			p= p.next;
		}

	}

	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}

	public void insertLast(int data) {
		if(first == null) {
			insertFirst(data);
			return;
		}
		Node newNode = new Node();
		newNode.data = data;
		last.next = newNode;
		last = newNode;
	}
}
