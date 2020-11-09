package StringAssignment;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String arr[]=str.split(" ");
        int size=arr.length;
       // String word;
        String a[]=new String[size];
        for(int i=0;i<size;i++) {
        	//word=
        	a[i]=arr[i].substring(0,1).toLowerCase()+arr[i].substring(1).toUpperCase();
        }
        for(int i=0;i<size;i++) {
          System.out.print(a[i]+" ");
        }
	}

}
