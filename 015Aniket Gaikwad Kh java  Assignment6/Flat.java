package ClassObjectInheritance;
import java.util.Scanner;
class OneBHK {
	double roomArea;
	double hallArea;
	double price;
	OneBHK(double roomArea,double hallArea,double price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	void show() {
		System.out.println(roomArea);
		System.out.println(hallArea);
		System.out.println(price);
	}
}
class TwoBHK extends OneBHK {
	double room2Area;
	
	TwoBHK(double ra,double ha,double p,double r2a){
		super(ra,ha,p);
		this.room2Area=r2a;
	}
	void show() {
		super.show();
		System.out.println(room2Area);
	}
}
public class Flat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TwoBHK tbhk[]=new TwoBHK[3];
		for(int i=0;i<5;i++) {
			double ra=sc.nextDouble();
			double ha=sc.nextDouble();
			double p=sc.nextDouble();
			double r2a=sc.nextDouble();
			tbhk[i]=new TwoBHK(ra,ha,p,r2a);
		}
		sc.close();
		for(int i=0;i<5;i++) {
			tbhk[i].show();
		}
	}

}
