
public class DieScoreMeasurer implements Measurer{

	@Override
	public int measure(Object o) {
		Die r = (Die) o;
		return r.getScore();
	}
	

}
