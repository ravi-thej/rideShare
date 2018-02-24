import java.util.Scanner;

public class HelloWorld {

	//static String input;
	public static void main(String[] args){
		
		/* Scanner is a class which is used to read input/ write output from/to the console. 
		 * creating a object called "oScan" which handles the input by using this scanner class methods.
		 * inputString is a string variable which stores the input given by the user. 
		 * scan.nextLine() // returns the next LINE of input.
		 * closing the scanner
       */
		Scanner oScan = new Scanner(System.in);
		String inputString = oScan.nextLine();
		String out = oScan.nextLine();
        oScan.close();
        
        /* directly printing some text on the console
         * print the input given by the user
         *          * print the input given by the user */
        
		System.out.println("hello world");
		System.out.println("The input line is "+inputString);
		System.out.println("The input line is "+out);
		System.out.println(oScan);



	}
	
}
