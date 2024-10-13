import java.applet.*;
//<applet code="Practical46.class" height="300" width="300"></applet>
public class Practical46 extends Applet{
    public void init()
    {
        System.out.println("Applet is Intialized.");
    }
    public void start()
    {
        System.out.println("Applet is Started");
    }
    public void stop()
    {
        System.out.println("Applet is Stopped");
    }
    public void destroy()
    {
        System.out.println("Applet is Destroyed");
    }
    public static void main(String[] args) {
        Practical46 p = new Practical46();
        p.init();
        p.start();
        p.stop();
        p.destroy();
    }
}

/*
 * Output:
 *          Applet is Intialized
 *          Applet is Started
 *          Applet is Started
 *          Applet is Destroyed
 */