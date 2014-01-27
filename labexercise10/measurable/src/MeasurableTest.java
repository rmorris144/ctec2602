import java.util.ArrayList;


public class MeasurableTest {

	/**
	 * @param args
	 * 
	 * @author MrMorris
	 */
	public static void main(String[] args) {
		System.out.println("The Test Programm: \n");
		
		//Measurable data = new Measurable();
		
		ArrayList<Measurable> accounts = new ArrayList<Measurable>();
		
		accounts.add(new BankAccount(5000000));
		accounts.add(new BankAccount(50));
		accounts.add(new BankAccount(1092));
		
		System.out.println("The sum of the accounts " + DataAnalysis.sum(accounts));
		System.out.println("The avg of the accounts " + DataAnalysis.avg(accounts));
		
		System.out.println("\nName class testing: \n");
		ArrayList<Measurable> names = new ArrayList<Measurable>();
		names.add(new Name("Ryan", "Morris"));
		names.add(new Name("Sam", "Jones"));
		names.add(new Name("Percy", "Musaka"));
		System.out.println("The combined length of the first and familyname: " + DataAnalysis.sum(names));
		System.out.println("The combined length of the first and familyname: " + DataAnalysis.avg(names));
	}

}
