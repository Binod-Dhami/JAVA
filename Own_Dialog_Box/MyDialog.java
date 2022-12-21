package Own_Dialog_Box;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyDialog {
    private static final String ENTER_ALIGEMENT = null;
    static JDialog d;
    static JLabel label;
    static JButton btn;
    
    public static void show_Dialog(JFrame frame,String msg,String title){
        d=new JDialog(frame,title);
        d.setSize(300,90);
        label=new JLabel(msg);
        btn=new JButton("ok");
        d.setLayout(new BoxLayout(d.getContentPane(),BoxLayout.Y_AXIS));
        label.setAlignmentX(Component(ENTER_ALIGEMENT));
        btn.setAlignmentX(Component(ENTER_ALIGEMENT));
        d.add(label);d.add(Box.createRigidArea(new Dimension(0,20)));
        d.add(btn);
        d.setVisible(true);
        d.setLocationRelativeTo(frame);
        btn.addActionListener(new Actionlistener() {
            
            public void actionPerformed(ActionEvent e){
                d.setVisible(false);
            }
        });
    }

    private static float Component(String enterAligement) {
        return 0;
    }
}

            
       
      