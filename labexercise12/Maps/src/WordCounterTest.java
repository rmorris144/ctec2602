import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class WordCounterTest {

	/**
	 * @param args
	 * 
	 * @author MrMorris
	 */
	
	//private String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Counter> map = new TreeMap<String, Counter>();
		Scanner sc = new Scanner(System.in);
		
		map.put("Percy Rarse idiot",new Counter());
		map.put("Ryan Morris",new Counter());
		map.put("Sam Jones",new Counter());
	//	map.put(key, value)
		System.out.println("Enter a string, and a counter object: ");
		String name = sc.next();
		
		//int count = 0;
		WordCounter wc = new WordCounter();
		
		while(!name.equals("quit")) {
			name = sc.nextLine();
			if(name.equals("quit")) {
				break;
			}
			wc.processWord(name);
			System.out.println(wc.getWordCount(name));
			
		}
		
		
		System.out.println("WordCount: " + map.toString() );
		
		

	}

}
