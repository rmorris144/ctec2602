import java.util.ListIterator;
import java.util.Scanner;


public class ProcessNameRegister {
	
	public static void main(String[] args) {
		NameRegister reg = new NameRegister();
		
		Scanner sc = new Scanner(System.in);
		int cmd = -1;
		String fName, lName;
		
		while (cmd  != 5) {
			
			System.out.println("\n===== Menu =====\n1. Add\n2. Remove\n3. Get last\n4. Process\n5. Quit\n");
			cmd = sc.nextInt();
			
			if (cmd == 1) {
				
				System.out.println("First name?");
				fName = sc.next();
				System.out.println("Last name?");
				lName = sc.next();
				reg.addFirst(new Name(fName, lName));
				
			} 
			else if (cmd == 2) {
				
				if (!reg.isRegisterEmpty()) {
					
					System.out.println("First name?");
					fName = sc.next();
					System.out.println("Last name?");
					lName = sc.next();
					
					if (reg.remove(new Name(fName, lName))) {
						System.out.println("Successfully removed name.");
					} else {
						System.out.println("Name does not exist in register.");
					}
					
				} else {
					System.out.println("Cannot remove from empty register.");
				}
				
			} 
			else if (cmd == 3) {
				
				if (!reg.isRegisterEmpty()) {
					
					System.out.println("Last name is " + reg.getLast().getFullName());
					
				} else {
					System.out.println("Register empty.");
				}
				
			} 
			else if (cmd == 4) {
				
				ListIterator<Name> itr = reg.iterator();
				
				while (cmd != 0 && (!reg.isRegisterEmpty())) {
					
					System.out.println("\n===== Sub Menu =====\n1. Next\n2. Previous\n3. Print register\n0. Stop processing\n");
					cmd = sc.nextInt();
					
					if (cmd == 1) {
						
						if (itr.hasNext()) {
							
							System.out.println("Current name: " + itr.next().getFullName());
							
							
							System.out.println("\n===== Sub Menu =====\n1. Add\n2. Set\n3. Remove\n4. Continue\n");
							cmd = sc.nextInt();
							
							if (cmd == 1) {
								
								System.out.println("First name?");
								fName = sc.next();
								System.out.println("Last name?");
								lName = sc.next();
								itr.add(new Name(fName, lName));
								
							} 
							else if (cmd == 2) {
								
								System.out.println("First name?");
								fName = sc.next();
								System.out.println("Last name?");
								lName = sc.next();
								itr.set(new Name(fName, lName));
								
							}
							else if (cmd == 3) {
								
								itr.remove();
								
							}							
							
							
						} else {
							System.out.println("At end of register.");
						}
						
					} 
					else if (cmd == 2) {
						
						if (itr.hasPrevious()) {
							
							System.out.println("Current name: " + itr.previous().getFullName());
							
							System.out.println("\n===== Sub Menu =====\n1. Add\n2. Set\n3. Remove\n4. Continue\n");
							cmd = sc.nextInt();
							
							if (cmd == 1) {
								
								System.out.println("First name?");
								fName = sc.next();
								System.out.println("Last name?");
								lName = sc.next();
								itr.add(new Name(fName, lName));
								
							} 
							else if (cmd == 2) {
								
								System.out.println("First name?");
								fName = sc.next();
								System.out.println("Last name?");
								lName = sc.next();
								itr.set(new Name(fName, lName));
								
							}
							else if (cmd == 3) {
								
								itr.remove();
								
							}	
							
							
						} else {
							System.out.println("At start of register.");
						}
						
					} 
					else if (cmd == 3) 
					{
						
						System.out.println("\n" + reg.getRegisterContent() + "\n");
						
					}
					else if (cmd != 0) {
						
						System.out.println("Invalid command.");
						
					}
					
				}
				
				System.out.println("\nStopped processing...");
				
			} 
			else if (cmd != 5) {
				
				System.out.println("Invalid command.");
				
			}
			
			System.out.println("\nRegister current content: " + reg.getRegisterContent());
			
		}
		
		System.out.println("\nQuitting register program...");
		sc.close();
	
	}

}
