package com.synchronus.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.nio.file.FileSystem;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

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
		setBounds(100, 100, 654, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(224, 255, 255));
		panel_1.setBackground(new Color(153, 180, 209));
		panel_1.setBounds(304, 0, 350, 470);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton Login = new JButton("LOGIN");
		Login.setForeground(new Color(224, 255, 255));
		Login.setBounds(44, 329, 128, 48);
		panel_1.add(Login);
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage loginPage = new LoginPage();
				loginPage.setVisible(true);
				setVisible(false);
			}
		});
		Login.setBorder(UIManager.getBorder("Button.border"));
		Login.setFont(new Font("Segoe UI", Font.BOLD, 16));
		Login.setBackground(new Color(153, 50, 204));
		Login.setBorderPainted(false);
		
		JButton Clear = new JButton("REGISTER");
		Clear.setBorder(new LineBorder(null, 3, true));
		Clear.setBorderPainted(false);
		Clear.setBounds(198, 330, 128, 48);
		panel_1.add(Clear);
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationForm rgForm = new RegistrationForm();
				rgForm.setVisible(true);
				setVisible(false);
			}
		});
		Clear.setBackground(new Color(0, 204, 0));
		Clear.setForeground(new Color(224, 255, 255));
		Clear.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setBounds(302, 0, 48, 29);
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
		
		JLabel lblNewLabel_1 = new JLabel("<html>\r\n<style>\r\np{text-align: center;\r\nline-height:2;\r\n}\r\n\r\n</style>\r\n<p> TIME </p>\r\n<br>\r\n<p>TO</p>\r\n<br>\r\n<p> VACCINATE </p>\r\n</html>");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 28));
		lblNewLabel_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(32, 82, 281, 190);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 304, 470);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tusha\\Desktop\\Vaccination_Hommepage.jpg"));
		lblNewLabel.setBounds(0, 0, 304, 470);
		panel.add(lblNewLabel);
	}
}
