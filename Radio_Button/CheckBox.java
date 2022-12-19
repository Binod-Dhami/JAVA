package Radio_Button;
import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;


public class CheckBox extends JFrame implements ItemListener {
    JCheckBox java,c;
    public CheckBox(){
        setSize(500,700);
        java=new JCheckBox("java",true);
        c=new JCheckBox("c++",true);
        add(java);add(c);
        setLayout(null);
        setVisible(true);
        java.addItemListener(this);
        c.addItemListener(this);

    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        // if the state of java is changed
        if (e.getSource() == java) {
            if (e.getStateChange() == 1){
            JOptionPane.showMessageDialog(this, "java is  selected");
             } else{
            JOptionPane.showMessageDialog(this,"java is  not selected");
        }
    }
  
        // if the state of c++ is changed
        else {
            if (e.getStateChange() == 1){
            JOptionPane.showMessageDialog(this," c++ is  selected");
             }
              else{
            JOptionPane.showMessageDialog(this,"c++ not selected");
        }
    }
    }
    
    public static void main(String args[]){
        new CheckBox();
    }
    
}
