package demologinframe;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame extends Frame implements ActionListener{
    TextField t1,t2;
    Button b1;
    Label l1;
    MyFrame(){       
        FlowLayout ob=new FlowLayout();
        setLayout(ob);
        t1=new TextField(5);
        t2=new TextField(5);  
        b1=new Button("Login");
        l1=new Label("                           ");        
        t2.setEchoChar('*');
        add(t1);
        add(t2);
        add(b1);
        add(l1);   
        b1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String un=t1.getText();
        String pass=t2.getText();
        if(un.equals("abc") && pass.equals("xyz")){
            l1.setText("Valid User!!!");
        }
        else{
            l1.setText("Invalid User!!!");
        }
    }   
}
public class DemoLoginFrame {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Login Page");
        f.setSize(500,500);
        f.setVisible(true);
    }   
}
