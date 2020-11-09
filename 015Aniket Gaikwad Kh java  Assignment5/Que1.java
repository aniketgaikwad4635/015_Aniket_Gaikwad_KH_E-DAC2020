package StringAssignment;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String s=str.toLowerCase();
        int vowel=0;
        int conson=0;
        int num=0;
        int symbol=0;
        for(int i=0;i<str.length();i++) {
        	char ch=s.charAt(i);
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {++vowel;}
        	else if(ch>='a'&&ch<='z') {++conson;}
        	else if(ch>='0'&&ch<='9') {++num;}
        	else  {++symbol;}
        }
        
        System.out.println("vowel="+vowel);
        System.out.println("consonant="+conson);
        System.out.println("number="+num);
        System.out.println("symbol="+symbol);
	}

}
