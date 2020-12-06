package demonulllayout;
import java.awt.*;
class MyFrame extends Frame{
    TextField t1,t2;
    MyFrame(){
        setLayout(null);
        t1=new TextField();
        t2=new TextField();
        t1.setBounds(100, 200, 50, 20);
        t2.setBounds(100, 250, 50, 20);
        add(t1);
        add(t2);
    }
}
public class DemoNullLayout {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500, 500);
        f.setVisible(true);       
    }  
}
