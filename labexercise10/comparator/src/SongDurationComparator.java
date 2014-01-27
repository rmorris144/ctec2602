import java.util.Comparator;


public class SongDurationComparator implements Comparator<Song> {

	public int compare(Song s1, Song s2) {
		return s1.getDuration() - s2.getDuration();
	}

	
}
