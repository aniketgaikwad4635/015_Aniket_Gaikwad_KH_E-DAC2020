import java.util.Scanner;
public class Arrayrev{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array element:");
   int arr[]=new int[10];

   for(int i=0;i<10;i++){
    System.out.print("Enter "+(i+1)+" element:");
     arr[i]=sc.nextInt(); 
    } 
   System.out.println("Given array:");
   for(int i=0;i<10;i++){
    System.out.println("arr["+i+"]="+arr[i]);
   }  
   System.out.println("reverse array:");
   
   int rev[]=new int[10];
   for(int i=9,j=0; i>=0; i--,j++){
     rev[j]=arr[i]; 
    } 
   for(int j=0;j<10;j++){
    System.out.println("arr["+j+"]="+rev[j]);
   }  

  }
}