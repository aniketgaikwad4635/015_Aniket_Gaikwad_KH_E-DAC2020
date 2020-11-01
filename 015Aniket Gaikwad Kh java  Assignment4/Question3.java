package assignment;
import java.util.Scanner;

class Bank{
	double balance=1000;
	double deposit;
	double withdraw;
	long customerid;
	String name;
	
	void deposit(double dep) {
		deposit=dep;
		if(deposit>0) {
		  balance=balance+deposit;
		  System.out.println("deposited successfully");
		}
		else {
	    	System.out.println("Wrong entry.please enter positive value.");
	    }
	}
	
	void withdraw(double with) {
		withdraw=with;
	    if(withdraw>0)	{
		   if(balance-withdraw>=1000){
			  balance=balance-withdraw;
			  System.out.println("withdraw successfully");
		   }
		   else {
			System.out.println("You do not have sufficient balance.Try again.");
		   }
	    }
	    else {
	    	System.out.println("Wrong entry.please enter positive value.");
	    }
	}
	
	void checkbal() {
		System.out.println("Available balance="+balance);
	}
	
	void detail(long id,String n) {
		customerid=id;
		name=n;
		System.out.println("Account Number="+customerid);
		System.out.println("Account holder name="+name);
		System.out.println("Available balance="+balance);
	}
}

public class Question3 {

	public static void main(String[] args) {
		long id;
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter customer id:");
		id=sc.nextLong();
		sc.nextLine();
		System.out.print("Enter name of customer:");
		n=sc.nextLine();
		Bank b=new Bank();
       do {
    	   System.out.println();
    	   System.out.println("1.Deposit");
    	   System.out.println("2.Withdraw");
    	   System.out.println("3.Check Balance");
    	   System.out.println("4.Account detail");
    	   System.out.println("5.Exit");
    	   System.out.print("Your choice:");
    	   int choice=sc.nextInt();
    	   
    	   if(choice==1) {
    		    System.out.print("Enter amount to deposit:");
    			double dep=sc.nextDouble();
    		    b.deposit(dep); 
    	   }
    	   else if(choice==2) {
    		   System.out.print("Enter amount to withdraw:");
   			   double with=sc.nextDouble();
    		   b.withdraw(with); 
    	   }
    	   else if(choice==3) {
    		   b.checkbal(); 
    	   }
    	   else if(choice==4) {
    		   b.detail(id,n);
    		   
    	   }
    	   else if(choice==5) {
    		   System.out.print("Thank you. have a nice day!!!"); 
    		   break;
    	   }
    	   else {
    		   System.out.print("Invalid option.Enter valid input."); 
    		   break;
    	   }
       }while(true);
       sc.close();
	}
}
