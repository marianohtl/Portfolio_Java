package br.com.tabuada;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;

public class calcular extends JFrame {

	private JPanel contentPane;
	private JLabel lblResult0;
	private JLabel lblMult0;
	private JLabel lblValor1;
	private JLabel lblMult1;
	private JLabel lblResult1;
	private JLabel lblValor2;
	private JLabel lblMult2;
	private JLabel lblResult2;
	private JLabel lblValor3;
	private JLabel lblValor4;
	private JLabel lblValor7;
	private JLabel lblValor5;
	private JLabel lblValor6;
	private JLabel lblValor8;
	private JLabel lblValor9;
	private JLabel lblMult3;
	private JLabel lblMult4;
	private JLabel lblMult5;
	private JLabel lblMult6;
	private JLabel lblMult7;
	private JLabel lblMult8;
	private JLabel lblMult9;
	private JLabel lblResult3;
	private JLabel lblResult4;
	private JLabel lblResult5;
	private JLabel lblResult6;
	private JLabel lblResult7;
	private JLabel lblResult8;
	private JLabel lblResult9;
	private JLabel lblValor0;
	private JLabel lblValor10;
	private JLabel lblMult10;
	private JLabel lblResult10;
	private JTextField txtValor;
	private JLabel lblNewLabel;
	private JLabel lblTabuada;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcular frame = new calcular();
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
	public calcular() {
		setTitle("TABUADA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalc = new JButton("CALCULAR");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		btnCalc.setBounds(31, 352, 112, 23);
		contentPane.add(btnCalc);
		
		lblResult0 = new JLabel("");
		lblResult0.setBounds(193, 49, 46, 14);
		contentPane.add(lblResult0);
		
		lblMult0 = new JLabel("");
		lblMult0.setBounds(108, 49, 46, 14);
		contentPane.add(lblMult0);
		
		lblValor1 = new JLabel("");
		lblValor1.setBackground(SystemColor.controlHighlight);
		lblValor1.setBounds(37, 74, 46, 14);
		contentPane.add(lblValor1);
		
		lblMult1 = new JLabel("");
		lblMult1.setBounds(108, 74, 46, 14);
		contentPane.add(lblMult1);
		
		lblResult1 = new JLabel("");
		lblResult1.setBounds(193, 74, 46, 14);
		contentPane.add(lblResult1);
		
		lblValor2 = new JLabel("");
		lblValor2.setBackground(SystemColor.controlHighlight);
		lblValor2.setBounds(37, 99, 46, 14);
		contentPane.add(lblValor2);
		
		lblMult2 = new JLabel("");
		lblMult2.setBounds(108, 99, 46, 14);
		contentPane.add(lblMult2);
		
		lblResult2 = new JLabel("");
		lblResult2.setBounds(193, 99, 46, 14);
		contentPane.add(lblResult2);
		
		lblValor3 = new JLabel("");
		lblValor3.setBackground(SystemColor.controlHighlight);
		lblValor3.setBounds(37, 129, 46, 14);
		contentPane.add(lblValor3);
		
		lblValor4 = new JLabel("");
		lblValor4.setBackground(SystemColor.controlHighlight);
		lblValor4.setBounds(37, 154, 46, 14);
		contentPane.add(lblValor4);
		
		lblValor7 = new JLabel("");
		lblValor7.setBackground(SystemColor.controlHighlight);
		lblValor7.setBounds(37, 229, 46, 14);
		contentPane.add(lblValor7);
		
		lblValor5 = new JLabel("");
		lblValor5.setBackground(SystemColor.controlHighlight);
		lblValor5.setBounds(37, 179, 46, 14);
		contentPane.add(lblValor5);
		
		lblValor6 = new JLabel("");
		lblValor6.setBackground(SystemColor.controlHighlight);
		lblValor6.setBounds(37, 204, 46, 14);
		contentPane.add(lblValor6);
		
		lblValor8 = new JLabel("");
		lblValor8.setBackground(SystemColor.controlHighlight);
		lblValor8.setBounds(37, 254, 46, 14);
		contentPane.add(lblValor8);
		
		lblValor9 = new JLabel("");
		lblValor9.setBackground(SystemColor.controlHighlight);
		lblValor9.setBounds(37, 279, 46, 14);
		contentPane.add(lblValor9);
		
		lblMult3 = new JLabel("");
		lblMult3.setBounds(108, 128, 46, 14);
		contentPane.add(lblMult3);
		
		lblMult4 = new JLabel("");
		lblMult4.setBounds(108, 154, 46, 14);
		contentPane.add(lblMult4);
		
		lblMult5 = new JLabel("");
		lblMult5.setBounds(108, 179, 46, 14);
		contentPane.add(lblMult5);
		
		lblMult6 = new JLabel("");
		lblMult6.setBounds(108, 204, 46, 14);
		contentPane.add(lblMult6);
		
		lblMult7 = new JLabel("");
		lblMult7.setBounds(108, 229, 46, 14);
		contentPane.add(lblMult7);
		
		lblMult8 = new JLabel("");
		lblMult8.setBounds(108, 254, 46, 14);
		contentPane.add(lblMult8);
		
		lblMult9 = new JLabel("");
		lblMult9.setBounds(108, 279, 46, 14);
		contentPane.add(lblMult9);
		
		lblResult3 = new JLabel("");
		lblResult3.setBounds(193, 128, 46, 14);
		contentPane.add(lblResult3);
		
		lblResult4 = new JLabel("");
		lblResult4.setBounds(193, 154, 46, 14);
		contentPane.add(lblResult4);
		
		lblResult5 = new JLabel("");
		lblResult5.setBounds(193, 179, 46, 14);
		contentPane.add(lblResult5);
		
		lblResult6 = new JLabel("");
		lblResult6.setBounds(193, 204, 46, 14);
		contentPane.add(lblResult6);
		
		lblResult7 = new JLabel("");
		lblResult7.setBounds(193, 229, 46, 14);
		contentPane.add(lblResult7);
		
		lblResult8 = new JLabel("");
		lblResult8.setBounds(193, 254, 46, 14);
		contentPane.add(lblResult8);
		
		lblResult9 = new JLabel("");
		lblResult9.setBounds(193, 279, 46, 14);
		contentPane.add(lblResult9);
		
		lblValor0 = new JLabel("");
		lblValor0.setBackground(SystemColor.controlHighlight);
		lblValor0.setBounds(37, 49, 46, 14);
		contentPane.add(lblValor0);
		
		lblValor10 = new JLabel("");
		lblValor10.setBackground(SystemColor.controlHighlight);
		lblValor10.setBounds(37, 304, 46, 14);
		contentPane.add(lblValor10);
		
		lblMult10 = new JLabel("");
		lblMult10.setBounds(108, 304, 46, 14);
		contentPane.add(lblMult10);
		
		lblResult10 = new JLabel("");
		lblResult10.setBounds(193, 304, 46, 14);
		contentPane.add(lblResult10);
		
		txtValor = new JTextField();
		txtValor.setBounds(322, 5, 26, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		lblNewLabel = new JLabel("DIGITE O VALOR:");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(188, 4, 133, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LIMPAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton.setBounds(209, 352, 112, 23);
		contentPane.add(btnNewButton);
		
		lblTabuada = new JLabel("TABUADA");
		lblTabuada.setFont(new Font("Verdana", Font.BOLD, 12));
		lblTabuada.setBounds(31, 4, 87, 20);
		contentPane.add(lblTabuada);
		
		lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(76, 304, 12, 14);
		contentPane.add(lblNewLabel_1);
		
		label = new JLabel("X");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(76, 279, 12, 14);
		contentPane.add(label);
		
		label_1 = new JLabel("X");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(76, 254, 12, 14);
		contentPane.add(label_1);
		
		label_2 = new JLabel("X");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(76, 229, 12, 14);
		contentPane.add(label_2);
		
		label_3 = new JLabel("X");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(76, 204, 12, 14);
		contentPane.add(label_3);
		
		label_4 = new JLabel("X");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(76, 179, 12, 14);
		contentPane.add(label_4);
		
		label_5 = new JLabel("X");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_5.setBounds(76, 154, 12, 14);
		contentPane.add(label_5);
		
		label_6 = new JLabel("X");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_6.setBounds(76, 128, 12, 14);
		contentPane.add(label_6);
		
		label_7 = new JLabel("X");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_7.setBounds(76, 99, 12, 14);
		contentPane.add(label_7);
		
		label_8 = new JLabel("X");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_8.setBounds(76, 74, 12, 14);
		contentPane.add(label_8);
		
		label_9 = new JLabel("X");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_9.setBounds(76, 49, 12, 14);
		contentPane.add(label_9);
		
		label_10 = new JLabel("=");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(164, 49, 19, 14);
		contentPane.add(label_10);
		
		label_11 = new JLabel("=");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_11.setBounds(164, 74, 19, 14);
		contentPane.add(label_11);
		
		label_12 = new JLabel("=");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_12.setBounds(164, 99, 19, 14);
		contentPane.add(label_12);
		
		label_13 = new JLabel("=");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_13.setBounds(164, 128, 19, 14);
		contentPane.add(label_13);
		
		label_14 = new JLabel("=");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_14.setBounds(164, 154, 19, 14);
		contentPane.add(label_14);
		
		label_15 = new JLabel("=");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_15.setBounds(164, 179, 19, 14);
		contentPane.add(label_15);
		
		label_16 = new JLabel("=");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_16.setBounds(164, 204, 19, 14);
		contentPane.add(label_16);
		
		label_17 = new JLabel("=");
		label_17.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_17.setBounds(164, 229, 19, 14);
		contentPane.add(label_17);
		
		label_18 = new JLabel("=");
		label_18.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_18.setBounds(164, 254, 19, 14);
		contentPane.add(label_18);
		
		label_19 = new JLabel("=");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_19.setBounds(164, 279, 19, 14);
		contentPane.add(label_19);
		
		label_20 = new JLabel("=");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_20.setBounds(164, 304, 19, 14);
		contentPane.add(label_20);
	}
	
	public void calc(){
		int valor, result;
		valor = (int) Double.parseDouble(txtValor.getText());		
		for (int ii = 0; ii <=10; ii++){
			System.out.println(ii);
			result = ii*valor;

			if (ii==0) {
			lblMult0.setText(""+ii);
			lblResult0.setText(""+result);
			}
			
			if (ii==1) {
			lblMult1.setText(""+ii);
			lblResult1.setText(""+result);
			}
			
			if (ii==2) {
			lblMult2.setText(""+ii);
			lblResult2.setText(""+result);
			}

			if (ii==3) {
			lblMult3.setText(""+ii);
			lblResult3.setText(""+result);
			}

			if (ii==4) {
			lblMult4.setText(""+ii);
			lblResult4.setText(""+result);
			}

			if (ii==5) {
			lblMult5.setText(""+ii);
			lblResult5.setText(""+result);
			}

			if (ii==6) {
			lblMult6.setText(""+ii);
			lblResult6.setText(""+result);
			}

			if (ii==7) {
			lblMult7.setText(""+ii);
			lblResult7.setText(""+result);
			}

			if (ii==8) {
			lblMult8.setText(""+ii);
			lblResult8.setText(""+result);
			}

			if (ii==9) {
			lblMult9.setText(""+ii);
			lblResult9.setText(""+result);
			}

			if (ii==10) {
			lblMult10.setText(""+ii);
			lblResult10.setText(""+result);
			}
		}
		
		lblValor0.setText(""+valor);
		lblValor1.setText(""+valor);
		lblValor2.setText(""+valor);
		lblValor3.setText(""+valor);
		lblValor4.setText(""+valor);
		lblValor5.setText(""+valor);
		lblValor6.setText(""+valor);
		lblValor7.setText(""+valor);
		lblValor8.setText(""+valor);
		lblValor9.setText(""+valor);
		lblValor10.setText(""+valor);
	}
	public void limpar(){

		lblValor0.setText(null);
		lblValor1.setText(null);
		lblValor2.setText(null);
		lblValor3.setText(null);
		lblValor4.setText(null);
		lblValor5.setText(null);
		lblValor6.setText(null);
		lblValor7.setText(null);
		lblValor8.setText(null);
		lblValor9.setText(null);
		lblValor10.setText(null);
		
		lblMult0.setText(null);
		lblMult1.setText(null);
		lblMult2.setText(null);
		lblMult3.setText(null);
		lblMult4.setText(null);
		lblMult5.setText(null);
		lblMult6.setText(null);
		lblMult7.setText(null);
		lblMult8.setText(null);
		lblMult9.setText(null);
		lblMult10.setText(null);
		
		lblResult0.setText(null);
		lblResult1.setText(null);
		lblResult2.setText(null);
		lblResult3.setText(null);
		lblResult4.setText(null);
		lblResult5.setText(null);
		lblResult6.setText(null);
		lblResult7.setText(null);
		lblResult8.setText(null);
		lblResult9.setText(null);
		lblResult10.setText(null);
	}
}