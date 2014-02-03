import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
//import java.util.Set;
//import java.util.TreeSet;


public class SetUniqueWordsTest {

	/**
	 * @param args
	 * 
	 * @author MrMorris
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> unique = new HashSet<String>();
		List<String> duplicates = new LinkedList<String>();
		
		String sentence = "The the the quick quick quick brown fox jumps over the lazy dog ";
		
		String[] words = sentence.split(" ");
		
		for(String s : words) {
			unique.add(s);
		}
		
		System.out.println("The size of your hashset: " + unique.size());
		unique.clear();
		
		for(String w : words) {
			Boolean isDuplicate = unique.add(w);
			if(isDuplicate.equals(false)){
				duplicates.add(w);
			}
		}
		System.out.println("Duplicate words: " + duplicates.size());
		
		
	}

}
