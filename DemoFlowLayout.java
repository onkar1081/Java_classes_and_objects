package demoflowlayout;
import java.awt.*;
class MyFrame extends Frame{
    Button b1,b2,b3;
    MyFrame(){
        FlowLayout ob=new FlowLayout(FlowLayout.LEFT,40,40);
        setLayout(ob);
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        add(b1);
        add(b2);
        add(b3);
    }
}
public class DemoFlowLayout {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500, 500);
        f.setVisible(true);          
    } 
}
