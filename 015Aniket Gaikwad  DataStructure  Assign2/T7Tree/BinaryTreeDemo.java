package T7Tree;

class Node1{
	private int val;
	 Node1 left;
	 Node1 right;
	
	public Node1(int v) {
		val=v;
		left=null;
		right=null;
	}
	void setleft(Node1 lt) {
		left=lt;
	}
	void setright(Node1 rt) {
		right=rt;
	}
	Node1 getleft() {
		return left;
	}
	Node1 getright() {
		return right;
	}
	void setvalue(int v) {
		val=v;
	}
	int getvalue() {
		return val;
	}
}
class BinaryTree{
	Node1 root;
	
	BinaryTree(){
		root=null;
	}
	
	void preorder() {
		preorder(root);
	}
	void preorder(Node1 node) {
		if(node==null)
			return;
		
		System.out.print(node.getvalue()+" ");
		preorder(node.left);
		preorder(node.right);
	}
	
	void inorder() {
		inorder(root);
	}
	void inorder(Node1 node) {
		if(node==null)
			return;
		
		inorder(node.left);
		System.out.print(" "+node.getvalue());
		inorder(node.right);
	}
	
	void postorder() {
		postorder(root);
	}
	void postorder(Node1 node) {
		if(node==null) 
			return;
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(" "+node.getvalue());
	}
}
public class BinaryTreeDemo {

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		
		tree.root=new Node1(1);
		tree.root.left=new Node1(2);
		tree.root.right=new Node1(3);
		tree.root.left.left=new Node1(4);
		tree.root.left.right=new Node1(5);
		
		System.out.println("preorder ");
		tree.preorder();
		System.out.println();
		
		System.out.println("inorder ");
		tree.inorder();
		System.out.println();
		
		System.out.println("postorder ");
		tree.postorder();
		System.out.println();
	}

}

