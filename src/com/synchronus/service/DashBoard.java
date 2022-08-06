package com.synchronus.service;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import rojerusan.RSMaterialButtonRectangle;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class DashBoard extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard();
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
	public DashBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1355,750 );
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 48, 220, 702);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		int x = 220;
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.setVisible(true);
				if (x==220) {
					panel_2.setSize(220,702);
					Thread thread = new Thread() {
						@Override
						public void run() {
							try {
								for (int i = 0; i <= 220; i++) {
									Thread.sleep(1);
									panel_2.setSize(i , 702);
								}
								
							} catch (Exception e2) {
								JOptionPane.showMessageDialog(null, e);
							}
						}
						
					};thread.start();
				
				}
			}
		});
		lblNewLabel.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/bulleted_list_32px.png")));
		lblNewLabel.setBounds(10, 9, 32, 32);
	
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Thread thread = new Thread() {
					@Override
					public void run() {
						try {
							for (int i = 220; i >= 0; i--) {
								Thread.sleep(1);
								panel_2.setSize(i , 702);
							}
							
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, e);
						}
					}
					
				};thread.start();
				
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1354, 49);
		panel.setBackground(new Color(102,102,255));
		contentPane.add(panel);
		panel.setLayout(null);

		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.DARK_GRAY, 3, true));
		panel_3.setBounds(0, 109, 220, 40);
		panel_2.add(panel_3);
		panel_3.setBackground(new Color(102,102,255));
		panel_3.setLayout(null);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Schedule Vaccination");
		lblNewLabel_2.setBounds(10, 0, 200, 40);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/appointment (1).png")));
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51 ,51,51));
		panel_1.setBounds(56, -2, 4, 50);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Vaccine Management System");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(77, 8, 343, 37);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Welcome,User");
		lblNewLabel_1_1.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/icons8_contacts_50px_1.png")));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(1096, 0, 196, 48);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("X");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_2.setBounds(1333, 0, 21, 27);
		panel.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		
		panel.add(lblNewLabel);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(Color.DARK_GRAY, 3, true));
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(102, 102, 255));
		panel_3_1.setBounds(0, 173, 220, 40);
		panel_2.add(panel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("View Appiontments");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_4.setBounds(38, 0, 168, 40);
		panel_3_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/Dose_24px.png")));
		lblNewLabel_5.setBounds(10, 10, 24, 24);
		panel_3_1.add(lblNewLabel_5);
		
		lblNewLabel_3.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/back_24px.png")));
		lblNewLabel_3.setBounds(196, 11, 24, 24);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(Color.DARK_GRAY, 3, true));
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(102, 102, 255));
		panel_3_2.setBounds(0, 46, 220, 40);
		panel_2.add(panel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Home");
		lblNewLabel_2_1.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/home_24px.png")));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(10, 0, 200, 40);
		panel_3_2.add(lblNewLabel_2_1);
		setUndecorated(true);
		
	}
}
