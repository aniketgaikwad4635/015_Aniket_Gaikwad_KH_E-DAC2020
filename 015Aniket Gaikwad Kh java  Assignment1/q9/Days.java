import java.util.Scanner;

public class Days{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter Days:");
     int d=sc.nextInt(); 
    
     int year=0;
     int month=0;

   while(d>=365){
     d=d-365;
     year++;
   }
   while(d>=31){
    d=d-31;
    month++;  
   }
  
   System.out.println("year="+year+" month="+month+" days="+d); 
  
  }
}