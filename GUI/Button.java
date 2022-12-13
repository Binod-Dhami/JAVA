package GUI;
import javax.swing.*;
class Button extends JFrame{
    JTextArea t;
    JButton b;
    Button(){
        t=new JTextArea();
        b=new JButton("click here");
        setSize(500,600);
        t.setBounds(250,300,100,50);
        b.setBounds(250,400,100,50);
        add(t);add(b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[]args){
       new Button();
    }
    
}
