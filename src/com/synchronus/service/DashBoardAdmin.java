package com.synchronus.service;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

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

public class DashBoardAdmin extends JFrame {
	
	public JLabel  firstName = new JLabel();
	private JPanel contentPane;
	ArrayList<String> arrayList = new ArrayList<String>();	
	ArrayList<Integer> aList = new ArrayList<>();	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoardAdmin frame = new DashBoardAdmin("");
					
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
	public DashBoardAdmin(String userName) {
		setUndecorated(true);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1064,651 );
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 48, 220, 603);
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
		lblNewLabel.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/bulleted_list_32px.png")));
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
		lblNewLabel_2.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/appointment (1).png")));
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		
		JLabel lblNewLabel_1 = new JLabel("Vaccine Management System");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(49, 5, 343, 37);
		panel.add(lblNewLabel_1);
		firstName.setText("Welcome , User");
		firstName.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/icons8_contacts_50px_1.png")));
		firstName.setSize(10, 100);
		
		
		firstName = new JLabel("Welcome,User");
		firstName.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/icons8_contacts_50px_1.png")));
		firstName.setForeground(Color.WHITE);
		firstName.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		firstName.setBounds(808, 0, 196, 48);
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
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_4.setBounds(38, 0, 168, 40);
		panel_3_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/Dose_24px.png")));
		lblNewLabel_5.setBounds(10, 10, 24, 24);
		panel_3_1.add(lblNewLabel_5);
		
		lblNewLabel_3.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/back_24px.png")));
		lblNewLabel_3.setBounds(196, 11, 24, 24);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(Color.DARK_GRAY, 3, true));
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(102, 102, 255));
		panel_3_2.setBounds(0, 46, 220, 40);
		panel_2.add(panel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Home");
		lblNewLabel_2_1.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/home_24px.png")));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(10, 0, 200, 40);
		panel_3_2.add(lblNewLabel_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		panel_1.setBounds(260, 97, 163, 115);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel coVaxin = new JLabel("");
		coVaxin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 34));
		coVaxin.setHorizontalAlignment(SwingConstants.CENTER);
		coVaxin.setBounds(48, 27, 65, 59);
		panel_1.add(coVaxin);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.textHighlight);
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(0, 11, 163, 5);
		panel_1.add(separator);
		
		JLabel coVaxinStock = new JLabel("COVAXIN");
		coVaxinStock.setHorizontalAlignment(SwingConstants.CENTER);
		coVaxinStock.setForeground(new Color(102,102,255));
		coVaxinStock.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		coVaxinStock.setBounds(284, 60, 115, 26);
		contentPane.add(coVaxinStock);
		
		JLabel lblLeft = new JLabel("REAMAINING");
		lblLeft.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeft.setForeground(new Color(102, 102, 255));
		lblLeft.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblLeft.setBounds(284, 218, 115, 26);
		contentPane.add(lblLeft);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		panel_1_1.setBounds(855, 97, 163, 115);
		contentPane.add(panel_1_1);
		
		JLabel coVishield = new JLabel("");
		coVishield.setHorizontalAlignment(SwingConstants.CENTER);
		coVishield.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 34));
		coVishield.setBounds(48, 27, 65, 59);
		panel_1_1.add(coVishield);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBackground(SystemColor.textHighlight);
		separator_1.setBounds(0, 11, 163, 5);
		panel_1_1.add(separator_1);
		
		JLabel coVishieldstock = new JLabel("COVISHILED");
		coVishieldstock.setHorizontalAlignment(SwingConstants.CENTER);
		coVishieldstock.setForeground(new Color(102, 102, 255));
		coVishieldstock.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		coVishieldstock.setBounds(879, 60, 115, 26);
		contentPane.add(coVishieldstock);
		
		JLabel lblLeft_1 = new JLabel("REAMAINING");
		lblLeft_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeft_1.setForeground(new Color(102, 102, 255));
		lblLeft_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblLeft_1.setBounds(879, 218, 115, 26);
		contentPane.add(lblLeft_1);
		
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
		try {
			firstName.setVisible(true);
			arrayList =	vaccineDetails.userDeatils(userName);
			System.out.println(arrayList.get(0));
			firstName.setText("Welcome <dynamic>");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}
	
	
}

