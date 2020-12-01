package demomousemotionevent;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
class MyFrame extends Frame implements MouseMotionListener{
    int x,y;
    String msg="";
    MyFrame(){
        addMouseMotionListener(this);
    }
    @Override
    public void paint(Graphics g){
        g.drawString(msg,500,500);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        msg="Mouse Dragging at "+x+","+y;
        repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        x=e.getX();
        y=e.getY();
        msg="Mouse Moving at "+x+","+y;
        repaint();
    }
}
public class DemoMouseMotionEvent {    
        public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500,500);
        f.setVisible(true);     
    }  
}
