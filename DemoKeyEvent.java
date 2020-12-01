package demokeyevent;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
class MyFrame extends Frame implements KeyListener{
    char ch;
    int x;
    String msg="";
    MyFrame(){
        addKeyListener(this);
    }
    @Override
    public void paint(Graphics g){
        g.drawString(msg, 100, 200);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        ch=e.getKeyChar();
        x=e.getKeyCode();
        msg="Key Typed "+ch+","+x;
        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) {
        ch=e.getKeyChar();
        x=e.getKeyCode();
        msg="Key Pressed "+ch+","+x;
        repaint();       
    }
    @Override
    public void keyReleased(KeyEvent e) {
        ch=e.getKeyChar();
        x=e.getKeyCode();
        msg="Key Released "+ch+","+x;
        repaint();        
    }
}
public class DemoKeyEvent {
        public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500,500);
        f.setVisible(true);           
    }   
}
