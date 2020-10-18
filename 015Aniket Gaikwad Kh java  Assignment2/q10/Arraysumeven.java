import java.util.Scanner;
public class Arraysumeven{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array element:");
   int arr[]=new int[10];
   int addeven=0;
   int addodd=0;   

   for(int i=0;i<10;i++){
    System.out.print("Enter "+(i+1)+" element:");
     arr[i]=sc.nextInt(); 
       if (arr[i]%2==0){
         addeven=addeven+arr[i]; 
       } 
       else if (arr[i]%2==1){
         addodd=addodd+arr[i]; 
       }
    }   
    System.out.println("Addition of even array element="+ addeven );
    System.out.println("Addition of odd array element="+ addodd );
  }
}