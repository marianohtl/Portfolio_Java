package portfolio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Sobre extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sobre dialog = new Sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setResizable(false);
		setBackground(SystemColor.desktop);
		getContentPane().setBackground(SystemColor.desktop);
		setTitle("SOBRE MIM");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 448, 477);
		getContentPane().setLayout(null);
		contentPanel.setBackground(SystemColor.desktop);
		contentPanel.setBounds(0, 0, 432, 442);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JTextArea txtrOlMeuNome = new JTextArea();
		txtrOlMeuNome.setFont(new Font("Gabriola", Font.PLAIN, 16));
		txtrOlMeuNome.setEditable(false);
		txtrOlMeuNome.setText("Ol\u00E1! Meu nome \u00E9 Thalita e eu tenho um Sonho.\r\nEstou \"iniciando\" meus estudos dentro da \u00E1rea de TI \r\npor ter me encantado com a l\u00F3gica, encontrei algo que \r\nme diverte e fez sentido ao meu ser.\r\n\u00C9 muito dif\u00EDcil determinar uma carreira fixa, por conta das \r\ntantas vari\u00E1veis da vida, por\u00E9m, \u00E9 este o caminho que escolhi,\r\nquero conquistar de forma honesta o meu espacinho.\r\nO sistema cansa mais do que a l\u00F3gica. \r\nE os atalhos nunca fizeram muito sentido para mim. \r\nProvavelmente estou apenas no lugar errado...\r\nMeu sonho? S\u00F3 quero conectar os pontos. =) ");
		txtrOlMeuNome.setBounds(0, 141, 441, 312);
		contentPanel.add(txtrOlMeuNome);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setForeground(SystemColor.text);
		lblNome.setBounds(10, 11, 46, 14);
		contentPanel.add(lblNome);
		
		JLabel lblNewLabel = new JLabel("Thalita Mariano");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(86, 11, 96, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("IDADE:");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("24");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setBounds(90, 36, 46, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RG:");
		lblNewLabel_3.setForeground(SystemColor.text);
		lblNewLabel_3.setBounds(251, 50, 46, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("undefined");
		lblNewLabel_4.setForeground(SystemColor.text);
		lblNewLabel_4.setBounds(335, 50, 66, 14);
		contentPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CPF:");
		lblNewLabel_5.setForeground(SystemColor.text);
		lblNewLabel_5.setBounds(251, 86, 46, 14);
		contentPanel.add(lblNewLabel_5);
		
		JLabel label = new JLabel("undefined");
		label.setForeground(SystemColor.text);
		label.setBounds(335, 86, 66, 14);
		contentPanel.add(label);
		
		JLabel lblEspcie = new JLabel("ESP\u00C9CIE:");
		lblEspcie.setForeground(SystemColor.text);
		lblEspcie.setBounds(251, 11, 59, 14);
		contentPanel.add(lblEspcie);
		
		JLabel label_2 = new JLabel("undefined");
		label_2.setForeground(SystemColor.text);
		label_2.setBounds(335, 11, 66, 14);
		contentPanel.add(label_2);
	}
}
