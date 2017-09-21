package ds.doublyLinkedList;

public class DoublyLinkedList {
	Node first;
	Node last;

	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if(isEmpty()) {
			last = newNode;
		}else {
			first.previous = newNode;
		}
		//old first
		newNode.next = first;
		first = newNode;
		first.previous = null;

	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if(isEmpty()) {
			first = newNode;
		}else {
			last.next = newNode;
			newNode.previous = last;
		}
		newNode.next = null;
		last = newNode;
	}

	// assume non empty list
	public Node deleteFirst() {
		Node temp = first;

		if(first.next == null) {
			last = null;
		}else {
			temp.next.previous = null;
		}
		first = temp.next;
		temp.next = null;

		return temp;
	}

	public Node deleteLast() {
		Node temp = last;
		if(first.next == null) {
			first = null;
		}else {
			last.previous.next = null;
		}
		last = last.previous;

		return temp;
	}

	public boolean insertAfter(int key, int data) {
		Node p = first;
		while(p != null) {

			if(p.data == key) {
				Node newNode = new Node();
				newNode.data = data;
				if(p != last) {
					p.next.previous = newNode;
				}else {
					last = newNode;
				}
				newNode.next = p.next;
				newNode.previous = p;
				p.next = newNode;
				return true;
			}
			p = p.next;
		}
		return false;
	}

	public Node deleteKey(int key) {
		Node p = first;

		while( p.data != key) {
			p = p.next;
			if(p == null)
				return null; // key is not present
		}

		Node temp = p; // item found

		// in the middle
		if(p != first) {
			p.previous.next = p.next; //problem if current node is first
		}else {
			p.next.previous = null;
			first = p.next;
		}

		if(p != last) {
			p.next.previous = p.previous; // problem if current node is last
		}else {
			p.previous.next = null;
			last = p.previous;
		}

		return p;
	}

	public void displayList() {
		Node p = first;
		while(p != null) {
			p.displayNode();
			p= p.next;
		}

	}
}