package StringAssignment;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++) {
        	if(i==ch.length-1) {
        	   System.out.print(ch[i]);	
        	}
        	else {
        		if(ch[i]==ch[i+1]) {
        			continue;
        		}
        		else {
        			 System.out.print(ch[i]);	
        		}
        	}
        }
	}

}
