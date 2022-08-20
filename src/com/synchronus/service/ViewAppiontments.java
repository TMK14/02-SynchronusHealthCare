package com.synchronus.service;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.synchronus.dao.BookAppiontment;
import com.synchronus.dao.SelectStatement;
import com.synchronus.dao.VaccineDetails;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import rojeru_san.complementos.RSButtonHover;
import javax.swing.border.CompoundBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import rojeru_san.complementos.RSTableMetro;
import java.awt.FlowLayout;
import rojerusan.RSMetroTextPlaceHolder;
import rojerusan.RSMaterialButtonRectangleBeanInfo;
import rojerusan.RSMaterialButtonRectangle;

public class ViewAppiontments extends JFrame {
	private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql:///synchronus healthcare";
    private static String userName = "root";
    private static String password = "";
    private String selectQueryString = "select * from vaccinedetails where Aadhar_No=";
    private Connection connection = null;
	private Statement statement= null ;
	private ResultSet rSet = null;
	private ArrayList<String> arrayList = new ArrayList<String>(); 

	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAppiontments frame = new ViewAppiontments("");
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
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	public ViewAppiontments(String uName) {
		System.out.println(uName);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937,500 );
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 112, 192), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JPanel centerPanel = new JPanel();
		centerPanel.setBorder(new LineBorder(SystemColor.textHighlight, 1, true));
		centerPanel.setBackground(Color.WHITE);
		centerPanel.setBounds(181, 78, 561, 383);
		contentPane.add(centerPanel);
		centerPanel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 49, 38, 451);
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
								for (int j = 180 ; j <= 300; j++) {
									centerPanel.setLocation(j,78);
								}
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
		lblNewLabel.setIcon(new ImageIcon(ViewAppiontments.class.getResource("/AdminIcons/bulleted_list_32px.png")));
		lblNewLabel.setBorder(new LineBorder(SystemColor.window, 1, true));
		
		lblNewLabel.setBounds(8, 9, 32, 32);
	
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Thread thread = new Thread() {
					@Override
					public void run() {
						try {
							for (int j = 300 ; j >= 180; j--) {
								centerPanel.setLocation(j,78);
							}
							
							for (int i = 220; i >= 38; i--) {
								Thread.sleep(1);
								panel_2.setSize(i,708);
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
		panel_3.setBorder(null);
		panel_3.setBounds(0, 109, 220, 40);
		panel_2.add(panel_3);
		panel_3.setBackground(new Color(102,102,255));
		panel_3.setLayout(null);
		
		
		
		JLabel scheduleVaccination = new JLabel("Schedule Vaccination");
		scheduleVaccination.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new ScheduleVaccination(uName).setVisible(true);
				dispose();
			}
		});
		scheduleVaccination.setBounds(10, 0, 200, 40);
		panel_3.add(scheduleVaccination);
		scheduleVaccination.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/appointment (1).png")));
		scheduleVaccination.setForeground(Color.WHITE);
		scheduleVaccination.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		
		JLabel lblNewLabel_1 = new JLabel("Synchronus Health Care");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(50, 5, 343, 37);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("X");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_2.setBounds(911, -2, 21, 27);
		panel.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		
		panel.add(lblNewLabel);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(null);
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(102, 102, 255));
		panel_3_1.setBounds(0, 173, 220, 40);
		panel_2.add(panel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("View Appiontments");
		lblNewLabel_4.setIcon(new ImageIcon(ViewAppiontments.class.getResource("/AdminIcons/Dose_24px.png")));
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_4.setBounds(10, 0, 200, 40);
		panel_3_1.add(lblNewLabel_4);
		
		lblNewLabel_3.setIcon(new ImageIcon(ViewAppiontments.class.getResource("/AdminIcons/back.png")));
		lblNewLabel_3.setBounds(196, 11, 24, 24);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(null);
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(102, 102, 255));
		panel_3_2.setBounds(0, 46, 220, 40);
		panel_2.add(panel_3_2);
		
		RSMetroTextPlaceHolder email = new RSMetroTextPlaceHolder();
		email.setBounds(22, 23, 250, 42);
		centerPanel.add(email);
		email.setPlaceholder("Enter your username");
		email.setPhColor(Color.BLACK);
		email.setFont(new Font("Segoe UI", Font.BOLD, 16));
		email.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 112, 192)));
		email.setVisible(true);
		
		JLabel lblNewLabel_2_1 = new JLabel("Home");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new DashBoard(uName).setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon(DashBoard.class.getResource("/AdminIcons/home_24px.png")));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(10, 0, 200, 40);
		panel_3_2.add(lblNewLabel_2_1);
				
						
						JLabel lblNewLabel_2 = new JLabel("Schedule");
						lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_2.setForeground(SystemColor.textHighlight);
						lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
						lblNewLabel_2.setBounds(162, 89, 253, 39);
						centerPanel.add(lblNewLabel_2);
						
						
								
								JLabel lblNewLabel_2_2 = new JLabel("Aadhar No:");
								lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.TRAILING);
								lblNewLabel_2_2.setForeground(SystemColor.textHighlight);
								lblNewLabel_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
								lblNewLabel_2_2.setBounds(162, 153, 110, 33);
								centerPanel.add(lblNewLabel_2_2);
								
								JLabel lblNewLabel_2_3 = new JLabel("Date:");
								lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.TRAILING);
								lblNewLabel_2_3.setForeground(SystemColor.textHighlight);
								lblNewLabel_2_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
								lblNewLabel_2_3.setBounds(162, 196, 110, 33);
								centerPanel.add(lblNewLabel_2_3);
								
								JLabel lblNewLabel_2_4 = new JLabel("Vaccine:");
								lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.TRAILING);
								lblNewLabel_2_4.setForeground(SystemColor.textHighlight);
								lblNewLabel_2_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
								lblNewLabel_2_4.setBounds(162, 239, 110, 33);
								centerPanel.add(lblNewLabel_2_4);
								
								JLabel lblNewLabel_2_5 = new JLabel("Center:");
								lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.TRAILING);
								lblNewLabel_2_5.setForeground(SystemColor.textHighlight);
								lblNewLabel_2_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
								lblNewLabel_2_5.setBounds(162, 282, 110, 33);
								centerPanel.add(lblNewLabel_2_5);
								
								JLabel AddharNumber = new JLabel("");
								AddharNumber.setHorizontalAlignment(SwingConstants.LEFT);
								AddharNumber.setForeground(SystemColor.textHighlight);
								AddharNumber.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
								AddharNumber.setBounds(292, 153, 234, 33);
								centerPanel.add(AddharNumber);
								
								JLabel DateLabel = new JLabel("");
								DateLabel.setHorizontalAlignment(SwingConstants.LEFT);
								DateLabel.setForeground(SystemColor.textHighlight);
								DateLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
								DateLabel.setBounds(292, 196, 234, 33);
								centerPanel.add(DateLabel);
								
								JLabel VaccineLabel = new JLabel("");
								VaccineLabel.setHorizontalAlignment(SwingConstants.LEFT);
								VaccineLabel.setForeground(SystemColor.textHighlight);
								VaccineLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
								VaccineLabel.setBounds(292, 239, 234, 33);
								centerPanel.add(VaccineLabel);
								
								JLabel CenterLabel = new JLabel("");
								CenterLabel.setHorizontalAlignment(SwingConstants.LEFT);
								CenterLabel.setForeground(SystemColor.textHighlight);
								CenterLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
								CenterLabel.setBounds(292, 282, 259, 33);
								centerPanel.add(CenterLabel);
	
								
								JSeparator separator = new JSeparator();
								separator.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
								separator.setBounds(282, 153, 3, 200);
								centerPanel.add(separator);
								
								
								RSButtonHover btnhvrViewAppointments = new RSButtonHover();
								btnhvrViewAppointments.setBounds(356, 27, 170, 35);
								centerPanel.add(btnhvrViewAppointments);
								btnhvrViewAppointments.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										VaccineDetails vaccineDetails = new VaccineDetails();
										try {
											
											
									        arrayList = vaccineDetails.vaccineDeatailsArrayList(email.getText());
									        AddharNumber.setText(arrayList.get(0));
									        DateLabel.setText(arrayList.get(1));
									        VaccineLabel.setText(arrayList.get(2));
									        CenterLabel.setText(arrayList.get(3));
										} catch (Exception e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
									}
								});
								btnhvrViewAppointments.setText("View Appointments");
								btnhvrViewAppointments.setBorder(new CompoundBorder(new LineBorder(new Color(0, 120, 215), 2, true), new LineBorder(new Color(0, 120, 215), 2, true)));
								btnhvrViewAppointments.setBackground(SystemColor.textHighlight);
								
		
		
		
		
		
		ButtonGroup rButtonGroup = new ButtonGroup();
		
		
		
		
	

		
//		JSpinField dateJSpinField = new JSpinField();
//		dateJSpinField.setBounds(382, 117, 41, 34);
//		dateJSpinField.setMaximum(31);
//		dateJSpinField.setMinimum(1);
//		panel_4.add(dateJSpinField);
//		
//		JSpinField dateJSpinField_1 = new JSpinField();
//		dateJSpinField_1.setMinimum(1);
//		dateJSpinField_1.setMaximum(12);
//		dateJSpinField_1.setBounds(454, 117, 41, 34);
//		panel_4.add(dateJSpinField_1);
//		
//		JSpinField dateJSpinField_2 = new JSpinField();
//		dateJSpinField_2.setMinimum(2022);
//		dateJSpinField_2.setMaximum();
//		dateJSpinField_2.setBounds(531, 117, 41, 34);
//		panel_4.add(dateJSpinField_2);
		setUndecorated(true);
		
	}
}
