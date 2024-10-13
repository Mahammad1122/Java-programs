import java.applet.*;
import java.awt.*;

//<applet code="Practical48.class" height="300" width="300"></applet>

public class Practical48 extends Applet{
    public void paint(Graphics g)
    {
        g.drawOval(50, 50, 200, 200);
        g.fillOval(100, 90, 40, 30);
        g.fillOval(170, 90, 40, 30);
        g.fillRect(150, 110, 10, 50);
        g.drawArc(95, 160, 120, 40, 180, 180);
    }
}
