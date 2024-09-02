import java.util.Arrays;
// importing libraries in java is very important

public class ArraysExample {
    public static void main(String[] args) {
        int[] marks = new int[] {23, 32, 12, 45, 56};
        Arrays.sort(marks); 
        System.out.println(Arrays.toString(marks));


        // Multi Dimensional Arrays
        int[][] marks1 = new int[][] {{20,30},{40,60},{70,80}};
        System.out.println(Arrays.deepToString(marks1));
    }
}
