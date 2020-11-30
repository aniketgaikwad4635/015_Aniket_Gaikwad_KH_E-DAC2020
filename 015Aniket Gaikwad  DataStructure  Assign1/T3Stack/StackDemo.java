package T3Stack;

class Stackd{
	int top;
	int max;
	int arr[];
	
	Stackd(){
		top=0;
		max=10;
		arr=new int[max];
	}
	boolean full() {
		return top==max;
	}
    boolean empty() {
    	return top==0;
    }
    void push(int v) {
    	if(top==max) {System.out.println("overflow");}
    	else {
    	   arr[top++]=v;	
    	}
    }
    int pop() {
    	if(top==0) {System.out.println("underflow"); return -1;}
    	else {
    		int ri=arr[--top];
    		return ri;
    	}
    }
    int peek() {
    	if(top==0) {System.out.println("underflow"); return -1;}
    	else {
    		return arr[top-1];
    	}
    }
    void print() {
    	for(int i=0;i<top-1;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
}
public class StackDemo {

	public static void main(String[] args) {
		Stackd st=new Stackd();
		st.push(10);
		st.push(20);
		st.push(30);
		st.print();
		System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.empty());
        st.pop();
        System.out.println(st.empty());
        st.pop();
        System.out.println(st.empty());
        st.pop();
        System.out.println(st.empty());
	}

}
