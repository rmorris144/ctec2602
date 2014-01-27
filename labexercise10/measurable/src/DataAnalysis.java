import java.util.ArrayList;


public class DataAnalysis {
	public static int sum (ArrayList<Measurable> objects)
	{
		int total = 0;
		for (Measurable obj : objects) {
			total = total + obj.getMeasure();	
		}
		return total;
	}
	
	public static int avg (ArrayList<Measurable> objects)
	{
		int total = 0, count = 0;
		for (Measurable obj : objects) {
			total = total + obj.getMeasure();
			count++;
		}
		return total/count;
	}

	
	

}
