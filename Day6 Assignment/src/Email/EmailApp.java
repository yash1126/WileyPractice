package Email;

public class EmailApp {
	
	public static void main(String[] args) {
		Email email = new Email();
		
		try {
			String result = email.validateEmail("man11@gmail.com");
			System.out.println(result);
			
			String result1 = email.validateEmail("mandwal@yash@gmail.com");
			System.out.println(result1);
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}