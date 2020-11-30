package T1Recursion;
class Sum{
	
	int sum(int n) {
		if(n==1)
			return 1;
		
		return n+sum(n-1);
	}
}
public class SumN {

	public static void main(String[] args) {
		Sum s=new Sum();
		int result_r=s.sum(5);
		System.out.print(result_r);

	}

}
