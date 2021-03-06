package ds.linkedList;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nodeA = new Node();
		nodeA.data = 4;

		Node nodeB = new Node();
		nodeB.data = 3;

		Node nodeC = new Node();
		nodeC.data = 7;

		Node nodeD = new Node();
		nodeD.data = 8;

		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;

		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));

	}

	public static int listLength(Node aNode) {
		int cnt = 0;
		Node current = aNode;
		while(current !=null) {
			current = current.next;
			cnt++;
		}
		return cnt;
	}

}
