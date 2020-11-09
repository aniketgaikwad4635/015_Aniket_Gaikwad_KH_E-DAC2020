package ClassObjectInheritance;
abstract class Processor {
	int data;  
	void showData() {
		System.out.println(data);
	}
	abstract void process() ;
}
class  Factorial extends Processor {
	 void process() {
		 int fact=1;
		 for(int i=1;i<=10;i++) {
			 fact=fact*i;
		 }
		 System.out.println(fact);
	 }
}
class  Circles extends Processor {
	 void process() {
		 int r=1;
		 double area=Math.PI*r*r;
		 System.out.println(area);
	 }
}
public class AbstractDemo {

	public static void main(String[] args) {
		Processor p=new Factorial();
		p.process();
		
		Processor c=new  Circles();
        c.process();
	}

}
