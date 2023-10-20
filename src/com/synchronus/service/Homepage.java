package com.synchronus.service;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import rojerusan.RSMaterialButtonRectangle;

public class Homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 112, 192), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(224, 255, 255));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 743, 408);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		RSMaterialButtonRectangle mtrlbtnrctnglRegister = new RSMaterialButtonRectangle();
		mtrlbtnrctnglRegister.setBounds(554, 317, 102, 47);
		panel_1.add(mtrlbtnrctnglRegister);
		mtrlbtnrctnglRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationForm registrationForm = new RegistrationForm();
				registrationForm.setVisible(true);
				setVisible(false);
			}
		});
		mtrlbtnrctnglRegister.setText("REGISTER");
		mtrlbtnrctnglRegister.setBackground(new Color(100, 149, 237));
		
		RSMaterialButtonRectangle mtrlbtnrctnglLogin = new RSMaterialButtonRectangle();
		mtrlbtnrctnglLogin.setBounds(407, 317, 102, 47);
		mtrlbtnrctnglLogin.setBackground(new Color(0,112,192));
		panel_1.add(mtrlbtnrctnglLogin);
		mtrlbtnrctnglLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage loginPage = new LoginPage();
				loginPage.setVisible(true);
				setVisible(false);
			}
		});
		mtrlbtnrctnglLogin.setText("LOGIN");
		mtrlbtnrctnglLogin.setBackground(new Color(100, 149, 237));
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setBounds(695, 0, 48, 29);
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setBorderPainted(false);
		
		JLabel loginPageHeadingLabel = new JLabel("SYNCHRONUS");
		loginPageHeadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginPageHeadingLabel.setForeground(new Color(0, 112, 192));
		loginPageHeadingLabel.setFont(new Font("Segoe UI", Font.BOLD, 48));
		loginPageHeadingLabel.setBounds(368, 59, 336, 47);
		panel_1.add(loginPageHeadingLabel);
		
		JLabel lblNewLabel = new JLabel("\"WE TAKE CARE\"");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel.setBounds(440, 277, 205, 29);
		lblNewLabel.setForeground(new Color(0 , 112 ,192));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\tusha\\Downloads\\medical-team.png"));
		lblNewLabel_1.setBounds(470, 128, 128, 128);
		panel_1.add(lblNewLabel_1);
		
		JLabel backgroundImage = new JLabel("");
		backgroundImage.setBackground(new Color(255, 255, 255));
		backgroundImage.setBorder(new LineBorder(new Color(0, 112, 192)));
		backgroundImage.setIcon(new ImageIcon("C:\\Users\\tusha\\Pictures\\Vaccine Project\\adult-children-hands-holding-paper-family-cutout_49149-1061.jpg"));
		backgroundImage.setBounds(0, 0, 743, 408);
		panel_1.add(backgroundImage);
	}
}
