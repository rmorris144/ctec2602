
public class ScreenRobot {
//fields
	private int x;
	private int y;
	private int direction; //1,2,3,4 - up, down, left, right
	
	// constructor
	public ScreenRobot() {
		x = 0;
		y = 0;
		direction = 4;
	}
	
	//methods
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void home() {
		
		x = 0;
		y = 0;
		direction = 4;
		
	}
	
	public void turnLeft() {
		direction = direction%4+1;
	}
	
	public void forward(int n) {
		if (direction == 1) {
			y = y - n;
			} else if (direction == 2) {
				x=x - n;
			} else if (direction == 3) {
				y = y + n;
			} else if (direction == 4) {
				x = x + n;
			}
	}
	
	public String getDirection() {
		if (direction == 1) {
			return "UP"; 
		} else if (direction = 2){
			
			public String toString() {
				return "ScreenRobot:[x=" + x +", y="+y+;
			}
		}

}