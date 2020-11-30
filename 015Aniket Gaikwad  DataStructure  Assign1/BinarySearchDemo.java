package Tree;
class Nodebst{
	Nodebst left;
	Nodebst right;
	int val;
	Nodebst(int v){
	   left=null;
		 right=null;
	  val=v;		
	}
	int getValue() {
		return val;
	}
	void setleft(Nodebst lt) {
		left=lt;
	}
	void setright(Nodebst rt) {
		right=rt;
	}
}
class BinarySearch {
	Nodebst root;
	BinarySearch(){
		root=null;
	}
	void insert(int v) {
		root=insert(root,v);
	}
	Nodebst insert(Nodebst node,int v) {
		if(node==null) {
			node=new Nodebst(v);
			return node;
		}
		else {
			if(v<=node.getValue()) {
				node.left=insert(node.left,v);
			}
			else {
				node.right=insert(node.right,v);	
			}						
		}
		return node;		
	}
	
	boolean  search(int v) {
		return search(root,v);
	}
	boolean  search(Nodebst node,int v) {
		boolean found=false;
		while(node!=null && found!=true) {
			
			if(v<node.getValue()) {
				node=node.left;
			}
			else if(v>node.getValue()) {
				node=node.right;
			}
			else {
				found=true;
				break;
			}
			found=search(node,v);
		}
		return found;
	}
	
	int countNode() {
		return countNode(root);
	}
	int countNode(Nodebst node) {
		if(node==null) {
			return 0;
		}
		
		int counter=1;
		counter=counter+countNode(node.left);
		counter=counter+countNode(node.right);
		return counter;
	}
	
	void delete(int v) {
		if(root==null) {
			System.out.println("list empty");
		}
		else if(search(v)==false){
			System.out.println("element not in list");
		}
		else {
			root=delete(root,v);
			System.out.println("deleted");
		}
	}
	Nodebst delete(Nodebst root,int v) {
		Nodebst p;
		Nodebst p2;
		Nodebst node;
		if(v==root.getValue()) {
			Nodebst lt;
			Nodebst rt;
			lt=root.left;
			rt=root.right;
			if(lt==null &&rt==null) {
				return null;
			}
			else if(lt==null) {
				p=rt;
				return p;
			}
			else if(rt==null) {
				p=lt;
				return p;
			}
			else {
				p2=rt;
				p=rt;
				
				while(p.left!=null) {
				   p=p.left;
				}
				p.left=lt;
				return p2;
			}
		}
		if(v<root.val) {
			node=delete(root.left,v);
			root.setleft(node);
		}
		else {	
				node=delete(root.right,v);
				root.setright(node);
			
		}
		return root;
	}
	
	void inorder() {
		inorder( root);
		System.out.println();
	}
	void inorder(Nodebst node) {
		if(node==null) {
			return;
		}
		
		inorder(node.left);
		System.out.print(node.getValue()+" ");
		inorder(node.right);
	} 
}
public class BinarySearchDemo {

	public static void main(String[] args) {
		BinarySearch bst=new BinarySearch();
		bst.insert(10);
		bst.insert(20);
		bst.insert(30);
		System.out.println(bst.countNode());
		System.out.println(bst.search(30));
		System.out.println(bst.search(10));
		System.out.println(bst.search(40));
		//bst.delete(40);
		//bst.delete(30);
		bst.inorder();
	}

}
