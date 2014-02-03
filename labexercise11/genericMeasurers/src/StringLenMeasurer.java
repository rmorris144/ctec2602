
public class StringLenMeasurer implements Measurer {

	@Override
	public int measure(Object o) {
		String s = (String) o;
		
		return s.length();
	}

}
