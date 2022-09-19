
public class Arrays {
	
	public static void main(String[] args) {
		
		
		int[] data = new int[5];
		
		int[] data2 = new int[] {10, 53, 33, 23};
		

		Employee[] empArray = new Employee[] {new Employee(1, "Leo"), new Employee(2, "Cris"), new Employee(33, "Rom")};

		
		for(Employee emp : empArray) 
			System.out.println(emp.toString());
			
		
		
		
		
	}

}