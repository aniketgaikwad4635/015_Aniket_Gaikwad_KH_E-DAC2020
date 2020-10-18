import java.util.Scanner;
public class Reverse{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter number:");
   int n=sc.nextInt();
   int rem;
   int reverse=0;
  System.out.print("Reverse number:");
  while(n>0)
  { 
    rem=n%10;
    System.out.print(rem);
  
    //reverse=(reverse*10)+rem;
    n=n/10;
   }
    //System.out.println("Reverse number:"+reverse);
  }
}