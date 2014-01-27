
public class OvertimeEmployee extends Employee{
	
	private int overtimeHours;
	private int overtimeRate;
	
	public OvertimeEmployee() {
		super();
		overtimeHours = 18;
		overtimeRate = 12;
		
	}
	
	
	public OvertimeEmployee(String fullName, int hoursWorked, int hourlyRate, int overtimeHours, int overtimeRate) {
		super(fullName, hoursWorked, hourlyRate);
		this.overtimeHours = overtimeHours;
		this.overtimeRate = overtimeRate;
	}
	



	@Override
	public int calculatePay() {
		return (((super.getHoursWorked() - overtimeHours) * super.getHourlyRate()) + (overtimeHours * overtimeRate));
	}

}
