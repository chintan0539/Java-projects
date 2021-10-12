import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
import java.util.*;
import java.awt.font.TextAttribute;

 
public class checkBoxEg2  {    
    checkBoxEg2(){    
        JFrame f= new JFrame("CheckBox");    
        final JLabel label = new JLabel("Java Programming");            
        label.setHorizontalAlignment(JLabel.CENTER);    
        label.setSize(400,100);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 14));  

        JCheckBox checkbox1 = new JCheckBox("Bold");    
        checkbox1.setBounds(150,100, 100,50);    


         JCheckBox checkbox2 = new JCheckBox("Italic");    
        checkbox2.setBounds(150,150, 100,50);  

         JCheckBox checkbox3 = new JCheckBox("Underline");    
        checkbox3.setBounds(150,200, 100,50);  
    
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(checkbox3);
        f.add(label);    

        checkbox1.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {    
                if(e.getStateChange()==1){
                    label.setFont(new Font("Times New Roman", Font.BOLD, 14));  
                }else{
                    label.setFont(new Font("Times New Roman", Font.PLAIN, 14));  
                }


             }    
        });
        checkbox2.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {    
                if(e.getStateChange()==1){
                    label.setFont(new Font("Times New Roman", Font.ITALIC, 14));  
                }else{
                    label.setFont(new Font("Times New Roman", Font.PLAIN, 14));  
                }


             }    
        });

        checkbox3.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {    
                if(e.getStateChange()==1){
                    Font font = label.getFont();
                    Map attributes = font.getAttributes();
                    attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                    label.setFont(font.deriveFont(attributes)); 
                }else{
                    label.setFont(new Font("Times New Roman", Font.PLAIN, 14));  
                }

             }    
        });

           
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
    }    
    public static void main(String args[])    
    {    
        new checkBoxEg2();    
    }    
}    