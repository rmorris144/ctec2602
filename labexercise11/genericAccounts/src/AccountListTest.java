
public class AccountListTest {

	/**
	 * @param args
	 * 
	 * @author MrMorris
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountList<BankAccount> rbmAcc = new AccountList<BankAccount>();
		rbmAcc.addAccount(new BankAccount(5000));
		rbmAcc.addAccount(new BankAccount(1000));
		System.out.println("These are your accounts:\n " + rbmAcc.toString());
		
		AccountList<InterestAccount> rbmInt = new AccountList<InterestAccount>();
		rbmInt.addAccount(new InterestAccount(10000, 5, 1000));
		rbmInt.addAccount(new InterestAccount(3500, 2, 500));
		System.out.println("\nThis is your Interest Account:\n " + rbmInt.toString());
		
		System.out.println("\nThis is the combined balance of the values: " + rbmInt.combinedBalance());
		
		
		for (BankAccount b : rbmAcc) {
			b.deposit(1000);
			b.getBalance();
			System.out.println("\nThe for loop: " + b.toString());
		}
	}

}
