package com.techlabs.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.techlabs.student.Student;
import com.techlabs.student.StudentDataStore;
import com.techlabs.student.buildresume.StudentUI;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;

public class StudentFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtAddress;
	private JTextArea txtArea;
	private ArrayList<Student> studentRecord;
	
	StudentUI buildResume = new StudentUI();
	StudentDataStore dataStore = new StudentDataStore();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentFrame frame = new StudentFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws FileNotFoundException 
	 */
	public StudentFrame() throws FileNotFoundException, ClassNotFoundException, IOException {
		studentRecord=dataStore.fetch();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student student=new Student();
				
				student.setFName(txtFirstName.getText());
				student.setLName(txtLastName.getText());
				student.setAddress(txtAddress.getText());
				if(!(txtFirstName.getText().isEmpty()&&txtLastName.getText().isEmpty()&&txtAddress.getText().isEmpty())){
					dataStore.add(student);
				}
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtAddress.setText(null);
				JOptionPane.showMessageDialog(null, "Student Added","Message", JOptionPane.ERROR_MESSAGE);
				try {
					dataStore.save();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(107, 202, 89, 23);
		panel.add(btnAdd);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtArea.setText(null);
				for (Student student : dataStore.getList()){
					txtArea.append("RollNo :" + student.getRollNo()+"\n");
					txtArea.append("First Name :" + student.getfName()+"\n");
					txtArea.append("Last Name :" + student.getlName()+"\n");
					txtArea.append("Address :" + student.getAddress()+"\n\n");	
				}
				
			}
		});
		btnDisplay.setBounds(253, 202, 89, 23);
		panel.add(btnDisplay);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(47, 31, 73, 23);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(47, 86, 73, 14);
		panel.add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(47, 136, 73, 14);
		panel.add(lblAddress);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(147, 32, 86, 20);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(147, 83, 86, 20);
		panel.add(txtLastName);
		txtLastName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(147, 133, 86, 20);
		panel.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtArea = new JTextArea();
		txtArea.setBounds(92, 315, 235, 300);
		panel.add(txtArea);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 253, 339, 2);
		panel.add(separator);
		
		JLabel lblDisplay = new JLabel("Student Details");
		lblDisplay.setBounds(161, 281, 119, 23);
		panel.add(lblDisplay);
		
		
	}
}
