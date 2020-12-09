package testmenu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame extends Frame implements ActionListener{
    MyFrame(){
      MenuBar mbar =new MenuBar();
        setMenuBar(mbar);
        Menu file=new Menu("File");
        MenuItem m1=new MenuItem("New");
        MenuItem m2=new MenuItem("Open");
        MenuItem m3=new MenuItem("Save");
        MenuItem m4=new MenuItem("Exit");
        file.add(m1);
        file.add(m2);
        file.add(m3);
        file.add(m4);
        mbar.add(file);
        Menu edit=new Menu("Edit");
        MenuItem m5=new MenuItem("Cut");
        MenuItem m6=new MenuItem("Copy");
        MenuItem m7=new MenuItem("-");
        MenuItem m8=new MenuItem("Paste");
        edit.add(m5);
        edit.add(m6);
        edit.add(m7);
        edit.add(m8);
        mbar.add(edit);
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);           
}
    @Override
    public void actionPerformed(ActionEvent e) {
        String n=e.getActionCommand();
        switch(n){
            case "New":
                System.out.println("You clicked New");
                FileDialog f1=new FileDialog(this, "open", FileDialog.LOAD);
                f1.setVisible(true);
                break;
            case "Open":
                System.out.println("You clicked Open");
                break;
            case "Save":
                System.out.println("You clicked Save");
                FileDialog f2=new FileDialog(this, "save", FileDialog.SAVE);
                f2.setVisible(true);
                break;
            case "Exit":
                System.out.println("You clicked Exit");
                break;
        }
    }
}
public class TestMenu {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500, 500);
        f.setVisible(true);              
    }
    
}
