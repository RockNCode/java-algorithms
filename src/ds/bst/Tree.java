package ds.bst;

public class Tree {

	Node root;

	public void add(int value) {
		Node newNode = new Node (value);
		if(root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		while(true) {
			if(value <= current.value) {
				// go left
				if(current.left != null) {
					current = current.left;
					continue;
				}else {
					current.left = newNode;
					break;
				}
			}else {
				// go right
				if(current.right != null) {
					current = current.right;
					continue;
				}else {
					current.right = newNode;
					break;
				}
			}
		}
	}

	public void preOrderPrint(Node root) {

		if(root == null)
			return;
		System.out.println(root.value + " ");

		preOrderPrint(root.left);
		preOrderPrint(root.right);
	}

	public void postOrderPrint(Node root) {
		if(root == null)
			return;

		postOrderPrint(root.left);
		postOrderPrint(root.right);
		System.out.println(root.value + " ");

	}

	public void inOrderPrint(Node root) {
		if(root == null)
			return;

		inOrderPrint(root.left);
		System.out.println(root.value + " ");
		inOrderPrint(root.right);
	}
}
