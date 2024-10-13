
public class Practical39 implements Runnable {
    public void run()
    {
        System.out.println("Thread Execution using Runnable interface");
    }
    public static void main(String[] args) {
        Practical39 p = new Practical39();
        Thread th = new Thread(p);
        th.start();
    }
}
/*
 * output: Thread Execution using Runnable interface
 */
