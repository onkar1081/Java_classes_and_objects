package testgui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MyAdapter extends WindowAdapter{
    MyFrame f;
    public MyAdapter(MyFrame f1) {
        f=f1;
    }
    @Override
    public void windowClosing(WindowEvent e) {
       f.dispose();
    }     
}
class MyFrame extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    String msg="";
    TextField t1,t2,t3;
    String ans="";
    MyFrame(){
       MyAdapter ob1=new MyAdapter(this);
       addWindowListener(ob1);
       FlowLayout ob=new FlowLayout();
       setLayout(ob);
       t1=new TextField(5);
       t2=new TextField(5);
       t3=new TextField(5);
       b1=new Button("Addition");
       b2=new Button("Subtraction");
       b3=new Button("Multiplication");
       b4=new Button("Division");
       add(t1);
       add(t2);     
       add(b1);
       add(b2);
       add(b3);
       add(b4);
       add(t3);
       t1.addActionListener(this);
       t2.addActionListener(this);
       t3.addActionListener(this);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);     
    }
    public void paint(Graphics g){
        g.drawString(msg, 200, 200);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       String n=e.getActionCommand();
       msg="You Clicked "+n;
       String s=t1.getText();
       int n1=Integer.parseInt(s);
       String s1=t2.getText();
       int n2=Integer.parseInt(s1); 
       if(n.equals("Addition")){
           int sum1=n1+n2;
           ans=Integer.toString(sum1);
           t3.setText(ans);
       }
       if(n.equals("Subtraction")){
           int sum1=n1-n2;
           ans=Integer.toString(sum1);
           t3.setText(ans);
       }
       if(n.equals("Division")){
           int sum1=n1/n2;
           ans=Integer.toString(sum1);
           t3.setText(ans);
       }
       if(n.equals("Multiplication")){
           int sum1=n1*n2;
           ans=Integer.toString(sum1);
           t3.setText(ans);
       }       
       repaint();
    }    
}
public class TestCalculatorGUI {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Calculator");
        f.setSize(500, 500);
        f.setVisible(true);        
    }  
}
