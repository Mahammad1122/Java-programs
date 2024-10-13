public class Practical17 {
    
    String merge(String s1,String s2)
    {
        return s1+" "+s2;
    }
    String merge(String s1,String s2,String s3)
    {
        return s1+" "+s2+" "+s3;
    }
    public static void main(String[] args) {
        Practical17 P = new Practical17();
        String str = P.merge("Hello","World");
        System.out.println(str);
        String str1 = P.merge("Hello","Computer","World");
        System.out.println(str1);
    }

}
