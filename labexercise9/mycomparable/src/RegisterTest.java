




public class RegisterTest {

	public static void main(String[] args) {
	
		
		Register reg = new Register();
		
			
			//register.addName( new Name("Ryan", "Morris") );
			reg.setTitle("Java");
			reg.addName(new Name("Ryan", "Morris"));
			reg.addName(new Name("Percy", "Jumbalaya"));
			reg.addName(new Name("Sam", "Jones"));
			reg.addName(new Name("Tino", "Morris"));
			reg.addName(new Name("Ismael", "Jumbalaya"));
			reg.addName(new Name("Sarah", "Jones"));
			
			
//			System.out.println("Register For " + reg.getTitle());
//			System.out.println("Register with " + reg.sizeofReg());
//			System.out.println(reg.getName(0) + "\n" 
//					 + reg.getName(1) + "\n"
//					+ reg.getName(2) );
			
			System.out.println("Title of Register " + reg.getTitle());
			System.out.println(reg.toString());
			System.out.println("\nRegister with " + reg.sizeofReg());
			//reg.getName(1);
			
			System.out.println("\nThe name your requested " + reg.getName(1));
			
			reg.sortRegister();
			
			System.out.println("\n" + reg.toString());
			
			reg.removeName(0);
			
			System.out.println("\n" + reg.toString());
			
//		    System.out.println(reg.removeName("Ryan", "Morris"));
//			
//			System.out.println("Clearing the Register: \n" + reg.clearRegister() + "\n");
			reg.clearRegister();
			
			System.out.println("\n" + reg.toString());
			
			
	}
			
	
//	reg.getFullName();
//	System.out.println("FullName:\n ");
		
	/**	System.out.println("The names contained in the array are:\n");
		for (Name i : register) {
			System.out.println(i.getFullName());
		}
		
		register.clear();
		if (register.isEmpty()) {
			System.out.println("\nThe ArrayList is now empty");
		}	**/	
	}
//}