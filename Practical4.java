public class Practical4 {
    public static void main(String[] args) {
        int no1,no2,no3;
        no1 = Integer.parseInt(args[0]);
        no2 = Integer.parseInt(args[1]);
        no3 = Integer.parseInt(args[2]);

        if(no1 > no2)
        {
            if(no1 > no3)
            {
                System.out.println(no1+ " Greator");
            }
            else
            {
                System.out.println(no3+ " Greator");
            }
        }
        else
        {
            if(no2 > no3)
            {
                System.out.println(no2+ " Greator");
            }
            else
            {
                System.out.println(no3+ " Greator");
            }
        }

    }
}
