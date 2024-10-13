final class Prototype{
    final void dis()
    {
        System.out.println("Final Method");
    }
}
public class Practical25 {
    public static void main(String[] args) {
        Prototype p = new Prototype();
        p.dis();
    }
}

// output : Final Method