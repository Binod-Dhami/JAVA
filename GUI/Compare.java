package GUI;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Compare extends JFrame implements ActionListener{
    JTextField t;
    JLabel l;
    JButton b;
    public Compare(){
    setTitle("SE-III");
    t=new JTextField();
    l=new JLabel();
    b=new JButton("click");
    setSize(500,600);
    t.setBounds(100,50,200,50);
    l.setBounds(100,100,200,50);
    b.setBounds(100,150,200,50);
    add(t);add(l);add(b);
   // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setVisible(true);
    b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int num=Integer.parseInt(t.getText());
        if(num%2==0)
        { 
            l.setText("even");

        }
        else{
            l.setText("odd");
        }
    }
    public static void main(String[]args){
       new Compare();
    }

}
