import java.util.Scanner;

public class Swap{
 public static void main(String[] args){
   Scanner scan=new Scanner(System.in);
   System.out.print("Enter first number:");
   int x=scan.nextInt();
   System.out.print("Enter second number:");
   int y=scan.nextInt();

   System.out.println("Before swaping");  
   System.out.println("X="+x+" Y="+y);

   x=x+y;
   y=x-y;
   x=x-y;

   System.out.println("After swaping");  
   System.out.println("X="+x+" Y="+y);
   
  }
}
   