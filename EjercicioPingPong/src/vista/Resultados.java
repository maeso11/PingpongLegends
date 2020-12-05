package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;

public class Resultados extends JFrame {

	private JPanel contentPane;
	public JButton btnVolver;
	public JComboBox comboBox;
	public JLabel lblNewLabel_1;
	public JLabel lblJugador4;
	public JLabel lblJugador6;
	public JLabel lblPorcentaje;
	public JLabel label;
	public JLabel label_1;
	public JLabel label_2;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_4;
	public JLabel lblBandera1;
	public JLabel lblBandera4;
	public JLabel lblBandera6;
	public JLabel fotoMaeso;
	public JLabel banderaMaeso;
	public JLabel porro;
	public JLabel lblNewLabel_5;
	public JLabel lblNewLabel_8;
	public JLabel label_3;
	public JLabel label_4;
	public JLabel lblUpgrade1;
	public JLabel lblUpgrade2;
	public JLabel lblUpgrade3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultados frame = new Resultados();
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
	public Resultados() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Resultados.class.getResource("/img/palas.png")));
		setTitle("RESULTADOS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUpgrade3 = new JLabel("");
		lblUpgrade3.setIcon(new ImageIcon(Resultados.class.getResource("/img/upgrade3.png")));
		lblUpgrade3.setBounds(740, 444, 70, 70);
		contentPane.add(lblUpgrade3);
		
		lblUpgrade2 = new JLabel("");
		lblUpgrade2.setIcon(new ImageIcon(Resultados.class.getResource("/img/upgrade2.png")));
		lblUpgrade2.setBounds(740, 290, 70, 70);
		contentPane.add(lblUpgrade2);
		
		lblUpgrade1 = new JLabel("");
		lblUpgrade1.setIcon(new ImageIcon(Resultados.class.getResource("/img/upgrade1.png")));
		lblUpgrade1.setBounds(740, 152, 70, 70);
		contentPane.add(lblUpgrade1);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Resultados.class.getResource("/img/oro.png")));
		label_4.setBounds(53, 146, 77, 76);
		contentPane.add(label_4);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Resultados.class.getResource("/img/plata.png")));
		label_3.setBounds(53, 284, 77, 76);
		contentPane.add(label_3);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Resultados.class.getResource("/img/bronce.png")));
		lblNewLabel_8.setBounds(53, 438, 77, 76);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Resultados.class.getResource("/img/logoPeque\u00F1o2.png")));
		lblNewLabel.setBounds(31, 35, 210, 133);
		contentPane.add(lblNewLabel);
		
		JLabel lblResultados = new JLabel("ESTAD\u00CDSTICAS");
		lblResultados.setForeground(Color.WHITE);
		lblResultados.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 25));
		lblResultados.setBounds(349, 11, 207, 30);
		contentPane.add(lblResultados);
		
		lblBandera1 = new JLabel("");
		lblBandera1.setIcon(new ImageIcon(Resultados.class.getResource("/img/Lilcorea.jpg")));
		lblBandera1.setBounds(454, 427, 58, 33);
		contentPane.add(lblBandera1);
		
		lblNewLabel_1 = new JLabel("DAVID");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(224, 463, 77, 18);
		contentPane.add(lblNewLabel_1);
		
		lblJugador4 = new JLabel("MANUEL");
		lblJugador4.setForeground(Color.WHITE);
		lblJugador4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador4.setBounds(224, 179, 95, 18);
		contentPane.add(lblJugador4);
		
		lblBandera4 = new JLabel("");
		lblBandera4.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILwilly2.png")));
		lblBandera4.setBounds(454, 135, 50, 33);
		contentPane.add(lblBandera4);
		
		lblJugador6 = new JLabel("PACO");
		lblJugador6.setForeground(Color.WHITE);
		lblJugador6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador6.setBounds(224, 303, 77, 18);
		contentPane.add(lblJugador6);
		
		lblBandera6 = new JLabel("");
		lblBandera6.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILBRASIL.png")));
		lblBandera6.setBounds(454, 273, 50, 35);
		contentPane.add(lblBandera6);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setBorderPainted(false);
		btnVolver.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setForeground(new Color(0, 0, 0));
		btnVolver.setBounds(0, 580, 909, 41);
		contentPane.add(btnVolver);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		comboBox.setBounds(349, 68, 207, 20);
		contentPane.add(comboBox);
		comboBox.addItem("MEJORES SACADORES");
		comboBox.addItem("MEJORES RESTADORES");
		comboBox.addItem("MEJORES REMATADORES");
		comboBox.addItem("MEJORES FUMADORES");
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Resultados.class.getResource("/img/manuelMINI.jpeg")));
		lblNewLabel_2.setBounds(375, 135, 65, 87);
		contentPane.add(lblNewLabel_2);
		
		lblPorcentaje = new JLabel("PORCENTAJE SAQUES GANADORES");
		lblPorcentaje.setForeground(Color.WHITE);
		lblPorcentaje.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPorcentaje.setBounds(596, 104, 303, 18);
		contentPane.add(lblPorcentaje);
		
		label = new JLabel("83%");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		label.setBounds(647, 179, 50, 18);
		contentPane.add(label);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Resultados.class.getResource("/img/pacoMINI.jpeg")));
		lblNewLabel_3.setBounds(375, 273, 65, 87);
		contentPane.add(lblNewLabel_3);
		
		label_1 = new JLabel("77%");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		label_1.setBounds(647, 317, 34, 18);
		contentPane.add(label_1);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Resultados.class.getResource("/img/DAVIDMINI.jpg")));
		lblNewLabel_4.setBounds(375, 427, 65, 87);
		contentPane.add(lblNewLabel_4);
		
		label_2 = new JLabel("71%");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		label_2.setBounds(647, 463, 34, 18);
		contentPane.add(label_2);
		
		fotoMaeso = new JLabel("");
		fotoMaeso.setBounds(368, 102, 210, 356);
		contentPane.add(fotoMaeso);
		
		banderaMaeso = new JLabel("");
		banderaMaeso.setBounds(302, 175, 48, 28);
		contentPane.add(banderaMaeso);
		
		porro = new JLabel("");
		porro.setBounds(569, 232, 574, 118);
		contentPane.add(porro);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Resultados.class.getResource("/img/fondoSoloNegro.jpg")));
		lblNewLabel_5.setBounds(0, 0, 909, 621);
		contentPane.add(lblNewLabel_5);
		setLocationRelativeTo(null);
		
	}
}

