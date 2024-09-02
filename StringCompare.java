
// Importing package
import java.util.*;

public class StringCompare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Day : ");
        String day = sc.next();
        if(day.equals("1")){
            System.out.println("Monday");
        }
        else if(day.equals("2")){
            System.out.println("Tuesday");
        }
        else if(day.equals("3")){
            System.out.println("Wednesday");
        }
        else{
            System.out.println("Some other day");
        }
        sc.close();

    }
    
}
