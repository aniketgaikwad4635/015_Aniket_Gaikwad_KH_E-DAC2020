package assignment;
import java.util.Scanner;

class Book {
	int id;
	String name;
	double price;
	
	Book(int num,String n,double p) {
		id=num;
		name=n;
		price=p;
  } 
  void printDetails() {
		System.out.println("Book Id= "+id);
		System.out.println("name= "+name);
		System.out.println("Price= "+price);
	}

}

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book arr[]=new Book[5];
        for(int i=0;i<5;i++) {
        	System.out.print("Enter id, name & price of book:");
        	int num=sc.nextInt();
        	String n=sc.next();
        	double p=sc.nextDouble();
        	arr[i]=new Book(num,n,p);
        }
        sc.close();
        double maxprice=arr[0].price;
        int maxPriceObj=0;
        for(int i=0;i<5;i++) {
        	if(arr[i].price>=maxprice) {
        		maxprice=arr[i].price;
        		maxPriceObj=i;
        	}
        }
       
        arr[maxPriceObj].printDetails();
	}

}
