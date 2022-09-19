package Bank;

public class BankApp {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(11, "Yash", AccountType.SAVINGS);
		try {
			double intrest = account1.calculateTotalInterest(179880, 6);
			System.out.println("Your total interest will be : " + intrest);
		} catch (DepositAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BankAccount account2 = new BankAccount(64, "Vani", AccountType.CURRENT);
		
		try {
			double intrest = account2.calculateTotalInterest(-33640, 3);
			System.out.println("Your total interest will be : " + intrest);
		} catch (DepositAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}