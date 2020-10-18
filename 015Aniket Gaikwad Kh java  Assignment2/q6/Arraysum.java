import java.util.Scanner;
public class Arraysum{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array element:");
   int arr[]=new int[10];
   int add=0;
   int mult=1;

   for(int i=0;i<10;i++){
    System.out.print("Enter "+(i+1)+" element:");
     arr[i]=sc.nextInt(); 
     add=add+arr[i];
     mult=mult*arr[i];
    }   
    System.out.println("Addition of array element="+ add );
    System.out.println("Multilication of array element="+ mult );
  }
}