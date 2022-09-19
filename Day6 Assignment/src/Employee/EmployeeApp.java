package Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		Address tempAddress = new Address(12, "Vicente", "Calderon", "Madrid");
		Address permanentAddress = new Address(56, "Sportify", "Camp Nou", "Barcelona");
		
		Address[] addressList = new Address[] {tempAddress, permanentAddress};
		
		Employee employee = new Employee(11, "Yash Mandwal",addressList );
		System.out.println(employee);
	}

}