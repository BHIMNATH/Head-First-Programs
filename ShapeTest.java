import java.applet.*;
import java.awt.*;
/*<APPLET code="ShapeTest.class" WIDTH=700 HEIGHT=600></APPLET>*/
public class ShapeTest extends Applet{
	public void paint(Graphics g){
		g.drawLine(20,300,300,10);
		g.drawOval(200,100,100,100);
		g.drawRect(400,100,200,100);
	}
}