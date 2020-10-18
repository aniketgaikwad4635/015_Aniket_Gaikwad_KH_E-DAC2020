import java.util.Scanner;
public class Prime{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter number:");
   int n=sc.nextInt();
   
    boolean prime=true;
    for(int i=2;i<=n-1;i++){
     if (n%i==0){
          prime=false;
          break;
       }
        prime=true;
    }   
    System.out.println(prime?"prime number":"not prime number");
  }
}