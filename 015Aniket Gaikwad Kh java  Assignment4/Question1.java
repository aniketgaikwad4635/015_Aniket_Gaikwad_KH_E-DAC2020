package assignment;
import java.util.Scanner;

class Student {
		int rollNo;
		String name;
		double marks;
		
      Student(int rn,String n,double m) {
    	  rollNo=rn;
    	  name=n;
    	  marks=m;
      } 
      void printDetails() {
  		System.out.println("Roll No "+rollNo);
  		System.out.println("name "+name);
  		System.out.println("marks "+marks);
  	}

}

public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student arr[]=new Student[2];
        for(int i=0;i<2;i++) {
        	System.out.print("Enter roll number,name and marks:");
        	int rn=sc.nextInt();
        	String n=sc.next();
        	double m=sc.nextDouble();
        	arr[i]=new Student(rn,n,m); 
        }
        sc.close();
        for(int i=0;i<2;i++) {
        	arr[i].printDetails();
        }

	}

}
