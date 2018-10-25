import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class MyPanel extends JFrame{
    Container cp;
    private JPanel panel1 = new JPanel(new GridLayout(1,6,2,2));
    private JPanel panel2 = new JPanel(new GridLayout(2,3,2,2));

    private JLabel lab1_1 = new JLabel("加密法");
    private String methodStr[]= {"DES","XOR","Caser","AES"};
    private JComboBox jcb = new JComboBox<String>(methodStr);
    private JLabel lab1_3 = new JLabel("Key");
    private JTextField txt1_1 = new JTextField("1723"); // text field
    private JButton but1_1 = new JButton("Run");
    private JButton but1_2 = new JButton("Close");

    private JLabel lab2_1 = new JLabel("原始檔");
    private JTextField txt2_1 = new JTextField();
    private JButton but2_1 = new JButton("Choose");

    private JLabel lab3_1 = new JLabel("加密檔");
    private JTextField txt3_1 = new JTextField();
    private JButton but3_1 = new JButton("Choose");

    public MyPanel(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,150,500,120);
        cp = this.getContentPane();
        cp.add(panel1,BorderLayout.CENTER);
        cp.add(panel2,BorderLayout.SOUTH);

        panel1.add(lab1_1);
        panel1.add(jcb);
        panel1.add(lab1_3);
        panel1.add(txt1_1);
        panel1.add(but1_1);
        panel1.add(but1_2);

        panel2.add(lab2_1);
        panel2.add(txt2_1);
        panel2.add(but2_1);

        panel2.add(lab3_1);
        panel2.add(txt3_1);
        panel2.add(but3_1);
    }
}
