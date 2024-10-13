public class Practical38 extends Thread {
    public void run(){
        System.out.println("Currently Executing Thread : "+Thread.currentThread());
    }
    public static void main(String[] args) {
        Practical38 th1 = new Practical38();
        Practical38 th2 = new Practical38();
    
        System.out.println("Thread ID : "+ th1.getId());
        System.out.println("Thread Name :"+th1.getName());
        System.out.println("Thread Priority : "+ th1.getPriority());

        System.out.println("Thread ID : "+ th2.getId());
        System.out.println("Thread Name :"+th2.getName());
        System.out.println("Thread Priority : "+ th2.getPriority());

        th1.setPriority(MAX_PRIORITY);
        th2.setPriority(MIN_PRIORITY);

        th1.start();
        th2.start();
    }
}
/*
 * Output:
 *      Thread ID : 13
 *      Thread Name : Thread-0
 *      Thread Priority : 5
 * 
 *      Thread ID : 14
 *      Thread Name : Thread-1
 *      Thread Priority : 5
 *      
 *      Currently Executing Thread : Thread[ Thread-0, 10, main]
 *      Currently Executing Thread : Thread[ Thread-1, 1, main]
 */