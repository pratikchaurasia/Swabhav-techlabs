package sync_async_calls;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.util.Date;

import javax.swing.JSeparator;

public class GUIframe extends JFrame {

	private JPanel contentPane;
	JLabel lblClock;
	
	SyncDateAndTime dateTime=new SyncDateAndTime();
	DateAndTime asyncDateTime=new DateAndTime();
	Thread t1=new Thread(asyncDateTime);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIframe frame = new GUIframe();
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
	public GUIframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date=dateTime.getDateAndTime();
				while(date != null){
					lblClock.setText("Date and Time : "+date);
				}
			}
		});
		btnNewButton.setBounds(20, 49, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Async print");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						t1.start();
		}
		});
		btnNewButton_1.setBounds(147, 49, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnHello = new JButton("Hello");
		btnHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Welcome to the Swabhav Techlabjqu","Message", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnHello.setBounds(275, 49, 89, 23);
		panel.add(btnHello);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 108, 317, 2);
		panel.add(separator);
		
		JLabel lblDateAndTime = new JLabel("Date And Time");
		lblDateAndTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDateAndTime.setBounds(114, 133, 162, 61);
		panel.add(lblDateAndTime);
		
		lblClock = new JLabel("");
		lblClock.setBounds(52, 192, 278, 61);
		panel.add(lblClock);
		
	}

	
}
