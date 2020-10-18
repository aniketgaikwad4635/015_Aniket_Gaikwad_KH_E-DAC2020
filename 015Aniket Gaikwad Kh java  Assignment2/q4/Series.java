import java.util.Scanner;
public class Series{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter number of iteration:");
   int n=sc.nextInt(); 
   int add=12;
   for(int i=2;i<=n;i++){
     add=add+10;
    }   
    System.out.println("Addition Of series upto "+n+"iterations="+add );
  }
}