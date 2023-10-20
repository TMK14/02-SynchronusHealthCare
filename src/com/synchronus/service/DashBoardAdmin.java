package com.synchronus.service;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSetMetaData;
import com.synchronus.dao.AppointmentDeatails;
import com.synchronus.dao.SelectStatement;
import com.synchronus.dao.UpdateStocks;

import rojerusan.RSMaterialButtonRectangle;
import rojerusan.RSMetroTextPlaceHolder;

public class DashBoardAdmin extends JFrame {
	
	public JLabel  firstName = new JLabel();
	private JPanel contentPane;
	ArrayList<String> arrayList = new ArrayList<String>();	
	ArrayList<Integer> aList = new ArrayList<>();	
	private JTable table;
	private ResultSetMetaData resultSetMetaData;
	private ButtonGroup buttonGroup = new ButtonGroup();
	
	private ResultSet rSet;

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
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1064,651 );
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 48, 227, 603);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		int x = 220;
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_2.setVisible(true);
				centerPanel.setLocation(220,60);
				
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
						centerPanel.setLocation(114, 60);
					}
					
				};thread.start();
				try {
					Thread.sleep(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1354, 49);
		panel.setBackground(new Color(102,102,255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Synchronus Health Care");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(49, 5, 343, 37);
		panel.add(lblNewLabel_1);
		firstName.setText("Welcome , User");
		firstName.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/icons8_contacts_50px_1.png")));
		firstName.setSize(10, 100);
		
		
		firstName = new JLabel("Welcome Admin");
		firstName.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/icons8_contacts_50px_1.png")));
		firstName.setForeground(Color.WHITE);
		firstName.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		firstName.setBounds(771, 0, 229, 48);
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
		
		RSMetroTextPlaceHolder email = new RSMetroTextPlaceHolder();
		email.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		email.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 120, 215)));
		email.setBackground(SystemColor.menu);
		email.setPlaceholder("Email");
		email.setBounds(47, 358, 193, 42);
		centerPanel.add(email);
		
		RSMetroTextPlaceHolder aadhar = new RSMetroTextPlaceHolder();
		aadhar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		aadhar.setPlaceholder("Aadhar No");
		aadhar.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 120, 215)));
		aadhar.setBackground(SystemColor.menu);
		aadhar.setBounds(272, 358, 193, 42);
		centerPanel.add(aadhar);
		
		JRadioButton dose1 = new JRadioButton("Dose 1");
		dose1.setBackground(Color.WHITE);
		dose1.setBounds(516, 369, 109, 23);
		dose1.setActionCommand("Dose 1");
		centerPanel.add(dose1);
		
		buttonGroup.add(dose1);
		
		lblNewLabel_3.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/back_24px.png")));
		lblNewLabel_3.setBounds(196, 11, 24, 24);
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(Color.DARK_GRAY, 3, true));
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(102, 102, 255));
		panel_3_2.setBounds(0, 46, 220, 40);
		panel_2.add(panel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Update Stocks");
		lblNewLabel_2_1.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/home_24px.png")));
		lblNewLabel_2_1.setForeground(Color.GREEN);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(10, 0, 200, 40);
		panel_3_2.add(lblNewLabel_2_1);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBorder(new LineBorder(Color.DARK_GRAY, 3, true));
		panel_3_2_1.setBackground(new Color(102, 102, 255));
		panel_3_2_1.setBounds(0, 121, 220, 40);
		panel_2.add(panel_3_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Sign Out");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Homepage().setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_2_1_1.setIcon(new ImageIcon(DashBoardAdmin.class.getResource("/AdminIcons/logout.png")));
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_2_1_1.setBounds(10, 0, 200, 40);
		panel_3_2_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		panel_1.setBounds(47, 37, 163, 115);
//		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.textHighlight);
		separator.setForeground(SystemColor.textHighlight);
		separator.setBounds(0, 11, 163, 5);
		panel_1.add(separator);
		
		JTextField coVaxin = new JTextField();
		coVaxin.setForeground(SystemColor.textHighlight);
		coVaxin.setHorizontalAlignment(SwingConstants.CENTER);
		coVaxin.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 48));
		coVaxin.setBackground(new Color(240,240,240));
		coVaxin.setBounds(28, 22, 102, 82);
		coVaxin.setBorder(null);
		panel_1.add(coVaxin);
		
		JLabel leftReamaing = new JLabel("REAMAINING");
		leftReamaing.setHorizontalAlignment(SwingConstants.CENTER);
		leftReamaing.setForeground(new Color(102, 102, 255));
		leftReamaing.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		leftReamaing.setBounds(78, 152, 115, 26);
		
		
		JLabel lblLeft_1 = new JLabel("REAMAINING");
		lblLeft_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeft_1.setForeground(new Color(102, 102, 255));
		lblLeft_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblLeft_1.setBounds(665, 152, 115, 26);
		
