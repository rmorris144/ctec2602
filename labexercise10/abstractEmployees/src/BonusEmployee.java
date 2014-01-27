
public class BonusEmployee extends Employee{
	
	public int bonusAmount;
	
	public BonusEmployee() {
		super();
		bonusAmount = 100;
	}
	
	public BonusEmployee(String fullName, int hoursWorked, int hourlyRate, int bonusAmount) {
		super(fullName, hoursWorked, hourlyRate);
		this.bonusAmount = bonusAmount;
		
	}
	
	@Override
	public int calculatePay() {
		return ((super.getHoursWorked() * super.getHourlyRate()) + bonusAmount);
	}

}
