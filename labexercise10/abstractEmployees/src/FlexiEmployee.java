
public class FlexiEmployee extends Employee{
	
	private int flexiHours;
	
	public FlexiEmployee() {
		super();
		flexiHours = 10;
	}
	
	public FlexiEmployee(String fullName, int hoursWorked, int hourlyRate, int flexiHours) {
		super(fullName, hoursWorked, hourlyRate);
		this.flexiHours = flexiHours;
	}
	@Override
	public int calculatePay() {
		return ((super.getHoursWorked() + flexiHours) * super.getHourlyRate());
	}
	
}
