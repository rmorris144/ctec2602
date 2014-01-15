import java.util.ArrayList;
import java.util.Scanner;


public class RegisterTest {

	public static void main(String[] args) {
		ArrayList<Name> register = new ArrayList<Name>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter a first name: ");
			String firstname = sc.next();
			System.out.println("Enter a family name: ");
			String surname = sc.next();
			
			register.add(new Name(firstname, surname));
		}
		sc.close();
		
		System.out.println("The names contained in the array are:\n");
		for (Name n : register) {
			System.out.println(n.getFullName());
		}
		
		register.clear();
		if (register.isEmpty()) {
			System.out.println("\nThe ArrayList is now empty");
		}		
	}

}