package demoframe;
import java.awt.*;
class MyFrame extends Frame{
    @Override
    public void paint(Graphics g){
        g.drawString("Hello World", 100, 200);
    }
}
public class DemoFrame {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500, 500);
        f.setVisible(true);        
    }  
}
