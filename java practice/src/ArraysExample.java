import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {

	//custom way of printing an int array without converting it to string.
	public static void printArray(int[] array){
		System.out.print("[");
		for (int i=0; i<array.length; i++)
		{
			int item = array[i];
			System.out.print(item);
               if (i<array.length-1){
           		System.out.print(", ");
           		}
		}
   		System.out.print("]");
	}
	
	//custom way of printing an string array without converting it to string.
	public static void printArray(String[] array){
		System.out.print("[");
		for (int i=0; i<array.length; i++)
		{
			String item = array[i];
			System.out.print(item);
               if (i<array.length-1){
           		System.out.print(", ");
           		}
		}
   		System.out.print("]");
	}
	// Above printarray method written two times each for different data type. But this a bad practice.
	
	public static void main (String[] args){
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2;
		int[] array3 = new int[4];
		String[] fruits = {"banana", "grapes", "orange"};
		
	//initializing array3
		array3[0]=3;
		array3[1]=6;
		array3[2]=7;
		array3[3]=1;
		
	// taking array2 as a user's input.
		
		
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array3));
        
		printArray(array3);
		System.out.println();
        printArray(array1);
		System.out.println();

        Arrays.sort(array3); /* this will sort the elements of array3. Now array3 will contain the 
                                  sorted values in this indices. we cannot retrieve previous 
		System.out.println();       allignment of numbers */
		printArray(array3);
		System.out.println();
		printArray(fruits);
		System.out.println();
		
 // Special for loop - foreach.
		for(int x : array1){
			System.out.println(x);
			// System.out.println("Hello");

		}

        

		
	}
}
