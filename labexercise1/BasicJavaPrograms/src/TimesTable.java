
public class TimesTable {

	public static void main(String[] args) {
		//declare a variabl of type int and assign 5
		int number = 5;
		
		//iterate from 1 to 12, note how i can be declared 
		//directly within for loop if it is not needed elsewhere
		for (int i = 1; i <= 12; i++) {
        
			//print result, note use of print instead of println
			//the print method does not add a new line after its output
			System.out.print(number*i + "\t");
		}
        
        for (int j = 1; j<= 12; j++){
            System.out.print(i*j + "\t");

            
        }
	}

    System.out.println("\n\n\n");
    int i =1;
    while(i < 13)
    {
        System.out.println(number * i + "\t");
            i++;
    }
}
