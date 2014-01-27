import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StringComparatorTest {

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("hi");
		list.add("goodbye");
		list.add("bye");
		
		System.out.println(list.toString());
		
		Collections.sort(list, new StringLenComparator());
		
		System.out.println("\n" +  list.toString());
		

	}

}
