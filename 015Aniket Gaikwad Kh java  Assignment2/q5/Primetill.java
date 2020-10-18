import java.util.Scanner;
public class Primetill{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter start number:");
   int s=sc.nextInt();
   System.out.print("Enter end number:");
   int e=sc.nextInt();
   prime(s,e);
  }
   
  public static void prime(int s,int e){
    for(int n=s;n<=e;n++){
        if(check(n)){
          System.out.print(n+" ");
        }
     }
   } 
   
    public static boolean check(int n){
     for(int i=2;i<=n-1;i++){
     if (n%i==0){
          return false;
       }
     }
     return true;
    }
 
}