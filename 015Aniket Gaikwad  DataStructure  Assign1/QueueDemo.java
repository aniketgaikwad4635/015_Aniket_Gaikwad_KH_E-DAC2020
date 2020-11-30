package Queue;

class Queue{
	int front;
	int rear;
	int max;
	int size;
	int arr[];
	
	Queue(){
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
		if(size==max) {
			System.out.println("overflow");
		}
		else {
			arr[rear++]=v;
			size++;
		}
	}
	int  deque() {
		if(size==0) {
			System.out.println("underflow");
			return -1;
		}
		else {
			int ri=arr[front++];
			if(front==rear) {
				front=0;
				 rear=0;			 
			}
			size--;
			return ri;
		}
	}
	
	void print() {
		if(size==0 ||front==rear) {
			System.out.println("list empty");
		}
		else {
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
public class QueueDemo {
	public static void main(String[] args) {
		Queue que=new Queue();
		que.enque(10);
		que.enque(20);
		que.enque(30);
		que.enque(40);
		que.enque(50);
		que.print();
		que.enque(60);
		
		que.deque();
		que.deque();
		que.deque();
		    que.print();
		que.deque();
		que.deque();
		    que.print();
		que.deque();
		    que.print();
		System.out.println(que.full());
		System.out.println(que.isEmpty());
		que.deque();
		System.out.println(que.isEmpty());
		que.enque(60);
		que.print();
	}
}
