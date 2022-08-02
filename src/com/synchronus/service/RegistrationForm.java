package com.synchronus.service;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import rojerusan.RSButtonMetro;
import rojerusan.RSMaterialButtonRectangle;

public class RegistrationForm extends JFrame {
	private JTextField firstName;
	private JTextField contactNo;
	private JTextField emailID;
	private JTextField lastName;

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
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 112, 192), 2));
		panel.setForeground(SystemColor.textHighlightText);
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 848, 493);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		ButtonGroup g1 = new ButtonGroup();
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setForeground(new Color(0, 112, 192));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(318, 11, 196, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 76, 80, 23);
		panel.add(lblNewLabel_1);
		
		firstName = new JTextField();
		firstName.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), UIManager.getBorder("Button.border")));
		firstName.setBounds(10, 127, 114, 29);
		panel.add(firstName);
		firstName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact No.");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 180, 93, 23);
		panel.add(lblNewLabel_1_1);
		
		contactNo = new JTextField();
		contactNo.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), UIManager.getBorder("Button.border")));
		contactNo.setColumns(10);
		contactNo.setBounds(10, 232, 114, 29);
		panel.add(contactNo);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email ID:");
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(206, 180, 80, 23);
		panel.add(lblNewLabel_1_2);
		
		emailID = new JTextField();
		emailID.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2), UIManager.getBorder("Button.border")));
		emailID.setColumns(10);
		emailID.setBounds(206, 232, 183, 29);
		panel.add(emailID);
		
		JLabel lblNewLabel_1_3 = new JLabel("Last Name:");
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(206, 76, 80, 23);
		panel.add(lblNewLabel_1_3);
		
		lastName = new JTextField();
		lastName.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), UIManager.getBorder("Button.border")));
		lastName.setColumns(10);
		lastName.setBounds(206, 127, 114, 29);
		panel.add(lastName);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 97, 1, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gender:");
		lblNewLabel_1_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(10, 272, 80, 23);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Address:");
		lblNewLabel_1_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(206, 272, 80, 23);
		panel.add(lblNewLabel_1_5);
		
		JTextArea address = new JTextArea();
		address.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2), UIManager.getBorder("Button.border")));
		address.setBounds(206, 324, 183, 75);
		panel.add(address);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(10, 97, 93, 2);
		panel.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(206, 97, 93, 2);
		panel.add(separator_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBackground(Color.BLACK);
		separator_1_2.setBounds(10, 201, 93, 2);
		panel.add(separator_1_2);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setBackground(Color.BLACK);
		separator_1_3.setBounds(206, 201, 93, 2);
		panel.add(separator_1_3);
		
		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setBackground(Color.BLACK);
		separator_1_4.setBounds(10, 294, 93, 2);
		panel.add(separator_1_4);
		
		JSeparator separator_1_5 = new JSeparator();
		separator_1_5.setBackground(Color.BLACK);
		separator_1_5.setBounds(206, 294, 93, 2);
		panel.add(separator_1_5);
		
		JLabel contactNoError = new JLabel("*Incorrect No.");
		contactNoError.setVisible(false);
		contactNoError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contactNoError.setForeground(Color.RED);
		contactNoError.setBounds(39, 214, 85, 14);
		panel.add(contactNoError);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 493);
		setUndecorated(true);
		
		JLabel emailError = new JLabel("*Invalid Email");
		emailError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emailError.setForeground(Color.RED);
		emailError.setVisible(false);
		emailError.setBounds(318, 214, 71, 14);
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
		dateChooser.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 1, true), UIManager.getBorder("Button.border")));
		
		dateChooser.setBounds(450, 127, 141, 29);
		panel.add(dateChooser);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("DOB:");
		lblNewLabel_1_3_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(450, 76, 80, 23);
		panel.add(lblNewLabel_1_3_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBackground(Color.BLACK);
		separator_1_1_1.setBounds(450, 97, 93, 2);
		panel.add(separator_1_1_1);
		
		JRadioButton maleRButton = new JRadioButton("Male");
		maleRButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		g1.add(maleRButton);
		maleRButton.setBounds(10, 318, 109, 23);
		panel.add(maleRButton);
		
		JRadioButton femaleRButton = new JRadioButton("Female");
		femaleRButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		g1.add(femaleRButton);
		femaleRButton.setBounds(10, 340, 109, 23);
		panel.add(femaleRButton);
		
		JRadioButton transRButton = new JRadioButton("Trans");
		transRButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		g1.add(transRButton);
		transRButton.setBounds(10, 362, 109, 23);
		panel.add(transRButton);
		
		JLabel firstNameError = new JLabel("*Enter First Name");
		firstNameError.setVisible(false);
		firstNameError.setForeground(Color.RED);
		firstNameError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		firstNameError.setBounds(39, 110, 93, 14);
		panel.add(firstNameError);
		
		JLabel lastNameError = new JLabel("*Enter Last Name");
		lastNameError.setVisible(false);
		lastNameError.setForeground(Color.RED);
		lastNameError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lastNameError.setBounds(229, 110, 85, 14);
		panel.add(lastNameError);
		
		JLabel genderError = new JLabel("*Choose a Gender.");
		genderError.setVisible(false);
		genderError.setForeground(Color.RED);
		genderError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		genderError.setBounds(41, 306, 102, 14);
		panel.add(genderError);
		
		JLabel addressError = new JLabel("*Enter a Address.");
		addressError.setVisible(false);
		addressError.setForeground(Color.RED);
		addressError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addressError.setBounds(296, 309, 93, 14);
		panel.add(addressError);
		
		JLabel dateError = new JLabel("*Select a Date");
		dateError.setVisible(false);
		dateError.setForeground(Color.RED);
		dateError.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dateError.setBounds(506, 110, 85, 14);
		panel.add(dateError);
		
		RSMaterialButtonRectangle mtrlbtnrctnglSubmit = new RSMaterialButtonRectangle();
		mtrlbtnrctnglSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean f1 , f2 ,f3 , f4 , f5 , f6 , f7;
				if (firstName.getText().equals("")) {
					firstNameError.setVisible(true);
					f3 = false;
				}else {
					firstNameError.setVisible(false);
					f3 = true;
				}
				
				if (lastName.getText().equals("")) {
					lastNameError.setVisible(true);
					f4 = false;
				}else {
					lastNameError.setVisible(false);
					f4 = true;
				}
				
				if (address.getText().equals("")) {
					addressError.setVisible(true);
					f5 = false;
				}else {
					addressError.setVisible(false);
					f5 = true;
				}
				
				if (!maleRButton.isSelected()) {
					genderError.setVisible(true);
					f6 = true;
				}else {
					genderError.setVisible(false);
					f6 = false;
				}
				if (!femaleRButton.isSelected()) {
					genderError.setVisible(true);
					f6 = true;
				}else {
					genderError.setVisible(false);
					f6 = false;
				}
				if (!transRButton.isSelected()) {
					genderError.setVisible(true);
					f6 = true;
				}else {
					genderError.setVisible(false);
					f6 = false;
				}
				if (((JTextField)dateChooser.getDateEditor().getUiComponent()).getText().isEmpty()){
					dateError.setVisible(true);
					f7 = true;
				} else {
					dateError.setVisible(false);
					f7 = false;
					
				}
				
				
				Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
				Matcher matcher = pattern.matcher(contactNo.getText());
				if (!(matcher.find()&&matcher.group().equals(contactNo.getText()))) {
					
					contactNoError.setVisible(true);
					f1 = false;;
				} else {
					contactNoError.setVisible(false);
					f1 = true;
				}
				
				pattern = Pattern.compile("[a-zA-Z||0-9]{3,20}@[A-Za-z]{3,10}.(com|in)");
				matcher = pattern.matcher(emailID.getText());
				
				if (!(matcher.find()&&matcher.group().equals(emailID.getText()))) {
					
					emailError.setVisible(true);
					f2 = false;;
				} else {
					contactNoError.setVisible(false);
					f2 = true;
				}
				if (f1 && f2 && f3 && f4 && f5 && f6 && f7) {
					LoginPage loginPage = new LoginPage();
					loginPage.setVisible(true);
					setVisible(false);
				}
			}
		});
		mtrlbtnrctnglSubmit.setText("SUBMIT");
		mtrlbtnrctnglSubmit.setBounds(31, 422, 102, 45);
		panel.add(mtrlbtnrctnglSubmit);
		
		RSMaterialButtonRectangle mtrlbtnrctnglClear = new RSMaterialButtonRectangle();
		mtrlbtnrctnglClear.setText("CLEAR");
		mtrlbtnrctnglClear.setBounds(172, 422, 102, 45);
		panel.add(mtrlbtnrctnglClear);
		
		
		
		
		
		
		
			
		
		
	}
}
