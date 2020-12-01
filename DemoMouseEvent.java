package demomouseevent;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
class MyFrame extends Frame implements MouseListener{
    int x,y;
    String msg="";
    MyFrame(){
        addMouseListener(this);
    }
    @Override
    public void paint(Graphics g){
        g.drawString(msg, x, y);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
       x=e.getX();
       y=e.getY();
       msg="Mouse Clicked "+x+","+y;
       repaint();
    }
    @Override
    public void mousePressed(MouseEvent e) {
       x=e.getX();
       y=e.getY();
       msg="Mouse Pressed "+x+","+y;
       repaint();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
       x=e.getX();
       y=e.getY();
       msg="Mouse Released "+x+","+y;
       repaint();        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
       setTitle("Mouse Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
       setTitle("Mouse Exited");
    }  
}
public class DemoMouseEvent {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500,500);
        f.setVisible(true);
    }   
}
