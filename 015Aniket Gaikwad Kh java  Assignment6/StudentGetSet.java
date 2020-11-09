package ClassObjectInheritance;
class StudentGS{
	private int rollno;
	private String name;
	public void setRollNo(int r) {
		rollno=r;
	}
	public int getRollNO() {
		return rollno;
	}
	public void setName(String s) {
		name=s;
	}
	public String getName() {
		return name;
	}
}
public class StudentGetSet {

	public static void main(String[] args) {
		StudentGS sgs=new StudentGS();
		sgs.setRollNo(15);
        sgs.setName("Aniket");
        
        System.out.println(sgs.getRollNO());
        System.out.println(sgs.getName());
	}

}
