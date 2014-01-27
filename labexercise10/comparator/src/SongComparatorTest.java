import java.util.ArrayList;
import java.util.Collections;


public class SongComparatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Song> rnb = new ArrayList<Song>();
		
		rnb.add(new Song("Only Girl(In the world)", 300, "Rihanna"));
		rnb.add(new Song("Down Right Now", 276, "August Alsina"));
		rnb.add(new Song("Beat It", 150, "Michael Jackson"));
		
		System.out.println("This is the playlist for the songs: " + rnb.toString());
		Collections.sort(rnb, new SongDurationComparator());
		System.out.println("\nTesting methods: " + rnb.toString());

	}

}
