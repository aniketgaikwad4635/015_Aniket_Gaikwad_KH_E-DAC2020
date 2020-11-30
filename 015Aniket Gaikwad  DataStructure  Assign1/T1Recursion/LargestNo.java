package T1Recursion;
import java.util.*;
public class LargestNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
		 int arr[]= {a,b,c};
		sc.close();
		 int larg=0;
		 int second=0;
		 int third=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>larg) {
				 third=second;
				 second=larg;
				 larg=arr[i];
			 }
			 if(arr[i]>second && arr[i]!=larg) {
				 third=second;
				 second=arr[i];
			 }
			 if(arr[i]>third && arr[i]!=second &&arr[i]!=larg) {
				 third=arr[i];
			 }
		 }
		 System.out.println("third "+third);
	}

}
