import java.util.ArrayList;
import java.util.List;


public class DataAnalysis {
	public static <E extends Measurable> int sum(List<E> objects)
	{
		int total = 0;
		for (E obj : objects) {
			total = total + obj.getMeasure();	
		}
		return total;
	}
	
	public static <E extends Measurable> int avg(List<E> objects)
	{
		int total = 0, count = 0;
		for (E obj : objects) {
			total = total + obj.getMeasure();
			count++;
		}
		return total/count;
	}
	
	//Question 11.4
	public static <E extends Measurable> E max(List<E> objects) {
		E elem = objects.get(0);
		int measure = elem.getMeasure();
		
		for (int i = 0; i < objects.size(); ++i) {
			if (objects.get(i).getMeasure() > measure) {
				elem = objects.get(i);
				measure = elem.getMeasure();
			}
		}
		return elem;
	}

	public static <E> int sum (List<E>  objects, Measurer m)
	{
		int total = 0;
		for (E obj : objects) {
			total = total + m.measure(obj);	
		}
		return total;
	}
	
	public static <E> int avg (List<E> objects, Measurer k)
	{
		int total = 0, count = 0;
		for (Object obj : objects) {
			total = total + k.measure(obj);
			count++;
		}
		return total/count;
	}
	

}
