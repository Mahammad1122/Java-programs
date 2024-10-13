public class Practical37 extends Thread{
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(2000);
                System.out.println("run Method");
            }catch (Exception e)
            {

            }
        }
    }
    public static void main(String[] args) {
        Practical37 p = new Practical37();
        p.start();
        for(int i =0;i < 5 ; i++)
        {
            p.yield();
            System.out.println("Main method");
            p.stop();
        }

    }
}

/*
 * output:
 *         Main method
 *         Main method
 *         Main method
 *         Main method
 *         Main method
 */