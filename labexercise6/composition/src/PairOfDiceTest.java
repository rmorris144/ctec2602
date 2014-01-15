
public class PairOfDiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PairOfDice p = new PairOfDice();
		p.rollDice();
		p.getDiceScore();
		
		System.out.println("Die score is: "+ p.getDiceScore());
		
		//Creating a default instance of PairOfDice
		PairOfDice pod = new PairOfDice();
		System.out.println(pod.toString() + "\n");
		
		System.out.println(pod.getRed());
		System.out.println(pod.getBlue());
		
		//The toString method
		
		
	}
	
	
	
	

}
