
public class Employee implements Cloneable {
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public Employee(Employee e) {
		
	}
	
	// Static methods
	public static Employee create() {
		return new Employee(1, "");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empId + " " + this.empName;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee employee = (Employee)obj; // Downcasting
		if(this.empId == employee.empId)
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// return this.empId * 8;
		return super.hashCode();
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}



	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1, "Rob");
		Employee employee2 = new Employee(11, "Leroy");
		

		Employee employee3 = (Employee)employee2.clone(); 
		System.out.println(employee3);
	}



	





}