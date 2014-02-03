import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AccountList<T extends BankAccount> implements Iterable<T> {

	
	
	//Fields
	private List<T> list;
	
	//Constructors
	public AccountList() {
		list = new ArrayList<T>();
	}
	
	//Methods
	public void addAccount(T elem) {
		list.add(elem);
	}
	
	public T getAccount(int i) {
		return list.get(i);
	}
	
	public String toString() {
		return "AccountList: list =" + list + " ";
	}
	
	public int combinedBalance() {
		int total = 0;
		for (T acc : list) {
			total += acc.getBalance();
		}
		return total;
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}
}
