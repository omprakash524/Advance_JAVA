package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button_Action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setBounds(100,200,800,600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = jf.getContentPane();
		jf.setLayout(null);
		
		JButton btn_submit = new JButton("Submit");
		btn_submit.setBounds(100,100,200,50);
		c.add(btn_submit);
		btn_submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c.setBackground(Color.red);;
			}
		});
		
		
		
		
		jf.setVisible(true);

	}

}
