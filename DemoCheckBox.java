package democheckbox;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class MyFrame extends Frame implements ItemListener{
    Checkbox c1,c2,c3;
    MyFrame(){
        FlowLayout ob=new FlowLayout();
        setLayout(ob);
        c1=new Checkbox("C", true);
        c2=new Checkbox("CPP", false);
        c3=new Checkbox("JAVA", true);
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
}
    @Override
    public void paint(Graphics g){
        g.drawString("C is selected "+c1.getState(),200, 200);
        g.drawString("CPP is selected "+c2.getState(),200, 230);
        g.drawString("JAVA is selected "+c3.getState(),200, 260);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
}
public class DemoCheckBox {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame1");
        f.setSize(700,700);
        f.setVisible(true);       
    }  
}
