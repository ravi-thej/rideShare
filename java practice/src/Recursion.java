

import java.util.*;


public class Recursion {
    private static int factorial(int n){
    if(n > 1){ // recursive case
        return n * factorial(n-1);
    }
    else{ // base case n = 1
        return n;
    }
}

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int result = factorial(k);
        scan.close();
        System.out.println();

        System.out.println(result);
    }
}
