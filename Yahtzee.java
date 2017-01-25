import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Yahtzee {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);

		Roll[] rolls = new Roll[5];

		for (int i = 0; i < 5; i++) {
			JLabel l = new JLabel();
			rolls[i] = new Roll(l);
			frame.add(l);
		}

		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(rolls[i]);
			t.start();
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				;
			}
		}

	}
}

