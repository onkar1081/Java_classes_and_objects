package togglebutton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class MyFrame extends JFrame implements ItemListener{
    JToggleButton tb;
    String msg;
    MyFrame(){
        FlowLayout ob=new FlowLayout();
        setLayout(ob);
        tb=new JToggleButton("On/Off");
        add(tb);
        tb.addItemListener(this);
    }
    @Override
    public void paint(Graphics g){   
        g.drawString(msg,100,200);
        
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
       msg="Toggle button is selected "+tb.isSelected();
        System.out.println(tb.isSelected());
        repaint();
}
}
public class ToggleButton {
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setTitle("Frame1");   
       f.setName("Frame1");
       f.setSize(500,500);
       f.setVisible(true);       
    }  
}
