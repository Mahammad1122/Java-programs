public class Practical19 {
    String name;
    Practical19(String uname){
        name = uname;
    }
    void disname()
    {
        System.out.println("Welcome "+name);
    }
    public static void main(String[] args) {
        Practical19 p1 = new Practical19("Mahammad ali");
        p1.disname();
        Practical19 p2 = new Practical19("Akbar ali");
        p2.disname();
    }
}
