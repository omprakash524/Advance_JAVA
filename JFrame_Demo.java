package GUI;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrame_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i am Groot");
		JFrame jf = new JFrame("Stock Market Screaning");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
//		jf.setSize(800,6000);
//		jf.setLocation(100,100);
		jf.setBounds(100,300,800,400);
//		jf.setTitle("Groot");
		
		ImageIcon icon = new ImageIcon("G:\\my image\\Defender\\exterior-image-164.jpg");
		jf.setIconImage(icon.getImage());
		
		Container contr = jf.getContentPane();
		contr.setBackground(Color.green);
		jf.setResizable(false);
		
		

	}
}


