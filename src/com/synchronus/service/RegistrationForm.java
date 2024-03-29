package com.synchronus.service;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import com.synchronus.dao.InsertIntoDataBase;
import com.toedter.calendar.JDateChooser;

import rojerusan.RSMaterialButtonRectangle;
import rojerusan.RSPasswordTextPlaceHolder;

public class RegistrationForm extends JFrame {
	private JTextField contactNo;
	private JTextField emailID;
	private JTextField lastName;
	private ArrayList<String> aList = new ArrayList<String>();
	public String firstNameString = null;
	private String lastNameString = null;
	private String contactString = null;
	private String emailString = null;
	private String DOB = null;
	private String genderString = null;
	private String addreString = null;
	private String passwordString = null;
	private int rowCount;
	private JTextField firstName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm frame = new RegistrationForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationForm() {
		getContentPane().setBackground(new Color(176, 224, 230));
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.textHighlight));
		panel.setForeground(SystemColor.textHighlight);
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(0, 0, 848, 493);
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		panel.setLayout(null);

		ButtonGroup g1 = new ButtonGroup();

		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 112, 192));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(235, 12, 351, 53);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(37, 76, 80, 23);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Contact No.");
		lblNewLabel_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(37, 180, 93, 23);
		panel.add(lblNewLabel_1_1);

		contactNo = new JTextField();
		contactNo.setForeground(SystemColor.textHighlight);
		contactNo.setBorder(new LineBorder(SystemColor.textHighlight));
		contactNo.setColumns(10);
		contactNo.setBounds(37, 232, 172, 29);
		panel.add(contactNo);

		JLabel lblNewLabel_1_2 = new JLabel("Email ID:");
		lblNewLabel_1_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(641, 272, 80, 23);
		panel.add(lblNewLabel_1_2);

		emailID = new JTextField();
		emailID.setForeground(SystemColor.textHighlight);
		emailID.setBorder(new LineBorder(SystemColor.textHighlight));
		emailID.setColumns(10);
		emailID.setBounds(641, 324, 172, 29);
		panel.add(emailID);

		JLabel lblNewLabel_1_3 = new JLabel("Last Name:");
		lblNewLabel_1_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(325, 76, 80, 23);
		panel.add(lblNewLabel_1_3);

		lastName = new JTextField();
		lastName.setForeground(SystemColor.textHighlight);
		lastName.setBorder(new LineBorder(SystemColor.textHighlight));
		lastName.setColumns(10);
		lastName.setBounds(325, 127, 172, 29);
		panel.add(lastName);

		JSeparator separator = new JSeparator();
		separator.setBounds(37, 97, 1, 2);
		panel.add(separator);

		JLabel lblNewLabel_1_4 = new JLabel("Gender:");
		lblNewLabel_1_4.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(37, 272, 80, 23);
		panel.add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("Address:");
		lblNewLabel_1_5.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(325, 272, 80, 23);
		panel.add(lblNewLabel_1_5);

		JTextArea address = new JTextArea();
		address.setForeground(SystemColor.textHighlight);
		address.setBorder(new LineBorder(SystemColor.textHighlight));
		address.setBounds(325, 324, 172, 75);
		panel.add(address);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.activeCaption);
		separator_1.setBackground(SystemColor.textHighlight);
		separator_1.setBounds(37, 97, 172, 2);
		panel.add(separator_1);

		JLabel contactNoError = new JLabel("*Incorrect No.");
		contactNoError.setVisible(false);
		contactNoError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contactNoError.setForeground(Color.RED);
		contactNoError.setBounds(37, 214, 172, 14);
		panel.add(contactNoError);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 493);
		setLocationRelativeTo(null);
		setUndecorated(true);

		JLabel emailError = new JLabel("*Invalid Email");
		emailError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emailError.setForeground(Color.RED);
		emailError.setVisible(false);
		emailError.setBounds(641, 306, 172, 14);
		panel.add(emailError);

		JButton btnNewButton_2 = new JButton("X");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(255, 51, 51));
		btnNewButton_2.setBounds(800, 0, 48, 29);
		panel.add(btnNewButton_2);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setBorder(new LineBorder(new Color(0, 120, 215)));
		dateChooser.setBorder(new LineBorder(new Color(0, 120, 215)));
		dateChooser.setDateFormatString("yyyy-MM-dd");

		dateChooser.setBounds(641, 127, 172, 29);
		panel.add(dateChooser);

		JLabel lblNewLabel_1_3_1 = new JLabel("DOB:");
		lblNewLabel_1_3_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_3_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(641, 76, 80, 23);
		panel.add(lblNewLabel_1_3_1);

		JRadioButton maleRButton = new JRadioButton("Male");
		maleRButton.setForeground(SystemColor.textHighlight);
		maleRButton.setBackground(SystemColor.inactiveCaptionBorder);
		maleRButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		g1.add(maleRButton);
		maleRButton.setBounds(37, 318, 109, 23);
		panel.add(maleRButton);

		JRadioButton femaleRButton = new JRadioButton("Female");
		femaleRButton.setForeground(SystemColor.textHighlight);
		femaleRButton.setBackground(SystemColor.inactiveCaptionBorder);
		femaleRButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		g1.add(femaleRButton);
		femaleRButton.setBounds(37, 340, 109, 23);
		panel.add(femaleRButton);

		JRadioButton transRButton = new JRadioButton("Trans");
		transRButton.setForeground(SystemColor.textHighlight);
		transRButton.setBackground(SystemColor.inactiveCaptionBorder);
		transRButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		g1.add(transRButton);
		transRButton.setBounds(37, 362, 109, 23);
		panel.add(transRButton);

		JLabel firstNameError = new JLabel("*Enter First Name");
		firstNameError.setVisible(false);
		firstNameError.setForeground(Color.RED);
		firstNameError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		firstNameError.setBounds(37, 110, 172, 14);
		panel.add(firstNameError);

		JLabel lastNameError = new JLabel("*Enter Last Name");
		lastNameError.setVisible(false);
		lastNameError.setForeground(Color.RED);
		lastNameError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lastNameError.setBounds(325, 110, 172, 14);
		panel.add(lastNameError);

		JLabel genderError = new JLabel("*Choose a Gender.");
		genderError.setVisible(false);
		genderError.setForeground(Color.RED);
		genderError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		genderError.setBounds(37, 306, 172, 14);
		panel.add(genderError);

		JLabel addressError = new JLabel("*Enter a Address.");
		addressError.setVisible(false);
		addressError.setForeground(Color.RED);
		addressError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addressError.setBounds(325, 306, 172, 14);
		panel.add(addressError);

		JLabel dateError = new JLabel("*Select a Date");
		dateError.setVisible(false);
		dateError.setForeground(Color.RED);
		dateError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dateError.setBounds(641, 110, 172, 14);
		panel.add(dateError);

		JLabel passwordError = new JLabel("*Enter a Password");
		passwordError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordError.setVisible(false);
		passwordError.setForeground(Color.RED);
		passwordError.setBounds(325, 214, 172, 14);
		panel.add(passwordError);

		JLabel confirmPasswordError = new JLabel("*Password doesn't match");
		confirmPasswordError.setVisible(false);
		confirmPasswordError.setForeground(Color.RED);
		confirmPasswordError.setBounds(641, 214, 172, 14);
		panel.add(confirmPasswordError);

		RSPasswordTextPlaceHolder password = new RSPasswordTextPlaceHolder();
		password.setBorder(new LineBorder(new Color(0, 120, 215)));
		password.setBounds(326, 230, 172, 29);
		panel.add(password);

		firstName = new JTextField();
		firstName.setForeground(SystemColor.textHighlight);
		firstName.setColumns(10);
		firstName.setBorder(new LineBorder(SystemColor.textHighlight));
		firstName.setBounds(37, 127, 172, 29);
		panel.add(firstName);

		RSPasswordTextPlaceHolder confirmPassword = new RSPasswordTextPlaceHolder();
		confirmPassword.setBorder(new LineBorder(new Color(0, 120, 215)));
		confirmPassword.setBounds(641, 230, 172, 29);
		panel.add(confirmPassword);

		RSMaterialButtonRectangle mtrlbtnrctnglSubmit = new RSMaterialButtonRectangle();
		mtrlbtnrctnglSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Pattern patternFirstNamePattern = Pattern.compile("^[A-Za-z]\\w{5,29}$");
				Matcher matcherFirstNameMatcher = patternFirstNamePattern.matcher(firstName.getText());
				boolean fName = false, lName, dob, mobileBoolean, passwordBoolean, confirmPassBoolean, genderBoolean,
						addressBoolean, emailBoolean;
				if (firstName.getText().equals("")) {
					firstNameError.setText("*First Name cannot be empty");
					firstNameError.setVisible(true);
				} else if (!(matcherFirstNameMatcher.find()
						&& matcherFirstNameMatcher.group().equals(firstName.getText()))) {
					firstNameError.setText("*Can't start with a number");
					firstNameError.setVisible(true);
					fName = false;
				} else {
					firstNameError.setVisible(false);
					fName = true;
				}

				Matcher lastNameMatcher = patternFirstNamePattern.matcher(lastName.getText());

				if (lastName.getText().equals("")) {
					lastNameError.setText("*First Name cannot be empty");
					lastNameError.setVisible(true);
					lName = false;
				} else {
					lastNameError.setVisible(false);
					lName = true;
				}

				if (address.getText().equals("")) {
					addressError.setVisible(true);
					addressBoolean = false;
				} else {
					addressError.setVisible(false);
					addressBoolean = true;
				}

				if ((maleRButton.isSelected() == false) && (femaleRButton.isSelected() == false)
						&& (transRButton.isSelected() == false)) {
					genderError.setVisible(true);
					genderBoolean = false;
				} else {
					genderError.setVisible(false);
					genderBoolean = true;
				}

				if (((JTextField) dateChooser.getDateEditor().getUiComponent()).getText().isEmpty()) {
					dateError.setVisible(true);
					dob = false;
				} else {
					dateError.setVisible(false);
					dob = true;

				}

				Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
				Matcher matcher = pattern.matcher(contactNo.getText());
				if (!(matcher.find() && matcher.group().equals(contactNo.getText()))) {

					contactNoError.setVisible(true);
					mobileBoolean = false;
				} else {
					contactNoError.setVisible(false);
					mobileBoolean = true;
				}

				pattern = Pattern.compile("[a-zA-Z||0-9]{3,20}@[A-Za-z]{3,10}.(com|in)");
				matcher = pattern.matcher(emailID.getText());

				if (!(matcher.find() && matcher.group().equals(emailID.getText()))) {

					emailError.setVisible(true);
					emailBoolean = false;
					;
				} else {
					contactNoError.setVisible(false);
					emailBoolean = true;
				}
				char pass[] = password.getPassword();
				passwordString = new String(pass);
				System.out.println(passwordString);

				if (passwordString.equals("")) {
					passwordError.setVisible(true);
					passwordBoolean = false;
				} else {
					passwordError.setVisible(false);
					passwordBoolean = true;
				}
				char confirmPass[] = confirmPassword.getPassword();
				String tempString = new String(confirmPass);

				if ((tempString.equals(passwordString))) {
					confirmPasswordError.setVisible(false);
					confirmPassBoolean = true;
				} else {
					confirmPasswordError.setVisible(true);
					confirmPassBoolean = false;
				}
				maleRButton.setActionCommand("Male");
				femaleRButton.setActionCommand("Female");
				transRButton.setActionCommand("Trans");
				firstNameString = firstName.getText();
				lastNameString = lastName.getText();
				DOB = dateChooser.getDate().toString();
				System.out.println(DOB);
				contactString = contactNo.getText();
				emailString = emailID.getText();
				addreString = address.getText();
				genderString = g1.getSelection().getActionCommand();
				addreString = address.getText();

				aList.add(firstNameString);
				aList.add(lastNameString);
				aList.add(DOB);
				aList.add(contactString);
				aList.add(emailString);
				aList.add(passwordString);
				aList.add(genderString);
				aList.add(addreString);

				InsertIntoDataBase insertIntoDataBase = new InsertIntoDataBase();
				rowCount = insertIntoDataBase.insertIntoDataBase(aList);
				if (fName && emailBoolean && lName && dob && mobileBoolean && passwordBoolean && confirmPassBoolean
						&& genderBoolean && addressBoolean) {
					LoginPage loginPage = new LoginPage();
					loginPage.setVisible(true);
					setVisible(false);
				}
			}
		});
		mtrlbtnrctnglSubmit.setText("SUBMIT");
		mtrlbtnrctnglSubmit.setBounds(293, 424, 102, 45);
		panel.add(mtrlbtnrctnglSubmit);

		RSMaterialButtonRectangle mtrlbtnrctnglClear = new RSMaterialButtonRectangle();
		mtrlbtnrctnglClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstName.setText("");
				lastName.setText("");
				dateChooser.setDate(null);
				contactNo.setText("");
				emailID.setText("");
				password.setText("");
				confirmPassword.setText("");
				g1.clearSelection();
				address.setText("");
			}
		});
		mtrlbtnrctnglClear.setText("CLEAR");
		mtrlbtnrctnglClear.setBounds(425, 424, 102, 45);
		panel.add(mtrlbtnrctnglClear);

		JLabel lblNewLabel_1_1_1 = new JLabel("Password:");
		lblNewLabel_1_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(325, 180, 93, 23);
		panel.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Confirm Password:");
		lblNewLabel_1_1_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(641, 180, 141, 23);
		panel.add(lblNewLabel_1_1_1_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(SystemColor.activeCaption);
		separator_1_1.setBackground(SystemColor.textHighlight);
		separator_1_1.setBounds(325, 97, 172, 2);
		panel.add(separator_1_1);

		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(SystemColor.activeCaption);
		separator_1_2.setBackground(SystemColor.textHighlight);
		separator_1_2.setBounds(37, 201, 172, 2);
		panel.add(separator_1_2);

		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setForeground(SystemColor.activeCaption);
		separator_1_3.setBackground(SystemColor.textHighlight);
		separator_1_3.setBounds(641, 293, 172, 2);
		panel.add(separator_1_3);

		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setForeground(SystemColor.activeCaption);
		separator_1_4.setBackground(SystemColor.textHighlight);
		separator_1_4.setBounds(37, 293, 172, 2);
		panel.add(separator_1_4);

		JSeparator separator_1_5 = new JSeparator();
		separator_1_5.setForeground(SystemColor.activeCaption);
		separator_1_5.setBackground(SystemColor.textHighlight);	
		separator_1_5.setBounds(325, 293, 172, 2);
		panel.add(separator_1_5);

		JSeparator separator_1_6 = new JSeparator();
		separator_1_6.setForeground(SystemColor.activeCaption);
		separator_1_6.setBackground(SystemColor.textHighlight);
		separator_1_6.setBounds(641, 97, 172, 2);
		panel.add(separator_1_6);

		JSeparator separator_1_7 = new JSeparator();
		separator_1_7.setForeground(SystemColor.activeCaption);
		separator_1_7.setBackground(SystemColor.textHighlight);
		separator_1_7.setBounds(325, 201, 172, 2);
		panel.add(separator_1_7);

		JSeparator separator_1_8 = new JSeparator();
		separator_1_8.setForeground(SystemColor.activeCaption);
		separator_1_8.setBackground(SystemColor.textHighlight);
		separator_1_8.setBounds(641, 201, 172, 2);
		panel.add(separator_1_8);

	}
}
