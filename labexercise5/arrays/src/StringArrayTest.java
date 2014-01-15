import java.io.*;

public class StringArrayTest {

	public int length() {
		return 0;
	}

	/**
	 * @param args
	 * @return 
	 * @return 
	 */
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruit1 = {"apple, pear, orange, grape, plum, orange, banana"};
		
		
		for (String s : fruit1) {
			System.out.println(s.toUpperCase());
		}
		
		for (int i = 0; i <= 6; i++){
			System.out.print("String length: ");
		}
	}

}
