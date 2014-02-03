
public class GenericRegisterTest {

	/**
	 * @param args
	 * 
	 * @author MrMorris
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericRegister<Name> nameReg = new GenericRegister<Name>();
		nameReg.add(new Name("Ryan", "Morris"));
		nameReg.add(new Name("Percy", "Musaka"));
		System.out.println("Your toString method: " + nameReg.toString());
		
		GenericRegister<Employee> empReg = new GenericRegister<Employee>();
		empReg.add(new Employee(new Name("Sam", "Jones"), new Date(01,10,2013), 30000));
		
		System.out.println("\nYour toString method: " + empReg.toString());
	}

}
