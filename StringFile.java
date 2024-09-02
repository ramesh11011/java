public class StringFile {
    public static void main(String[] args){
        String name = new String("Hello World");
        System.out.println(name.length());
        // Length of the string 
        System.out.println(name.toLowerCase());
        // Coverts the string into lowercase
        System.out.println(name.toUpperCase());
        // Converts the string into uppercase
        System.out.println(name.indexOf("World"));
        // Returns the index of the world world
        System.out.println(name.endsWith("d"));
        // Returns whether the string is ending with d or not
        System.out.println(name.trim());
        // Trim down the white spaces from front and back
        System.out.println(name);
        // Returning the Original String
        System.out.println(name.replace("World","year"));
        // repalcing a word in string and it will return another string

        // NOTE : string is immutable in nature
        // alot of string methods are there in java 
        // Refer w3schools for details : https://www.w3schools.com/java/java_ref_string.asp
    }
    
}
