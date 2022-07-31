package com.synchronus.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.TextUI;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField Username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tusha\\Pictures\\Login.png"));
		setForeground(Color.WHITE);
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 314, 349);
		panel.setBackground(new Color(255, 218, 185));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Pictures\\Login.png"));
		lblNewLabel.setBounds(83, 134, 128, 85);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(314, 0, 403, 349);
		panel_1.setBackground(SystemColor.activeCaption);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Username = new JTextField();
		Username.setHorizontalAlignment(SwingConstants.CENTER);
		Username.setToolTipText("");
		Username.setBounds(242, 93, 151, 35);
		
		panel_1.add(Username);
		Username.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBorder(new LineBorder(new Color(240, 240, 240), 3));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(53, 237, 122, 35);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("FORGOT PASSWORD");
		btnNewButton_1.setBackground(new Color(255, 0, 51));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(251, 237, 142, 35);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(38, 99, 137, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(38, 163, 137, 29);
		panel_1.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(242, 162, 151, 35);
		panel_1.add(passwordField);
	}
}
