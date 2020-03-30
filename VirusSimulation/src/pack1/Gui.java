package pack1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.*;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Gui {

	public Gui(String title) {
		
		//jf1
		Var.jf1 = new JFrame();
		Var.jf1.setTitle(title);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		Var.jf1.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setResizable(true);
		
		//label1
		Var.l1 = new Label();
		Var.l1.setLayout(Var.gbl);
		Var.jf1.add(Var.l1);
		Var.jf1.setVisible(true);
		
		//GBC
		Var.gbc.insets = new Insets(5, 5, 5, 5);
		Var.gbc.fill = GridBagConstraints.HORIZONTAL;
	
		// init
		initHeading();
		initQuestions();
		initTextfields();
		initTags();
		initCalculateButton();
		initButtons();
		
		// heading
		addElementPosition(0, 0, 5, 1, Var.heading);

		// first rows
		addElementPosition(0, 1, 1, 1, Var.name);
		addElementPosition(0, 2, 1, 1, Var.date);
		addElementPosition(0, 3, 1, 1, Var.country);
		addElementPosition(0, 4, 1, 1, Var.infectionRate);
		addElementPosition(0, 5, 1, 1, Var.mortalityRate);
		addElementPosition(0, 6, 1, 1, Var.vaccineAvailable);
		addElementPosition(0, 7, 1, 1, Var.incubationPeriod);

		// infectionRate
		addElementPosition(1, 4, 1, 1, Var.low);
		addElementPosition(2, 4, 1, 1, Var.medium);
		addElementPosition(3, 4, 1, 1, Var.high);

		// Vaccine?
		addElementPosition(1, 6, 1, 1, Var.yes);
		addElementPosition(3, 6, 1, 1, Var.no);

		// calculate
		addElementPosition(4, 7, 1, 1, Var.calculate);

		// textfields
		addElementPositionTextfield(1, 1, 3, 1, Var.nameInput);
		addElementPositionTextfield(1, 2, 3, 1, Var.dateInput);
		addElementPositionTextfield(1, 3, 1, 1, Var.countryInput);
		addElementPositionTextfield(3, 3, 1, 1, Var.cityInput);
		addElementPositionTextfield(1, 5, 3, 1, Var.mortalityInput);
		addElementPositionTextfield(1, 7, 3, 1, Var.incubationInput);
		Var.jf1.pack();
		Var.jf1.setVisible(true);
	}


	private void addElementPositionTextfield(int gridx, int gridy, int gridwidth, int gridheight, Component element) {
		Var.gbc.gridx = gridx;
		Var.gbc.gridy = gridy;
		Var.gbc.gridwidth = gridwidth;
		Var.gbc.gridheight = gridheight;
		Var.gbc.fill = GridBagConstraints.BOTH;
		Var.gbl.setConstraints(element, Var.gbc);

		Var.l1.add(element);
	}

	private void initTags() {
		initTagsAppereance(Var.low);
		initTagsAppereance(Var.high);
		initTagsAppereance(Var.medium);
	}

	private void initTagsAppereance(JButton tag) {
		// panel
		tag.setOpaque(true);
		tag.setBackground(Color.DARK_GRAY);
		tag.setBorder(new LineBorder(Color.white));

		// font
		Font font = new Font("Papyrus", Font.PLAIN, 20);
		tag.setFont(font);
		tag.setForeground(Color.white);
		tag.setVerticalAlignment(JLabel.CENTER);
		tag.setHorizontalAlignment(JLabel.CENTER);

	}

	private void initTextfieldAppereance(JTextField text) {
		Font font = new Font("Papyrus", Font.BOLD, 18);
		text.setBackground(new Color(55, 55, 190, 130));
		text.setFont(font);
		text.setForeground(Color.white);
		
		text.setVisible(true);

	}

	private void initTextfields() {
		initTextfieldAppereance(Var.nameInput);
		initTextfieldAppereance(Var.dateInput);
		initTextfieldAppereance(Var.countryInput);
		initTextfieldAppereance(Var.cityInput);
		initTextfieldAppereance(Var.mortalityInput);
		initTextfieldAppereance(Var.incubationInput);
	}

	private void initHeading() {
		// panel
		Var.heading = new JLabel("Simulation of virus spread");
		// heading.setPreferredSize(new Dimension(450, 50));
		Var.heading.setOpaque(true);
		Var.heading.setBackground(new Color (20, 20, 200, 130));
		Var.heading.setBorder(new LineBorder(Color.white, 2, true));
		//Var.heading.setBorder(new LineBorder(Color.white, 3));

		// font
		Font font = new Font("Papyrus", Font.BOLD, 30);
		Var.heading.setFont(font);
		Var.heading.setForeground(Color.white);
		Var.heading.setVerticalAlignment(JLabel.CENTER);
		Var.heading.setHorizontalAlignment(JLabel.CENTER);

		Var.heading.setVisible(true);
	}

	private void initQuestionAppereance(JLabel name) {
		// panel
		name.setOpaque(true);
		name.setBackground(Color.darkGray);
		name.setBorder(new LineBorder(Color.white));

		// font
		Font font = new Font("Papyrus", Font.PLAIN, 20);
		name.setFont(font);
		name.setForeground(Color.white);
		name.setVerticalAlignment(JLabel.CENTER);
		name.setHorizontalAlignment(JLabel.CENTER);

		name.setVisible(true);
	}

	private void initQuestions() {
		for (final JLabel element : addQuestions()) {
			initQuestionAppereance(element);
		}
	}

	private void initCalculateButton() {
		// panel
		Var.calculate.setOpaque(true);
//		Var.calculate.set
		Var.calculate.setBackground(new Color(213, 134, 145, 123));
		//Var.calculate.setBackground(Color.GREEN);
		Var.calculate.setBorder(new LineBorder(Color.white));
		
		//Var.calculate.setContentAreaFilled(false);

		// font
		Font font = new Font("Papyrus", Font.PLAIN, 20);
		Var.calculate.setFont(font);
		Var.calculate.setForeground(Color.white);
		Var.calculate.setVerticalAlignment(JLabel.CENTER);
		Var.calculate.setHorizontalAlignment(JLabel.CENTER);

		Var.calculate.setVisible(true);
	}

	private void initButtons() {
		initButtonAppereance(Var.yes);
		initButtonAppereance(Var.no);
		initButtonAppereance(Var.high);
		initButtonAppereance(Var.medium);
		initButtonAppereance(Var.low);
	}

	private void initButtonAppereance(JButton button) {
		// panel
		button.setOpaque(true);
		button.setBackground(new Color(30, 30, 200, 130));
		button.setBorder(new LineBorder(Color.white, 2, true));

		// font
		Font font = new Font("Papyrus", Font.PLAIN, 20);
		button.setFont(font);
		button.setForeground(Color.white);
		button.setVerticalAlignment(JLabel.CENTER);
		button.setHorizontalAlignment(JLabel.CENTER);

		button.setVisible(true);
	}

	private LinkedList<JLabel> addQuestions() {
		LinkedList<JLabel> questionList = new LinkedList<JLabel>();
		questionList.add(Var.name);
		questionList.add(Var.date);
		questionList.add(Var.country);
		questionList.add(Var.infectionRate);
		questionList.add(Var.mortalityRate);
		questionList.add(Var.vaccineAvailable);
		questionList.add(Var.incubationPeriod);
		return questionList;
	}

	private void addElementPosition(int gridx, int gridy, int gridwidth, int gridheight, Component element) {
		Var.gbc.gridx = gridx;
		Var.gbc.gridy = gridy;
		Var.gbc.gridwidth = gridwidth;
		Var.gbc.gridheight = gridheight;
		Var.gbl.setConstraints(element, Var.gbc);
		Var.l1.add(element);
		Var.jf1.pack();
	}


}
