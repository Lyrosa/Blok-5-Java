

/**
 *
 * @author Osman
 */

import java.awt.*;
import java.awt.event.*;
//import java.util.HashSet;
//import java.util.Set;
//import java.awt.event.*;
import javax.swing.*;


public class GUI1 extends JFrame implements ActionListener {
    
    private JTextField textField;       // private button datatype met de naam button
    private JButton button, button2;             // alleen vanaf dit programma is de layout of functie van button aan te passen (private)
    private JLabel label;
    private JPanel panel;
    public static void main (String[] args) {
        GUI1 frame = new GUI1();
        frame.setSize(300, 200);        //grootte in pixels
        frame.createGUI();
        frame.setVisible(true);       

    }
    
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();        //Container = datatype, window = variabele 
        window.setLayout(new FlowLayout() );        //layout aanmaken voor container van GUI
        
        label = new JLabel("Vul in:");
        window.add(label);
        
        textField = new JTextField(20);             // grootte in characters 
        window.add(textField);        
        
        button = new JButton("OK");
        button2 = new JButton("OK");
        //button.setEnabled(false);
        button.setBackground(Color.red);
        button2.setBackground(Color.yellow);
        button.addActionListener(this);
        button2.addActionListener(this);
        window.add(button);
        window.add(button2);
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.PINK);
        window.add(panel);
       
        

       
    }
    
    public void actionPerformed (ActionEvent event){
        //System.out.println("Hello World!");
        textField.setText("Hello World!");
        System.out.println(textField.getText());
        
        Graphics paper = panel.getGraphics();
        paper.drawLine(10, 10, 100, 200);
        paper.setColor(Color.pink);
        
    }
    
       
}    
