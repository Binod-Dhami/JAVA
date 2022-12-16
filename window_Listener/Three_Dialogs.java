package window_Listener;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
class Three_Dialogs extends JFrame implements Actionlistener,WindowListener{
    JButton b;
//three dilog
   Three_Dialogs(){
    setSize(500,700);
    setTitle("Title");
    b=new JButton("click");
   // pack();
   b.setBounds(250,500,100,100);
    add(b);
    setVisible(true);
    setLayout(null);
    b.addActionListener((ActionListener) this);
    addWindowListener(this);
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
    String input=JOptionPane.showInputDialog(null,"enter an integer");
    int num=Integer.parseInt(input);
    if(num%2==0){
        JOptionPane.showMessageDialog(null,"even","Example",JOptionPane.PLAIN_MESSAGE);
    }
    else{
        JOptionPane.showMessageDialog(null,"odd");

    }

}
public void WindowClosing(WindowEvent e){
    int c=JOptionPane.showConfirmDialog(null,"Do you wants to exit?","Title",JOptionPane.OK_CANCEL_OPTION);
    if(c==JOptionPane.OK_OPTION)
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public static void main(String[]args){
    new Three_Dialogs();
}
public void windowOpened(WindowEvent e) {   
}

public void windowClosing(WindowEvent e) {    
}

public void windowClosed(WindowEvent e) {   
}

public void windowIconified(WindowEvent e) {    
}

public void windowDeiconified(WindowEvent e) {  
}

public void windowActivated(WindowEvent e) {  
}

public void windowDeactivated(WindowEvent e) {
    
}

}