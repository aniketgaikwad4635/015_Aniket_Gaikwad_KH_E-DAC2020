package Stack;
class StackApar{
	int top;
	int max;
	char arr[];
	StackApar(int m){
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
public class StackAllPar {
	     String str;
	     StackApar sk;
         void check(String s) {
        	 str=s;
        	 sk=new StackApar(str.length());
        	 for(int i=0;i<str.length();i++) {
        		 char c=str.charAt(i);
        		 
        		 if(c=='(' || c=='[' || c=='{' ) {
        			 sk.push(c);
        		 }
        		 else if(sk.isEmpty() && (c==')' || c==']' || c=='}' )  ) {
        			 sk.push(c);
        			 break;
        		 }
        		 else if(!sk.isEmpty() && (  ( sk.peek()=='(' && c==')' )|| 
        				                     ( sk.peek()=='[' && c==']' )||                             
        				                     ( sk.peek()=='{' && c=='}' )  )   ){
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
		StackAllPar skall=new StackAllPar();
		skall.check("(the[is]{valid})");
		skall.check("(the[is]{valid))");
		skall.check("{the(is[valid])}");
		skall.check("(this](is}{valid)");

	}

}
