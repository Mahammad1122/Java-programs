abstract class Abclass {
    abstract void dis();
}
public class Practical26 extends Abclass {
    void dis()
    {
        System.out.println("Abstract Method");
    }
    public static void main(String[] args) {
        Abclass a = new Practical26();
        a.dis();
    }
}

// output = Abstract Method
