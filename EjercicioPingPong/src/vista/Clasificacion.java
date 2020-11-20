package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Window.Type;
import java.awt.Toolkit;

public class Clasificacion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clasificacion frame = new Clasificacion();
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
	public Clasificacion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Clasificacion.class.getResource("/img/palas.png")));
		setTitle("CLASIFICACI\u00D3N");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/Lilcorea.jpg")));
		lblNewLabel_3.setBounds(198, 409, 45, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblJesus_2 = new JLabel("DAVID");
		lblJesus_2.setForeground(Color.WHITE);
		lblJesus_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJesus_2.setBounds(106, 421, 119, 14);
		contentPane.add(lblJesus_2);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILBRASIL.png")));
		label_9.setBounds(198, 480, 60, 29);
		contentPane.add(label_9);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILESPA\u00D1A.png")));
		label_12.setBounds(689, 409, 46, 29);
		contentPane.add(label_12);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILESPA\u00D1A.png")));
		lblNewLabel.setBounds(198, 283, 46, 29);
		contentPane.add(lblNewLabel);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILjamaica.jpg")));
		label_11.setBounds(689, 283, 46, 29);
		contentPane.add(label_11);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILwilly2.png")));
		label_7.setBounds(198, 340, 60, 29);
		contentPane.add(label_7);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILPORTUGAL.png")));
		label_10.setBounds(689, 340, 46, 29);
		contentPane.add(label_10);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/lilINDIA.png")));
		label_13.setBounds(689, 480, 46, 29);
		contentPane.add(label_13);
		
		JLabel lblPuntos_2 = new JLabel("10 PUNTOS");
		lblPuntos_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos_2.setForeground(Color.WHITE);
		lblPuntos_2.setBounds(254, 424, 107, 14);
		contentPane.add(lblPuntos_2);
		
		JLabel lblPuntos_6 = new JLabel("7 PUNTOS");
		lblPuntos_6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos_6.setForeground(Color.WHITE);
		lblPuntos_6.setBounds(748, 423, 107, 14);
		contentPane.add(lblPuntos_6);
		
		JLabel lblPuntos_1 = new JLabel("11 PUNTOS");
		lblPuntos_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos_1.setForeground(Color.WHITE);
		lblPuntos_1.setBounds(254, 351, 107, 14);
		contentPane.add(lblPuntos_1);
		
		JLabel lblPuntos_4 = new JLabel("12 PUNTOS");
		lblPuntos_4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos_4.setForeground(Color.WHITE);
		lblPuntos_4.setBounds(748, 288, 107, 14);
		contentPane.add(lblPuntos_4);
		
		JLabel lblPuntos = new JLabel("16 PUNTOS");
		lblPuntos.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos.setForeground(Color.WHITE);
		lblPuntos.setBounds(254, 288, 107, 14);
		contentPane.add(lblPuntos);
		
		JLabel lblPuntos_3 = new JLabel("7 PUNTOS");
		lblPuntos_3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos_3.setForeground(Color.WHITE);
		lblPuntos_3.setBounds(254, 492, 107, 14);
		contentPane.add(lblPuntos_3);
		
		JLabel lblPuntos_5 = new JLabel("11 PUNTOS");
		lblPuntos_5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos_5.setForeground(Color.WHITE);
		lblPuntos_5.setBounds(748, 351, 107, 14);
		contentPane.add(lblPuntos_5);
		
		JLabel lblPuntos_7 = new JLabel("5 PUNTOS");
		lblPuntos_7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos_7.setForeground(Color.WHITE);
		lblPuntos_7.setBounds(745, 495, 97, 14);
		contentPane.add(lblPuntos_7);
		
		JLabel lblJesus_6 = new JLabel("CARLOS");
		lblJesus_6.setForeground(Color.WHITE);
		lblJesus_6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJesus_6.setBounds(592, 421, 77, 14);
		contentPane.add(lblJesus_6);
		
		JLabel lblJesus_4 = new JLabel("MAESO");
		lblJesus_4.setForeground(Color.WHITE);
		lblJesus_4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJesus_4.setBounds(592, 288, 77, 14);
		contentPane.add(lblJesus_4);
		
		JLabel lblJesus_3 = new JLabel("PACO");
		lblJesus_3.setForeground(Color.WHITE);
		lblJesus_3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJesus_3.setBounds(106, 492, 119, 14);
		contentPane.add(lblJesus_3);
		
		JLabel lblJesus = new JLabel("JESUS");
		lblJesus.setForeground(Color.WHITE);
		lblJesus.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJesus.setBounds(106, 288, 71, 14);
		contentPane.add(lblJesus);
		
		JLabel lblJesus_7 = new JLabel("TONY");
		lblJesus_7.setForeground(Color.WHITE);
		lblJesus_7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJesus_7.setBounds(592, 492, 77, 14);
		contentPane.add(lblJesus_7);
		
		JLabel lblJesus_5 = new JLabel("VICTOR");
		lblJesus_5.setForeground(Color.WHITE);
		lblJesus_5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJesus_5.setBounds(592, 351, 77, 14);
		contentPane.add(lblJesus_5);
		
		JLabel lblJesus_1 = new JLabel("MANUEL");
		lblJesus_1.setForeground(Color.WHITE);
		lblJesus_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJesus_1.setBounds(106, 351, 97, 14);
		contentPane.add(lblJesus_1);
		
		JLabel label_6 = new JLabel("4\u00BA");
		label_6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(529, 492, 60, 14);
		contentPane.add(label_6);
		
		JLabel label_5 = new JLabel("3\u00BA");
		label_5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(529, 421, 60, 14);
		contentPane.add(label_5);
		
		JLabel label_4 = new JLabel("2\u00BA");
		label_4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(529, 351, 60, 14);
		contentPane.add(label_4);
		
		JLabel label_2 = new JLabel("4\u00BA");
		label_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(51, 492, 60, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("1\u00BA");
		label_3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(529, 288, 60, 14);
		contentPane.add(label_3);
		
		JLabel label_1 = new JLabel("3\u00BA");
		label_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(51, 421, 60, 14);
		contentPane.add(label_1);
		
		JLabel lblPrimero = new JLabel("1\u00BA");
		lblPrimero.setForeground(Color.WHITE);
		lblPrimero.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPrimero.setBounds(51, 288, 60, 14);
		contentPane.add(lblPrimero);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/tierB.png")));
		lblNewLabel_2.setBounds(617, 76, 130, 157);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/tierA.png")));
		lblNewLabel_1.setBounds(128, 76, 130, 149);
		contentPane.add(lblNewLabel_1);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(new Color(0, 0, 0));
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnVolver.setBounds(0, 586, 909, 35);
		contentPane.add(btnVolver);
		
		JLabel label = new JLabel("2\u00BA");
		label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		label.setForeground(Color.WHITE);
		label.setBounds(51, 351, 60, 14);
		contentPane.add(label);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Jugadores.class.getResource("/img/fondoSoloNegro.jpg")));
		lblFondo.setBounds(0, 0, 909, 621);
		contentPane.add(lblFondo);
		setLocationRelativeTo(null);
	}
}


