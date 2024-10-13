public class Practical2 {
    public static void main(String[] args) 
    {
        int no,fact=1;
        no = Integer.parseInt(args[0]);
        while(no>0)
        {
            fact = fact*no;
            no--;
        }
        System.out.println("Factoriral number= "+fact);
    }
}
