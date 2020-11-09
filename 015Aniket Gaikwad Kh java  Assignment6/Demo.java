package ClassObjectInheritance;

import java.util.Scanner;

class MathOperation {
	static int add(int x,int y) {
		int res=x+y;
		return res;
	}
	static int subtract(int x,int y) {
		int res=x-y;
		return res;
	}
	static int multiply(int x,int y) {
		int res=x*y;
		return res;
	}
	static int power(int x,int y) {
		int res=1;
		for(int i=1;i<=y;i++) {
			res=res*x;
		}
		return res;
	}
}
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int f=sc.nextInt();
		System.out.print("Enter second number:");
		int s=sc.nextInt();
		sc.close();
		System.out.println(MathOperation.add(f,s));
		System.out.println(MathOperation.subtract(f,s));
		System.out.println(MathOperation.multiply(f,s));
		System.out.println(MathOperation.power(f,s));
	}

}
