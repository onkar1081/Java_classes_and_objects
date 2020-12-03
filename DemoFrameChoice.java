package demoframechoice;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class MyFrame extends Frame implements ItemListener{
    Choice ch;
    MyFrame(){
        FlowLayout ob=new FlowLayout ();
        setLayout(ob);        
        ch=new Choice();
        add(ch);
        ch.add("A");
        ch.add("B");
        ch.add("C");
        ch.add("D");
        ch.addItemListener(this);              
    }
    @Override
    public void paint(Graphics g){
        g.drawString("You selected "+ch.getSelectedItem(),200, 200);
        g.drawString("You selected index no. "+ch.getSelectedIndex(), 200, 230);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
}
public class DemoFrameChoice {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame1");
        f.setSize(700,700);
        f.setVisible(true);           
    } 
}