//		JPanel centerPanel = new JPanel();
		centerPanel.setBounds(114, 60, 874, 563);
		contentPane.add(centerPanel);
		centerPanel.add(leftReamaing);
		centerPanel.add(lblLeft_1);
		centerPanel.add(panel_1);
		centerPanel.setLayout(null);
		AppointmentDeatails appointmentDeatails = new AppointmentDeatails();
		rSet = appointmentDeatails.appiontmentDetails();
		
		
		
		

		JScrollPane scrollPane = new JScrollPane();
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Email", "Aadhar No", "Date", "Vaccine", "Vaccine Center", "Status"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(162);
		table.getColumnModel().getColumn(1).setPreferredWidth(101);
		table.getColumnModel().getColumn(4).setPreferredWidth(86);
		table.setRowSelectionAllowed(false);
		table.setBorder(null);
		table.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		table.setBackground(SystemColor.menu);
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					resultSetMetaData = (ResultSetMetaData) rSet.getMetaData();
					int q = resultSetMetaData.getColumnCount();
					DefaultTableModel recordTable = (DefaultTableModel)table.getModel();
					recordTable.setRowCount(0);
					while (rSet.next()) {
						Vector <String> columnDataVector  = new Vector<String>();
						
						for(int i = 1; i<=q;i++) {
							columnDataVector.add(rSet.getString("Email"));
							columnDataVector.add(rSet.getString("Aadhar_No"));
							columnDataVector.add(rSet.getString("Date"));
							columnDataVector.add(rSet.getString("Vaccine_Choice"));
							columnDataVector.add(rSet.getString("Vaccine_Center"));
							columnDataVector.add(rSet.getString("VaccineStatus"));
							
							
						}
						recordTable.addRow(columnDataVector);
						
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}
		});
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel recordTabel = (DefaultTableModel) table.getModel();
				int selectedRow = table.getSelectedRow();
				email.setText(recordTabel.getValueAt(selectedRow, 0).toString());
				aadhar.setText(recordTabel.getValueAt(selectedRow, 1).toString());
				
				
				
			}
		});

		scrollPane.setBorder(new LineBorder(SystemColor.textHighlight, 2));
		scrollPane.setEnabled(false);
		scrollPane.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		scrollPane.setBackground(SystemColor.textHighlight);
		scrollPane.setBounds(47, 206, 757, 125);
		centerPanel.add(scrollPane);
		
		
		
		SelectStatement selectStatement = new SelectStatement();
		aList = selectStatement.checkAvalability();
		
		@SuppressWarnings("removal")
		int a , b;
		a= aList.get(0);
		b= aList.get(1);
		Integer covi  = new Integer(a);
		@SuppressWarnings("removal")
		Integer coVaxin1 = new Integer(b);
		coVaxin.setText(coVaxin1.toString());
		
		JLabel coVaxinStock = new JLabel("COVAXIN");
		coVaxinStock.setBounds(64, 11, 115, 26);
		centerPanel.add(coVaxinStock);
		coVaxinStock.setHorizontalAlignment(SwingConstants.CENTER);
		coVaxinStock.setForeground(new Color(102,102,255));
		coVaxinStock.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		
		JLabel coVishieldstock = new JLabel("COVISHILED");
		coVishieldstock.setBounds(654, 11, 115, 26);
		centerPanel.add(coVishieldstock);
		coVishieldstock.setHorizontalAlignment(SwingConstants.CENTER);
		coVishieldstock.setForeground(new Color(102, 102, 255));
		coVishieldstock.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		//		.add(leftReamaing);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(636, 37, 163, 115);
		centerPanel.add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.textHighlight);
		separator_1.setBackground(SystemColor.textHighlight);
		separator_1.setBounds(0, 11, 163, 5);
		panel_1_1.add(separator_1);
		
		JTextField coVishield = new JTextField();
		coVishield.setBounds(29, 22, 102, 82);
		panel_1_1.add(coVishield);
		coVishield.setForeground(SystemColor.textHighlight);
		coVishield.setHorizontalAlignment(SwingConstants.CENTER);
		coVishield.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 48));
		coVishield.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		coVishield.setBackground(SystemColor.menu);
		coVishield.setText(covi.toString());
		RSMaterialButtonRectangle mtrlbtnrctnglUpdateStock = new RSMaterialButtonRectangle();
		mtrlbtnrctnglUpdateStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStocks updateStocks = new UpdateStocks();
				updateStocks.updateStocks(Integer.valueOf(coVishield.getText()), Integer.valueOf(coVaxin.getText()));
			}
		});
		mtrlbtnrctnglUpdateStock.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		mtrlbtnrctnglUpdateStock.setText("Update Stock");
		mtrlbtnrctnglUpdateStock.setBounds(317, 70, 200, 60);
		centerPanel.add(mtrlbtnrctnglUpdateStock);
		
		
		RSMaterialButtonRectangle updateDeatils = new RSMaterialButtonRectangle();
		updateDeatils.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel recordTabel = (DefaultTableModel) table.getModel();
				int selectedRow = table.getSelectedRow();
				
				recordTabel.setValueAt(email.getText(), selectedRow, 0);
				recordTabel.setValueAt(aadhar.getText(), selectedRow, 1);
				recordTabel.setValueAt(buttonGroup.getSelection().getActionCommand(), selectedRow, 5);
				
				appointmentDeatails.updateAppiontmentDeatils(email.getText(), aadhar.getText(), buttonGroup.getSelection().getActionCommand());
				
				
				
			}
		});
		updateDeatils.setText("Update Deatils");
		updateDeatils.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		updateDeatils.setBounds(317, 433, 200, 60);
		centerPanel.add(updateDeatils);
		
		
//		VaccineDetails vaccineDetails = new VaccineDetails();
//		try {
//			firstName.setVisible(true);
//			arrayList =	vaccineDetails.userDeatils(userName);
//			System.out.println(arrayList.get(0));
//			firstName.setText("Welcome Admin ");
//					
//							
//			
//			
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		
		
	}
}

