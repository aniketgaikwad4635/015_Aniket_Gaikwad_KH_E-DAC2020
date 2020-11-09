package ClassObjectInheritance;
class Employee{
	int empNo;
	double salary=10000;
	double totalSalary;
	
	 Employee(int empNo){
		 this.empNo=empNo;
	 }
	 double  totalSalary() {
		this.totalSalary=empNo*salary;
		return totalSalary;
	} 
	void displaytotal() {
		System.out.println("display no. of employees="+this.empNo);
		System.out.println("total of their salaries="+ this.totalSalary);
	} 
}
public class EmployeeDemo {
    
	public static void main(String[] args) {
		 Employee emp=new Employee(1);
		 emp.totalSalary();
		 emp.displaytotal();
	}

}
