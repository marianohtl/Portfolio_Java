package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Nascimento extends JFrame {

	private JPanel contentPane;
	private JTextField txtAnoNasc;
	private JLabel lblNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nascimento frame = new Nascimento();
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
	public Nascimento() {
		setResizable(false);
		setTitle("NASCIMENTO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 330, 195);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite em que ano voc\u00EA nasceu:");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 63, 225, 19);
		contentPane.add(lblNewLabel);
		
		txtAnoNasc = new JTextField();
		txtAnoNasc.setBounds(222, 64, 67, 20);
		contentPane.add(txtAnoNasc);
		txtAnoNasc.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ANO DE NASCIMENTO");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 26, 173, 17);
		contentPane.add(lblNewLabel_1);
		
		lblNasc = new JLabel("");
		lblNasc.setBounds(10, 86, 241, 25);
		contentPane.add(lblNasc);
		
		JButton btnNewButton = new JButton("IDADE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularNasc();
			}
		});
		btnNewButton.setBounds(10, 122, 103, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LIMPAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setBounds(200, 122, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	
	public void calcularNasc() {
		//Date data = new Date();
		//DateFormat formatadorDate = DateFormat.getDateInstance(DateFormat.YEAR_FIELD);
		Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int data = (int) Double.parseDouble(txtAnoNasc.getText());	
        int nasc = year - data;
        if (nasc <= 0) {
        	lblNasc.setText("Dados inválidos! Tente novamente.");	
		} else {
			if (nasc == 1) {
		        lblNasc.setText("Você tem  "+nasc+" ano de idade.");
			} else {
		        lblNasc.setText("Você tem  "+nasc+" anos de idade.");
			}
		}
	}
	
	public void limpar() {
		txtAnoNasc.setText(null);
		lblNasc.setText(null);
	}
}
