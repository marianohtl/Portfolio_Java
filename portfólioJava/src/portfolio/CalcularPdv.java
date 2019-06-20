package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CalcularPdv extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorCompra;
	private JTextField txtDesconto;
	private JTextField txtValorRecebido;
	private JTextField txtTroco;
	private JLabel lblNewLabel;
	private JLabel lblData;
	private JLabel lblDesc;
	private JLabel lblValorDaCompra;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcularPdv frame = new CalcularPdv();
					frame.setVisible(true);
					//Centralizando o Frame
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcularPdv() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
			 alterarData();
			}
		});
		setBackground(SystemColor.inactiveCaption);
		setTitle("PDV");
		setResizable(false);
		setBounds(100, 100, 426, 327);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtValorCompra = new JTextField();
		txtValorCompra.setBounds(208, 29, 96, 20);
		contentPane.add(txtValorCompra);
		txtValorCompra.setColumns(10);
		
		txtDesconto = new JTextField();
		txtDesconto.setBounds(208, 60, 96, 20);
		contentPane.add(txtDesconto);
		txtDesconto.setColumns(10);
		
		txtValorRecebido = new JTextField();
		txtValorRecebido.setBounds(208, 155, 96, 20);
		contentPane.add(txtValorRecebido);
		txtValorRecebido.setColumns(10);
		
		JLabel lblValorTotal = new JLabel("Valor da Compra:");
		lblValorTotal.setForeground(SystemColor.textHighlightText);
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorTotal.setBounds(29, 29, 137, 20);
		contentPane.add(lblValorTotal);
		
		JLabel lblDesconto = new JLabel("Desconto:");
		lblDesconto.setForeground(SystemColor.textHighlightText);
		lblDesconto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDesconto.setBounds(29, 60, 96, 17);
		contentPane.add(lblDesconto);
		
		JLabel lblValorRecebido = new JLabel("Valor Rebido:");
		lblValorRecebido.setForeground(SystemColor.textHighlightText);
		lblValorRecebido.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorRecebido.setBounds(29, 156, 115, 14);
		contentPane.add(lblValorRecebido);
		
		JLabel lblTroco = new JLabel("Troco:");
		lblTroco.setForeground(SystemColor.textHighlightText);
		lblTroco.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTroco.setBounds(29, 192, 48, 14);
		contentPane.add(lblTroco);
		
		txtTroco = new JTextField();
		txtTroco.setBounds(208, 191, 96, 20);
		contentPane.add(txtTroco);
		txtTroco.setColumns(10);
		
		lblNewLabel = new JLabel("Troco:");
		lblNewLabel.setBounds(39, 155, 48, 14);
		contentPane.add(lblNewLabel);
		
		lblData = new JLabel("");
		lblData.setForeground(SystemColor.textHighlightText);
		lblData.setBounds(321, 230, 73, 14);
		contentPane.add(lblData);
		
		lblDesc = new JLabel("");
		lblDesc.setForeground(SystemColor.text);
		lblDesc.setBounds(29, 115, 144, 14);
		contentPane.add(lblDesc);
		
		lblValorDaCompra = new JLabel("Valor da Compra com Desconto:");
		lblValorDaCompra.setForeground(Color.WHITE);
		lblValorDaCompra.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorDaCompra.setBounds(29, 92, 233, 17);
		contentPane.add(lblValorDaCompra);
		
		btnNewButton = new JButton("LIMPAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton.setBounds(235, 255, 115, 23);
		contentPane.add(btnNewButton);;
		
		btnNewButton_1 = new JButton("CALCULAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calcular();
			}
		});
		btnNewButton_1.setBounds(290, 91, 104, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("CALCULAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularTroco();
			}
		});
		btnNewButton_2.setBounds(73, 255, 115, 23);
		contentPane.add(btnNewButton_2);
	}

	public void alterarData() {
		//evento ativar o formulário e mostrar a data
		Date data = new Date();
		DateFormat formatadorDate = DateFormat.getDateInstance(DateFormat.SHORT);
		lblData.setText(formatadorDate.format(data));
		
	}

	// CALCULANDO 

	public void calcular() {
		double desconto, valor, valorRecebido, valorTotal;
		DecimalFormat formatadorDecimal = new DecimalFormat("0.00");
		//import scanner java until
		Scanner leia = new Scanner(System.in); 
		// Date > trabalhar com Data
		Date data = new Date();
		//import Java Util
		// formatar a data
		DateFormat formatadorDate = DateFormat.getDateInstance(DateFormat.FULL);
		valor = Double.parseDouble(txtValorCompra.getText().replace(",", "."));
		desconto = Double.parseDouble(txtDesconto.getText().replace(",", "."));
		desconto = (desconto/100)* valor;
		valorTotal = valor - desconto;
		lblDesc.setText(""+valorTotal);
	}
	
	public void calcularTroco() {
		double desconto, valor, valorTotal, troco, valorRecebido;
		DecimalFormat formatador = new DecimalFormat("0.00");
		valor = Double.parseDouble(txtValorCompra.getText().replace(",", "."));
		desconto = Double.parseDouble(lblDesc.getText().replace(",", "."));
		//desconto = (desconto/100)* valor;
		desconto = Double.parseDouble(lblDesc.getText().replace(",", "."));
		valorRecebido = Double.parseDouble(txtValorRecebido.getText().replace(",", "."));
		troco = valorRecebido - desconto;
		txtTroco.setText("R$ " + formatador.format(troco));
	}

	public void limpar(){
		lblDesc.setText(null);
		txtValorCompra.setText(null);
		txtDesconto.setText(null);
		txtTroco.setText(null);
		txtValorRecebido.setText(null);
	}
}