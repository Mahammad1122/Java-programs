import java.util.*;
public class Practical32 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(2);
        System.out.println("size = "+v.size());
        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(50);
        System.out.println("size = "+v.size()+" capicity= "+ v.capacity());
        System.out.println(v);
    }
}
/*
 * Output
 *  size = 5 capicity = 8
 *  [10,20,30,40,50]
 */