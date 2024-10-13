import java.applet.*;
import java.awt.*;
/*
 * <applet code="Practical47.class" height="300" width="300">
 *      <param name="message" value="Hello Applet">
 * </applet>
 */
public class Practical47 extends Applet {
    String message;

    public void init()
    {
        message = getParameter("message");
    }
    public void paint(Graphics g)
    {
        g.drawString(message, 120, 150);
    }
}
