import java.util.Scanner;
import java.lang.Math.*;

public class Circle{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Radius of circle:");
     double r=sc.nextDouble();
    
     double area=Math.PI*r*r;
     double roundedarea=Math.round(area*100.0)/100.0;

     double per=2*Math.PI*r;
     double roundedper=Math.round(per*100.0)/100.0;

      System.out.println("Area="+ roundedarea);
      System.out.println("Circumfererence="+ roundedper);
  }
}