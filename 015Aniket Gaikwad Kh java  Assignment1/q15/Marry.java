import java.util.Scanner;

public class Marry{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter gender(m/f):");
    char gender=sc.next().charAt(0);
    System.out.print("Enter age:");
    int age=sc.nextInt();
     if( gender=='m'){
         if(age>=21){
          System.out.println("eligible for marriage");
         }
         else if(age<21 && age>0){
          System.out.println("not eligible for marriage");
         }
         else{
         System.out.println("Invalid age");
         }
      }
     else if(gender=='f'){
        if(age>=18){
           System.out.println("eligible for marriage");
         }
        else if(age<18 && age>0){
           System.out.println("not eligible for marriage");
         }
        else {
        System.out.println("Invalid age");
        }
     } 
     else{
         System.out.println("Invalid Entry");
      }
  }
}