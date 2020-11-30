package Stack;
class Stackrev{
	int top;
	int max;
	char arr[];
	Stackrev(int m){
		top=0;
		max=m;
		arr=new char [max];
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
	void push(char v) {
		if(top>=max) {
			System.out.println("overflow");
		}
		else {
			arr[top++]=v;
		}
	}
	char pop() {
		if(top<=0) {
			return 0;
		}
		else {
			char rc=arr[--top];
			return rc;
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
}	
public class StackStrRev {
	String str;
	Stackpar sk;
    public void check(String s) {
    	str=s;
    	sk=new Stackpar(str.length());
    	
    	for(int i=0;i<str.length();i++) {  
    			sk.push(str.charAt(i));
    	}
    	for(int i=0;i<str.length();i++) {  
    		char ch=sk.pop();
			System.out.print(ch);
	     }
    }
	public static void main(String[] args) {
		StackStrRev  st=new StackStrRev ();
		st.check("welcome friend");
         
	}

}
