package T1Recursion;
class Fibo{
	
	void fibo_i(int n) {
		int f=0;
		int s=1;
		int t;
		System.out.print(f+" "+s);
		for(int i=3;i<=n;i++) {
			t=f+s;
			f=s;
			s=t;
			System.out.print(" "+t);		
		}
		System.out.println();	
	}
	int fibo_r(int n) {
		if(n==0||n==1)
			return 1;
		
		return fibo_r(n-1)+fibo_r(n-2);
	}
}
public class Fibbonacci {

	public static void main(String[] args) {
		Fibo fb=new Fibo();
		fb.fibo_i(5);
        
		
		int result_r=fb.fibo_r(5);
        System.out.println(result_r);
	}

}
