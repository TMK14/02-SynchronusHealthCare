package com.synchronus.service;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import com.synchronus.dao.AdminCredentials;
import com.synchronus.dao.UserCredential;

import rojerusan.RSMaterialButtonRectangle;
import rojerusan.RSMetroTextPlaceHolder;
import rojerusan.RSPasswordTextPlaceHolder;

public class LoginPage extends JFrame {

	private  String userName , pwd ;
	private JPanel contentPane;
	private ResultSet reaResultSet = null;

	UserCredential userCredential = new UserCredential();
	AdminCredentials adminCredentials = new AdminCredentials();
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
		LoginError.setBounds(70, 329, 273, 35);
		panel_1.add(LoginError);
		
		JLabel emailError = new JLabel("*Invalid Email");
		emailError.setVisible(false);
		emailError.setHorizontalAlignment(SwingConstants.TRAILING);
		emailError.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		emailError.setForeground(SystemColor.textHighlight);
		emailError.setBounds(170, 104, 173, 20);
		panel_1.add(emailError);
		
		JLabel passwordError = new JLabel("*Invalid Password");
		passwordError.setVisible(false);
		passwordError.setHorizontalAlignment(SwingConstants.TRAILING);
		passwordError.setForeground(SystemColor.textHighlight);
		passwordError.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		passwordError.setBounds(170, 177, 173, 20);
		panel_1.add(passwordError);

		JRadioButton rdbtnUser = new JRadioButton("User");
		rdbtnUser.setActionCommand("User");
		JRadioButton rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setActionCommand("Admin");
		
		ButtonGroup selectionGroup = new ButtonGroup();
		selectionGroup.add(rdbtnUser);
		selectionGroup.add(rdbtnAdmin);
		
		RSMaterialButtonRectangle mtrlbtnrctnglLogin = new RSMaterialButtonRectangle();
		mtrlbtnrctnglLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (selectionGroup.getSelection().getActionCommand()=="User") {
				Pattern	pattern = Pattern.compile("[a-zA-Z||0-9]{3,20}@[A-Za-z]{3,10}.(com|in)");
				Matcher	matcher = pattern.matcher(uName.getText());
				
				Boolean emailBoolean , passwordBoolean ;
					
					Boolean boolean1 = false;
					if (!(matcher.find()&&matcher.group().equals(uName.getText()))) {
						
						emailError.setVisible(true);
						emailBoolean = false;
					} else {
						userName = uName.getText();
						emailError.setVisible(false);
						emailBoolean = true;
					}
					
					char temp [] = password.getPassword();
					pwd = new String(temp);
					
					if (pwd.equals("")) {
						passwordError.setVisible(true);
						passwordBoolean = false;
					} else {
						passwordError.setVisible(false);
						passwordBoolean = true;
					}
					
					
					if (emailBoolean&&passwordBoolean) {
						char temp1 [] = password.getPassword();
						pwd = new String(temp1);
						
						boolean1 = userCredential.selectUserCredentials(uName.getText(),pwd );
						if (boolean1 ==true) {
	//					JOptionPane.showMessageDialog(null, "Login Successfull");
							DashBoard dashBoard = new DashBoard(userName);
							dashBoard.setVisible(true);
							setVisible(false);
						}else {
							JOptionPane.showMessageDialog(null, "Invalid userName or Password");
						} 
					
					}
	
				}else {
						char temp2[] = password.getPassword();
						String adminPasswordString = new String(temp2);
						
						boolean boolean2 = adminCredentials.selectUserCredentials(uName.getText(),adminPasswordString);
						if (boolean2 ==true) {
	//					JOptionPane.showMessageDialog(null, "Login Successfull");
							DashBoardAdmin dashBoard = new DashBoardAdmin(userName);
							dashBoard.setVisible(true);
							setVisible(false);
						}else {
							JOptionPane.showMessageDialog(null, "Invalid userName or Password");
						} 
					
					
					
				}
			}
		});
		
		mtrlbtnrctnglLogin.setText("LOGIN");
		mtrlbtnrctnglLogin.setBackground(new Color(0, 112, 192));
		mtrlbtnrctnglLogin.setBounds(94, 281, 102, 47);
		panel_1.add(mtrlbtnrctnglLogin);
		
		RSMaterialButtonRectangle mtrlbtnrctnglSignIn = new RSMaterialButtonRectangle();
		mtrlbtnrctnglSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationForm registrationForm = new RegistrationForm();
				registrationForm.setVisible(true);
				setVisible(false);
			}
		});
		mtrlbtnrctnglSignIn.setText("SIGN UP");
		mtrlbtnrctnglSignIn.setBackground(new Color(0, 112, 192));
		mtrlbtnrctnglSignIn.setBounds(222, 281, 102, 47);
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
		
		rdbtnUser.setForeground(SystemColor.textHighlight);
		rdbtnUser.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		rdbtnUser.setBackground(Color.WHITE);
		rdbtnUser.setBounds(93, 251, 109, 23);
		panel_1.add(rdbtnUser);
		
		rdbtnAdmin.setForeground(SystemColor.textHighlight);
		rdbtnAdmin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		rdbtnAdmin.setBackground(Color.WHITE);
		rdbtnAdmin.setBounds(234, 251, 109, 23);
		panel_1.add(rdbtnAdmin);
		
		
	}
}
