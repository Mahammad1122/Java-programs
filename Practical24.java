class Bank{
    int rateOfInterest()
    {
        return 0;
    }
}
public class Practical24 extends Bank {
    int rateOfInterest()
    {
        return 9;
    }
    public static void main(String[] args) {
        Practical24 p = new Practical24();
        System.out.println("Rate of Interest is "+ p.rateOfInterest());
    }
}

// Output  =  Rate of Interest is 9 