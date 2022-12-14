package GUI;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class Two_class extends JFrame{
    JTextField first,second,result;
    JButton sum,sub;
    public Two_class(){
        setSize(500,700);
        setTitle("menu Bar");
        first=new JTextField();
        second=new JTextField();
        result=new JTextField();
        sum=new JButton("Sum");
        sub=new JButton("Sub");
        first.setBounds(250,100,200,50);
        second.setBounds(250,150,200,50);
        result.setBounds(250,200,200,50);
        sum.setBounds(100,250,200,50);
        sub.setBounds(400,250,200,50);
        add(first);add(second);add(result);add(sub);add(sum);
        setLayout(null);
        setVisible(true);
        Controller c=new Controller(this);
        sum.addActionListener(c);
        sub.addActionListener(c);
    }


public static void main (String[]args){
    new Two_class();
}
}
    class Controller implements ActionListener{
        Two_class tw;
        public Controller(Two_class tw){
            this.tw=tw;
        }
    
   
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==this.tw.sum){
            int a=Integer.parseInt(this.tw.first.getText());
            int b=Integer.parseInt(this.tw.second.getText());
         int addition =a+b;
        this.tw.result.setText(" "+addition);
        this.tw.result.setForeground(Color.RED);
    }
    else
    {
        int a=Integer.parseInt(this.tw.first.getText());
        int b=Integer.parseInt(this.tw.second.getText());
    int Subtraction=a-b;
    this.tw.result.setText(" "+Subtraction);
    this.tw.result.setForeground(Color.BLUE);
    }
    }
}
    





