
public class CDTrackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing default constructor initialisation and toString method...");
		CDTrack n = new CDTrack();
		System.out.println("Expected both empty strings: Actual: " + n.toString());
		
		System.out.println("Testing set and get methods for first and family name...");
		n.settitle("I am sasha Fierce");
		n.setartist("Beyonce");
		System.out.println("Expected I am sasha Fierce: Actual: " + n.gettitle());
		System.out.println("Expected Beyonce: Actual: " + n.getartist());
		
		System.out.println("Testing custom constructor initialisation...");
		CDTrack music = new music(90);
		System.out.println("Testing get method for duration...");
		System.out.println("Expected 90mins:" + music.getduration());
	}

}