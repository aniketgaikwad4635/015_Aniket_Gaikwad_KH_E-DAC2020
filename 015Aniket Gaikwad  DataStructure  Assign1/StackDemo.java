package Stack;
class Stack{
	int top;
	int max=3;
	int arr[];
	Stack(){
		top=0;
		arr=new int [max];
	}
	boolean full() {
		if(top>=max) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isEmpty() {
		if(top<=0) {
			return true;
		}
		else {
			return false;
		}
	}
	void push(int v) {
		if(top>=max) {
			System.out.println("overflow");
		}
		else {
			arr[top++]=v;
		}
	}
	int pop() {
		if(top<=0) {
			System.out.println("underflow");
			return -1;
		}
		else {
			int ri=arr[--top];
			return ri;
		}
	}
	int peek() {
		if(top<=0) {
			System.out.println("list empty");
			return -1;
		}
		else {
			return arr[top-1];
		}
	}
	void print() {
		if(top<=0) {
			System.out.println("list empty");
		}
		else {
			for(int i=0;i<top;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
public class StackDemo {

	public static void main(String[] args) {
		Stack sk=new Stack();
		System.out.println(sk.isEmpty());
		System.out.println(sk.full());
		sk.print();
		sk.push(10);
		sk.push(20);
		sk.push(30);
		sk.print();
		System.out.println(sk.isEmpty());
		System.out.println(sk.full());
		sk.push(40);
        sk.pop();
        sk.pop();
        System.out.println(sk.peek());
        sk.pop();
        sk.pop();
        System.out.println(sk.isEmpty());
		System.out.println(sk.full());
	}

}
