package Radio_Button;

import java.awt.*; 
//class with extend frame
 class CheckBoxExample extends Frame 
 { 
    //construction
      CheckBoxExample() 
     { 
         setLayout(new FlowLayout());  
         Label lblHobbies = new Label("HOBBIES"); 
         Checkbox chkSports = new Checkbox("Sports"); 
         Checkbox chkMusic = new Checkbox("Music ",true); 
         Checkbox chkReading = new Checkbox("Reading"); 
         add(lblHobbies); 
         add(chkSports); 
         add(chkMusic); 
         add(chkReading); 
     } 
 } 
    class CheckboxJavaExample 
   { 
    //main funcation
          public static void main(String args[]) 
         { 
                 CheckBoxExample frame = new CheckBoxExample(); 
                 frame.setTitle("Checkbox in Java Example"); 
                 frame.setSize(350,100); 
                 frame.setResizable(false); 
                 frame.setVisible(true); 
          } 
   } 