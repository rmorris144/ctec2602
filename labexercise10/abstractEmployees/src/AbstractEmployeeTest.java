import java.util.ArrayList;
import java.util.List;


public class AbstractEmployeeTest {

	/**
	 * @param args
	 * 
	 * @author MrMorris
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new OvertimeEmployee("Ryan Morris", 65, 7, 5, 14));
		employees.add(new FlexiEmployee("Sam Jones", 65, 7, -5));
		employees.add(new BonusEmployee("Percy Musaka", 65, 7, 250));
		
		System.out.println("This is the employees: \n " + employees.toString());
		
		for(Employee r : employees) {
			System.out.println("The for each loop: " + r.toString() + " This is the total of the calculate pay: £" + r.calculatePay());
		}
//		System.out.println("The for each loop: " + employees.toString());
		
	}

}
