package StringAssignment;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i].length()+" ");
        }
        System.out.println();
        
        for(int i=0;i<arr.length;i++) {
        	char ch[]=arr[i].toCharArray();
        	System.out.print(ch.length+" ");
        }
	}

}
