package pack1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Var {

	static JFrame jf1;
	static Label l1;

	static int screenwidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	static int screenheight = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	static int backgroundX1 = -screenwidth;
	static int backgroundX2 = 0;

	static BufferedImage background1;
	static BufferedImage background2;

	static GridBagLayout gbl = new GridBagLayout();
	static GridBagConstraints gbc = new GridBagConstraints();

	static JLabel heading;
	static JLabel name = new JLabel("Name of the virus:");
	static JLabel date = new JLabel("When did the virus break out for the first time?");
	static JLabel country = new JLabel("Where was the first infected person?");
	static JLabel infectionRate = new JLabel("Infection rate:");
	static JLabel mortalityRate = new JLabel("Mortality rate:");
	static JLabel vaccineAvailable = new JLabel("Vaccine Available?");
	static JLabel incubationPeriod = new JLabel("Incubation period:");

	static JButton low = new JButton("low");
	static JButton medium = new JButton("medium");
	static JButton high = new JButton("high");

	static JButton yes = new JButton("yes");
	static JButton no = new JButton("no");

	static JButton calculate = new JButton("calculate!");

	static JTextField nameInput = new JTextField(0);
	static JTextField dateInput = new JTextField(0);
	static JTextField countryInput = new JTextField(0);
	static JTextField cityInput = new JTextField(0);
	static JTextField mortalityInput = new JTextField(0);
	static JTextField incubationInput = new JTextField(0);

	static int backgroundspeed = 60;

	public Var() {
		try {
			background1 = ImageIO.read(new File("Corona1.jpg"));
			System.out.println("found1");
		} catch (IOException exc) {
			exc.printStackTrace();
			System.out.println("error!");
		}

		try {
			background2 = ImageIO.read(new File("Corona2.jpg"));
			System.out.println("found2");
		} catch (IOException exc) {
			exc.printStackTrace();
			System.out.println("error!");
		}
	}
}
