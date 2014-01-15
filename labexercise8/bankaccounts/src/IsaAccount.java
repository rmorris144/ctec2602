/**
 * The IsaAccount is an extension of the InterestAccount class
 * The IsaAccount creates a integer depositRemaining to alert the user of there
 * amount.
 *It also inherits the deposit field from the BankAccount class and overrides this.
 * @author: Ryan Morris
 */
public class IsaAccount extends InterestAccount {
	
	//Fields
	private int depositRemaining;
//	private int deposit;
	
	
	//Constructors
	
    /**Creates an IsaAccount with a deposit of 5000. */
	public IsaAccount() {
		super();
		depositRemaining = 5000;
	}
	
    /**Creates an IsaAccount
     *@param depositRemaining returns the depositRemaining.
     */
	public IsaAccount(int depositRemaining) {
		super();
		this.depositRemaining = depositRemaining;
		
		
	}
	
	//Methods
    /** Overrides the deposit method this includes super. It inputs the result 
     * into amount
     */
	@Override
	public void deposit(int amount) {
		if (depositRemaining - amount > 0) {
			super.deposit(amount);
			depositRemaining = depositRemaining - amount;
		}
	}
	
	/** This method get the depositRemaining and returns it*/
	public int getDepositRemaining() {
		return depositRemaining;
	}
	
//	public int resetDepositRemaining(int i) {
//		return 5000;
//	}
	/**This method resets the depositRemaining value to 5000 not only does it reset
     * it also initialises it.*/
	public void resetDepositRemaining() {
		depositRemaining = 5000;
	}
    
	/**This toString method returns a string containing the depositRemaining data.*/
	public String toString() {
	return super.toString() + " depositRemaining = " + depositRemaining;
	} 

}
