/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

//import Week5.FileChooserDemo;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Asus
 */
public class HydroApp extends JFrame implements ActionListener 
{
   private JLabel label1, label2;
   private JTextField textField1;
   private JButton button1, button2;
   private JTextArea area;
   private JPanel panel;
   private JFileChooser fileChooser;
   private BufferedReader inFile;
   
    /**
     *
     * @param args
     */
    public static void main(String[] args) 
    {
        try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
                //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (UnsupportedLookAndFeelException e) 
            {
                // handle exception
            } catch (ClassNotFoundException e) 
            {
                // handle exception
            } catch (InstantiationException e) 
            {
                // handle exception
            } catch (IllegalAccessException e) 
            {
                // handle exception
            }
        
        HydroApp frame = new HydroApp();
        frame.setSize(400, 600);
        frame.createGUI();
        frame.setVisible(true);
    }
    
    /**
     * 
     * 
     */
    public void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        label1 = new JLabel("File");
        label2 = new JLabel("Input");
        textField1 = new JTextField("");
        button1 = new JButton("Browse");
        button2 = new JButton("Analyse");
        area = new JTextArea();
        panel = new JPanel();
        
        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(310,100));
        
        window.add(label1);
        window.add(textField1);
        window.add(button1);
        window.add(label2);
        window.add(area);
        window.add(button2);
        window.add(panel);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
    }
    
    /**
     *
     * @return
     */
    public String readFile() 
    {
        String inhoud = "";
            
        try 
        {
            inFile = new BufferedReader(new FileReader(textField1.getText()));
            area.setText("");
            String line;
            while ((line = inFile.readLine()) != null) {
                area.append(line + "\n");
                inhoud = inhoud + line + "\n";
            }
            System.out.println(inhoud);
            inFile.close();
        } 
        catch (IOException e) 
        {
            System.out.println(e);
        }
        return inhoud;
    }
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        HydroTrans trans = new HydroTrans();
        Graphics paper = panel.getGraphics();
        
        File selectedFile;  //object File met de verwijzing selectedFile waarin het pad naar gekozen bestand wordt gezet
        int reply;      //
        if (event.getSource() == button1) 
        {
            fileChooser = new JFileChooser();
            reply = fileChooser.showSaveDialog(this);  //popup geven van bestanden, retouneerd een int aanvankelijk cancel, approve of error 
            if (reply == JFileChooser.APPROVE_OPTION) 
            {
                selectedFile = fileChooser.getSelectedFile();
                textField1.setText(selectedFile.getAbsolutePath());  //path die in File object selectedFile wordt gestopt, geprint in het textField nameField
                readFile();
            }
        }
        if (event.getSource() == button2)
        {
            String[] inLijst = readFile().toUpperCase().split("");
            
            int[] lijst = trans.Check(inLijst);
            
            float deel = 300/lijst.length;
            int delen = (int) deel;
            System.out.println(lijst.length);
            System.out.println(delen);
            
            for (int i = 0;i<lijst.length;i++)
            {
                if (lijst[i] == 1)
                {
                   paper.setColor(Color.blue);
                   paper.fillRect(i*delen, 10, i*delen, 30);
                }
                else if (lijst[i] == 2)
                {
                    paper.setColor(Color.red);
                    paper.fillRect(i*delen, 10, i*delen, 30);
                }
                else if (lijst[i] == 3)
                {
                    paper.setColor(Color.yellow);
                    paper.fillRect(i*delen, 10, i*delen, 30);
                }
                System.out.println(i*delen);
            }
        }
        
    }
   
}
