
public class StudentAccount extends BankAccount {

	//Fields
//	private int balance;  //This initialises balance
	private int Overdraft;
	private int maximumBalance;
	
	
	//Constructors
	public StudentAccount() {
		super();
	//	balance = 0;
		Overdraft = 0;
		maximumBalance = 1000;
	}
	
	
	public StudentAccount(int balance, int Overdraft, int maximumBalance) {
		super(balance);
		this.Overdraft = Overdraft;
		this.maximumBalance = maximumBalance;
	}
	
	public void setmaximumBalance(int maximumBalance) {
		this.maximumBalance = maximumBalance;
	}
	
	public int getmaximumBalance() {
		return getmaximumBalance();
	}
	
	@Override
	public void withdraw(int amount) {
		if (super.getBalance() - amount >= maximumBalance) {
			System.out.println("You have exceeded your maximum limit:  " + getBalance());
		//	return maximumBalance;
		}
	}
	
	public String toString() {
		return super.toString() + "[StudentAccount=" + Overdraft + ", maximumBalance=" + maximumBalance + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void addBalance() {
		int amount = (super.getbalance());
	}
	
	public StudentAccount(int balance) {
		this.balance = balance;
	}
	
	//Methods
	
	public void deposit (int amount) {
		balance = balance + amount;
	}
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}
	
	
	
	
	
}
