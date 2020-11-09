package ClassObjectInheritance;

class Student {
	int rollno;
	 String name;
	 void setData(int rollno,String name) {
		 this.rollno=rollno;
		 this.name=name;
	 }
	 void showData() {
		 System.out.println(rollno);
		 System.out.println(name);
	 }
}
public class StudentDemo {

	public static void main(String[] args) {
		Student stud=new Student();
		stud.setData(15, "Aniket");
		stud.showData();

	}

}
