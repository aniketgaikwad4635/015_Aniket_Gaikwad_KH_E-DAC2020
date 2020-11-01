package assignment;
import java.util.Scanner;

class Complex{
	int real;
	int complex;
	void addition(int r1,int i1,int r2,int i2) {
		real=r1+r2;
		complex=i1+i2;
		System.out.print(real+"+"+complex+"i");
	}
	
}

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Complex c=new Complex();
		System.out.print("Enter first complex number:");
        int r1=sc.nextInt();
       // char c1=sc.next().charAt(0);
        int i1=sc.nextInt();
        //char c2=sc.next().charAt(0);
        
        System.out.print("Enter second complex number:");
        int r2=sc.nextInt();
        //char c3=sc.next().charAt(0);
        int i2=sc.nextInt();
        //char c4=sc.next().charAt(0);
        c.addition(r1,i1,r2,i2);
        sc.close();
	}

}
