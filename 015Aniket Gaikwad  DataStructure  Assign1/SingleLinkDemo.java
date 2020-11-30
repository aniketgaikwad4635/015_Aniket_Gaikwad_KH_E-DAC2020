package LinkedList;
class Nodes{
	private int val;
	     Nodes next;
	     Nodes(int v){
	    	 val=v;
	    	 next=null;
	     } 
	     void setNext(Nodes n) {
	    	next=n; 
	     }
	     void setVal(int v) {
		    	val=v;
		 }
	     Nodes getNext() {
	    	 return next;
	     }
	     int getVal() {
	    	 return val;
	     }
}

class SLL{
	  private Nodes head;
	         int size;
	  SLL(){
		  size=0;
		  head=null;
	  }
	  void insertFirst(int v) {
		  Nodes n=new Nodes(v);
		  if(head==null) {
			  head=n;
		  }
		  else {
			  n.next=head;
			  head=n;
		  }
		  size++;
	  }
	  void insertLast(int v) {
		  Nodes n=new Nodes(v);
		  if(head==null) {
			  head=n;
		  }
		  else if(head.next==null) {
			  head.next=n;
		  }
		  else {
			  Nodes curr=head;
			  while(curr.next!=null) {
				  curr=curr.next;
			  }
			  curr.next=n;
		  }
		  size++;
	  }
	  void deleteFirst() {
		  if(head==null) {
			  return;
		  }
		  else if(head.next==null) {
			  head=null;
			  size--;
		  }
		  else {
			  head=head.next;
			  size--;
		  }
	  }
	  void deleteLast() {
		  if(head==null) {
			  return;
		  }
		  else if(head.next==null) {
			  head=null;
			  size--;
		  }
		  else {
			  Nodes curr=head;
			  while(curr.next.next!=null) {
				  curr=curr.next;
			  }
			  curr.next=null;
			  size--;
		  }
		  
	   }
	  
	  void insertAtPos(int pos,int v) {
		  if(pos==1) {
			  insertFirst(v);
		  }
		  else if(pos==size+1) {
			  insertLast(v);
		  }
		  else if(pos>1 && pos<=size) {
			  Nodes curr=head;
			  int i=1;
			  while(i<pos-1) {
				  curr=curr.next;
				  i++;
			  }
			 Nodes n=new Nodes(v);
			 n.next=curr.next;
			 curr.next=n;
			 size++;
		  }
		  else {
			  System.out.println("insertion not possible");
		  }
	  }
	  void deleteAtPos(int pos) {
		  if(pos==1) {
			  deleteFirst();
		  }
		  else if(pos==size) {
			  deleteLast();
		  }
		  else if(pos>1 && pos<size) {
			  Nodes curr=head;
			  int i=1;
			  while(i<pos-1) {
				  curr=curr.next;
				  i++;
			  }
			 curr.next=curr.next.next;
			 size--;
		  }
		  else {
			  System.out.println("deletion not possible");
		  }
	  }
	  void print() {
		  if(head==null) {
			  return;
		  }
		  else {
			  Nodes curr=head;
			  while(curr!=null) {
				  System.out.print(curr.getVal()+" ");
				  curr=curr.next;
			  }
			  System.out.println();
		  }
	  }
}


public class SingleLinkDemo {

	public static void main(String[] args) {
		SLL sll=new SLL();
		sll.insertFirst(5);
		sll.insertAtPos(1, 10);
		sll.insertAtPos(2, 20);
		sll.insertAtPos(3, 30);
		sll.insertAtPos(2, 40);
        sll.print();
        sll.deleteFirst();
        sll.deleteLast();
        sll.deleteAtPos(1);
        sll.deleteAtPos(3);
        sll.deleteAtPos(2);
        sll.print();
	}

}
