package com.synchronus.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationForm extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		panel.setForeground(SystemColor.textHighlightText);
		panel.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		panel.setBounds(0, 0, 848, 493);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setForeground(new Color(148, 0, 211));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(347, 11, 162, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 76, 80, 23);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), UIManager.getBorder("Button.border")));
		textField.setBounds(10, 110, 114, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contact No.");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 180, 93, 23);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), UIManager.getBorder("Button.border")));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 214, 114, 23);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email ID:");
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(206, 180, 80, 23);
		panel.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2), UIManager.getBorder("Button.border")));
		textField_2.setColumns(10);
		textField_2.setBounds(206, 214, 183, 23);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Last Name:");
		lblNewLabel_1_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(206, 76, 80, 23);
		panel.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), UIManager.getBorder("Button.border")));
		textField_3.setColumns(10);
		textField_3.setBounds(206, 110, 124, 23);
		panel.add(textField_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 97, 1, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gender:");
		lblNewLabel_1_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(10, 288, 80, 23);
		panel.add(lblNewLabel_1_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M");
		rdbtnNewRadioButton.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		rdbtnNewRadioButton.setBorder(UIManager.getBorder("Button.border"));
		rdbtnNewRadioButton.setForeground(new Color(65, 105, 225));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(10, 324, 39, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		rdbtnF.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		rdbtnF.setForeground(new Color(65, 105, 225));
		rdbtnF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnF.setBounds(65, 324, 38, 23);
		panel.add(rdbtnF);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("T");
		rdbtnNewRadioButton_1.setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		rdbtnNewRadioButton_1.setForeground(new Color(65, 105, 225));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(121, 324, 38, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1_5 = new JLabel("Address:");
		lblNewLabel_1_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(206, 288, 80, 23);
		panel.add(lblNewLabel_1_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), UIManager.getBorder("Button.border")));
		textArea.setBounds(206, 324, 183, 75);
		panel.add(textArea);
		
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
		separator_1_4.setBounds(10, 309, 93, 2);
		panel.add(separator_1_4);
		
		JSeparator separator_1_5 = new JSeparator();
		separator_1_5.setBackground(Color.BLACK);
		separator_1_5.setBounds(206, 309, 93, 2);
		panel.add(separator_1_5);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(new Color(255, 250, 250));
		btnNewButton.setBackground(new Color(0, 255, 127));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		btnNewButton.setBounds(22, 444, 102, 23);
		panel.add(btnNewButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setHorizontalTextPosition(SwingConstants.CENTER);
		btnClear.setForeground(new Color(255, 250, 250));
		btnClear.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		btnClear.setBorderPainted(false);
		btnClear.setBorder(UIManager.getBorder("Button.border"));
		btnClear.setBackground(new Color(128, 0, 128));
		btnClear.setBounds(206, 444, 102, 23);
		panel.add(btnClear);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\tusha\\Pictures\\Vaccine Project\\Registration_Page.jpg"));
		lblNewLabel_2.setBounds(463, 82, 331, 318);
		panel.add(lblNewLabel_2);
		
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 493);
		setUndecorated(true);
	}
}
