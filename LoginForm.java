package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginForm {

	public static void main(String[] args) {
		JFrame jf = new JFrame("Login Form");
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(800,100,700,500);
		jf.setBackground(Color.gray);
		
		Container contr = jf.getContentPane();
		contr.setLayout(null);
		
		JLabel jlabel = new JLabel("Enter Name : ");
		JLabel jlabel1 = new JLabel("Enter Password : ");
		jlabel.setBounds(100,100,100,50); //x,y,width,height
		jlabel1.setBounds(100,140,100,60);
		jlabel.setBackground(Color.BLUE);
		contr.add(jlabel);
		contr.add(jlabel1);
		jf.setVisible(true);
		
		JTextField jtxt = new JTextField();
		JTextField jtxt1 = new JTextField();
		jtxt.setBounds(200,100,200,30); // x,y,right width, down
		jtxt1.setBounds(200,150,200,30);
		// jtxt.setText("1");
//		jtxt.setText("1");
		contr.add(jtxt);
		contr.add(jtxt1);
		
//		creating submit button
		JButton jbtn = new JButton("Submit");
		jbtn.setBounds(200,220,90,50);
		jbtn.setBackground(Color.GREEN);
		contr.add(jbtn);
		// add radius to submit button
		jbtn.setBorderPainted(false);
		jbtn.setOpaque(true);
		jbtn.setContentAreaFilled(true);
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			String name=jtxt.getText().trim();
			String password=jtxt1.getText().trim();
			if (name.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")){		
				AdminPage apage = new AdminPage();
				apage.showpage();
			}else if (!name.isEmpty() || !password.isEmpty()) {
				JOptionPane.showMessageDialog(jf,"Invalid UserName or Password","Error",JOptionPane.ERROR_MESSAGE);
			}
			}
		};
		
		jbtn.addActionListener(al);
	}
}

	