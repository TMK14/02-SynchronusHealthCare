package com.synchronus.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.TextUI;

import com.synchronus.dao.UserCredential;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.management.loading.PrivateClassLoader;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JSeparator;
import rojerusan.RSButtonPane;
import rojerusan.RSMetroTextPlaceHolderBeanInfo;
import rojerusan.RSMetroTextPlaceHolder;
import rojerusan.RSPasswordTextPlaceHolder;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import rojerusan.RSMaterialButtonRectangle;
import rojerusan.RSLabelVerticalD;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginPage extends JFrame {

	private String userName , pwd ;
	private JPanel contentPane;
	private ResultSet reaResultSet = null;

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
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 314, 388);
		panel.setBackground(new Color(0, 112, 192));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\user (1).png"));
		lblNewLabel.setBounds(86, 139, 128, 128);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(314, 0, 419, 388);
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
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
		
		RSPasswordTextPlaceHolder password = new RSPasswordTextPlaceHolder();
		password.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 112, 192)));
		password.setPhColor(new Color(0, 0, 0));
		password.setFont(new Font("Segoe UI", Font.BOLD, 16));
		password.setPlaceholder("Enter Password");
		password.setBounds(93, 198, 250, 35);
		panel_1.add(password);
		
		RSMetroTextPlaceHolder uName = new RSMetroTextPlaceHolder();
		uName.setPhColor(new Color(0, 0, 0));
		uName.setFont(new Font("Segoe UI", Font.BOLD, 16));
		uName.setPlaceholder("Enter Username");
		uName.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 112, 192)));
		uName.setBounds(93, 124, 250, 42);
		panel_1.add(uName);

		JLabel LoginError = new JLabel("Invalid Username or Password");
		LoginError.setVisible(false);
		LoginError.setHorizontalAlignment(SwingConstants.CENTER);
		LoginError.setForeground(new Color(0, 112, 192));
		LoginError.setFont(new Font("Segoe UI", Font.BOLD, 14));
		LoginError.setBounds(70, 315, 273, 35);
		panel_1.add(LoginError);
		
		RSMaterialButtonRectangle mtrlbtnrctnglLogin = new RSMaterialButtonRectangle();
		mtrlbtnrctnglLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Boolean boolean1;
				userName = uName.getText();
				char temp [] = password.getPassword();
				pwd = new String(temp);
				UserCredential userCredential = new UserCredential();
				boolean1 = userCredential.selectUserCredentials(userName, pwd);
				if (boolean1 ==true) {
//					JOptionPane.showMessageDialog(null, "Login Successfull");
					DashBoard dashBoard = new DashBoard();
					dashBoard.setVisible(true);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null,"Invalid email or password");
				}	

			}
		});
		
		mtrlbtnrctnglLogin.setText("LOGIN");
		mtrlbtnrctnglLogin.setBackground(new Color(0, 112, 192));
		mtrlbtnrctnglLogin.setBounds(93, 260, 102, 47);
		panel_1.add(mtrlbtnrctnglLogin);
		
		RSMaterialButtonRectangle mtrlbtnrctnglSignIn = new RSMaterialButtonRectangle();
		mtrlbtnrctnglSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationForm registrationForm = new RegistrationForm();
				registrationForm.setVisible(true);
				setVisible(false);
			}
		});
		mtrlbtnrctnglSignIn.setText("SIGN IN");
		mtrlbtnrctnglSignIn.setBackground(new Color(0, 112, 192));
		mtrlbtnrctnglSignIn.setBounds(221, 260, 102, 47);
		panel_1.add(mtrlbtnrctnglSignIn);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\id-card (1).png"));
		lblNewLabel_1.setBounds(37, 139, 32, 32);
		panel_1.add(lblNewLabel_1);
		
		JLabel passwordIcon = new JLabel("");
		passwordIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				password.setEchoChar((char)0);
				passwordIcon.setIcon(new ImageIcon("E:\\GPS\\3RD YEAR GPS\\5TH SEM\\Industrial Training\\VaccineManagementSystem\\src\\AdminIcons\\open-padlock.png"));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				password.setEchoChar('\u25CF');
				passwordIcon.setIcon(new ImageIcon("E:\\\\GPS\\\\3RD YEAR GPS\\\\5TH SEM\\\\Industrial Training\\\\VaccineManagementSystem\\\\src\\\\AdminIcons\\\\close-padlock.png"));
			}
		});
		
		passwordIcon.setIcon(new ImageIcon(LoginPage.class.getResource("/AdminIcons/close-padlock.png")));
		passwordIcon.setBounds(37, 201, 32, 32);
		panel_1.add(passwordIcon);
		
		JLabel loginPageHeadingLabel = new JLabel("SYNCHRONUS");
		loginPageHeadingLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		loginPageHeadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginPageHeadingLabel.setBounds(70, 46, 273, 35);
		loginPageHeadingLabel.setForeground(new Color(0 , 112 ,192));
		panel_1.add(loginPageHeadingLabel);
		
	}
}
