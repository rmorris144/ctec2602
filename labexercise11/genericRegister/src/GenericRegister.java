import java.util.ArrayList;
import java.util.List;


public class GenericRegister<T> {
	
	//Fields
	private List<T> list;
	
	//Constructors
	public GenericRegister() {
		list = new ArrayList<T>();
	}
	
	//Methods
	public void add(T e) {
		list.add(e);
	}
	
	public void remove(int pos) {
		list.remove(pos);
	}
	
	public T get(int pos) {
		return list.get(pos);
	}
	
	public int size() {
		return list.size();
	}
	
	public void clearRegister() {
		list.clear();
	}
	
	public boolean isRegisterEmpty() {
		return list.isEmpty();
	}
	
	public String toString() {
		return "GenericRegister:[list=" + list + "]";
	}
}
