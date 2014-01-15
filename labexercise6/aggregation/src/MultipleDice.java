/**
 * Multiple Dice Class
 * Is based on the collection of objects from the die class
 * The MultipleDice has an arraylist of type dielist as the field
 * It has a construction that accepts an int argument and add the number of die
 * objects
 * @author: Ryan Morris
 */

//The MultipleDice class must have an ArrayList of type Die

import java.util.ArrayList;

public class MultipleDice {
	
	//Fields
	private String diceTitle; //The title of the Dice
	private ArrayList<Die> dielist; // this is a a list of die objects
	private Die dieObject;

	//Constructors
	public MultipleDice() {
	this.diceTitle = "DICE";
	dielist = new ArrayList<Die>();

	}

	public MultipleDice(int dieObjects){
	for (int i = 0; i < dieObjects; i++) {
		dielist.add(dieObject);
	}
	}

	//Create a new Die list with loop 

	//Methods
	//Add method
	public String dieListTitle() {
		return diceTitle;
	}

	public void addDie(Die k) {
	dielist.add(k);
	}

	
    /** Remove Die objects from the list.
     * @param j the index of the Die object to be removed.
     */
	public void removeDie(int j) {
	dielist.remove(j);
	}
    
    //check if the list is empty
    public boolean isDieListEmpty() {
        return dieList.isEmpty();
    }
	
	//check the size of the list
	public int dielistSize() {
		return dielist.size();
	}
	
	/** Returns a Die object from the given index.
     * @param i the index for the DIe object to be retrieved from.
     * @return n a Die object
     */
	public Die getDie(int i) {
		Die n = null;
		if (0 <= i && i < dielistSize()) {
			n = dielist.get(i);
		} else {
			n = null;
		}
		return n;
	}
	
	// roll die list 
	public void rollDiceList() {
		for(Die dieObject : dielist) {
			dieObject.roll();
		}
	}

	public void rollAll() {
		for(Die dieObject : dielist){
		dieObject.roll();
		}
	}
    
    
	public String getDieList() {
	String s = "The DieList: " + this.diceTitle + "\n";
			for (int i = 0; i < dielist.size(); i++) {
				s = s + dielist.get(i).toString() + "\n";
	
	}
	return s;
	}
    
    // Get total Score of the DieList
	public int getTotalScore() {
		int sum = 0;
		for(int i = 0; i < dielistSize(); i++) {
			sum = sum+dielist.get(i).getScore();
			}
			return sum;
		}


	}
