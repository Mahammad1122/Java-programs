public class Practical43 {
    public static void main(String[] args) {
        try{
            try
            {
                int n = 50/0;   
            } catch(ArithmeticException e)
            {
                System.out.println("Error = "+ e);
            }
            String str = null;
            int n = str.length();
        }
        catch(Exception e)
        {   
            System.out.println("Error = "+ e);
        }
    }    
}

/*
 * Output:
 *      Error = java.lang.ArithmeticException :  / zero
 *      Error = java.lang.NullpointerAccessException
 */