package demojlist;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
class MyFrame extends JFrame implements ActionListener {
    JList <String>list1;
    JButton b1;
    JLabel l1;
    JScrollPane jp;
    MyFrame(){
        FlowLayout ob = new FlowLayout();
        setLayout(ob);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   
        String[] arr={"Marathi","English","Hindi","Sanskrit","Marathi","English","Hindi","Sanskrit","Marathi","English","Hindi","Sanskrit"};
        list1=new JList<String>(arr);
        jp=new JScrollPane(list1);
        b1=new JButton("Ok");
        l1=new JLabel("               ");
        add(jp);      
        add(b1);
        add(l1 );
        b1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       List<String> items=list1.getSelectedValuesList();
       String msg="";
        for (String s1: items) {
            msg+=","+s1;
        }
        l1.setText(msg);
    }
}
public class DemoJList {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("MyFrame");
        f.setVisible(true);
        f.setSize(500, 500);
    }
}
