package swingoperations;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame extends JFrame implements ActionListener{
    JTextField t1,t2,t3;
    Button b1,b2,b3,b4;
    MyFrame(){
        FlowLayout ob=new FlowLayout();
        setLayout(ob);
        t1=new JTextField(5);
        t2=new JTextField(5);
        t3=new JTextField(5);
        b1=new Button("Add");
        b2=new Button("Subtract");
        b3=new Button("Multiply");
        b4=new Button("Divide");          
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        int num1,num2,ans=0;
        num1=Integer.parseInt(t1.getText());
        num2=Integer.parseInt(t2.getText());
        String n=e.getActionCommand();
           switch(n){
               case "Add":
                   ans=num1+num2;
                   break;
               case "Subtract":
                   ans=num1-num2;
                   break;
               case "Multiply":
                   ans=num1*num2;
                   break;
               case "Divide":
                   ans=num1/num2;
                   break;      
           }
           String n1=Integer.toString(ans);   
           t3.setText(n1);
    }  
}
public class SwingOperations {
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setTitle("Frame1");   
       f.setName("Frame1");
       f.setSize(500,500);
       f.setVisible(true); 
    }  
}
