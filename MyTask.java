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

public class MyTask {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("I am Groot");
		ImageIcon icon = new ImageIcon("D:\\Eclipse workspace\\Advance Java\\src\\GUI\\lpu.png");
		jf.setIconImage(icon.getImage());
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(200,200,700,500);
		
		Container contr = jf.getContentPane();
		contr.setLayout(null);
		
		JLabel jlabel = new JLabel("",icon,JLabel.RIGHT);
//		JLabel jlabel = new JLabel("User Name : ");
		jlabel.setBounds(200,400,1000,500); //x,y,width,height
		contr.add(jlabel);
		jf.setVisible(true);
		
//		JLabel jlabel1 = new JLabel("Field ",icon,JLabel.RIGHT);
////		JLabel jlabel1 = new JLabel("User Name : ");
//		jlabel1.setBounds(210,390,1000,600); //x,y,width,height
//		contr.add(jlabel);
//		jf.setVisible(true);

		
		
		contr.setBackground(Color.CYAN);
		
		Font f = new Font("Lucida-Sans",Font.BOLD,30);
		jlabel.setFont(f);
		
		JTextField jtxt = new JTextField();
		jtxt.setBounds(200,200,300,50);
		jtxt.setText("");
		jtxt.setText("");
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
