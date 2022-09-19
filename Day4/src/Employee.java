
public class Employee {
	int empId;
	String empName;
	static int empCounter;
	
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
		System.out.println("Employee created... Counter will be incremented by 1");
		empCounter++;
	}
	
	// Static block
	static {
		System.out.println("In the static block");
		empCounter = 100;
	}
	
	// static method is not dedicated to any of the object. So you cannot use the keyword of object, or you cannot use any instant variables inside static method
	public static int getEmployeeCounter() {
		return empCounter;
	}
	
	public static void main(String[] args) {
		
	}
	
	



}