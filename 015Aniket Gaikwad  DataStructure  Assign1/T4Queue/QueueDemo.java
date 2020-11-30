package T4Queue;

class Queue{
	int front;
	int rear;
	int max;
	int arr[];
	int size;
	Queue(){
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
		if(size==max) {
			System.out.println("overflow");
		}
		else {
			arr[rear++]=v;
			size++;
		}
	}
	int dequeue() {
		if(size==0) {
			System.out.println("underflow");
			return -1;
		}
		else {
			int ri=arr[front++];
			size--;
			if(front==rear) {   //front==rear    //deleting last element so we just reset value of front and rear
				front=0;
				rear=0;
			}
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
		for(int i=front;i<rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}	
	}
}
public class QueueDemo {
    
	public static void main(String[] args) {
		Queue que=new Queue();
		que.enqueue(10);
		que.enqueue(20);
		que.enqueue(30);
		que.enqueue(40);
		que.enqueue(50);
		que.print();
		que.enqueue(60);
		
		que.dequeue();
		que.dequeue();
		que.dequeue();
		    que.print();
		que.dequeue();
		que.dequeue();
		    que.print();
		que.dequeue();
		    que.print();
		System.out.println(que.full());
		System.out.println(que.empty());
		que.dequeue();
		System.out.println(que.empty());
		que.enqueue(60);
		que.print();
	}

}

