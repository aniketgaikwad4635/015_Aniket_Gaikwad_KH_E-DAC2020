package java_Assignment;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter floating number:");
        float f=sc.nextFloat();
        sc.close();
        int count=0;
        do {
        	f=f*10;
        	count++;
        }while(f!=(int)f);
        System.out.println(count);
	}

}
