package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import GUI.Swing1.SoundEffectListener;

public class MyLabel {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("I am Groot");
		ImageIcon icon = new ImageIcon("G:\\my image\\Defender\\exterior-image-164.jpg");
		jf.setIconImage(icon.getImage());
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100,200,700,500);
		
		Container contr = jf.getContentPane();
		contr.setLayout(null);
		
		JLabel jlabel = new JLabel("User Name : ",icon,JLabel.RIGHT);
//		JLabel jlabel = new JLabel("User Name : ");
		jlabel.setBounds(50,50,icon.getIconWidth(),icon.getIconHeight()); //x,y,width,height
		contr.add(jlabel);
		jf.setVisible(true);

		
		
		contr.setBackground(Color.green);
		
		Font f = new Font("Lucida-Sans",Font.BOLD,30);
		jlabel.setFont(f);
		
		JTextField jtxt = new JTextField();
		jtxt.setBounds(200,200,300,50);
		jtxt.setText("Enter user Name : ");
		contr.add(jtxt);
		
		Font font = new Font("Lucida-Sans", Font.BOLD,30);
		jtxt.setFont(font);
		
		jf.setVisible(true);
		
		jtxt.setForeground(Color.BLUE);
		jtxt.setEditable(true);
		
		JPanel p = new JPanel();
		JButton button = new JButton();
		button.addActionListener(new SoundEffectListener());
        p.add(button);
        
        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(200,300,300,50);
        pwd.setText("123456789");
        pwd.setEchoChar('$');
        pwd.setEchoChar((char)0);
        contr.add(pwd);

	}

}
