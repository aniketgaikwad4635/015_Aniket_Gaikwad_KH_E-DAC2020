package StringAssignment;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int div=1;;
        char ch[]=str.toCharArray();
        /*for(int i=1;i<ch.length;i++) {
        	if(ch[0]==ch[i]) {
        		div=i;
        		break;
        	}
        }
        String by=str.substring(0,1);
        String arr[]=str.split(by,div-1);
        */
        String by=str.substring(0,0);
        String arr[]=str.split(by);
        int count=0;
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]);
        }
        boolean repeat=true;
        for(int i=1;i<str.length();i++) {
            if(arr[0].compareTo(arr[i])==0) {
            	repeat=true;
            	count++;
        	    continue;
            }
            repeat=false;
            break;
        }
        
        if(repeat) {
        	System.out.println(repeat+"("+arr[0]+" is repeated "+count+" times)");
        }
        else {
        	System.out.println(repeat);
        }
	}

}
