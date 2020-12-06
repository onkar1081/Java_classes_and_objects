package demoborderlayout;
import java.awt.*;
class MyFrame extends Frame{
    Button b1,b2,b3,b4;
    MyFrame(){
        BorderLayout ob=new BorderLayout();
        setLayout(ob);
        b1=new Button("East");
        b2=new Button("West");
        b3=new Button("North");
        b4=new Button("South");
        add(b1,BorderLayout.EAST);
        add(b2,BorderLayout.WEST);
        add(b3,BorderLayout.NORTH);
        add(b4,BorderLayout.SOUTH);
    }
}
public class DemoBorderLayout {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500, 500);
        f.setVisible(true);    
    }   
}
