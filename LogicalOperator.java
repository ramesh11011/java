
import java.util.*;

public class LogicalOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean a , b ;
        System.out.print("Enter the value of a : ");
        a = sc.nextBoolean();
        System.out.print("Enter the value of b : ");
        b = sc.nextBoolean();
        
        // Displaying Outputs
        System.out.println("a && b :: " + (a && b));
        System.out.println("a || b :: " + (a || b));
        sc.close();
        

    }
}
