package demowindowadapter;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MyAdapter extends WindowAdapter{
    MyFrame f;
    public MyAdapter(MyFrame f1) {
        f=f1;
    }
    @Override
    public void windowClosing(WindowEvent e) {
       f.dispose();
    }     
}
class MyFrame extends Frame{
    MyFrame(){
        MyAdapter ob=new MyAdapter(this);
        addWindowListener(ob);
    }
    public void paint(Graphics g){
        g.drawString("Hello World",200,200);
    }
}
public class DemoWindowAdapter {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500, 500);
        f.setVisible(true);       
    }    
}
