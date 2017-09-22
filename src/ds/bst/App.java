package ds.bst;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree myTree = new Tree();

		myTree.add(1);
		myTree.add(2);
		myTree.add(5);
		myTree.add(6);
		myTree.add(3);
		myTree.add(4);

		System.out.println("Pre Order");
		myTree.preOrderPrint(myTree.root);
		System.out.println("Post Order");
		myTree.postOrderPrint(myTree.root);

	}

}
