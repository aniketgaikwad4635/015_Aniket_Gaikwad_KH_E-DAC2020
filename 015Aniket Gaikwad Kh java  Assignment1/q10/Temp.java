import java.util.Scanner;
import java.lang.Math.*;

public class Temp{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter temprature in fahrenheit:");
     double tempf=sc.nextDouble(); 
     double tempc=(5*(tempf-32))/9;
     double roundtempc=Math.round(tempc*100.0)/100.0;
    System.out.print("Temprature in celsius:"+roundtempc);
  }
}