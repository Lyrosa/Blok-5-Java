/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefentoets;

import Week7.HydroTrans;
import javax.swing.*;
import javax.swing.JScrollPane;
//import javax.swing.JScrollPaneConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class CompareGUI extends JFrame implements ActionListener
{

    private JLabel label1, label2;
    private JTextField textField1;
    private JButton button1, button2, button3;
    private JTextArea area;
    private JPanel panel;
    private JFileChooser fileChooser;
    private BufferedReader inFile;
    private JScrollPane scrollPane;

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

        CompareGUI frame = new CompareGUI();
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
        button2 = new JButton("Browse");
        button3 = new JButton("Analyze");
        area = new JTextArea(10,30);
        panel = new JPanel();
        scrollPane = new JScrollPane ();
        scrollPane.setViewportView(area);
        //scrollPane.VERTICAL_SCROLLBAR_ALWAYS;
        //scrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        //scrollPane.setMinimumSize(new Dimension(310, 100));
        //scrollPane.setMaximumSize(new Dimension(310,100));

        panel.setBackground(Color.white);
        panel.setPreferredSize(new Dimension(310, 100));
        //area.setPreferredSize(new Dimension(310, 100));


        window.add(label1);
        window.add(textField1);
        window.add(button1);
        window.add(label2);
        //window.add(area);
        window.add(button2);
        window.add(panel);
        window.add(scrollPane);
        window.setVisible(true);

        button1.addActionListener(this);
        button2.addActionListener(this);
        //button3.addActionListener(this);
    }

    /**
     *
     * @return
     */
    public String compareFile()
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
        if (event.getSource() == button1) {
            fileChooser = new JFileChooser();
            reply = fileChooser.showSaveDialog(this);  //popup geven van bestanden, retouneerd een int aanvankelijk cancel, approve of error
            if (reply == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = fileChooser.getSelectedFile();
                textField1.setText(selectedFile.getAbsolutePath());  //path die in File object selectedFile wordt gestopt, geprint in het textField nameField
                compareFile();
            }
        }

        if (event.getSource()==button2)
        {
            fileChooser = new JFileChooser();
            reply = fileChooser.showSaveDialog(this);  //popup geven van bestanden, retouneerd een int aanvankelijk cancel, approve of error
            if (reply == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = fileChooser.getSelectedFile();
                textField1.setText(selectedFile.getAbsolutePath());  //path die in File object selectedFile wordt gestopt, geprint in het textField nameField
                compareFile();
            }
        }

        if (event.getSource() == button3)
        {
            compareFile();
        }


    }
}
