import java.awt.*;
import java.awt.event.*;

class  but  extends Frame
{
    but()
    {
    java.awt.Button b=new Button("OK");
    add(b);
    b.addActionListener(new Mycls());
    }
    public static void main(String[] args) {
        java.awt.Button obj=new Button();
        obj.setSize(400,300);
        obj.setVisible(true);
    }   
}
class Mycls implements ActionListener
{
    public void actionPerformed(ActionEvent ae)
    {
        System.exit(0);
    }

}