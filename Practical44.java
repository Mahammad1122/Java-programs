public class Practical44 {
    void divide(int a, int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException("Divide by zero");
        }
        else
        {
            System.out.println("Result ="+ a/b);
        }
    }
    public static void main(String[] args) {
        Practical44 p = new Practical44();
        try {
            p.divide(5, 0);
        } catch (Exception e) {
            System.out.println("Error = "+e.getMessage());
        }
        try {
            p.divide(10, 2);
        } catch (Exception e) {
            System.out.println("Error = "+e.getMessage());
        }
    }
}
/*
 * Output:
 *          Error = Divide by zero
 *          Result = 5
 */