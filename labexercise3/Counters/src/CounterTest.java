
public class CounterTest {
	
	public static void main(String[] args) {
		/* The following test code is just an example of how you can write
		 * a simple test program to check the basic functionality of your class
		 * works as you expect. The primary aim is to test each constructor and
		 * method - there are many combinations of how you could go about this.
		 * For more complex classes and/or methods you may write several different
		 * tests for each method to check boundary cases for example.
		 */
		
		System.out.println("Testing default constructor initialisation and get method...");
		Counter c = new Counter();
		System.out.println("Expected 0: Actual: " + c.getCount());
		
		System.out.println("Testing increment method...");
		c.increment();
		c.increment();
		System.out.println("Expected 2: Actual: " + c.getCount());
		
		System.out.println("Testing set method...");
		c.setCount(10);
		System.out.println("Expected 10: Actual: " + c.getCount());
		
		
		
		System.out.println("Testing custom constructor initialisation...");
		Counter c1 = new Counter(5); //Note: creating a second object instance of the Counter class (which has its own state)
		System.out.println("Expected 5: Actual: " + c1.getCount());
		
		System.out.println("Testing reset method...");
		c1.reset();
		System.out.println("Expected 0: Actual: " + c1.getCount());
		
		System.out.println("Testing toString method...");
		System.out.println("Expected count=0: Actual: " + c1.toString());
		
		System.out.println("Testing decrement method..");
		c.decrement();
		c.decrement();
		System.out.println("Expected 1: Actual:" + c.getCount());
		
		
		Counter launch = new Counter();
		
		launch.incremendBy(10);
		
		while (!launch.isZero()) {
			System.out.print(launch.getCount() + " ");
			launch.decrement();
		}
		
		System.out.print("Blast off!");
		
		
	}
}