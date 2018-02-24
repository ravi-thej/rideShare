
public class SubTest1 extends Test1 {

	public static void main (String args[]){
		
		SubTest1 osub = new SubTest1();
		
		osub.x = 10;
		osub.y=15;
		
		System.out.println("The values of x and y are " + osub.x + ", "+ osub.y);
	}
}
