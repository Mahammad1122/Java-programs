public class Practical20 {

    String merge;
    Practical20(String s1,String s2)
    {
        merge = s1 +" "+ s2;
    }
    Practical20(String s1,String s2,String s3)
    {
        merge = s1 +" "+s2 +" "+ s3;
    }
    public static void main(String[] args) {
        Practical20 p = new Practical20("Hello", "Computer");
        System.out.println(p.merge);
        Practical20 p1 = new Practical20("Hello", "Computer", "World");
        System.out.println(p1.merge);
    }
}
