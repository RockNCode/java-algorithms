package ds.bst;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree myTree = new Tree();

		myTree.add(5);
		myTree.add(4);
		myTree.add(6);
		myTree.add(3);
		myTree.preOrderPrint(myTree.root);

	}

}
