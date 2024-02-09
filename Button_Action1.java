package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener {
    Container cntr;
    JButton[] buttons;

    MyFrame() {
        cntr = this.getContentPane();
        // Consider using layout managers instead of null layout
        cntr.setLayout(new FlowLayout());

        buttons = new JButton[4];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            // Use the correct font format
            buttons[i].setFont(new Font("Lucida Sans", Font.PLAIN, 24));
            buttons[i].addActionListener(this);
            cntr.add(buttons[i]);
        }
    }

//    set unique background color on each button
    public void actionPerformed(ActionEvent e) {
        // Handle button click event
        JButton clickedButton = (JButton) e.getSource();
        cntr.setBackground(Color.BLUE);
    }
}

public class Button_Action1 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Action on Button");
        f.setBounds(100, 100, 800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);	
		
		
		
		/*
		 
		JFrame jf = new JFrame("My button Demo");
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setBounds(100,100,800,500); // x, y, w, h
		Container cntr =  jf.getContentPane();
		cntr.setLayout(null);
		
		JButton jbtn = new JButton("Click me..");
		jbtn.setSize(200,200);
		jbtn.setLocation(100,100);
		jf.add(jbtn);
		
		jbtn.setFont(new Font("Lucida-sans" , Font.BOLD,24));
		jbtn.setText("My button");
		jbtn.setForeground(Color.GRAY);
		jbtn.setBackground(Color.GREEN);
		
//		cursor event
		Cursor csr = new Cursor(Cursor.WAIT_CURSOR);
		Cursor csr1 = new Cursor(Cursor.MOVE_CURSOR);
		jbtn.setCursor(csr);
		jbtn.setCursor(csr1);
//		
		jbtn.setEnabled(true);
		
//		Save image as button
		ImageIcon icon = new ImageIcon("D:\\Eclipse workspace\\Advance Java\\src\\GUI\\submit.png\\");
		jf.setIconImage(icon.getImage());
		
		JButton jbtn1 = new JButton(icon);
		jbtn1.setSize(icon.getIconWidth(), icon.getIconHeight());
		jbtn1.setLocation(310,100);
		cntr.add(jbtn1);
		
		
		
		
		
		jf.setVisible(true);
		*/

	}

}
