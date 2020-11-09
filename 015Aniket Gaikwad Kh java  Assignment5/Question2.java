package StringAssignment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++) {
        	switch(arr[i]) {
        	case "zero": arr[i]="one";break;
        	case "one": arr[i]="two";break;
        	case "two": arr[i]="three";break;
        	case "three": arr[i]="four";break;
        	case "four": arr[i]="five";break;
        	case "five": arr[i]="six";break;
        	case "six": arr[i]="seven";break;
        	case "seven": arr[i]="eight";break;
        	case "eight": arr[i]="nine";break;
        	case "nine": arr[i]="ten";break;
        	}
        }
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }

	}

}
