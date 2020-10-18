import java.util.Scanner;
import java.lang.Math.*;

public class Greatest{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter 3 numbers:");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
   
    int d=c>((a>b)?a:b)? c:((a>b)?a:b);
    System.out.println("greatest number is "+d); 
    
   
     if (a>=b && a>=c){
     System.out.println("greatest number is "+a);
     }
    else if (b>=a && b>=c){
     System.out.println("greatest number is "+b);
     }
     else if (c>=a && c>=b){
     System.out.println("greatest number is "+c);
     }
   
  }
}