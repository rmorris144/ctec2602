
public class ModuloCounterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing default constructor initialisation and get method...");
		ModuloCounter mc = new ModuloCounter();
//		System.out.println("Expected 2: Actual: " + mc.getCount());
		
//		System.out.println("Testing increment method...");
//		mc.increment();
//		mc.increment();
//		System.out.println("Expected 4: Actual: " + mc.getCount());
		
		System.out.println("Testing set method...");
		mc.setCount(8);
		mc.increment();
		System.out.println("Expected 6: Actual: " + mc.getCount());
		
		System.out.println("Testing custom constructor initialisation...");
		ModuloCounter mc1 = new ModuloCounter(); //Note: creating a second object instance of the Counter class (which has its own state)
		System.out.println("Expected 2: Actual: " + mc1.getCount());
		
		System.out.println("Testing decrement method..");
		mc.setCount(8);
		mc.decrement();
		mc.decrement();
		System.out.println("Expected 6: Actual:" + mc.getCount());
		
		System.out.println("Testing reset method...");
		mc1.reset();
		System.out.println("Expected 0: Actual: " + mc1.getCount());
		
/**		System.out.println("Testing toString method...");
		System.out.println("Expected count=0: Actual: " + mc1.toString());
		
		System.out.println("Testing toString method...");
		System.out.println("Expected count=0: Actual: " + mc1.toString()); **/
		
	do{
		System.out.println("Testing the amount of times it looped:" + mc.getCount());
		mc++;
		System.out.print("\n");
	} while (mc < 20 );
	}
		
	}

}
