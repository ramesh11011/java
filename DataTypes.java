 import java.awt.*;

public class DataTypes {
    public static void main(String[]args){
        int RollNumber = 21;
        byte marks = 95;
        boolean isPassed = true;
        char a = 'r';
        double num = 12.2345645;
        float number = 12.23F;
        long phoneNumber = 8839379244L ;
    
        System.out.println(RollNumber);
        System.out.println(marks);
        System.out.println(isPassed);
        System.out.println(a);
        System.out.println(num);
        System.out.println(number);
        System.out.println(phoneNumber);




        // Defining Non Primitive Datatypes
        String name = new String("My name is P Ramesh");
        System.out.println(name);
        java.util.Date date = new java.util.Date();
        System.out.println(date);

        int b = 4;
        int c = b;
        System.out.println(c);

        Point point = new Point(12,13);
        Point point1 = point;
        point.x = 14;
        System.out.println(point1);

    }




    
}
