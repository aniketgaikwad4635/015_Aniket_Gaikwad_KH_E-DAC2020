package StringAssignment;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        sc.close();
        String str=str1.toLowerCase();
        String arr[]=str.split(" ");
        String flip[]=new String[arr.length];
        for(int i=0,j=(arr.length)-1;i<arr.length;i++,j--) {
        	flip[i]=arr[j];
        }
       
        for(int i=0;i<arr.length;i++) {
        	char ch[]=flip[i].toCharArray();
        	for(int j=0,k=ch.length-1;j<ch.length;j++,k--) {
        		System.out.print(flip[i].charAt(k));
        	}
        	
        	System.out.print(" ");
        }
       
        //shortcut
        System.out.println();
        for(int i=str.length()-1;i>=0;i--) {
        	System.out.print(str.charAt(i));
        }
	}

}
