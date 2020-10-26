package java_Assignment;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter numer of iterations for given series:");
		int n=sc.nextInt();
		sc.close();
		int square;
		int cube;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				cube=i*i*i;
				System.out.print(cube+" ");
			}
			else if(i%2==0) {
				square=i*i;
				System.out.print(square+" ");
			}
		}
	}

}
