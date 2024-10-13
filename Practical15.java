public class Practical15
{
    static int c = 0;
    public static void main(String[] arg)
    {
        System.out.println(c);
        sum(5,6);
        sum(10, 20);
        sum(30,50);
        System.out.println(c);
    }
    public static void count()
    {
        c++;
    }
    public static void sum(int a,int b)
    {
        System.out.println("Sum ="+(a+b));
        count();
    }

}