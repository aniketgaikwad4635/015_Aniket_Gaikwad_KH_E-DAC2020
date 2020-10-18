import java.util.Scanner;
import java.lang.Math.*;

public class Simplei{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter principle amount:");
     int p=sc.nextInt(); 
     System.out.print("Enter rate of interest:");
     double r=sc.nextDouble(); 
     System.out.print("Enter time in year:");
     double t=sc.nextDouble();
   
   double si= (t*r*p)/100;
   double roundsi=Math.round(si*100.0)/100.0;
   System.out.println("Simple Interest="+roundsi); 
   System.out.println("Total Amount="+(p+roundsi));
  }
}