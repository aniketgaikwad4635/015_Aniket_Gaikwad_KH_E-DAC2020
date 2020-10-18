import java.util.Scanner;
import java.lang.Math.*;

public class Salary{
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter basic salary of employee:");
     int basic=sc.nextInt(); 
     double HRA;
     double DA;
     double GS;
     double roundGS;
     if (basic<10000)
    {
     HRA=0.10*basic;
     DA=0.90*basic;
     GS=basic+DA+HRA;
     roundGS=Math.round(GS*100.0)/100.0;
     System.out.println("Gross Salary="+roundGS);
    }
    else if(basic>=10000){
     HRA=2000;
     DA=0.98*basic;
     GS=basic+DA+HRA;
     roundGS=Math.round(GS*100.0)/100.0;
     System.out.println("Gross Salary="+roundGS);
     }
     
  }
}