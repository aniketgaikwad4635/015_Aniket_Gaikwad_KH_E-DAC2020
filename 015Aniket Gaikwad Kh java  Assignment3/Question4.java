package java_Assignment;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();                                 
		                            //5,14,35,90,139     //88,67,35,14,-12  //65,14,129,34,7 
		boolean Ascending=false;
		boolean Descending=false;
		outer:for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {		
				if(arr[j]<arr[i]) {
					Ascending=true;
					continue;
				}
				Ascending=false;
				break outer;
			}
		}
		
		outer:for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {		
				if(arr[j]>arr[i]) {
					Descending=true;
					continue;
				}
				Descending=false;
				break outer;
			}
		}
				
		if(Ascending==true) {
			System.out.println("Ascending");
		}
		else if(Descending==true) {
			System.out.println("Descending");
		}
		else {
			System.out.println("Random");
		}
	}
}
