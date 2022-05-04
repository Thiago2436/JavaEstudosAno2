package Jcalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Formcalc extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	double primeiro , segundo, resultados;
	String Operacao, Resposta;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formcalc frame = new Formcalc();
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
	public Formcalc() {
		setTitle("JCalc by Thiago Martins");
		setResizable(false);
		setBounds(100, 100, 410, 376);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		/*
		 * Operaçoes ---------------------------------------------------------
		 */
		JButton btnNewButton = new JButton("+");// verifcar boolean se foi pressonado
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				primeiro = Double.parseDouble(textField.getText());
				textField.setText("");
				textField_1.setText("+(Adição)");
				Operacao = "+";
						
			}
		});
		btnNewButton.setBounds(12, 64, 117, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				primeiro = Double.parseDouble(textField.getText());
				textField.setText("");
				textField_1.setText("-(Subtração)");
				Operacao = "-";
			}
		});
		btnNewButton_1.setBounds(141, 64, 117, 25);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("=");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				segundo = Double.parseDouble(textField.getText());
				if(Operacao == "+") {
					resultados = (primeiro + segundo);
					Resposta = String.format("%.2f",resultados);
					textField.setText(Resposta);
					}
				else if(Operacao == "-") {
					resultados = (primeiro - segundo);
					Resposta = String.format("%.2f",resultados);
					textField.setText(Resposta);
					
					}
				else if(Operacao == "*") {
					resultados = (primeiro * segundo);
					Resposta = String.format("%.2f",resultados);
					textField.setText(Resposta);
					}
				else if(Operacao == "/") {
					resultados = (primeiro / segundo);
					Resposta = String.format("%.2f",resultados);
					textField.setText(Resposta);
					}
				
				
			}
		});
		btnNewButton_2.setBounds(141, 289, 246, 45);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				primeiro = Double.parseDouble(textField.getText());
				textField.setText("");
				textField_1.setText("/ (Divisão)");
				Operacao = "/";
			}
		});
		btnNewButton_3.setBounds(12, 106, 117, 25);
		getContentPane().add(btnNewButton_3);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(141, 215, 117, 25);
		getContentPane().add(btn5);
		
		JButton btnNewButton_5 = new JButton("*");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				primeiro = Double.parseDouble(textField.getText());
				textField.setText("");
				textField_1.setText("*(Multiplicação)");
				Operacao = "*";
			}
		});
		btnNewButton_5.setBounds(141, 106, 117, 25);
		getContentPane().add(btnNewButton_5);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(270, 252, 117, 25);
		getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBounds(12, 215, 117, 25);
		getContentPane().add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBounds(270, 178, 117, 25);
		getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(141, 178, 117, 25);
		getContentPane().add(btn2);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(141, 252, 117, 25);
		getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(12, 252, 117, 25);
		getContentPane().add(btn7);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn1.getText();
				textField.setText(EnterNumber);
				
				
			}
		});
		btn1.setBounds(12, 178, 117, 25);
		getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBounds(12, 289, 117, 25);
		getContentPane().add(btn0);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBounds(270, 215, 117, 25);
		getContentPane().add(btn6);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(12, 12, 375, 40);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_3_1_4 = new JButton("LIMPAR");
		btnNewButton_3_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnNewButton_3_1_4.setBounds(270, 106, 117, 25);
		getContentPane().add(btnNewButton_3_1_4);
		
		JButton btnNewButton_3_1_5 = new JButton("<BCKSPACE");
		btnNewButton_3_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String BCKSPC = null;
				if(textField.getText().length()>0) {
					StringBuilder StrB = new StringBuilder(textField.getText());
					StrB.deleteCharAt(textField.getText().length()-1);
					BCKSPC =StrB.toString();
					textField.setText(BCKSPC);
				}
							
			}
		});
		btnNewButton_3_1_5.setBounds(270, 64, 117, 25);
		getContentPane().add(btnNewButton_3_1_5);
		
		JLabel lblJayCalcc = new JLabel(" Operação ->");
		lblJayCalcc.setBounds(12, 137, 101, 29);
		getContentPane().add(lblJayCalcc);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Monospaced", Font.BOLD, 13));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(121, 137, 136, 25);
		getContentPane().add(textField_1);

	}
}
