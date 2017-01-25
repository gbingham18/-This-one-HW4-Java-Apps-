import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Roll implements Runnable {
	private JLabel _label;

	public Roll(JLabel label) {
		_label = label;
	}

	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		URL imgUrl = getClass().getResource("/Resource/1c.gif");
		URL imgUrl2 = getClass().getResource("/Resource/die_02_42159_sm.gif");
		URL imgUrl3 = getClass().getResource("/Resource/3c.gif");
		URL imgUrl4 = getClass().getResource("/Resource/die_04_42161_mth.gif");
		URL imgUrl5 = getClass().getResource("/Resource/Dice5.jpg");
		URL imgUrl6 = getClass().getResource("/Resource/6-clipart-1.gif");
		Image img = toolkit.getImage(imgUrl);
		Image img2 = toolkit.getImage(imgUrl2);
		Image img3 = toolkit.getImage(imgUrl3);
		Image img4 = toolkit.getImage(imgUrl4);
		Image img5 = toolkit.getImage(imgUrl5);
		Image img6 = toolkit.getImage(imgUrl6);
		img = img.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		img2 = img2.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		img3 = img3.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		img4 = img4.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		img5 = img5.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		img6 = img6.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		ImageIcon[] Images = new ImageIcon[6];
		ImageIcon icon = new ImageIcon(img);
		Images[0] = icon;
		ImageIcon icon2 = new ImageIcon(img2);
		Images[1] = icon2;
		ImageIcon icon3 = new ImageIcon(img3);
		Images[2] = icon3;
		ImageIcon icon4 = new ImageIcon(img4);
		Images[3] = icon4;
		ImageIcon icon5 = new ImageIcon(img5);
		Images[4] = icon5;
		ImageIcon icon6 = new ImageIcon(img6);
		Images[5] = icon6;
		for (int i = 15; i > 0; i--) {
			Random rand = new Random();
			int x = rand.nextInt(6) + 1;
			_label.setIcon(Images[x - 1]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				;
			}
		}
	}
}

