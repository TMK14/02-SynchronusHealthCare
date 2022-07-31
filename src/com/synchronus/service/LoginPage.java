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
import javax.swing.JSeparator;

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
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 314, 388);
		panel.setBackground(new Color(255, 218, 185));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Pictures\\Login.png"));
		lblNewLabel.setBounds(83, 160, 128, 85);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(314, 0, 419, 388);
		panel_1.setBackground(SystemColor.activeCaption);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Username = new JTextField();
		Username.setBackground(SystemColor.menu);
		Username.setBorder(new EmptyBorder(0, 0, 0, 0));
		Username.setHorizontalAlignment(SwingConstants.CENTER);
		Username.setToolTipText("");
		Username.setBounds(210, 118, 151, 29);
		
		panel_1.add(Username);
		Username.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBorder(new LineBorder(new Color(240, 240, 240), 3));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(44, 274, 142, 35);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("FORGOT PASSWORD");
		
		btnNewButton_1.setBackground(new Color(255, 0, 51));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(219, 274, 142, 35);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(38, 118, 137, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(38, 193, 137, 29);
		panel_1.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.menu);
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(210, 195, 151, 29);
		panel_1.add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(210, 171, 151, 2);
		panel_1.add(separator);
		
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
		btnNewButton_2.setBounds(371, 0, 48, 29);
		panel_1.add(btnNewButton_2);
	}
}
