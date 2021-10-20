package basic;

public class Employee {
	String empName;
	String empID;
	private double sal;
	Employee(){}
	public Employee(String empName, String empID) {
		super();
		this.empName = empName;
		this.empID = empID;
	}
	public double getsal() {
		return sal;
	}
	public void setsal(double sal) {
		this.sal=sal;	
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", sal=" + sal + "]";
	}
	
	

}





