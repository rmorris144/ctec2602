//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class NameRegister implements Iterable<Name> {
	
	//Fields
	private LinkedList<Name> list;
	
	//Constructors
	public NameRegister() {
		list = new LinkedList<Name>();
	}
	
	//Methods
	public void addFirst(Name e) {
		list.addFirst(e);
	}
	
	public boolean remove(Name e) {
		return list.remove(e);
	}
	
	public Name getLast() {
		return list.getLast();
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isRegisterEmpty() {
		return list.isEmpty();
	}
	
	public ListIterator<Name> iterator() {
		return list.listIterator();
	}
	
	public String getRegisterContent() {
		String s = "";
		for (Name n : list) {
			s += "<" + n.getFullName() + ">";
		}
		return s;
	}
	
	public String toString() {
		return "GenericRegister:[list=" + list + "]";
	}
}
