public class Practical16 {
    public static void main(String[] args) 
    {
        Practical16 P = new Practical16();
        P.displaysum(10, 20);
    }
    void displaysum(int a,int b)
    {
        int s = sum(a, b);
        System.out.println("Sum = "+s);
    }
    int sum(int a,int b)
    {
        return a+b;
    }
}
