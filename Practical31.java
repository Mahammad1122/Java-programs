public class Practical31 {
    public static void main(String[] args) {
        String str = "Hello";
        // Find out if string contains sequence of characters
        System.out.println(str.contains("ell"));

        //Return a substring from a string
        System.out.println(str.substring(3));
        
        // Find out if a string is empty or not
        System.out.println(str.isEmpty());

        // Return the Unicode of the first character in a string 
        System.out.println(str.codePointAt(0));
    }
}
//output:
// true
// lo
// false
// 72