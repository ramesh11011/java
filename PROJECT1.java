import java.util.*;
// PROJECT 1
// s = ut + (a*t^2)/2

public class PROJECT1 {
    public static void main(String[] args){
        System.out.println("Welcome User");
        System.out.println("Distance Calculator");

        // Defining all the required elements for the project
        Scanner sc = new Scanner(System.in);
        // Defining Scanner class for taking the input
        double s , u , a , t ;
        System.out.print("Enter the Initial Velocity , u (in m/s) : ");
        u = sc.nextDouble();
        System.out.print("Enter the Acceleration , a (in m/s^2) : ");
        a = sc.nextDouble();
        System.out.print("Enter the Time Taken , t (in s) : ");
        t = sc.nextDouble();

        s = u*t + ( (a * (Math.pow(t, 2)))/2);
        System.out.println("Required Distance : " + s + " meters");
        sc.close();
    }
}
