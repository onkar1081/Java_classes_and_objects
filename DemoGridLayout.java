package demogridlayout;
import java.awt.*;
class MyFrame extends Frame{
    int i,j,k=0;
    MyFrame(){
        GridLayout ob=new GridLayout(4,4);
        setLayout(ob);
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++){
                Button b1=new Button(""+k);
                add(b1);
                k++;
            }
        }
    }
}
public class DemoGridLayout {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Frame 1");
        f.setSize(500, 500);
        f.setVisible(true);         
    }   
}
