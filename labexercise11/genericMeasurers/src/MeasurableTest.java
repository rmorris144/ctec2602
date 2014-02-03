import java.util.ArrayList;
import java.util.List;


public class MeasurableTest {

	/**
	 * @param args
	 * 
	 * @author MrMorris
	 */
	public static void main(String[] args) {
		System.out.println("The Test Programm: \n");
		
		//Measurable data = new Measurable();
		
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		accounts.add(new BankAccount(50));
		accounts.add(new BankAccount(5000000));
		accounts.add(new BankAccount(1092));
		
		System.out.println("The sum of the accounts " + DataAnalysis.sum(accounts));
		System.out.println("The avg of the accounts " + DataAnalysis.avg(accounts));
		System.out.println("The max of the accounts " + DataAnalysis.max(accounts));
		
		System.out.println("\nName class testing: \n");
		ArrayList<BankAccount> names = new ArrayList<BankAccount>();
		names.add(new BankAccount());
		System.out.println("The combined length of the first and familyname: " + DataAnalysis.sum(names));
		System.out.println("The combined length of the first and familyname: " + DataAnalysis.avg(names));
	}

}
