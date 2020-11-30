package T4Queue;

class Cqueue{
	int front;
	int rear;
	int max;
	int arr[];
	int size;
	
	Cqueue(){
		front=0;
		rear=0;
	    max=5;
		arr=new int[max];
		size=0;
	}
	
	boolean full() {
		return size==max;
	}
	boolean empty() {
         return size==0;
	}
	void enqueue(int v) {
		if(size==max) {System.out.println("overflow");}
		else {
			arr[rear]=v;
			size++;
			rear=(rear+1)%max;
		}
	}
	int dequeue() {
		if(size==0) 
		 {  
		   System.out.println("underflow");
		   return -1;  
		 }
		else {
			int ri=arr[front];
			size--;
			front=(front+1)%max;
			return ri;
		 }
	}
	int peek() {
		if(size==0 ||front==rear) {System.out.println("Empty");return -1;}
		else {
			return arr[rear-1];
		}
	}
	void print() {
		if(size==0) {
			System.out.println("empty");
		}
		else {
		for(int i=front;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}	
	}
	
}
public class CqueueDemo {

	public static void main(String[] args) {
		Cqueue cque=new Cqueue();
		cque.enqueue(10);
		cque.enqueue(20);
		cque.enqueue(30);
		cque.enqueue(40);
		cque.enqueue(50);
		   cque.print();
		cque.enqueue(60);
		   cque.print();
		cque.dequeue();
		cque.dequeue();
		cque.dequeue();
		    cque.print();
		cque.dequeue();
		cque.dequeue();
		   cque.print();
		cque.dequeue();
		    cque.print();
		System.out.println(cque.full());
		System.out.println(cque.empty());
		cque.dequeue();
		System.out.println(cque.empty());
		cque.enqueue(60);
		cque.print();

	}

}
