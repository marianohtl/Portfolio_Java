package portfolio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;

public class Array extends JFrame {

	private JPanel contentPane;
	private JButton btnNaipes;
	private JButton btnNewButton;
	private JLabel lblFaces;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setResizable(false);
		setBackground(SystemColor.desktop);
		setTitle("CARTAS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 277, 242);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblFaces = new JLabel("");
		lblFaces.setFont(new Font("Tahoma", Font.PLAIN, 46));
		lblFaces.setBounds(66, 26, 59, 95);
		contentPane.add(lblFaces);
		
		btnNaipes = new JButton("");
		btnNaipes.setBounds(138, 26, 89, 95);
		contentPane.add(btnNaipes);
		
		btnNewButton = new JButton("JOGAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				random();
			}
		});
		btnNewButton.setBounds(88, 151, 89, 23);
		contentPane.add(btnNewButton);
		
		button = new JButton("");
		button.setBounds(36, 26, 89, 95);
		contentPane.add(button);
	}
	
	public void random() {
		Random random = new Random();
		int numeroFace = random.nextInt(13);
		int numeroNipe = random.nextInt(4);
		int[] nipes = new int[4];
		nipes [0] = 1;
		nipes [1] = 2;
		nipes [2] = 3;
		nipes [3] = 4;
		String [] faces = new String[13];
		faces [0] = "A";
		faces [1] = "2";
		faces [2] = "3";
		faces [3] = "4";
		faces [4] = "5";
		faces [5] = "6";
		faces [6] = "7";
		faces [7] = "8";
		faces [8] = "9";
		faces [9] = "10";
		faces [10] = "J";
		faces [11] = "Q";
		faces [12] = "K";
		
		lblFaces.setText(faces[numeroFace]);
		if (numeroNipe == 1) {
			btnNaipes.setIcon(new ImageIcon(Array.class.getResource("/icones/1.1.png")));
		} else {
			if (numeroNipe == 2) {
				btnNaipes.setIcon(new ImageIcon(Array.class.getResource("/icones/2.2.png")));
			} else {
				if (numeroNipe == 3) {
					btnNaipes.setIcon(new ImageIcon(Array.class.getResource("/icones/3.3.png")));
				} else {
					btnNaipes.setIcon(new ImageIcon(Array.class.getResource("/icones/4.4.png")));
				}
				
			}
		}
	}
}