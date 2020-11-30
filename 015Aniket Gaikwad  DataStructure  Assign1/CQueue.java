package Queue;

class Cque{
	int front;
	int rear;
	int max;
	int size;
	int arr[];
	
	Cque(){
		 front=0;
		 rear=0;
		 max=5;
		 size=0;
	     arr=new int [max];
	}
	boolean full() {
		return size==max;
	}
	boolean isEmpty() {
		return size==0;
	}
	void enque(int v) {
			arr[rear]=v;
			rear=(rear+1)%max;
			size++;
	}
	int  deque() {
		int ri=arr[front];
		front=(front+1)%max;
		size--;
		return ri;
	}
	void print() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[(front+i)%max]+" ");
		}
		System.out.println();
	}
	
	
}	
public class CQueue {

	public static void main(String[] args) {
		Cque cque=new Cque();
		cque.enque(10);
		cque.enque(20);
		cque.enque(30);
		cque.enque(40);
		cque.enque(50);
		   cque.print();
		cque.enque(60);
		   cque.print();
		cque.deque();
		cque.deque();
		cque.deque();
		    cque.print();
		cque.deque();
		cque.deque();
		   cque.print();
		cque.deque();
		    cque.print();
		System.out.println(cque.full());
		System.out.println(cque.isEmpty());
		cque.deque();
		System.out.println(cque.isEmpty());
		cque.enque(60);
		cque.print();

	}

}
