import java.util.ArrayList;


public class MeasurerTest {

	/**
	 * @param args
	 * 
	 * @author MrMorris
	 */
	public static void main(String[] args) {
		System.out.println("The test program: ");
		
		ArrayList<String> objects = new ArrayList<String>();
		Measurer m = new StringLenMeasurer();
		// Measurer k = new StringLenMeasurer();

		objects.add("Ryan");
		objects.add("Sam");
		objects.add("Percy");
		
		System.out.println("\nThe sum of objects: " + DataAnalysis.sum(objects, m));
		System.out.println("The average of objects: " + DataAnalysis.avg(objects, m));
		
		System.out.println("\nThe DieScoreMeasurer Test: ");
		
	//	ArrayList<String> dd = new ArrayList<String>();
	//	Measurer d = new DieScoreMeasurer();
		
	/**	dd.add(new Die());
		dd.add(new Die());
		dd.add(new Die());
		dd.add(new Die());
		dd.add(new Die());**/
		
	//	System.out.println("\nThe total score of die: " + DataAnalysis.sum(dd, d));
		//System.out.println("The total score of die: " + DataAnalysis.avg(dd, d));
		
		
	}

}
