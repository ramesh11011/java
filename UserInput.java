// User Input in java 

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Enter the name : ");
        name = sc.nextLine();
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        System.out.println("Your name is " + name + " and your age is " + age + " years");

        sc.close();
    }
    
}
