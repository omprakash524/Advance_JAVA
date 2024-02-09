package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class My_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

}
