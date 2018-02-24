
import java.util.*;


// printing no.of times 1 occurs consecutively after converting to binary.
public class Binarynumbers {

    public static void main(String[] args) {
        int t=0,s=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n>0)
        {
            int remainder = n%2;
            n=n/2; 
            if (remainder ==1){
                s++;
                if (s>=t){
                    t=s;
                }
            }
            else {
                s=0;
            }
                  
        }    
           System.out.print(t); 
            
            
        
    }
}