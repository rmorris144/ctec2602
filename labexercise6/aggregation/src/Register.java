import java.util.ArrayList;

//import java.util.ArrayList;


public class Register {
	
	//Fields
	//private String name;
	//private int duration;
	private ArrayList<Name> namelist; //COLLECTION OF NAMES IN THE REGISTER
	
	//Constructors
	public Register() {
		namelist = new ArrayList<Name>();
	}
	/**Creates a empty register with no title included. */
	
	/**Creates an empty register with a name included. */
	
	//Methods
	
	
	
	public String toString() {
		return "Register:[FirstName=" + FirstName + ", FamilyName=" + FamilyName + "]";
	}
	
	/****************************************************
	 * 
	 * 
	 * 
	 * 
	 ****************************************************/
	
	public void addName(Name r) {
		namelist.add(r);
	}
	
	public void removeName(int i) {
		namelist.remove(i);
	}
	
	
	public void clearRegister() {
		namelist.clear();
	}
	
	
	/**public String toString() {
		return "Register:[FirstName=" + FirstName + ", namelist=" + namelist + "]";
	} */
	
	
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
	
	//Returns the total names in the register
	public int getTotalRegister() {
		int total = 0;
		for (Name n : namelist) {
            total = total + n.getDuration();
        }
        return total;
	}
	
	
	
	
	
}
