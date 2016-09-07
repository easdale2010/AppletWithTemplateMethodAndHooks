import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
	
	String message;
	
	public void init(){
		message = "Hello World I am alive!";
		repaint();
	}
	
	public void start(){
		message = "Now I'm starting up...";
		repaint();
	}
	
	public void stop(){
		message = "Oh, now I am being stopped...";
		repaint();
	}
	
	public void destroy(){
		 // Applet is going away
	}
	
	public void paint(Graphics graphics){
		graphics.drawString(message,  5,  15);
	}
}
