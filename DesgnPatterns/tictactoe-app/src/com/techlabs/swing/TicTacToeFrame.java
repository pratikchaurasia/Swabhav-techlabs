package com.techlabs.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import com.techlabs.board.Game;
import com.techlabs.board.IBoard;
import com.techlabs.board.IResultAnalyzer;
import com.techlabs.board.Mark;
import com.techlabs.board.Player;
import com.techlabs.board.Result;
import com.techlabs.board.Result3DAnalyzer;
import com.techlabs.board.ThreeDBoard;

public class TicTacToeFrame extends JFrame {

	private JPanel contentPane;
	private JTextField playerName1;
	private JTextField playerName2;
	static String buffer[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JLabel winner;

	private IBoard b = new ThreeDBoard();
	private IResultAnalyzer ra = new Result3DAnalyzer(b);
	private int row, column;
	private int cellNo = 0;
	private Player p1;
	private Player p2;
	private Player p[] = { p1, p2 };
	private Game game;
	private int count = 0;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeFrame frame = new TicTacToeFrame();
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
	public TicTacToeFrame() {
		
		initialize();
		disableAllButtons();
		
		JButton start = new JButton("Start");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(playerName1.getText().length()>0 &&playerName2.getText().length()>0 ){
					p1 = new Player(playerName1.getText(), Mark.X);
					p2 = new Player(playerName2.getText(), Mark.O);
					p[0]=p1;
					p[1]=p2;
					game = new Game(b, p, ra);
					start.setVisible(false);
					enableAllButtons();
					
				}
				
				
			}
			}
		);
		start.setBounds(97, 119, 89, 23);
		panel.add(start);
		
		
		JLabel lblPlayer = new JLabel("Player1 Name   :");
		lblPlayer.setBounds(26, 37, 86, 14);
		panel.add(lblPlayer);
		
		JLabel lblPlayerName = new JLabel("Player2 Name   :");
		lblPlayerName.setBounds(26, 78, 86, 14);
		panel.add(lblPlayerName);
		
		winner = new JLabel("");
		winner.setBounds(64, 285, 158, 23);
		panel.add(winner);
	
	}

	public void checkResult(JButton button, int cellNo2) {

		Result r = game.play(b.getRow(cellNo), b.getColumn(cellNo));
		button.setText(b.getCell(b.getRow(cellNo), b.getColumn(cellNo)).toString());
		button.setEnabled(false);
		if (r == Result.Win) {
			winner.setText("Winner is : " + game.getCurrentplayer().toString());
			disableAllButtons();

		}
		else if (r == Result.Draw) {
			winner.setText("Its A Draw");
		}
		else{
			winner.setText("Onging");
		}

	}

	public void disableAllButtons() {
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);

	}
	public void enableAllButtons() {
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellNo = Integer.parseInt(btn1.getText());
				checkResult(btn1, cellNo);
			}
		});
		btn1.setBounds(10, 166, 89, 23);
		panel.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellNo = Integer.parseInt(btn2.getText());
				checkResult(btn2, cellNo);
			}
		});
		btn2.setBounds(97, 166, 89, 23);
		panel.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellNo = Integer.parseInt(btn3.getText());
				checkResult(btn3, cellNo);
			}
		});
		btn3.setBounds(186, 166, 89, 23);
		panel.add(btn3);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellNo = Integer.parseInt(btn4.getText());
				checkResult(btn4, cellNo);
			}
		});
		btn4.setBounds(10, 196, 89, 23);
		panel.add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellNo = Integer.parseInt(btn5.getText());
				checkResult(btn5, cellNo);
			}
		});
		btn5.setBounds(97, 196, 89, 23);
		panel.add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellNo = Integer.parseInt(btn6.getText());
				checkResult(btn6, cellNo);
			}
		});
		btn6.setBounds(186, 196, 89, 23);
		panel.add(btn6);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellNo = Integer.parseInt(btn7.getText());
				checkResult(btn7, cellNo);
			}
		});
		btn7.setBounds(10, 222, 89, 23);
		panel.add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellNo = Integer.parseInt(btn8.getText());
				checkResult(btn8, cellNo);
			}
		});
		btn8.setBounds(97, 222, 89, 23);
		panel.add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cellNo = Integer.parseInt(btn9.getText());
				checkResult(btn9, cellNo);
			}
		});
		btn9.setBounds(186, 222, 89, 23);
		panel.add(btn9);
		
		playerName1 = new JTextField();
		playerName1.setBounds(136, 34, 86, 20);
		panel.add(playerName1);
		playerName1.setColumns(10);
		
		playerName2 = new JTextField();
		playerName2.setBounds(136, 75, 86, 20);
		panel.add(playerName2);
		playerName2.setColumns(10);
	}
}
