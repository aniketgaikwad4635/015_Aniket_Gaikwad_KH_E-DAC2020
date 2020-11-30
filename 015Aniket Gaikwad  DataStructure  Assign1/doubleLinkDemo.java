package LinkedList;
class Noded{
	private int val;
	     Noded prev;
	     Noded next;
	     Noded(int v){
	    	 val=v;
	    	 prev=null;
	    	 next=null;
	     } 
	     Noded(Noded pv,int v,Noded nt){
	    	 val=v;
	    	 prev=pv;
	    	 next=nt;
	     }
	     int getVal() {
	    	 return val;
	     }
}
class DLL{
	 Noded head;
	 int size;
	 DLL(){
		 head=null;
		 size++;
	 }
	 void insertFirst(int v){
		 if(head==null) {
			 Noded n=new Noded(null,v,null);
			 head=n;
			 
		 }
		 else {
			 Noded curr= head;
			 Noded n=new Noded(null,v,curr);
			 curr.prev=n;
			 head=n;
		 }
		 size++;
	 }
	 void insertLast(int v){
		 if(head==null) {
			 Noded n=new Noded(null,v,null);
			 head=n;
			 size++;
		 }
		 else if(head.next==null) {
			 Noded curr=head;
			 Noded n=new Noded(curr,v,null);
			 head.next=n;
			 size++;
		 }
		 else {
			 Noded curr= head;
			 while(curr.next!=null) {
				 curr=curr.next;
			 }
			 Noded n=new Noded(curr,v,null);
			 curr.next=n;
			 size++;
		 }
	  } 
	  void deleteFirst() {
		  if(head==null) {
				return;
		   }
		  else {
			     head=head.next;
				 head.prev=null;
				 size--;
			 }
	  }
	 void deleteLast() {
		 if(head==null) {
			return;
		 }
		 else if (head.next==null)  {
			 head=null;
		 }
		 else {
			 Noded curr= head;
			 while(curr.next.next!=null) {
				 curr=curr.next;
			 }
			 curr.next=null;
		 }
	 }
	void print() {
		if(head==null) {
			return;
		 }
		else {
			  Noded curr=head;
			  while(curr!=null) {
				  System.out.print(curr.getVal()+" ");
				  curr=curr.next;
			  }
			  System.out.println();
		  }
	}
}
public class doubleLinkDemo {

	public static void main(String[] args) {
		DLL dll=new DLL();
		dll.insertFirst(10);
		dll.insertFirst(20);
		dll.insertLast(30);
		dll.insertLast(40);
		dll.print();
		dll.deleteFirst();
		dll.deleteLast();
		dll.print();
	}

}
