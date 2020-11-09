package ClassObjectInheritance;
import java.util.Scanner;
class Product{
	int pid;
	double price;
	int quantity;
	Product(int pid,double price,int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	void detail(){
		System.out.println("process ID="+pid);
		System.out.println("price="+price);
		System.out.println("quantity="+quantity);
	}
}

public class ProductDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Product prod[]=new Product[5];
        for(int i=0;i<5;i++) {
        	int pid=sc.nextInt();
    		double price=sc.nextDouble();
    		int quantity=sc.nextInt();
    		prod[i]=new Product(pid,price,quantity);
        }
        double max=prod[0].price;
        int index=0;
        for(int i=0;i<5;i++) {
        	if(prod[i].price>max) {
        		max=prod[i].price;
        		index=i;
        	}
        }
        sc.close();
        prod[index].detail();
        
	}

}
