
public class DieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Die c = new Die();
		
		System.out.println("Die score is "+ c.getScore());
		
		System.out.println("Die sides is " + c.getSides());
		
		c.roll();
		System.out.println("Roll " + c.getScore());
		System.out.println(" "+ c.toString());
	}
}
