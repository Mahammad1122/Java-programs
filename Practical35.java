import java.util.Arrays;

public class Practical35 {
    public static void main(String[] args) {
        String str = "string";
        char[] c = str.toCharArray();
        Arrays.sort(c);
        str = new String(c);
        System.out.println(str);
    }
}
/*
 * output:
 *      ginrst
 */