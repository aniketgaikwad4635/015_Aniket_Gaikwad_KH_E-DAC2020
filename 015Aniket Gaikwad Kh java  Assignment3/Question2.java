package java_Assignment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements of array");   ////5,14,35,89,140
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		int avg;
	    if(arr.length>=3) {	
		  for(int i=0;i<arr.length-2;i++) {
			avg=(arr[i]+arr[i+1]+arr[i+2])/3;
			System.out.print(avg+" ");
		   }
	    } 	 
   }                              
}