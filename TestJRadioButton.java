package testjradiobutton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class MyFrame extends JFrame implements ActionListener {
    JRadioButton r1, r2;
    JLabel l1;
    ButtonGroup bg;
    JButton b1;
    String msg;
    MyFrame() {
        FlowLayout ob = new FlowLayout();
        setLayout(ob);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        bg=new ButtonGroup();
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l1 = new JLabel("                ");
        b1=new JButton("OK");
        bg.add(r1);
        bg.add(r2);
        add(r1);
        add(r2);
        add(b1);
        add(l1);
        b1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected()) {
            msg="Male is selectd";
        } else {
            msg="Female is selectd";
        }
        l1.setText(msg);
    }
}
public class TestJRadioButton {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("MyFrame");
        f.setVisible(true);
        f.setSize(250, 250);
    }
}
