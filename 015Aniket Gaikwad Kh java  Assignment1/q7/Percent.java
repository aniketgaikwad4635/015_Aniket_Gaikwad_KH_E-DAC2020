import java.util.Scanner;
import java.lang.Math.*;

public class Percent{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter Marks in 5 subject:");
     int s1=sc.nextInt(); 
     int s2=sc.nextInt();
     int s3=sc.nextInt();  
     int s4=sc.nextInt(); 
     int s5=sc.nextInt(); 
   
   double perc= (s1+s2+s3+s4+s5)/5.0;
   double roundperc=Math.round(perc*100.0)/100.0;
   System.out.println("percentage marks =" +roundperc+"%"); 
  }
}