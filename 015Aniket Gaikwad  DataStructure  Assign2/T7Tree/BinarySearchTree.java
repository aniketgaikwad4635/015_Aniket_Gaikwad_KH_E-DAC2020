package T7Tree;

class Node2{
	private int val;
	 Node2 left;
	 Node2 right;
	
	public Node2(int v) {
		val=v;
		left=null;
		right=null;
	}
	void setleft(Node2 lt) {
		left=lt;
	}
	void setright(Node2 rt) {
		right=rt;
	}
	Node2 getleft() {
		return left;
	}
	Node2 getright() {
		return right;
	}
	void setvalue(int v) {
		val=v;
	}
	int getvalue() {
		return val;
	}
}
class BSearchTree{
	  private Node2 root;
	  BSearchTree(){
		  root=null;
	  }
	  
	  void insert(int v) {
		  root=insert(root,v);
	  }
	  Node2 insert(Node2 node,int v) {
		  if(node==null) {
			  node=new Node2(v);
			  return node;
		  }
		  if(v<=node.getvalue()) {
			  node.left=insert(node.left,v);
		  }
		  else {
			  node.right=insert(node.right,v);
		  }
		 return node; 
	  }
	  
	 void delete(int v){
		  if(root==null) {
			  System.out.println("list is empty");
		  }
		  else if(search(v)==false) {
			  System.out.println("element not found in tree");
		  }
		  else {
			 root=delete(root,v); 
			  System.out.println("element deleted");
		  }
	  }
	  Node2 delete(Node2 root,int v) {
		  Node2 p, p2, node;
		  if(root.getvalue()==v) {    //delete main root
			   Node2 lt, rt;
			   lt=root.getleft();
			   rt=root.getright();
			  
			   if(lt==null && rt==null) {
				   return null;
			   }
			   if(lt==null) {                     //left node not present
				   p=rt;                          //make root to right node
				   return p;
			   }
			   else if(rt==null) {                //right node not present       
				   p=lt;                          //make root to left node
				   return p;
			   }
			   else {
				   p2=rt;
				   p=rt;
				   while(p.getleft()!=null) {
					   p=p.getleft();
				   }
				   p.setleft(lt);
				   return p2;
			   }
		  }
		  if(v<root.getvalue()) {
			  node=delete(root.getleft(),v);
			  root.setleft(node);
		  }
		  else {
			  node=delete(root.getright(),v);
			  root.setright(node);
		  }
		  
		 return root; 
	  }
	  
	  
	  boolean search(int v) {
		  return search(root,v);
	  }
	  boolean search(Node2 node,int v) {
		  boolean found=false;
		  
		  while(node!=null && found!=true) {
			  int nodeval=node.getvalue();
			  
			 if(v<nodeval) {
				 node=node.getleft();
			 } 
			 else if(v>nodeval) {
				 node=node.getright();
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
		return  countNode(root);
	  }
	  int countNode(Node2 node) {
		 if(node==null)
			 return 0;
		 else {
		 int counter=1;
		 counter=counter+countNode(node.left);
		 counter=counter+countNode(node.right);
		 return counter;
		 }
	  }
	  
	  void inorder() {
		  inorder(root);
		  System.out.println();
	  }
	  void inorder(Node2 node) {
		  if(node==null)
			  return;
		  
		  inorder(node.left);
		  System.out.print(node.getvalue()+" ");
		  inorder(node.right);		  
	  }	  
}
public class BinarySearchTree {

	public static void main(String[] args) {
		BSearchTree bst=new BSearchTree();
		bst.insert(10);
		bst.insert(20);
		bst.insert(30);
		bst.insert(40);
		bst.insert(50);
		bst.inorder();
		System.out.println(bst.search(10));
		System.out.println(bst.search(60));
		System.out.println(bst.countNode());
		bst.delete(60);
		bst.inorder();
		bst.delete(40);
		bst.inorder();
		bst.delete(10);
		bst.inorder();
	}

}

