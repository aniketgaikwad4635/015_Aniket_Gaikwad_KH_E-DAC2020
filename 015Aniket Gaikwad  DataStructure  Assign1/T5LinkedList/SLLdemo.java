package T5LinkedList;

class Nodell {
	int val;
	Nodell next;
	
	Nodell(){
		next=null;
	}
	Nodell(int v){
		val=v;
		next=null;
	}
	void setValue(int v) {
		val=v;
	}
	void setNext(Nodell n) {
		next=n;
	}
	int getValue() {
		return val;
	}
	Nodell getNext() {
		return next;
	}
}

class LL{
	int size;
	Nodell head;
	
	LL(){
		size=0;
		head=null;
	}
	void addFirst(int v) {
		Nodell n=new Nodell(v);
		n.setNext(head);
		head=n;
		size++;
	}
	void addLast(int v) {
		Nodell n=new Nodell(v);
		if(head==null) {                //means empty
			n.setNext(head);
			head=n;
		}
		else {
			Nodell current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.setNext(n);
		}
		size++;	
	}
	 void removefirst() {
		 if(head==null) {    System.out.println("list empty"); }
		 else {
			head=head.next;      //original head shifted to next node 
			size--;	
		 } 
	}
	 void removelast() {
		 if(head==null) {    System.out.println("list empty"); }
		 else {
			 Nodell current=head;
			 while(current.next.next!=null) {
				 current=current.next;
			 }
			 current.setNext(null);
			 size--;
		 }
	 }
	 void print() {
		 if(head==null) {    System.out.println("list empty"); }
		 else {
		 Nodell current=head;
		 while(current!=null) {
			 System.out.print(current.getValue()+" ");
			 current=current.next;
		 }
		 System.out.println();
	   }
	 }
}
public class SLLdemo {

	public static void main(String[] args) {
		LL ll=new LL();
		ll.addFirst(10);
		ll.addFirst(50);
		ll.addLast(70);
		ll.addLast(90);
		ll.print();
		ll.removefirst();
		ll.removelast();
		ll.print();
	}

}
