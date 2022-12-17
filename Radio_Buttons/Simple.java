package Radio_Buttons;
import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
class Simple extends JFrame implements ActionListener {
    JRadioButton se,it;
    JLabel l;
    public Simple(){
        setSize(500,700);
        setTitle("Radio Buttons");
        se=new JRadioButton("SE");
        it=new JRadioButton("IT");
        add(se);add(it);
        setVisible(true);
        setLayout(null);
        //diffferent
        ButtonGroup bg=new ButtonGroup();
        bg.add(it);bg.add(se);
        se.addActionListener(this);
        it.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==se){
            l.setText("SE is selected");
        }
        else{
            l.setText("IT is selected");
        }
    }
    public static void maian(String[]args){
        new Simple();
    }
    
}
