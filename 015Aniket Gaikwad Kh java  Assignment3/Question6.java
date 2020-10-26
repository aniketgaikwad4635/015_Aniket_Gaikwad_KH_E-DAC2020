package java_Assignment;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements of array");   //24,54,31,16,82,45,67
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		int largest=0;
		int secondlarge=0;
		int thirdlarge=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				thirdlarge=secondlarge;
				secondlarge=largest;
				largest=arr[i];
				
			}
			if(arr[i]>secondlarge&&arr[i]!=largest) {
				thirdlarge=secondlarge;
				secondlarge=arr[i];
				
			}
			if(arr[i]>thirdlarge&&arr[i]!=secondlarge&&arr[i]!=largest) 
			{
				thirdlarge=arr[i];
			}
			
		}
		System.out.print("Third largest="+thirdlarge);
	}

}
