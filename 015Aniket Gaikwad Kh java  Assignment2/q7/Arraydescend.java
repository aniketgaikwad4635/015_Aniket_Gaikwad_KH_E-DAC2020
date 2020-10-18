import java.util.Scanner;
public class Arraydescend{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array element:");
   int arr[]=new int[10];
  
   for(int i=0;i<10;i++){
    System.out.print("Enter "+(i+1)+" element:");
     arr[i]=sc.nextInt(); 
    }   
     
      //int  max=arr[0];        //consider 0 index element is max and min for starting
      //int min=arr[0];
      int temp;
     
    for(int i=0;i<10;i++){      //to take all elements in array  suppose i=0 arr[4]
      for(int j=0;j<i;j++){     //check upto that index          check for arr[0] arr[1] arr[2] arr[3]
          if (arr[i]>arr[j]){   //  after swapping also we check all previous element // i for actual values in array j for iterate array element
              temp=arr[i];  
              arr[i]=arr[j];       //just swap max number at first and then min number so we will get max-min series that is in descending order
              arr[j]=temp;
             }
         }
      }
     
     System.out.println("Descending order");
      for(int i=0;i<10;i++)
     {
       System.out.println("arr["+i+"]="+arr[i]);
      } 
   
     for(int i=0;i<10;i++){
        for(int j=0;j<i;j++){
            if(arr[i]<arr[j]){
              temp=arr[i];
              arr[i]=arr[j];    
              arr[j]=temp;
           }
        }
      }
      System.out.println("Ascending order");
      for(int i=0;i<10;i++){
           System.out.println("arr["+i+"]="+arr[i]);
       }
  }
}