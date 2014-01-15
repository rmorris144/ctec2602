public class ModuloCounter {
		private int count;
		private int max;
		
		public ModuloCounter() {
			count = 2;
			max = 10;
		}
		
	/**	public void MC (int c, int m) {
			count = c;
			max   = m;
		}**/
		public void setCount(int count) {
			this.count = count;
		}
		
		/** Returns the current value of the counter.
		 * 
		 * @return the current value of the counter.
		 */
		public int getCount() {
			return count;
		}
		
		/** Increments the counter value by one. */
		public void increment() {
			if (count <= max) {
				count = count + 1;
			} else {
				count = 0;
			}
		}
		
		
		
		public void decrement() {
			if (count <= max && count >= 0) {
				count = count -1;
			} else {
			count = 0;
			}
		}
		
		public boolean isZero() {
			return count == 0;
		}
		
/**		public void incrementBy(int amount){
			if (count + amount == max) 
			count = count + amount - max;
		} else {
			count = count + getCount();
		}
}**/
		
		
		
		/** Resets the counter value to zero. */
		public void reset() {
			count = 0;
		}
}
		
		/** Returns a textual representation of the counter.
		 * 
		 * @return a textual representation of the counter.
		 */
/**public String toString() {
			return "ModuloCounter:[count=" + count +, max"]";
		}
}
		
	/**	Modulo Counter mc = new Modulo Counter (0,20);
		for(int i = o; i<25; i++){
			System.out.print(mc.getCount() + "");
			mc.increment();
}
		}**/