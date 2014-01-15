
public class PairOfDice {

	//Fields
		private Die red;
		private Die blue;
		
	//Constructors
		public PairOfDice() {
			red = new Die();
			blue = new Die();
		}
		
	//Methods
		
		public void rollDice() {
			red.roll();
			blue.roll();
		}
		
		public int getDiceScore() {
			return red.getScore() + blue.getScore();
		}
		
		public Die getRed() {
			return red;
		}
		
		public Die getBlue() {
			return blue;
		}
		
		public void setRed(Die d) {
			red = d;
		}
		
		public void setBlue(Die e) {
			blue = e;
		}
		
		public String toString() {
			return "PairOfDice:[red=" + red + ", blue=" + blue + "]";
		}
		
		
		
}
