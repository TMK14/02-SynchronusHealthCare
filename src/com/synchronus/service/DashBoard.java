package com.synchronus.service;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.synchronus.dao.SelectStatement;
import com.synchronus.dao.VaccineDetails;
import javax.swing.border.MatteBorder;
import java.awt.Component;

public class DashBoard extends JFrame {
	
	public JLabel  firstName = new JLabel();
	private JPanel contentPane;
	public JLabel imageLabel = new JLabel();
	ArrayList<String> arrayList = new ArrayList<String>();	
	ArrayList<Integer> aList = new ArrayList<>();	
	private static String userName;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard("");
					
					
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
	public DashBoard(String userName) {
		this.userName = userName;
		
		setUndecorated(true);
		
		imageLabel = new JLabel("");
		imageLabel.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		imageLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				imageLabel.setIcon(new ImageIcon("E:\\GPS\\3RD YEAR GPS\\5TH SEM\\Industrial Training\\VaccineManagementSystem\\src\\resources\\2002.i203.005_healthy lifestyle .jpg"));
			}
		});
		imageLabel.setIcon(new ImageIcon(DashBoard.class.getResource("/resources/how-you-can-make-a-difference-16.png")));
		imageLabel.setBounds(10, 206, 804, 363);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1064,651 );
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel centerPanel = new JPanel();
		centerPanel.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		centerPanel.setBackground(Color.WHITE);
		centerPanel.setBounds(130, 71, 824, 580);
		contentPane.add(centerPanel);
		centerPanel.setLayout(null);
		centerPanel.add(imageLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 48, 38, 603);
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
									centerPanel.setLocation(225,71);
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
		lblNewLabel.setBounds(7, 10, 32, 32);
	
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Thread thread = new Thread() {
					@Override
					public void run() {
						try {
							for (int i = 220; i >= 38; i--) {
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
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ScheduleVaccination scheduleVaccination = new ScheduleVaccination(userName);
				scheduleVaccination.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_2.setBounds(10, 0, 200, 40);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/appointment (1).png")));
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		
		JLabel lblNewLabel_1 = new JLabel("Synchronus Health Care");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(49, 5, 343, 37);
		panel.add(lblNewLabel_1);
		firstName.setText("Welcome , User");
		firstName.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/icons8_contacts_50px_1.png")));
		firstName.setSize(10, 100);
		
		
		firstName = new JLabel("Welcome,User");
		firstName.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/icons8_contacts_50px_1.png")));
		firstName.setForeground(Color.WHITE);
		firstName.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		firstName.setBounds(761, 0, 249, 48);
//		firstName.setText("Welcome ,"+arrayList.get(0));
		panel.add(firstName);
		
		JLabel lblNewLabel_1_2 = new JLabel("X");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_2.setBounds(1041, 10, 21, 27);
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
		lblNewLabel_4.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/Dose_24px.png")));
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new ViewAppiontments(userName).setVisible(true);
				dispose();
			}
		});
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_4.setBounds(10, 0, 196, 40);
		panel_3_1.add(lblNewLabel_4);
		
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
		
		SelectStatement selectStatement = new SelectStatement();
		aList = selectStatement.checkAvalability();
		
		@SuppressWarnings("removal")
		int a , b;
		a= aList.get(0);
		b= aList.get(1);
		Integer covi  = new Integer(a);
		@SuppressWarnings("removal")
		Integer coVaxin1 = new Integer(b);
		
		VaccineDetails vaccineDetails = new VaccineDetails();
		JLabel lblNewLabel_6 = new JLabel("Name:");
		lblNewLabel_6.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6.setForeground(SystemColor.textHighlight);
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(20, 22, 82, 22);
		centerPanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Mobile No:");
		lblNewLabel_6_1.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_6_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel_6_1.setAlignmentY(0.0f);
		lblNewLabel_6_1.setBounds(20, 84, 82, 22);
		centerPanel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Email:");
		lblNewLabel_6_2.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_6_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel_6_2.setBounds(20, 152, 82, 22);
		centerPanel.add(lblNewLabel_6_2);
		
		JLabel name = new JLabel((String) null);
		name.setForeground(SystemColor.textHighlight);
		name.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		name.setBounds(122, 22, 185, 22);
		centerPanel.add(name);
		
		JLabel mobileNo = new JLabel((String) null);
		mobileNo.setForeground(SystemColor.textHighlight);
		mobileNo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		mobileNo.setAlignmentY(0.0f);
		mobileNo.setBounds(122, 84, 185, 22);
		centerPanel.add(mobileNo);
		
		JLabel email = new JLabel((String) null);
		email.setForeground(SystemColor.textHighlight);
		email.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		email.setBounds(122, 152, 219, 22);
		centerPanel.add(email);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		separator.setBounds(411, 27, 3, 150);
		centerPanel.add(separator);
		
		JLabel lblNewLabel_6_4 = new JLabel("Address:");
		lblNewLabel_6_4.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6_4.setForeground(SystemColor.textHighlight);
		lblNewLabel_6_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel_6_4.setBounds(464, 22, 82, 22);
		centerPanel.add(lblNewLabel_6_4);
		
		JLabel address = new JLabel((String) null);
		address.setForeground(SystemColor.textHighlight);
		address.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		address.setBounds(567, 22, 185, 22);
		centerPanel.add(address);
		
		JLabel lblNewLabel_6_5 = new JLabel("Gender:");
		lblNewLabel_6_5.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_6_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6_5.setForeground(SystemColor.textHighlight);
		lblNewLabel_6_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel_6_5.setAlignmentY(0.0f);
		lblNewLabel_6_5.setBounds(464, 84, 82, 22);
		centerPanel.add(lblNewLabel_6_5);
		
		JLabel gender = new JLabel((String) null);
		gender.setForeground(SystemColor.textHighlight);
		gender.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		gender.setAlignmentY(0.0f);
		gender.setBounds(567, 84, 185, 22);
		centerPanel.add(gender);
		
		JLabel lblNewLabel_6_3 = new JLabel("DOB:");
		lblNewLabel_6_3.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_6_3.setForeground(SystemColor.textHighlight);
		lblNewLabel_6_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblNewLabel_6_3.setBounds(464, 152, 82, 22);
		centerPanel.add(lblNewLabel_6_3);
		
		JLabel DOB = new JLabel((String) null);
		DOB.setForeground(SystemColor.textHighlight);
		DOB.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		DOB.setBounds(567, 152, 185, 22);
		centerPanel.add(DOB);
		try {
			firstName.setVisible(true);
			arrayList =	vaccineDetails.userDeatils(userName);
			System.out.println(arrayList.get(0));
			firstName.setText("Welcome "+arrayList.get(0));
			name.setText(arrayList.get(0).toUpperCase());
			
			DOB.setText(arrayList.get(1));
			mobileNo.setText(arrayList.get(2));
			email.setText(arrayList.get(3));
			gender.setText(arrayList.get(4));
			address.setText(arrayList.get(5));
			
			
		
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}
}

