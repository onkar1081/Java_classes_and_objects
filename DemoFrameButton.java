package demoframebutton;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class MyFrame extends Frame implements ItemListener{
    Checkbox c1,c2,c3;
    CheckboxGroup cg;
    MyFrame(){
        FlowLayout ob=new FlowLayout();
        setLayout(ob);
        cg=new CheckboxGroup();
        c1=new Checkbox("A", true,cg);
        c2=new Checkbox("B", false,cg);
        c3=new Checkbox("C", true,cg);
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
}
    @Override
    public void paint(Graphics g){
        g.drawString("A is selected "+c1.getState(),200, 200);
        g.drawString("B is selected "+c2.getState(),200, 230);
        g.drawString("C is selected "+c3.getState(),200, 260);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
}
public class DemoFrameButton {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame1");
        f.setSize(700,700);
        f.setVisible(true);      
    }    
}
