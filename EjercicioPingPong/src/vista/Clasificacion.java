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

	public JLabel lblPuntos3;
	public JLabel lblPuntos1;
	public JLabel lblPuntos2;
	public JLabel lblPuntos4;
	public JLabel lblPuntos5;
	public JLabel lblPuntos6;
	public JLabel lblPuntos7;
	public JLabel lblPuntos8;
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

		JLabel lblTierA = new JLabel("TIER A");
		lblTierA.setForeground(Color.WHITE);
		lblTierA.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblTierA.setBounds(164, 40, 57, 19);
		contentPane.add(lblTierA);

		JLabel lblDiamante = new JLabel("");
		lblDiamante.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/tierA.png")));
		lblDiamante.setBounds(128, 76, 130, 149);
		contentPane.add(lblDiamante);

		JLabel lblTierB = new JLabel("TIER B");
		lblTierB.setForeground(Color.WHITE);
		lblTierB.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblTierB.setBounds(653, 40, 59, 19);
		contentPane.add(lblTierB);

		JLabel lblMadera = new JLabel("");
		lblMadera.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/tierB.png")));
		lblMadera.setBounds(617, 76, 130, 157);
		contentPane.add(lblMadera);

		JLabel lblLogoLiga = new JLabel("");
		lblLogoLiga.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/palas.png")));
		lblLogoLiga.setBounds(353, 92, 170, 122);
		contentPane.add(lblLogoLiga);

		JLabel lblPrimeroA = new JLabel("1\u00BA");
		lblPrimeroA.setForeground(Color.WHITE);
		lblPrimeroA.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPrimeroA.setBounds(51, 288, 60, 14);
		contentPane.add(lblPrimeroA);

		JLabel lblSegundoA = new JLabel("2\u00BA");
		lblSegundoA.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblSegundoA.setForeground(Color.WHITE);
		lblSegundoA.setBounds(51, 351, 60, 14);
		contentPane.add(lblSegundoA);

		JLabel lblTerceroA = new JLabel("3\u00BA");
		lblTerceroA.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblTerceroA.setForeground(Color.WHITE);
		lblTerceroA.setBounds(51, 421, 60, 14);
		contentPane.add(lblTerceroA);

		JLabel lblCuartoA = new JLabel("4\u00BA");
		lblCuartoA.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblCuartoA.setForeground(Color.WHITE);
		lblCuartoA.setBounds(51, 492, 60, 14);
		contentPane.add(lblCuartoA);

		JLabel lblPrimeroB = new JLabel("1\u00BA");
		lblPrimeroB.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPrimeroB.setForeground(Color.WHITE);
		lblPrimeroB.setBounds(529, 288, 60, 14);
		contentPane.add(lblPrimeroB);

		JLabel lblSegundoB = new JLabel("2\u00BA");
		lblSegundoB.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblSegundoB.setForeground(Color.WHITE);
		lblSegundoB.setBounds(529, 351, 60, 14);
		contentPane.add(lblSegundoB);

		JLabel lblTerceroB = new JLabel("3\u00BA");
		lblTerceroB.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblTerceroB.setForeground(Color.WHITE);
		lblTerceroB.setBounds(529, 421, 60, 14);
		contentPane.add(lblTerceroB);

		JLabel lblCuartoB = new JLabel("4\u00BA");
		lblCuartoB.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblCuartoB.setForeground(Color.WHITE);
		lblCuartoB.setBounds(529, 492, 60, 14);
		contentPane.add(lblCuartoB);

		JLabel lblJesus = new JLabel("JESUS");
		lblJesus.setForeground(Color.WHITE);
		lblJesus.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJesus.setBounds(106, 288, 71, 14);
		contentPane.add(lblJesus);

		JLabel lblManuel = new JLabel("MANUEL");
		lblManuel.setForeground(Color.WHITE);
		lblManuel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblManuel.setBounds(106, 351, 97, 14);
		contentPane.add(lblManuel);

		JLabel lblDavid = new JLabel("DAVID");
		lblDavid.setForeground(Color.WHITE);
		lblDavid.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblDavid.setBounds(106, 421, 119, 14);
		contentPane.add(lblDavid);

		JLabel lblPaco = new JLabel("PACO");
		lblPaco.setForeground(Color.WHITE);
		lblPaco.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPaco.setBounds(106, 492, 119, 14);
		contentPane.add(lblPaco);

		JLabel lblMaeso = new JLabel("MAESO");
		lblMaeso.setForeground(Color.WHITE);
		lblMaeso.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblMaeso.setBounds(592, 288, 77, 14);
		contentPane.add(lblMaeso);

		JLabel lblVictor = new JLabel("VICTOR");
		lblVictor.setForeground(Color.WHITE);
		lblVictor.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblVictor.setBounds(592, 351, 77, 14);
		contentPane.add(lblVictor);

		JLabel lblCarlos = new JLabel("CARLOS");
		lblCarlos.setForeground(Color.WHITE);
		lblCarlos.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblCarlos.setBounds(592, 421, 77, 14);
		contentPane.add(lblCarlos);

		JLabel lblTony = new JLabel("TONY");
		lblTony.setForeground(Color.WHITE);
		lblTony.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblTony.setBounds(592, 492, 77, 14);
		contentPane.add(lblTony);

		JLabel lblBandera1 = new JLabel("");
		lblBandera1.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILESPA\u00D1A.png")));
		lblBandera1.setBounds(198, 283, 46, 29);
		contentPane.add(lblBandera1);

		JLabel lblBandera2 = new JLabel("");
		lblBandera2.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILwilly2.png")));
		lblBandera2.setBounds(198, 340, 60, 29);
		contentPane.add(lblBandera2);

		JLabel lblBandera3 = new JLabel("");
		lblBandera3.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/Lilcorea.jpg")));
		lblBandera3.setBounds(198, 409, 45, 30);
		contentPane.add(lblBandera3);

		JLabel lblBandera4 = new JLabel("");
		lblBandera4.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILBRASIL.png")));
		lblBandera4.setBounds(198, 480, 60, 29);
		contentPane.add(lblBandera4);

		JLabel lblBandera5 = new JLabel("");
		lblBandera5.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILjamaica.jpg")));
		lblBandera5.setBounds(689, 283, 46, 29);
		contentPane.add(lblBandera5);

		JLabel lblBandera6 = new JLabel("");
		lblBandera6.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILPORTUGAL.png")));
		lblBandera6.setBounds(689, 340, 46, 29);
		contentPane.add(lblBandera6);

		JLabel lblBandera7 = new JLabel("");
		lblBandera7.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/LILESPA\u00D1A.png")));
		lblBandera7.setBounds(689, 409, 46, 29);
		contentPane.add(lblBandera7);

		JLabel lblBandera8 = new JLabel("");
		lblBandera8.setIcon(new ImageIcon(Clasificacion.class.getResource("/img/lilINDIA.png")));
		lblBandera8.setBounds(689, 480, 46, 29);
		contentPane.add(lblBandera8);

		lblPuntos1 = new JLabel(" PUNTOS");
		lblPuntos1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos1.setForeground(Color.WHITE);
		lblPuntos1.setBounds(254, 288, 107, 14);
		contentPane.add(lblPuntos1);

		lblPuntos2 = new JLabel(" PUNTOS");
		lblPuntos2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos2.setForeground(Color.WHITE);
		lblPuntos2.setBounds(254, 351, 107, 14);
		contentPane.add(lblPuntos2);

		lblPuntos3 = new JLabel(" PUNTOS");
		lblPuntos3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos3.setForeground(Color.WHITE);
		lblPuntos3.setBounds(254, 424, 107, 14);
		contentPane.add(lblPuntos3);

		lblPuntos4 = new JLabel(" PUNTOS");
		lblPuntos4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos4.setForeground(Color.WHITE);
		lblPuntos4.setBounds(254, 492, 107, 14);
		contentPane.add(lblPuntos4);

		lblPuntos5 = new JLabel(" PUNTOS");
		lblPuntos5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos5.setForeground(Color.WHITE);
		lblPuntos5.setBounds(748, 288, 107, 14);
		contentPane.add(lblPuntos5);

		lblPuntos6 = new JLabel(" PUNTOS");
		lblPuntos6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos6.setForeground(Color.WHITE);
		lblPuntos6.setBounds(748, 351, 107, 14);
		contentPane.add(lblPuntos6);

		lblPuntos7 = new JLabel(" PUNTOS");
		lblPuntos7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos7.setForeground(Color.WHITE);
		lblPuntos7.setBounds(748, 423, 107, 14);
		contentPane.add(lblPuntos7);

		lblPuntos8 = new JLabel(" PUNTOS");
		lblPuntos8.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPuntos8.setForeground(Color.WHITE);
		lblPuntos8.setBounds(745, 495, 97, 14);
		contentPane.add(lblPuntos8);

		btnVolver = new JButton("VOLVER");
		btnVolver.setBorderPainted(false);
		btnVolver.setForeground(new Color(0, 0, 0));
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnVolver.setBounds(0, 586, 909, 35);
		contentPane.add(btnVolver);

		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Jugadores.class.getResource("/img/fondoSoloNegro.jpg")));
		lblFondo.setBounds(0, 0, 909, 621);
		contentPane.add(lblFondo);
		setLocationRelativeTo(null);
	}
}
