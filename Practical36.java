class Practical36 extends Thread{
    public void run()
    {
        System.out.println("Thread is Executing");
    }
    public static void main(String[] args) {
        Practical36 p = new Practical36();
        p.start();
    }
}
/*
 * output:
 *  Thread is Executing
 */