/**
 * 
 * @author MrMorris
 * This class takes the PairOfDice class and adds some of it's methods to the 
 * Players.
 * 
 * 
 */

public class Player {

	//Fields
	private Name name;
	private PairOfDice dice;	
	
	//Constructors
	/**
	 * Default constructor that creates a new player object.
	 */
	public Player() {
		name = new Name();
		dice = new PairOfDice();
	}
	
    /**This constructor 
     * @param it takes a name and dice and then returns them. 
     */
	public Player (Name name, PairOfDice dice) {
		this.name = name;
		this.dice = dice;
		}
	
	
	
	//Methods
	/** Sets the Player name
     * @param name the name to be set to the Player object
     */
	public void setName(Name name) {
		this.name = name;
	}
	
    /**This method gets the Names and returns the. */
	public Name getName() {
		return name;
	}
	
    /**Gets the Dice from Die object. */
	public PairOfDice getPairOfDice() {
		return dice;
	}
	
    /**This method rolls both the red and blue dice. */
	public void rollDice() {
		dice.rollDice();
	}
	
    /**This method returns the DiceScore. */
	public int getDiceScore() {
		return dice.getDiceScore();
	}
	
	/**
	 * Returns a textual representation of the Player object.
	 * 
	 * @return a textual representation of the Player object.
	 */
	@Override
	public String toString() {
		return "Player:[name=" + name + ", Player Dice=" + dice + "]";
	}
	
}
