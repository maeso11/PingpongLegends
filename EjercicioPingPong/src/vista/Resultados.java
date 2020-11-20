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

public class Resultados extends JFrame {

	private JPanel contentPane;
	public JButton btnVolver;
	public JButton btnClasificacion;
	public JButton btnActualizar;
	public JButton btnJugadores;
	public JButton btnSimulacion;
	
	private JTextField textPuntos1;
	private JTextField textPuntos2;
	private JTextField textPuntos3;
	private JTextField textPuntos4;
	private JTextField textPuntos5;
	private JTextField textPuntos6;
	private JTextField textPuntos7;
	private JTextField textPuntos8;

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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Resultados.class.getResource("/img/logoPeque\u00F1o2.png")));
		lblNewLabel.setBounds(31, 35, 210, 133);
		contentPane.add(lblNewLabel);
		
		JLabel lblResultados = new JLabel("RESULTADOS");
		lblResultados.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		lblResultados.setBounds(349, 11, 194, 24);
		contentPane.add(lblResultados);
		
		JLabel lblInformacin = new JLabel("INFORMACI\u00D3N");
		lblInformacin.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblInformacin.setBounds(273, 73, 122, 23);
		contentPane.add(lblInformacin);
		
		JLabel lblNovedades = new JLabel("NOVEDADES");
		lblNovedades.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNovedades.setBounds(502, 77, 94, 20);
		contentPane.add(lblNovedades);
		
		JLabel lblMsTorneos = new JLabel("M\u00C1S TORNEOS");
		lblMsTorneos.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblMsTorneos.setBounds(734, 68, 151, 32);
		contentPane.add(lblMsTorneos);
		
		JLabel lblBandera1 = new JLabel("");
		lblBandera1.setIcon(new ImageIcon(Resultados.class.getResource("/img/Lilcorea.jpg")));
		lblBandera1.setBounds(31, 318, 58, 33);
		contentPane.add(lblBandera1);
		
		JLabel lblNewLabel_1 = new JLabel("DAVID");
		lblNewLabel_1.setBounds(89, 320, 46, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblVs = new JLabel("VS");
		lblVs.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblVs.setBounds(186, 329, 46, 14);
		contentPane.add(lblVs);
		
		JLabel lblNewLabel_2 = new JLabel("TONY");
		lblNewLabel_2.setBounds(282, 328, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblBandera2 = new JLabel("");
		lblBandera2.setIcon(new ImageIcon(Resultados.class.getResource("/img/lilINDIA.png")));
		lblBandera2.setBounds(349, 319, 50, 33);
		contentPane.add(lblBandera2);
		
		JLabel lblBandera3 = new JLabel("");
		lblBandera3.setIcon(new ImageIcon(Resultados.class.getResource("/img/ESPA\u00D1A.png")));
		lblBandera3.setBounds(31, 433, 50, 33);
		contentPane.add(lblBandera3);
		
		JLabel lblJugador3 = new JLabel("JES\u00DAS");
		lblJugador3.setBounds(89, 444, 46, 14);
		contentPane.add(lblJugador3);
		
		JLabel label = new JLabel("VS");
		label.setFont(new Font("Stencil", Font.PLAIN, 15));
		label.setBounds(186, 445, 46, 14);
		contentPane.add(label);
		
		JLabel lblJugador4 = new JLabel("MANUEL");
		lblJugador4.setBounds(282, 444, 57, 14);
		contentPane.add(lblJugador4);
		
		JLabel lblBandera4 = new JLabel("");
		lblBandera4.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILwilly2.png")));
		lblBandera4.setBounds(349, 433, 50, 33);
		contentPane.add(lblBandera4);
		
		JLabel lblBandera5 = new JLabel("");
		lblBandera5.setIcon(new ImageIcon(Resultados.class.getResource("/img/ESPA\u00D1A.png")));
		lblBandera5.setBounds(446, 319, 50, 33);
		contentPane.add(lblBandera5);
		
		JLabel lblJugador5 = new JLabel("CARLOS");
		lblJugador5.setBounds(533, 328, 63, 14);
		contentPane.add(lblJugador5);
		
		JLabel label_1 = new JLabel("VS");
		label_1.setFont(new Font("Stencil", Font.PLAIN, 15));
		label_1.setBounds(644, 329, 46, 14);
		contentPane.add(label_1);
		
		JLabel lblJugador6 = new JLabel("PACO");
		lblJugador6.setBounds(743, 328, 46, 14);
		contentPane.add(lblJugador6);
		
		JLabel lblBandera6 = new JLabel("");
		lblBandera6.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILBRASIL.png")));
		lblBandera6.setBounds(798, 317, 50, 35);
		contentPane.add(lblBandera6);
		
		JLabel lblBandera7 = new JLabel("");
		lblBandera7.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILPORTUGAL.png")));
		lblBandera7.setBounds(450, 433, 50, 33);
		contentPane.add(lblBandera7);
		
		JLabel lblJugador7 = new JLabel("V\u00CDCTOR");
		lblJugador7.setBounds(533, 444, 46, 14);
		contentPane.add(lblJugador7);
		
		JLabel label_2 = new JLabel("VS");
		label_2.setFont(new Font("Stencil", Font.PLAIN, 15));
		label_2.setBounds(644, 445, 46, 14);
		contentPane.add(label_2);
		
		JLabel lblJugador8 = new JLabel("MAESO");
		lblJugador8.setBounds(743, 444, 46, 14);
		contentPane.add(lblJugador8);
		
		JLabel lblBandera8 = new JLabel("");
		lblBandera8.setIcon(new ImageIcon(Resultados.class.getResource("/img/LILjamaica.jpg")));
		lblBandera8.setBounds(798, 433, 50, 33);
		contentPane.add(lblBandera8);
		
		
		
		textPuntos1 = new JTextField();
		textPuntos1.setEditable(false);
		textPuntos1.setBounds(145, 325, 15, 20);
		contentPane.add(textPuntos1);
		textPuntos1.setColumns(10);
		
		textPuntos2 = new JTextField();
		textPuntos2.setEditable(false);
		textPuntos2.setBounds(228, 325, 15, 20);
		contentPane.add(textPuntos2);
		textPuntos2.setColumns(10);
		
		textPuntos3 = new JTextField();
		textPuntos3.setEditable(false);
		textPuntos3.setColumns(10);
		textPuntos3.setBounds(149, 441, 15, 20);
		contentPane.add(textPuntos3);
		
		textPuntos4 = new JTextField();
		textPuntos4.setEditable(false);
		textPuntos4.setColumns(10);
		textPuntos4.setBounds(228, 441, 15, 20);
		contentPane.add(textPuntos4);
		
		textPuntos5 = new JTextField();
		textPuntos5.setEditable(false);
		textPuntos5.setColumns(10);
		textPuntos5.setBounds(608, 325, 15, 20);
		contentPane.add(textPuntos5);
		
		textPuntos6 = new JTextField();
		textPuntos6.setEditable(false);
		textPuntos6.setColumns(10);
		textPuntos6.setBounds(689, 325, 15, 20);
		contentPane.add(textPuntos6);
		
		textPuntos7 = new JTextField();
		textPuntos7.setEditable(false);
		textPuntos7.setColumns(10);
		textPuntos7.setBounds(608, 441, 15, 20);
		contentPane.add(textPuntos7);
		
		textPuntos8 = new JTextField();
		textPuntos8.setEditable(false);
		textPuntos8.setColumns(10);
		textPuntos8.setBounds(689, 441, 15, 20);
		contentPane.add(textPuntos8);
		
		btnJugadores = new JButton("JUGADORES");
		btnJugadores.setBounds(257, 97, 157, 48);
		contentPane.add(btnJugadores);
		
		btnClasificacion = new JButton("CLASIFICACI\u00D3N");
		btnClasificacion.setBounds(468, 96, 171, 50);
		contentPane.add(btnClasificacion);
		
		btnSimulacion = new JButton("SIMULACI\u00D3N");
		btnSimulacion.setBounds(700, 96, 185, 50);
		contentPane.add(btnSimulacion);
		
		btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setBounds(378, 542, 122, 56);
		contentPane.add(btnActualizar);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(793, 569, 106, 41);
		contentPane.add(btnVolver);
		setLocationRelativeTo(null);
	}
}
