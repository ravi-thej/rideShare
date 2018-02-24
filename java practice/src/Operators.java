import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
             Scanner oScan = new Scanner(System.in);
             double mealPrice = oScan.nextDouble();
             int tipPercent = oScan.nextInt();
             int taxPercent = oScan.nextInt();
             oScan.close();
             
             double tip = mealPrice*tipPercent/100;
             double tax = mealPrice*taxPercent/100;
            int totalCost = (int) Math.round(mealPrice + tip + tax);

           System.out.println("the total cost is " + totalCost + " dollars");
             
	}

}
