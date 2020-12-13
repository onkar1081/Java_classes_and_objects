package testjcheckbox;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
class MyFrame extends JFrame implements ItemListener{
    JCheckBox c1,c2,c3;
    JLabel l1,l2,l3;
MyFrame(){
    FlowLayout ob=new FlowLayout();
    setLayout(ob);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    c1=new JCheckBox("C");
    c2=new JCheckBox("Cpp");
    c3=new JCheckBox("Java");
    l1=new JLabel("                          ");
    l2=new JLabel("                          ");
    l3=new JLabel("                          ");
    add(c1);
    add(c2);
    add(c3);
    add(l1);
    add(l2);
    add(l3);
    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);  
}
    @Override
    public void itemStateChanged(ItemEvent e) {
        l1.setText("C is selected "+c1.isSelected());
        l2.setText("Cpp is selected "+c2.isSelected());
        l3.setText("Java is selected "+c3.isSelected());
    }    
}
public class TestJCheckBox {
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setTitle("MyFrame");
       f.setVisible(true);
       f.setSize(250,250);
    }  
}
