//ComboBox

import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 

class ComboBoxEg1 extends JFrame implements ItemListener 
{ 
  
    
    static JFrame f; 
   
    static JLabel l, l1; 
      
    static JComboBox c1; 
  
    // main class 
    public static void main(String[] args) 
    { 
        
        f = new JFrame("frame"); 
         
        ComboBoxEg1 s = new ComboBoxEg1(); 
  
        
        f.setLayout(new FlowLayout()); 
  
        // array of string contating cities 
        String s1[] = { "Pune", "Mumbai", "Kolhapur", "Kolkata", "New Delhi" }; 
  
        
        c1 = new JComboBox(s1); 
  
        // add ItemListener 
        c1.addItemListener(s); 
  
        // create labels 
        l = new JLabel("Select your city "); 
        l1 = new JLabel("Pune selected"); 
  
        // set color of text 
        l.setForeground(Color.red); 
        l1.setForeground(Color.blue); 
  
        // create a new panel 
        JPanel p = new JPanel(); 
  
        p.add(l); 
  
        // add combobox to panel 
        p.add(c1); 
  
        p.add(l1); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 

        f.setSize(400, 300); 
  
        f.show(); 
    } 
    public void itemStateChanged(ItemEvent e) 
    { 
        // if the state combobox is changed 
        if (e.getSource() == c1)
       { 
  
            l1.setText(c1.getSelectedItem() + " selected"); 
        } 

    } 
} 




