public class Name {

	//Fields
	private String firstName;
	private String familyName;

	
	//Constructors
	public Name() {
		firstName = "";
		familyName = "";
	}
	
	public Name(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}

	
	//Methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override 
	public int hashCode() {
		return this.getFullName().length();
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getFullName() {
		return firstName + " " + familyName;
	}

	@Override
	public String toString() {
		return "Name:[firstName=" + firstName + ", familyName=" + familyName + "]";
	}
	
/**	@Override
	public boolean equals(Object obj) {
		if ((this.getClass() != obj.getClass()) || (obj == null) )
			return false;
		
			Name other = (Name) obj;
			
			return this.firstName.equals(other.firstName) && this.familyName.equals(other.familyName);
	}*/
}
