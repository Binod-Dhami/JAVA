package window_Listener;
import javax.swing.*;

public class Popup {
    JFrame f;
    Popup(){
        JOptionPane.showMessageDialog(f, "Hello there! How are you today?");
    }
    
    public static void main(String[] args) {
     new Popup();
    }
}