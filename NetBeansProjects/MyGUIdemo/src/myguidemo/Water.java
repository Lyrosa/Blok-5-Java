/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myguidemo;
    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;


/**
 *
 * @author Lysanne Rosaria
 */

    

public class Water extends JFrame implements ActionListener {
    
    private JTextField textfieldx, textfieldy;       // private button datatype met de naam button
    private JButton button;             // alleen vanaf dit programma is de layout of functie van button aan te passen (private)
    private JLabel labelx, labely;  
    private JPanel panel;
    
    //public final double PI = 3.14;                //Bij de sout in de main zal een error komen omdat PI niet static is. We voegen dat dus toe aan de declaratie
    public static final double PI = 3.14;           //public, te benaderen vanuit andere classen, static, variabel komt maar 1 keer voor, final, laatste waarde, niet meer aan te passen.  
                                                    //constante zoals PI in hoofdletters, programmeurs afspraak
    private static int o;                           // private, niet te benaderen vanuit andere classen.
    
    public static void main (String[] args) {
        o = 1;                                      // te initialiseren omdat o een globale waarde is en aan het begin van de class gedeclareerd is. 
        Water frame = new Water();
        frame.setSize(300, 200);        //grootte in pixels
        frame.createGUI();
        frame.setVisible(true);    
        
        System.out.println(PI);

    }
    
    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();        //Container = datatype, window = variabele 
        window.setLayout(new FlowLayout() );        //layout aanmaken voor container van GUI
        
        labelx = new JLabel("x:");
        window.add(labelx);    
        textfieldx = new JTextField(3);             // grootte in characters 
        window.add(textfieldx); 
        
        labely = new JLabel("y:");
        window.add(labely);
        textfieldy = new JTextField(3);
        window.add(textfieldy);
        
        textfieldx.setText("0");
        textfieldy.setText("0");
        
        button = new JButton("Place");                 //button.setEnabled(false);
        button.setBackground(Color.pink);        
        button.addActionListener(this);        
        window.add(button);        
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.black);
        window.add(panel);
        
          
       
    }
    
    public void actionPerformed (ActionEvent event){
        //System.out.println("Hello World!");
        
        //System.out.println(textfieldx.getText());
        
        Graphics paper = panel.getGraphics();
        //panel.repaint();
        //removeAll();
        paper.setColor(Color.black);
        paper.fillRect(0, 0, 300, 300);     //repainting hele container met zwarte rechthoek
        
        
        int x;
        int y;
        x = Integer.parseInt(textfieldx.getText());
        y = Integer.parseInt(textfieldy.getText());
        System.out.println(x);
        System.out.println(y);
        
        
        paper.setColor(Color.white);
        paper.fillOval(x, y, 16, 16);        

        paper.setColor(Color.gray);
        paper.drawLine(x+8, y+8, x+62, y+132);
        
        paper.setColor(Color.red);
        paper.fillOval(x+46, y+116, 28, 28);
        
        paper.setColor(Color.gray);
        paper.drawLine(x+62, y+132, x+158, y+132);
        
        paper.setColor(Color.white);
        paper.fillOval(x+148, y+122, 16, 16);
        
        
       
    }
    
       
}    
