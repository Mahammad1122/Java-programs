public class Practical40 {
    public static void main(String[] args) {
        try {
            int sum = 50/0;
        } catch (Exception e) {
            System.out.println("Error = "+ e);
        }
    }
}
/*
 * Error = java.lang.ArithmeticException : / by zero
 */