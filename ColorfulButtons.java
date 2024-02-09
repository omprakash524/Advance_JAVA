package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorfulButtons extends JFrame implements ActionListener {
    private JButton[] buttons;

    public ColorfulButtons() {
        setTitle("Colorful Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Number of buttons
        int numberOfButtons = 5;

        // Create an array of buttons
        buttons = new JButton[numberOfButtons];

        // Set layout manager (you can choose based on your design)
        setLayout(new FlowLayout());

        // Set unique background color for each button
        for (int i = 0; i < numberOfButtons; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            buttons[i].addActionListener(this);

            // Set a unique background color for each button
            buttons[i].setBackground(new Color((i + 1) * 50, (i + 1) * 30, (i + 1) * 20));

            add(buttons[i]);
        }

        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Handle button click event if needed
    }

    public static void main(String[] args) {
        new ColorfulButtons();
    }
}
