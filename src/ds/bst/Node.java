package ds.bst;

public class Node {
	int value;
	Node left;
	Node right;

	public Node() {

	}

	public Node (int value) {
		this.value = value;
	}

	public void displayNode() {
		System.out.println(" { " + value + " } ");
	}
}
