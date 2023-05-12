import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class HelloACN  extends GraphicsProgram {

    public void run(){
        GLabel label = new GLabel("Hello World!");
        add(label, 100, 100);

        GRect rect = new GRect(300, 300);
        rect.setColor(Color.CYAN);
        rect.setFilled(true);
        add(rect);
        add(label, 100, 100);

        GTurtle turtle = new GTurtle();
        add(turtle, 200, 200);
    }
    public static void main(String[] args){
        (new HelloACN()).start(args);
    }
}
