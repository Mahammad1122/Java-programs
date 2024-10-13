class Superclass
{
    void sum(int a, int b)
    {
        System.out.println("Sum = "+ (a+b));
    }
}
class Practical21 extends Superclass
{
    int a = 10;
    int b = 20;
    public static void main(String[] args) {
        Practical21 p = new Practical21();
        p.sum(p.a, p.b);
    }
}

// Output: sum = 30