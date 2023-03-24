import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class Calculator {

	private JFrame frame; 
	private JTextField textField;
	
	//Initialise variables for calculations
	double first;
	double second;
	double result;
	String m1;
	String operation;
	String answer;
	

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public Calculator() {
		initialize();
	}

	//Initialise the contents of the frame.
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
		frame.setBounds(100, 100, 454, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Make "calculator" label
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel.setBounds(136, 10, 170, 46);
		frame.getContentPane().add(lblNewLabel);
		
		//Make text window where numbers and result are displayed
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setBounds(10, 66, 421, 59);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Make AC button clear the text window
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnAC.setBackground(SystemColor.window);
		btnAC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAC.setBounds(10, 135, 61, 59);
		frame.getContentPane().add(btnAC);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBackground(SystemColor.window);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 199, 61, 59);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setForeground(SystemColor.desktop);
		btn4.setBackground(SystemColor.window);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 268, 61, 59);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBackground(SystemColor.window);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 337, 61, 59);
		frame.getContentPane().add(btn1);
		
		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				m1 = Double.toString(a);
			}
		});
		btnEx.setBackground(SystemColor.window);
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEx.setBounds(84, 135, 61, 59);
		frame.getContentPane().add(btnEx);
		
		JButton btndec = new JButton(".");
		btndec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndec.getText();
				textField.setText(number);
			}
		});
		btndec.setBackground(SystemColor.window);
		btndec.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndec.setBounds(10, 406, 61, 59);
		frame.getContentPane().add(btndec);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBackground(SystemColor.window);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(84, 199, 61, 59);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBackground(SystemColor.window);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(84, 268, 61, 59);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBackground(SystemColor.window);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(84, 337, 61, 59);
		frame.getContentPane().add(btn2);
		
		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.setBackground(SystemColor.window);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				m1 = Double.toString(a);
			}
		});
		btnSqrt.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnSqrt.setBounds(155, 135, 61, 59);
		frame.getContentPane().add(btnSqrt);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBackground(SystemColor.window);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(155, 199, 61, 59);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBackground(SystemColor.window);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(155, 268, 61, 59);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBackground(SystemColor.window);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(155, 337, 61, 59);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBackground(SystemColor.window);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(84, 406, 61, 59);
		frame.getContentPane().add(btn0);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBackground(Color.WHITE);
		btnplus.setBounds(226, 135, 61, 59);
		frame.getContentPane().add(btnplus);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus.setBackground(Color.WHITE);
		btnminus.setBounds(226, 199, 61, 59);
		frame.getContentPane().add(btnminus);
		
		JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "*";
			}
		});
		btnmult.setForeground(Color.BLACK);
		btnmult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmult.setBackground(Color.WHITE);
		btnmult.setBounds(226, 268, 61, 59);
		frame.getContentPane().add(btnmult);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndiv.setBackground(Color.WHITE);
		btndiv.setBounds(226, 337, 61, 59);
		frame.getContentPane().add(btndiv);
		
		
		//Get operation when "=" button is pressed
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result = first+second;
					answer = String.format("%.2f", result);
					m1 = answer;
					textField.setText(answer);
					
				}
				else if(operation=="-")
				{
					result = first-second;
					answer = String.format("%.2f", result);
					m1 = answer;
					textField.setText(answer);
					
				}
				else if(operation=="*")
				{
					result = first*second;
					answer = String.format("%.2f", result);
					m1 = answer;
					textField.setText(answer);
					
				}
				else if(operation=="/")
				{
					result = first/second;
					answer = String.format("%.2f", result);
					m1 = answer;
					textField.setText(answer);
					
				}
				else if(operation=="X^Y") 
				{
					double resultt = 1;
					for (int i=0;i<second;i++) {
						resultt = first*resultt;
					}
					
					
					answer = String.format("%.2f", resultt);
					m1 = answer;
					textField.setText(answer);
				}
				else if(operation=="%") 
				{
					result = first%second;
					answer = String.format("%.2f",result);
					m1 = answer;
					textField.setText(answer);
				}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBackground(Color.WHITE);
		btnequal.setBounds(226, 406, 61, 59);
		frame.getContentPane().add(btnequal);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log10(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				m1 = Double.toString(a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLog.setBackground(Color.WHITE);
		btnLog.setBounds(300, 135, 61, 59);
		frame.getContentPane().add(btnLog);
		
		JButton btnLn = new JButton("ln");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				m1 = Double.toString(a);
			}
		});
		btnLn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLn.setBackground(Color.WHITE);
		btnLn.setBounds(300, 199, 61, 59);
		frame.getContentPane().add(btnLn);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "X^Y";
			}
		});
		btnXy.setForeground(Color.BLACK);
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXy.setBackground(Color.WHITE);
		btnXy.setBounds(300, 268, 61, 59);
		frame.getContentPane().add(btnXy);
		
		JButton btnX2 = new JButton("x^2");
		btnX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*a;
				m1 = Double.toString(a);
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnX2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnX2.setBackground(Color.WHITE);
		btnX2.setBounds(300, 337, 61, 59);
		frame.getContentPane().add(btnX2);
		
		JButton btnX3 = new JButton("x^3");
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*a*a;
				m1 = Double.toString(a);
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnX3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnX3.setBackground(Color.WHITE);
		btnX3.setBounds(300, 406, 61, 59);
		frame.getContentPane().add(btnX3);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				m1 = Double.toString(a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSin.setBackground(Color.WHITE);
		btnSin.setBounds(370, 135, 61, 59);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				m1 = Double.toString(a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCos.setBackground(Color.WHITE);
		btnCos.setBounds(370, 199, 61, 59);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				m1 = Double.toString(a);
			}
		});
		btnTan.setForeground(SystemColor.desktop);
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTan.setBackground(Color.WHITE);
		btnTan.setBounds(370, 268, 61, 59);
		frame.getContentPane().add(btnTan);
		
		JButton btnMod = new JButton("MOD");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMod.setBackground(Color.WHITE);
		btnMod.setBounds(370, 337, 61, 59);
		frame.getContentPane().add(btnMod);
		
		JButton btnfac = new JButton("x!");
		btnfac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact=1;
				while (a!=0) {
					fact = fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				m1 = Double.toString(fact);
			}
		});
		btnfac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnfac.setBackground(Color.WHITE);
		btnfac.setBounds(370, 406, 61, 59);
		frame.getContentPane().add(btnfac);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText(textField.getText() + m1);
			}
		});
		btnM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnM.setBackground(Color.WHITE);
		btnM.setBounds(155, 406, 61, 59);
		frame.getContentPane().add(btnM);
	}
}
