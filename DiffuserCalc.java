package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class DiffuserCalc {
    //create the class data fields
    private double qts;
    private double qes;
    private double vas;
    private JFrame programBounds = new JFrame();
    private JLabel label1= new JLabel("Qts");
    private JLabel label2= new JLabel("Qes");
    private JLabel label3= new JLabel("Fs");
    private JLabel label4= new JLabel("BL");
    private JLabel label5= new JLabel("Xmax");
    private JLabel label6= new JLabel("Fs");
    private JLabel label7= new JLabel("Vas");
    private JLabel label8= new JLabel("Diameter");
    private JLabel label9= new JLabel("Pmax (RMS)"); 

    private JTextField qtsParam = new JTextField("Value");
    private JTextField qesParam = new JTextField("Value");
    private JTextField fsParam = new JTextField("");
    private JTextField bLParam = new JTextField("");
    private JTextField xmaxParam = new JTextField("");

    private Font myFont = new Font("Tahoma", Font.BOLD, 20);

    DiffuserCalc()
    {
        programBounds.setTitle("Box Designer");
        JPanel parameterMenu = new JPanel();
        JPanel labelPanel = new JPanel();
        JPanel fieldInputs = new JPanel();

        // LAYOUT
        programBounds.setLayout(new BorderLayout());
        parameterMenu.setLayout(new BorderLayout());
        fieldInputs.setLayout(new FlowLayout(FlowLayout.LEFT));
        fieldInputs.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        labelPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        labelPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);


        programBounds.add(parameterMenu, BorderLayout.NORTH);
        parameterMenu.add(labelPanel, BorderLayout.NORTH);
        parameterMenu.add(fieldInputs, BorderLayout.SOUTH);
//        programBounds.add(fieldInputs);
        programBounds.setSize(1300,800);

        Border lineBdr = BorderFactory.createLineBorder(Color.BLACK);
        Border BlackBorder = BorderFactory.createTitledBorder(lineBdr, "    T/S Parameters    ", TitledBorder.CENTER, TitledBorder.TOP, myFont, Color.black);

        //FIELD PROPERTIES
        label1.setFont(myFont);
        label2.setFont(myFont);
        label3.setFont(myFont);
        label4.setFont(myFont);
        label5.setFont(myFont);
        label6.setFont(myFont);
        label7.setFont(myFont);
        label8.setFont(myFont);
        label9.setFont(myFont);

        // ADD FIELDS
        labelPanel.add(label1);
        labelPanel.add(label2);
        labelPanel.add(label3);
        labelPanel.add(label4);
        labelPanel.add(label5);
        labelPanel.add(label6);
        labelPanel.add(label7);
        labelPanel.add(label8);
        labelPanel.add(label9);

        parameterMenu.setBorder(BlackBorder);

        qtsParam.setColumns(3);
        fieldInputs.add(qtsParam);
        qesParam.setColumns(3);
        fieldInputs.add(qesParam);
        fsParam.setColumns(2);
        fieldInputs.add(fsParam);
        bLParam.setColumns(2);
        fieldInputs.add(bLParam);
        xmaxParam.setColumns(2);
        fieldInputs.add(xmaxParam);

        // set everything proper
        qtsParam.requestFocus();
        programBounds.pack();
        programBounds.setVisible(true);
    }
    public double BoxDimension(int x, int y)
    {
        return x;
    }
    public static void main(String[] args) {

        DiffuserCalc MainProgram = new DiffuserCalc();


    }
}