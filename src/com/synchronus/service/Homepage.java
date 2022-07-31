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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

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
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(0, 0, 638, 90);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Vaccine Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(101, 25, 426, 37);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(244, 164, 96));
		panel_1.setBounds(298, 89, 340, 342);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton Login = new JButton("LOGIN");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage loginPage = new LoginPage();
				loginPage.setVisible(true);
				setVisible(false);
			}
		});
		Login.setBorder(new CompoundBorder(new CompoundBorder(null, new CompoundBorder()), new CompoundBorder(null, new CompoundBorder())));
		Login.setFont(new Font("Segoe UI", Font.BOLD, 16));
		Login.setBackground(Color.GREEN);
		Login.setBorderPainted(false);
		Login.setBounds(27, 192, 128, 48);
		panel_1.add(Login);
		
		JButton Clear = new JButton("REGISTER");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationForm rgForm = new RegistrationForm();
				rgForm.setVisible(true);
				setVisible(false);
			}
		});
		Clear.setBackground(Color.DARK_GRAY);
		Clear.setBorderPainted(false);
		Clear.setForeground(Color.WHITE);
		Clear.setFont(new Font("Tahoma", Font.BOLD, 16));
		Clear.setBounds(202, 193, 128, 48);
		panel_1.add(Clear);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 89, 297, 342);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\tusha\\Pictures\\Vaccine.jpg"));
		lblNewLabel_1.setBounds(0, 0, 297, 342);
		panel_2.add(lblNewLabel_1);
	}
}
