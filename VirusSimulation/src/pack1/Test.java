package pack1;

import java.awt.Color;
import java.awt.Component;

import java.awt.Font;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Test extends JFrame {
	
	Label l2 = new Label();
//	public Test(String title) {
//		this.setTitle(title);
//		this.add(l2);		
//		this.add(new Screen());
//		
//		this.setLayout(null);
//		this.setVisible(true);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
//	}
	
	class Screen extends JPanel {

//		private GridBagLayout gbl = new GridBagLayout();
//		private GridBagConstraints gbc = new GridBagConstraints();
//
//		private JLabel heading;
//		private JLabel name = new JLabel("Name of the virus:");
//		private JLabel date = new JLabel("When did the virus break out for the first time?");
//		private JLabel country = new JLabel("Where was the first infected person?");
//		private JLabel infectionRate = new JLabel("Infection rate:");
//		private JLabel mortalityRate = new JLabel("Mortality rate:");
//		private JLabel vaccineAvailable = new JLabel("Vaccine Available?");
//		private JLabel incubationPeriod = new JLabel("Incubation period:");
//
//		private JButton low = new JButton("low");
//		private JButton medium = new JButton("medium");
//		private JButton high = new JButton("high");
//
//		private JButton yes = new JButton("yes");
//		private JButton no = new JButton("no");
//
//		private JButton calculate = new JButton("calculate!");
//
//		private JTextField nameInput = new JTextField(0);
//		private JTextField dateInput = new JTextField(0);
//		private JTextField countryInput = new JTextField(0);
//		private JTextField cityInput = new JTextField(0);
//		private JTextField mortalityInput = new JTextField(0);
//		private JTextField incubationInput = new JTextField(0);

//		public Screen() {
//
//			setSize((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() - 5,
//					(int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 15);
//			setResizable(true);
//			setLocationRelativeTo(null);
//			setLayout(gbl);
			
//			gbc.insets = new Insets(5, 5, 5, 5);
//			gbc.fill = GridBagConstraints.HORIZONTAL;

			// init
//			initHeading();
//			initQuestions();
//			initTextfields();
//			initTags();
//			initCalculateButton();
//			initButtons();

//			// heading
//			addElementPosition(0, 0, 5, 1, heading);
//
//			// first rows
//			addElementPosition(0, 1, 1, 1, name);
//			addElementPosition(0, 2, 1, 1, date);
//			addElementPosition(0, 3, 1, 1, country);
//			addElementPosition(0, 4, 1, 1, infectionRate);
//			addElementPosition(0, 5, 1, 1, mortalityRate);
//			addElementPosition(0, 6, 1, 1, vaccineAvailable);
//			addElementPosition(0, 7, 1, 1, incubationPeriod);
//
//			// infectionRate
//			addElementPosition(1, 4, 1, 1, low);
//			addElementPosition(2, 4, 1, 1, medium);
//			addElementPosition(3, 4, 1, 1, high);
//
//			// Vaccine?
//			addElementPosition(1, 6, 1, 1, yes);
//			addElementPosition(3, 6, 1, 1, no);
//
//			// calculate
//			addElementPosition(4, 7, 1, 1, calculate);
//
//			System.out.println(dateInput);
//			// textfields
//			addElementPositionTextfield(1, 1, 3, 1, nameInput);
//			addElementPositionTextfield(1, 2, 3, 1, dateInput);
//			addElementPositionTextfield(1, 3, 1, 1, countryInput);
//			addElementPositionTextfield(3, 3, 1, 1, cityInput);
//			addElementPositionTextfield(1, 5, 3, 1, mortalityInput);
//			addElementPositionTextfield(1, 7, 3, 1, incubationInput);
////			pack();
//			setVisible(true);
//
//		}

//		private LinkedList<JLabel> addQuestions() {
//			LinkedList<JLabel> questionList = new LinkedList<JLabel>();
//			questionList.add(name);
//			questionList.add(date);
//			questionList.add(country);
//			questionList.add(infectionRate);
//			questionList.add(mortalityRate);
//			questionList.add(vaccineAvailable);
//			questionList.add(incubationPeriod);
//			return questionList;
//		}
//
//		private void addElementPosition(int gridx, int gridy, int gridwidth, int gridheight, Component element) {
//			gbc.gridx = gridx;
//			gbc.gridy = gridy;
//			gbc.gridwidth = gridwidth;
//			gbc.gridheight = gridheight;
//			gbl.setConstraints(element, gbc);
//			add(element);
////			pack();
//		}
//
//		private void addElementPositionTextfield(int gridx, int gridy, int gridwidth, int gridheight,
//				Component element) {
//			gbc.gridx = gridx;
//			gbc.gridy = gridy;
//			gbc.gridwidth = gridwidth;
//			gbc.gridheight = gridheight;
//			gbc.fill = GridBagConstraints.BOTH;
//			gbl.setConstraints(element, gbc);
//
//			add(element);
////			pack();
//		}
//
//		private void initTags() {
//			initTagsAppereance(low);
//			initTagsAppereance(high);
//			initTagsAppereance(medium);
//		}
//
//		private void initTagsAppereance(JButton tag) {
//			// panel
//			tag.setOpaque(true);
//			tag.setBackground(Color.DARK_GRAY);
//			tag.setBorder(new LineBorder(Color.white));
//
//			// font
//			Font font = new Font("Papyrus", Font.PLAIN, 20);
//			tag.setFont(font);
//			tag.setForeground(Color.white);
//			tag.setVerticalAlignment(JLabel.CENTER);
//			tag.setHorizontalAlignment(JLabel.CENTER);
//
//		}
//
//		private void initTextfieldAppereance(JTextField text) {
//			text = new JTextField(1);
//			text.setOpaque(true);
//			text.setBackground(Color.green);
//			text.setVisible(true);
//
//		}
//
//		private void initTextfields() {
//			initTextfieldAppereance(nameInput);
//			initTextfieldAppereance(dateInput);
//			initTextfieldAppereance(countryInput);
//			initTextfieldAppereance(cityInput);
//			initTextfieldAppereance(mortalityInput);
//			initTextfieldAppereance(incubationInput);
//		}
//
//		private void initHeading() {
//			// panel
//			heading = new JLabel("Simulation of virus spread");
//			// heading.setPreferredSize(new Dimension(450, 50));
//			heading.setOpaque(true);
//			heading.setBackground(Color.blue);
//			heading.setBorder(new LineBorder(Color.white, 3));
//
//			// font
//			Font font = new Font("Papyrus", Font.BOLD, 30);
//			heading.setFont(font);
//			heading.setForeground(Color.white);
//			heading.setVerticalAlignment(JLabel.CENTER);
//			heading.setHorizontalAlignment(JLabel.CENTER);
//
//			heading.setVisible(true);
//		}
//
//		private void initQuestionAppereance(JLabel name) {
//			// panel
//			name.setOpaque(true);
//			name.setBackground(Color.darkGray);
//			name.setBorder(new LineBorder(Color.white));
//
//			// font
//			Font font = new Font("Papyrus", Font.PLAIN, 20);
//			name.setFont(font);
//			name.setForeground(Color.white);
//			name.setVerticalAlignment(JLabel.CENTER);
//			name.setHorizontalAlignment(JLabel.CENTER);
//
//			name.setVisible(true);
//		}
//
//		private void initQuestions() {
//			for (final JLabel element : addQuestions()) {
//				initQuestionAppereance(element);
//			}
//		}
//
//		private void initCalculateButton() {
//			// panel
//			calculate.setOpaque(true);
//			calculate.setBackground(Color.GREEN);
//			calculate.setBorder(new LineBorder(Color.white));
//
//			// font
//			Font font = new Font("Papyrus", Font.PLAIN, 20);
//			calculate.setFont(font);
//			calculate.setForeground(Color.white);
//			calculate.setVerticalAlignment(JLabel.CENTER);
//			calculate.setHorizontalAlignment(JLabel.CENTER);
//
//			calculate.setVisible(true);
//		}
//
//		private void initButtons() {
//			initButtonAppereance(yes);
//			initButtonAppereance(no);
//			initButtonAppereance(high);
//			initButtonAppereance(medium);
//			initButtonAppereance(low);
//		}
//
//		private void initButtonAppereance(JButton button) {
//			// panel
//			button.setOpaque(true);
//			button.setBackground(Color.blue);
//			button.setBorder(new LineBorder(Color.white));
//
//			// font
//			Font font = new Font("Papyrus", Font.PLAIN, 20);
//			button.setFont(font);
//			button.setForeground(Color.white);
//			button.setVerticalAlignment(JLabel.CENTER);
//			button.setHorizontalAlignment(JLabel.CENTER);
//
//			button.setVisible(true);
//		}
	
}
