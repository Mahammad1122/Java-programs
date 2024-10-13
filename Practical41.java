public class Practical41 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Error = "+ e);
        } catch (NullPointerException e) {
            System.out.println("Error = "+ e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error = "+ e);
        }
    }
}
/*
 * OutPut:
 *          Error = java.lang.NullPointerException
 */