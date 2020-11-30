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
import javax.swing.JTextField;

public class AdminClasificacion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnVolver;
	public JTextField puntos1;
	public JTextField puntos2;
	public JTextField puntos3;
	public JTextField puntos4;
	public JTextField puntos5;
	public JTextField puntos6;
	public JTextField puntos7;
	public JTextField puntos8;
	public JButton btnActualizar;

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
	public AdminClasificacion() {
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
		
		JLabel label_19 = new JLabel("PUNTOS");
		label_19.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		label_19.setForeground(Color.WHITE);
		label_19.setBounds(794, 487, 56, 14);
		contentPane.add(label_19);
		
		JLabel label_16 = new JLabel("PUNTOS");
		label_16.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		label_16.setForeground(Color.WHITE);
		label_16.setBounds(794, 290, 56, 14);
		contentPane.add(label_16);
		
		JLabel label_18 = new JLabel("PUNTOS");
		label_18.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		label_18.setForeground(Color.WHITE);
		label_18.setBounds(794, 417, 56, 14);
		contentPane.add(label_18);
		
		JLabel label_15 = new JLabel("PUNTOS");
		label_15.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		label_15.setForeground(Color.WHITE);
		label_15.setBounds(314, 487, 536, 14);
		contentPane.add(label_15);
		
		JLabel label_8 = new JLabel("PUNTOS");
		label_8.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(314, 347, 536, 14);
		contentPane.add(label_8);
		
		JLabel label_17 = new JLabel("PUNTOS");
		label_17.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		label_17.setForeground(Color.WHITE);
		label_17.setBounds(794, 347, 56, 14);
		contentPane.add(label_17);
		
		JLabel label_14 = new JLabel("PUNTOS");
		label_14.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		label_14.setForeground(Color.WHITE);
		label_14.setBounds(314, 417, 536, 14);
		contentPane.add(label_14);
		
		JLabel lblPuntos = new JLabel("PUNTOS");
		lblPuntos.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 11));
		lblPuntos.setForeground(Color.WHITE);
		lblPuntos.setBounds(314, 290, 536, 14);
		contentPane.add(lblPuntos);
		
		puntos7 = new JTextField();
		puntos7.setColumns(10);
		puntos7.setBounds(745, 410, 33, 29);
		contentPane.add(puntos7);
		
		puntos2 = new JTextField();
		puntos2.setColumns(10);
		puntos2.setBounds(258, 340, 33, 29);
		contentPane.add(puntos2);
		
		puntos8 = new JTextField();
		puntos8.setColumns(10);
		puntos8.setBounds(745, 480, 33, 29);
		contentPane.add(puntos8);
		
		puntos6 = new JTextField();
		puntos6.setColumns(10);
		puntos6.setBounds(745, 340, 33, 29);
		contentPane.add(puntos6);
		
		puntos4 = new JTextField();
		puntos4.setColumns(10);
		puntos4.setBounds(258, 480, 33, 29);
		contentPane.add(puntos4);
		
		puntos3 = new JTextField();
		puntos3.setColumns(10);
		puntos3.setBounds(258, 410, 33, 29);
		contentPane.add(puntos3);
		
		puntos5 = new JTextField();
		puntos5.setColumns(10);
		puntos5.setBounds(745, 283, 33, 29);
		contentPane.add(puntos5);
		
		puntos1 = new JTextField();
		puntos1.setBounds(258, 283, 33, 29);
		contentPane.add(puntos1);
		puntos1.setColumns(10);
		
		btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(391, 537, 107, 23);
		contentPane.add(btnActualizar);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/palas.png")));
		lblNewLabel_5.setBounds(353, 92, 170, 122);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("TIER B");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(653, 40, 59, 19);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("TIER A");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(164, 40, 57, 19);
		contentPane.add(lblNewLabel_4);
		
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
		btnVolver.setBorderPainted(false);
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
		lblFondo.setForeground(Color.WHITE);
		lblFondo.setIcon(new ImageIcon(Jugadores.class.getResource("/img/fondoSoloNegro.jpg")));
		lblFondo.setBounds(0, 0, 909, 621);
		contentPane.add(lblFondo);
		setLocationRelativeTo(null);
	}
}


