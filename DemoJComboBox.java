package demojcombobox;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
    class MyFrame extends JFrame implements ItemListener {
        JComboBox c1;
        JLabel l1;
        MyFrame() {
        FlowLayout ob = new FlowLayout();
        setLayout(ob);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c1=new JComboBox();
        c1.addItem("Windows");
        c1.addItem("Linux");
        c1.addItem("Mac");
        l1=new JLabel("                   ");
        add(c1);
        add(l1);
        c1.addItemListener(this);
        }
    @Override
    public void itemStateChanged(ItemEvent e) {
        String item=c1.getSelectedItem().toString();
        int index=c1.getSelectedIndex();
        l1.setText(item+","+index);
    }
}
public class DemoJComboBox {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("MyFrame");
        f.setVisible(true);
        f.setSize(250, 250);
    }
}
