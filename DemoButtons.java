package demobuttons;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame extends Frame implements ActionListener{
    Button b1,b2,b3;
    String msg="";
    MyFrame(){
       FlowLayout ob=new FlowLayout();
       setLayout(ob);
       b1=new Button("One");
       b2=new Button("Two");
       b3=new Button("Three");
       add(b1);
       add(b2);
       add(b3);      
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
    }
    public void paint(Graphics g){
        g.drawString(msg, 200, 200);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       String n=e.getActionCommand();
       msg="You Clicked "+n;
       repaint();
    }
}
public class DemoButtons {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500, 500);
        f.setVisible(true);          
    }  
}
