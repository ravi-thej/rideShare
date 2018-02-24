
public class Test1 {
	
	public int x;
	public int y;

    public void test1(int a, int b){
    	
		x=a;
		y=b;
		
	}


    public static void main (String args[]){
    	Test1 otest = new Test1();
    	
    	otest.x = 80;
    	otest.y = 20;
    	
    System.out.println(otest.x + ", " + otest.y);
}
}
