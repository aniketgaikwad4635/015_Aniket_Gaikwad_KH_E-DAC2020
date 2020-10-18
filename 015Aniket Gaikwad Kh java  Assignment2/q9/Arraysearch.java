import java.util.Scanner;
public class Arraysearch{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array element:");
   int arr[]=new int[10];

   for(int i=0;i<10;i++){
    System.out.print("Enter "+(i+1)+" element:");
     arr[i]=sc.nextInt(); 
    }   
    System.out.println("Enter element to search in array:" );
    int x=sc.nextInt();
    boolean found=true;
     for(int i=0;i<10;i++){
          if(x==arr[i]){
             found=true;
             break;   
          }
          else{
           found=false;
           continue; 
          }
     }
    
   System.out.println(found?"Entered element found in array":"Entered element Not found in array" );
  }
}