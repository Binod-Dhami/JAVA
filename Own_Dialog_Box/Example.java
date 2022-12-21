package Own_Dialog_Box;
import javax.swing.*;


//import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Example extends JFrame implements Actionlistener {
    JButton btn;
    public Example(){
        btn=new JButton("click");
        add(btn);
        setSize(500,700);
        setVisible(true);
        btn.addActionListener((ActionListener) this);
    }
    public void actionPerformed(ActionEvent e){
        MyDialog.show_Dialog(null, "binod", "title");
    }
    public static void main (String []args){
        new Example();
    }
}

