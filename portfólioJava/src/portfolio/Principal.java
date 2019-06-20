package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					//Centralizando o Frame
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Principal() {
		setResizable(false);
		setTitle("TELA PRINCIPAL");
		setBounds(100, 100, 507, 373);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/icones/sobre2.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//as linhas abaixo "ativam" um novo form
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
				sobre.setLocationRelativeTo(null);
			}
		});
		btnNewButton.setBounds(380, 191, 97, 103);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Principal.class.getResource("/icones/imc.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//ATIVANDO UM EVENTO
			Calcular calcular = new Calcular();
			calcular.setVisible(true);
			//Centralizando o Frame
			calcular.setLocationRelativeTo(null);
			}
		});
		btnNewButton_1.setBounds(378, 33, 99, 103);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Principal.class.getResource("/icones/dividir2.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ativando o Evento
				CalculoMedia2 calculoMedia2 = new CalculoMedia2();
				calculoMedia2.setVisible(true);
				calculoMedia2.setLocationRelativeTo(null);
			}
		});
		btnNewButton_2.setBounds(142, 33, 99, 103);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Principal.class.getResource("/icones/pedra.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PedraPapelTesoura pedrapapeltesoura = new PedraPapelTesoura();
				pedrapapeltesoura.setVisible(true);
				pedrapapeltesoura.setLocationRelativeTo(null);
			}
		});
		btnNewButton_3.setBounds(24, 191, 99, 103);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(Principal.class.getResource("/icones/mult.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculartab calculartabuada  = new calculartab();
				calculartabuada.setVisible(true);
				calculartabuada.setLocationRelativeTo(null);
			}
		});
		btnNewButton_4.setBounds(24, 33, 97, 103);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(Principal.class.getResource("/icones/Anglo-American_card_suits1.png")));
		btnNewButton_5.setBackground(SystemColor.inactiveCaptionBorder);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Array array = new Array();
				array.setVisible(true);
				array.setLocationRelativeTo(null);
			}
		});
		btnNewButton_5.setBounds(263, 33, 97, 103);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(Principal.class.getResource("/icones/cifr\u00E3o2.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalcularPdv pdv = new CalcularPdv();
				pdv.setVisible(true);
				pdv.setLocationRelativeTo(null);
			}
		});
		btnNewButton_6.setBounds(142, 191, 99, 103);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon(Principal.class.getResource("/icones/age.png")));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nascimento nascimento = new Nascimento();
				nascimento.setVisible(true);
				nascimento.setLocationRelativeTo(null);
			}
		});
		btnNewButton_7.setBounds(263, 191, 102, 103);
		contentPane.add(btnNewButton_7);
	}

}
