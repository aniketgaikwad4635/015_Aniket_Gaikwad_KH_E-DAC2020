package ClassObjectInheritance;
import java.util.Scanner;

class Circle {
	double radius;
	double area;
	double arearound;
	
	void init(double radius) {
		this.radius=radius;
	}
	void calculateArea() {
		this.area=2*Math.PI*radius;
	}
	void display() {
		System.out.println(area);
		arearound=Math.round(area*100.0)/100.0;
		System.out.println(arearound);
	}
}
public class CircleDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius:");
		double r=sc.nextDouble();
		sc.close();
		Circle c=new Circle();
		c.init(r);
		c.calculateArea();
		c.display();
	}

}
