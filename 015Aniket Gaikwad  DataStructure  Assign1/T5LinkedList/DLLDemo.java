package T5LinkedList;

class Nodedll{
	int val;
	Nodedll prev;
	Nodedll next;
	
	Nodedll(){
		val=0;
		prev=null;
		next=null;
	}
	
	Nodedll(Nodedll p, int v, Nodedll n){
		prev=p;
		val=v;
		next=n;
	}
	int getValue() {
		return val;
	}
}
class DLL{
	 int size;
	 Nodedll head;
	 
	 DLL() {
		 head=null;
		 size=0;
	 }
	 
	 void addfirst(int v) {
		 if(head==null) {
		   Nodedll n=new Nodedll(null,v,null);
		   head=n;
		 }
		 else {                                        //if(head.next==null) 
			 Nodedll current=head;
			 Nodedll n=new Nodedll(null,v,current);
			 current.prev=n;
			 head=n;
		 }
	   size++;	 
	 }
	 
	 void addlast(int v) {
		 if(head==null) {
			   Nodedll n=new Nodedll(null,v,null);
			   head=n;
		 }
		 else {
			 Nodedll current=head;
			 while(current.next!=null) {
				 current=current.next;
			 }
			 Nodedll n=new Nodedll(current,v,null);
			 current.next=n;
		 }
		 size++;
	 }
	 void addAtPos(int v,int pos) {
		  if(head==null) {return;}
		  if(pos<1 || pos>size) {return;}
		  
		  Nodedll current=head;
		  int i=1;
			while(i<pos) {
				current=current.next;
				i++;
			}  
		  
			if(current.prev==null) {                   //pos=1 
				Nodedll n=new Nodedll(null,v,current);
				current.prev=n;
				head=n;
				
			}
			else {
				Nodedll n=new Nodedll(current.prev,v,current);
				current.prev.next=n;
				current.prev=n;
			}
			
			size++;
	 }
	 void removefirst() {
		 if(head==null) {
			   System.out.println("list empty");
		 }
		 else {
			 Nodedll current=head;
			 head=head.next;
			 head.prev=null;
			 size--; 
		 }
		
	 }
	 void removelast() {
		 if(head==null) {                          //0 element
			   System.out.println("list empty");
		 }
		 else if(head.next==null) {               //1 element
			 head=null;
			 size--;
		 }
		 else {                                  //more than 1 element  
			 Nodedll current=head;
			 while(current.next.next!=null) {
				 current=current.next;
			 }
			 current.next=null;
			 size--;
		 }
	 } 
	 void print() {
	      if(head==null) {    System.out.println("list empty"); }
		 else {
		 Nodedll current=head;
		 while(current!=null) {
			 System.out.print(current.getValue()+" ");
			 current=current.next;
		 }
		 System.out.println();
	   }
	 }
}
public class DLLDemo {

	public static void main(String[] args) {
		  DLL dll=new DLL();
		  dll.addfirst(10);
		  dll.addfirst(30);
		  dll.addlast(60);
		  dll.addlast(80);
		  dll.print();
		  
		  dll.removefirst();
		  dll.removelast();
		  dll.print();
		  dll.removelast();
		  dll.print();
		  dll.removelast();
		  dll.print();
		  
		  dll.addAtPos(10, 0);
		  dll.addAtPos(10, 1);
		  dll.print();
		  dll.addAtPos(100, 1);
		  dll.print();
		  dll.addAtPos(100, 1);
		  dll.print();
	}

}
