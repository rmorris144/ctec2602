import java.util.ArrayList;
import java.util.Scanner;


public class RegisterTest {

	public static void main(String[] args) {
		ArrayList<Name> register = new ArrayList<Name>();
		Scanner sc = new Scanner(System.in);
		
		Register reg = new Register();
		
	for (int i = 0; i < 1; i++) {
			System.out.println("Enter a first name: ");
			String FirstName = sc.next();
			System.out.println("Enter a family name: ");
			String FamilyName = sc.next();
			
			//register.addName( new Name("Ryan", "Morris") );
	}
			sc.close();
			
			
			reg.getName(i);
	
//	reg.getFullName();
//	System.out.println("FullName:\n ");
		
		System.out.println("The names contained in the array are:\n");
		for (Name i : register) {
			System.out.println(i.getFullName());
		}
		
		register.clear();
		if (register.isEmpty()) {
			System.out.println("\nThe ArrayList is now empty");
		}		
	}
}