
public class BankAccount {

	private double balance;


public BankAccount(double initialBalance) {
	balance = initialBalance;
}

public void deposit(double amount) {
	balance = balance + amount;
}

public void withdrawn(double amount) {
	balance = balance - amount;
}

public double getBalance() {
	return balance;
}

}
