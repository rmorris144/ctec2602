/**
 * An Employee has a name, date of employment, and salary.
 * This example shows how an Employee is a Composition of Name and Date objects.
 * 
 * @author la
 */
public abstract class Employee {
    
	//Fields
    private int hourlyRate;
    private String fullName;
    private int hoursWorked;
    
    
    //Constructors
    /** Creates a new instance of Employee, using default name and date values. 
     * The default annual salary is 10000. */
    public Employee() {
        hoursWorked = 8;
        hourlyRate = 10; 
        fullName = "";
    }
    
    /** Creates a new instance of Employee, with the given values. 
     * 
     * @param name the name of the employee
     * @param date the date employment starts/started
     * @param salary the annual salary 
     * */
    public Employee( String fullName, int hourlyRate, int hoursWorked) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.fullName = fullName;
    }
 
    
    //Methods
    
    //Methods start
    
    public int getHoursWorked() {
    	return hoursWorked;
    }
    
    public void setHoursWorked (int i) {
     hoursWorked = i;
    }
    
    public int getHourlyRate() {
    	return hourlyRate;
    }
    
    public void setHourlyRate(int i) {
    	hourlyRate = i;
    }
    
    public String getFullName() {
    	return fullName;
    }
    
    public void setFullName() {
    	
    }
    
    public abstract int calculatePay();
    
    public String toString() {
    	return "Employee: fullName = " + fullName + ", hourlyRate = " + hourlyRate + ", hoursWorked = " + hoursWorked + "\n";
    }
    


    
    /* NOTE - when writing a toString method where a field
     * is a reference type, rather than a primitive type if you use
     * the name of the variable, e.g. name or startDate as below,
     * it will automatically call their toString method so in the 
     * code below startDate evaluates as startDate.toString(). You
     * can of course explicitly write .toString() if you like.
     */
}
