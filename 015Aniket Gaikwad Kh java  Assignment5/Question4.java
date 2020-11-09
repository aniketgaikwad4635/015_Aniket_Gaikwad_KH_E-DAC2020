package StringAssignment;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        char ch[]=str.toCharArray();
        
       outer: for(int i=0;i<ch.length;i=i+2) {
        	if(i==ch.length-2) {
        		if(ch[i]==ch[i+1]) {
        	       System.out.print("not found");	
        	   }
        	}
        	else if(i==ch.length-1) {
        		
        	       System.out.print(ch[i]);	
        	   
        	}
        	else {
        		if(ch[i]==ch[i+1]) {
        			continue outer;
        		}
        		else {
        			 System.out.print(ch[i]);
        			 break outer;
        		}
        	}
        }
	}

}
