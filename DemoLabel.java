package demolabel;
import java.awt.*;
class MyFrame extends Frame{
    Label l1,l2,l3;
    MyFrame(){
       FlowLayout ob=new FlowLayout();
       setLayout(ob);
       l1=new Label("One");
       l2=new Label("Two");
       l3=new Label("Three");
       add(l1);
       add(l2);
       add(l3);
    }
}
public class DemoLabel {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500, 500);
        f.setVisible(true);        
    }   
}
