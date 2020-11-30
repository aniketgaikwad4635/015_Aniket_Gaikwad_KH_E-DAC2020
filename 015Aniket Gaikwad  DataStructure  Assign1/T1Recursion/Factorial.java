package T1Recursion;
class Fact{
	
	int fact_i(int n) {
		int factorl=1;
		for(int i=1;i<=n;i++)
			factorl=factorl*i;
		return factorl;
	}
	int fact_r(int n) {
		if(n==1)
			return 1;
		
		return n*fact_i(n-1);
	}
}
public class Factorial {

	public static void main(String[] args) {
		Fact ft=new Fact();
		int result_i=ft.fact_i(5);
        System.out.println(result_i);
		
		int result_r=ft.fact_r(5);
        System.out.println(result_r);
	}

}
