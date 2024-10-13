import java.util.Stack;

public class Practical33 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
    }
}
/*
 * output:
 *  [3,4,5]
 *  [3,4]
 *  4
 */