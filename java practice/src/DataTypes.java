import java.util.Scanner;

public class DataTypes {
		
	public static void main(String[] args) {
		int i = 4;
		double d = 5.0;
		String s = "pragnya";

		Scanner oScan = new Scanner(System.in);
		int a;
		double b;
		String c;
		
		a = oScan.nextInt();
		b = oScan.nextDouble();
	    oScan.nextLine();
        c = oScan.nextLine();
		oScan.close();
		
		
		System.out.println(i+a);
		System.out.println(d+b);
		System.out.println(s+c);

		
	}

}
