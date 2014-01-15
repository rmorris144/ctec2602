/**
 * The Register Class imports the ArrayList and the Collections.
 * Its a collection of Names that has many features such as sorting the register 
 * finding the size of the register etc. 
 * @author Ryan Morris
 */

import java.util.ArrayList;
import java.util.Collections;

//import java.util.ArrayList;


public class Register {
	
	//Fields
	private ArrayList<Name> namelist;//COLLECTION OF NAMES IN THE REGISTER
	private String Title; //The namefor the register
	
	//Constructors
	/**public Register() {
		namelist = new ArrayList<Name>();
	}*/
	
    /**Creates an empty playlist witht the given name.*/
	public Register() {
		this.Title = "Luke Attwood Register";
		namelist = new ArrayList<Name>();
	}
	
	/**Creates a empty register with no title included.
     * @param Title passes a Title to the register namelist
     */
	public Register(String Title) {
		this.Title = Title;
		namelist = new ArrayList<Name>();
	}
	
	//Collections method
	public void sortRegister() {
		Collections.sort(namelist);
	}
	

	
	/**Creates an empty register with a name included. */
	
	//Methods

	/****************************************************
	 * 
	 * 
	 * 
	 * 
	 ****************************************************/
	
    /** setTitle sets the title of the array. */
	public void setTitle(String Title) {
		this.Title = Title;
	}
	
    /**Gets the title of the array. */
	public String getTitle() {
		return Title;
	}
	
    /** Adds a name to the register
     * @param passes the method the variable r which gives it a name.
     */
	public void addName(Name r) {
		namelist.add(r);
	}
    
	/**This method returns the size of the register. */
	public int sizeofReg() {
		return namelist.size();
	}
	
    /**This method removes the Name at index I, you can pass an integer to the 
     * array and it will move the name for you.
     * @param i here we are passing it the integer i so that we can locate any 
     * given name within the array.
     */
	public void removeName(int i) {
		namelist.remove(i);
	}
	
	/**Here we are clearing the entire register.*/
	public void clearRegister() {
		namelist.clear();
	}
	
    /**We have Overrided the original toString method from the Name class 
     * we have given this class a Title and also the array.
     */
	@Override
	public String toString() {
		return "Register: Title = " + Title + "\n" + "namelist = " + namelist;
	}
	
	/**we are getting the names from the arrayList and returning them in 
     * the output. 
     * @param i we have passed the paramater I from the array which gets all the 
     * names from the array.
     */
	//Returns the name in the register at index i.
	public Name getName(int i) {
		Name n = null;
		if (0 <= i && i < namelist.size()) {
            n = namelist.get(i);
        } else {
            n = null; // i is out of range
        }
        return n;
	} 
	
}
