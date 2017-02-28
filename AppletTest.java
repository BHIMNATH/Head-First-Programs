import java.applet.*;
import java.awt.*;
/*<APPLET CODE="AppletTest.class" WIDTH="300" HEIGHT="400"></APPLET>*/
public class AppletTest extends Applet{
	public void paint(Graphics g){
		g.drawString("Hello World",25,66);
		//setBackground(Color.black);
	}
	public void init(){
		Button b=new Button("Name");
		b.setBackground(Color.black);
		add(b);
	}
}