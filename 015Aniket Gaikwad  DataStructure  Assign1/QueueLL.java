package Queue;
class Node{
	int val;
	Node next;
	Node(int v){
		val=v;
		next=null;
	}
	int getValue() {
		return val;
	}
}
class LinkQue{
	Node front;
	Node rear;
	int length;
	int length() {
		return length;
	}
	boolean isEmpty() {
		return length==0;
	}
	void enqueue(int v) {
		Node n=new Node(v);
		if(isEmpty()) {
			front=n;
		}
		else {
			rear.next=n;
		}
		rear=n;
		length++;
	}
	void print() {
		if(isEmpty()) {
			return;
		}
		Node curr=front;
		while(curr!=null) {
			System.out.print(curr.getValue()+">> ");
			curr=curr.next;
		}
		System.out.print("null");
	}
}
public class QueueLL {

	public static void main(String[] args) {
		LinkQue lq=new LinkQue();
		lq.enqueue(10);
		lq.enqueue(15);
		lq.enqueue(20);
		lq.print();
	}

}
