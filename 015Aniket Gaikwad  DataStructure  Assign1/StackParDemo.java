package Stack;
class Stackpar{
	int top;
	int max;
	char arr[];
	Stackpar(int m){
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
	char peek() {
		if(top<=0) {
			System.out.println("list empty");
			return 0;
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
public class StackParDemo {
	   String str;
	   Stackpar sk;
         void check(String s) {
		   str=s;
		   sk=new Stackpar(str.length());
		   for(int i=0;i<str.length();i++) {
			   if(str.charAt(i)=='{') {
	    		sk.push(str.charAt(i));
	    	   }
			   else if( sk.isEmpty() && str.charAt(i)=='}'){
				   sk.push(str.charAt(i));
				   break;
			   }
		       else if( !sk.isEmpty() && str.charAt(i)=='}'){
			      sk.pop();
		       }		      
             }
		   if(sk.isEmpty()) {
			   System.out.println("balanced");
		   }
		   else {
			   System.out.println("Not balanced");
		   }
         }
	public static void main(String[] args) {
		StackParDemo stp=new StackParDemo() ;
		stp.check("{}{{}{}}{}");	
		stp.check("{}{");
	}

}
