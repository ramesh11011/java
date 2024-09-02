
public class Arithmetic {
    public static void main(String[] args){
        int a = 12;
        int b = 10;


        // Arithmetic Operators in java
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // unary Operator
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);


        // Operations are performed in the java by following BODMAS rule
        System.out.println(a);
        int x = a++ ;
        System.out.println(x);
        int y = a-- ;
        System.out.println(x);
        System.out.println(x + y);
    }
    
}
