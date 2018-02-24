import java.util.Scanner;

public class ConditionalStatements {

	   public static void main(String[] args) {
		      Scanner scan = new Scanner(System.in);
		      int n = scan.nextInt(); 
		      scan.close();
		      String ans="";
		          
		      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		      if(n%2==1){
		         ans = "Weird";
		      }
		      else if (2<=n && n<=5 && n%2==0){
		                   ans = "Not Weird";
		      }
		       else if (6<=n && n<=20 && n%2==0){
		                   ans = "less Weird";
		      }
		       else if (n>20 && n%2==0){
		                   ans = "more Weird";
		      }
		      System.out.println(ans);
		  }
}

