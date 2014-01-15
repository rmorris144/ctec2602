
public class CDTrack {

	
	private String title;
	private String artist;
	private int duration;
	
	public void title() {
		title = "SashaFierce";
		artist = "Beyonce";
		duration = 90;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getartist() {
		return artist;
	}
	
	public void title(String title, String artist, String duration) {
		this.title = title;
		this.artist = artist;
		this.duration = 90;
	}
	
	public void settitle(String title) {
		this.title = title;
	}
	
	public void setartist(String artist) {
		this.artist = artist;
	}
	
	public String gettitle() {
		return title;
	}
	
	public String getartist() {
		return artist;
	}
	
	public int getduration() {
		return duration;
	}
	
	public String toString() {
		return "CDTrack:[title=" + title + ", artist=" + artist + ", duration=" + duration + "]";
	}
	
}
