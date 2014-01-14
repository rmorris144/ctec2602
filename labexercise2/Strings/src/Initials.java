
public class Initials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myName = "David Beckham";
		
		//Prints out the string literal
		System.out.println(myName);
		
		char c;
		
		//Uses the charAt method and assigns it the variable 4
		c = myName.charAt(4);
		System.out.println("4th character is:" + c);
		
		//Uses the indexof API to return the first occurrence of the string
		System.out.println(myName.indexOf(myName));

		//Uses the toLower case to change the email address from uppercase to lower case
		System.out.println(myName.toLowerCase());
	}

}
