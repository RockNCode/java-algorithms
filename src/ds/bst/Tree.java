package ds.bst;

public class Tree {

	Node root;

	public void add(int value) {
		System.out.println("add");
		Node newNode = new Node (value);
		if(root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		while(true) {
			System.out.println("at while");
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

	public void inorderPrint() {

	}
}
