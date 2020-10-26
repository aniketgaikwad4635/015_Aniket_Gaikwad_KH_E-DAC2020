package java_Assignment;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of first array:");
		int first=sc.nextInt();
		int arrf[]=new int[first];
		System.out.println("enter elements of first array");
		for(int i=0;i<first;i++) {
			arrf[i]=sc.nextInt();
		}
		System.out.print("enter size of second array:");
		int second=sc.nextInt();
		int arrs[]=new int[second];
		System.out.println("enter elements of second array");	
		for(int i=0;i<second;i++) {
			arrs[i]=sc.nextInt();
		}
		sc.close();
		
		int max=(first>=second)?first:second;
		int third=first+second;
		int arrt[]=new int[third];
		int j=0;
		for(int i=0;i<max;i++) {
			if(i<first) {
			arrt[j]=arrf[i];
			j++;
			}
			if(i<second) {
				arrt[j]=arrs[i];
				j++;
			}
		}
		
		for(int i=0;i<third;i++) {
			System.out.print(arrt[i]+" ");
		}
	}
}
