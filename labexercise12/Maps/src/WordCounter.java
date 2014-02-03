import java.util.Map;
import java.util.TreeMap;


public class WordCounter {
	
	private Map<String, Counter> lookup;
	
	//Constructors
	
	public WordCounter() {
		lookup = new TreeMap<String, Counter>();
	}
	
	Counter count = new Counter(1);
	
	public WordCounter(Map <String, Counter>lookup) {
		this.lookup = lookup;
	}
	
	public int getWordCount(String word) {
		return lookup.get(word).getCount();
	}
	
	public void processWord(String word) {
		if(lookup.containsKey(word)) {
			lookup.get(word).increment();
		}else{
			lookup.put(word, count);
		}
		
	}
	
	@Override
	public String toString() {
		return"WordCounter: [Map = " + lookup +" ]";
	}

}
