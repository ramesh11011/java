import java.util.*;

public class ComparisionOperator {
    public static void main(String[] args) {
        int a , b;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a = sc1.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc1.nextInt();

        System.out.println("a == b :: " + (a == b));
        System.out.println("a != b :: " + (a != b));
        System.out.println("a >= b :: " + (a >= b));
        System.out.println("a <= b :: " + (a <= b));

        sc1.close();
    }
    
}
