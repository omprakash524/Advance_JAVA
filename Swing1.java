package GUI;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.AudioSystem;
	import javax.sound.sampled.Clip;
	import java.io.File; // Add this import statement

	public class Swing1 {

	    static public void main(String... rk) {
	        JFrame f = new JFrame("JAVA");
	        f.setSize(500, 500);
	        f.getContentPane().setBackground(new Color(100, 2, 255, 20));
	        f.setLocationRelativeTo(null);
	        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        f.setBackground(Color.GREEN);

	        JLabel msg = new JLabel("Copyright Reserver @ Omprakash");
	        f.add(msg, BorderLayout.SOUTH);

	        JTextField value = new JTextField(20);
	        f.add(value, BorderLayout.NORTH);

	        GridLayout gl = new GridLayout(4, 4);
	        JPanel p = new JPanel(gl);

	        // Adding buttons with sound effect on click
	        for (int i = 0; i <= 15; i++) {
	            JButton button = new JButton("" + i);
	            button.setBackground(Color.GREEN);
	            button.addActionListener(new SoundEffectListener());
	            p.add(button);
	        }

	        f.add(p);
	        f.setVisible(true);
	    }

	    static class SoundEffectListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            playButtonClickSound();
	        }

	        private void playButtonClickSound() {
	            try {
	                String soundName = "D:\\Eclipse workspace\\Advance Java\\src\\GUI\\sound.wav"; // Replace with the actual path to your sound file
	                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
	                Clip clip = AudioSystem.getClip();
	                clip.open(audioInputStream);
	                clip.start();
	            } catch (Exception ex) {
	                System.out.println("Error with playing sound.");
	                ex.printStackTrace();
	            }
	        }
	    }
	}
