
public class BankAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Ryancheck = new BankAccount(1000);
		Ryancheck.deposit(1000);
		Ryancheck.withdrawn(500);
		System.out.println(Ryancheck.getBalance());
		System.out.println("Expected: 500");
	}

}
