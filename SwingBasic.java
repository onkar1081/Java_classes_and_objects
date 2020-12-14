package swingbasic;
import java.awt.*;
import javax.swing.*;
class MyFrame extends JFrame{
    MyFrame(){
    setTitle("Frame1");
}
    @Override
    public void paint(Graphics g){
        g.drawString("Hello World",100,200);
    }
}
public class SwingBasic {
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setSize(500,500);
       f.setVisible(true);
    }    
}
