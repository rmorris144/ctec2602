
import java.util.Scanner;

public class NumberArrayTest {

	public static void main(String[] args) {
		
		//declare an array to store 12 int numbers
		int[] number = new int[12]; 
		//initialise each element
		number[0] = 4;
		number[1] = 2;
		number[2] = 4;
		number[3] = 60;		
		number[4] = 3;
		number[5] = 6;
		number[6] = 4;
		number[7] = 62;		
		number[8] = 5;
		number[9] = 10;		
		number[10] = 111;
		number[11] = 43;
		
		
		
		
		/* PROCESS NUMBERS */
		
		//loop through each number in array
		for (int i=0; i < number.length; i++) {
			//print out current element (i) in array
			System.out.println(number[i]);
		}
		
		//loop through each number in array in reverse order
		for (int i=11; i >= 0; i--) {
			//print out current element (i) in array
			System.out.println(number[i]);
		}
		
		
		
		/* FIND LARGEST NUMBER */
		
		//variable to store largest number, initialsed at 0
		int largestNum = 0;
		
		//loop through each number in array
		for (int i=0; i < number.length; i++) {
			//check if current number element (i) is greater than the
			//current largest number stored in the variable
			if (number[i] > largestNum) {
				//update the largest number
				largestNum = number[i];
			}
		}	
		
		//print out the result of the largest number
		System.out.println("The largest number is " + largestNum);
		
		
		
		/* COUNT EVEN NUMBERS */
		
		//variable to store a count of even numbers
		int countEven = 0;
		
		//loop through each number in array
		for (int i=0; i < 12; i++) {
			//if the remainder of the current number element (i)
			//when divided by 2 is 0, then it must be even
			if (number[i] % 2 == 0) {
				//increment count by 1
				countEven++;
			}
		} 
		
		//output result showing the count of even numbers
		System.out.println("The amount of even numbers in our array is " + countEven);
		
		//ADD MORE CODE HERE...
		Scanner sc = new Scanner(System.in);
		int[] number2 = new int[5];
		
		int sum = 0;
		double avarage = 0;
		
		for ( int i = 0; i < number2.length; i++) {
			System.out.println("Please enter number");
			number2[i] = (int) sc.nextInt();
		}
		for (int i : number2){
			sum += i;
			avarage = sum / number2.length;
			
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + avarage);
		
		
	

	}

	
}
