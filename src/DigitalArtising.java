import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class DigitalArtising extends GraphicsProgram {
    public void run(){

        GImage img = new GImage("A96C7EC4-8B00-406E-914C-C083BEB7881D.JPG");
        add(img, 0, 0);

        GLabel label = new GLabel("He scares the girls and kidnaps the black");
        add(label, 10, 50);
        label.setFont("Bodoni MT-Bold-39");

        GOval ccl = new GOval(30,30,30,30);
        add(ccl, 320, 730);
        ccl.setFillColor(Color.LIGHT_GRAY);
        ccl.setFilled(true);

        GOval ccl2 = new GOval(30,30,30,30);
        add(ccl2, 320, 790);
        ccl2.setFillColor(Color.LIGHT_GRAY);
        ccl2.setFilled(true);

       GRect rect = new GRect(20, 50, 20, 20);

        GTurtle turtle = new GTurtle();
        add(turtle, 230, 230);
    }
    public static void main(String[] args){
        (new DigitalArtising()).start(args);
    }
}
