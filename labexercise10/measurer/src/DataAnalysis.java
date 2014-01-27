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

	public static int sum (ArrayList<Object> objects, Measurer m)
	{
		int total = 0;
		for (Object obj : objects) {
			total = total + m.measure(obj);	
		}
		return total;
	}
	
	public static int avg (ArrayList<Object> objects, Measurer k)
	{
		int total = 0, count = 0;
		for (Object obj : objects) {
			total = total + k.measure(obj);
			count++;
		}
		return total/count;
	}
	
	

}
