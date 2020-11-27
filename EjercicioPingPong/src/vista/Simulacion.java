package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;

public class Simulacion extends JFrame {

	private JPanel contentPane;
	public JTextField txtPuntuacion1;
	public JTextField txtPuntuacion2;
	private JTextField txtPuntuacion3;
	private JTextField txtPuntuacion4;
	private JTextField txtPuntuacion5;
	private JTextField txtPuntuacion6;
	private JTextField txtPuntuacion7;
	private JTextField txtPuntuacion8;
	private JTextField txtPuntuacionSemi1;
	private JTextField txtPuntuacionSemi2;
	private JTextField txtPuntuacionSemi3;
	private JTextField txtPuntuacionSemi4;
	private JTextField txtPuntuacionFinal1;
	private JTextField txtPuntuacionFinal2;
	public JLabel lblJugador1;
	public JLabel lblJugador2;
	public JLabel lblJugador3;
	public JLabel lblJugador4;
	public JLabel lblJugador5;
	public JLabel lblJugador6;
	public JLabel lblJugador7;
	public JLabel lblJugador8;
	public JLabel lblSemifinalista1;
	public JLabel lblSemifinalista2;
	public JLabel lblSemifinalista3;
	public JLabel lblSemifinalista4;
	public JLabel lblFinalista1;
	public JLabel lblFinalista2;
	public JButton btnSimular;
	public JButton btnVolver;
	public JButton btnGenerar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulacion frame = new Simulacion();
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
	public Simulacion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Simulacion.class.getResource("/img/palas.png")));
		setResizable(false);
		setTitle("SIMULACI\u00D3N");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSimulacionFinal = new JButton("");
		btnSimulacionFinal.setIcon(new ImageIcon(Simulacion.class.getResource("/img/plei.png")));
		btnSimulacionFinal.setRolloverIcon(new ImageIcon(Simulacion.class.getResource("/img/plei2.png")));
		btnSimulacionFinal.setFocusTraversalPolicyProvider(true);
		btnSimulacionFinal.setFocusPainted(false);
		btnSimulacionFinal.setContentAreaFilled(false);
		btnSimulacionFinal.setBorderPainted(false);
		btnSimulacionFinal.setBounds(417, 275, 72, 48);
		contentPane.add(btnSimulacionFinal);
		
		JButton btnSimulacionSemi2 = new JButton("");
		btnSimulacionSemi2.setRolloverIcon(new ImageIcon(Simulacion.class.getResource("/img/plei2.png")));
		btnSimulacionSemi2.setIcon(new ImageIcon(Simulacion.class.getResource("/img/plei.png")));
		btnSimulacionSemi2.setFocusTraversalPolicyProvider(true);
		btnSimulacionSemi2.setFocusPainted(false);
		btnSimulacionSemi2.setContentAreaFilled(false);
		btnSimulacionSemi2.setBorderPainted(false);
		btnSimulacionSemi2.setBounds(622, 227, 72, 48);
		contentPane.add(btnSimulacionSemi2);
		
		JButton btnSimulacion4 = new JButton("");
		btnSimulacion4.setIcon(new ImageIcon(Simulacion.class.getResource("/img/plei.png")));
		btnSimulacion4.setRolloverIcon(new ImageIcon(Simulacion.class.getResource("/img/plei2.png")));
		btnSimulacion4.setFocusTraversalPolicyProvider(true);
		btnSimulacion4.setFocusPainted(false);
		btnSimulacion4.setContentAreaFilled(false);
		btnSimulacion4.setBorderPainted(false);
		btnSimulacion4.setBounds(793, 364, 72, 48);
		contentPane.add(btnSimulacion4);
		
		JButton btnSimulacion3 = new JButton("");
		btnSimulacion3.setRolloverIcon(new ImageIcon(Simulacion.class.getResource("/img/plei2.png")));
		btnSimulacion3.setIcon(new ImageIcon(Simulacion.class.getResource("/img/plei.png")));
		btnSimulacion3.setFocusTraversalPolicyProvider(true);
		btnSimulacion3.setFocusPainted(false);
		btnSimulacion3.setContentAreaFilled(false);
		btnSimulacion3.setBorderPainted(false);
		btnSimulacion3.setBounds(793, 96, 72, 48);
		contentPane.add(btnSimulacion3);
		
		JButton btnSimulacionSemi1 = new JButton("");
		btnSimulacionSemi1.setIcon(new ImageIcon(Simulacion.class.getResource("/img/plei.png")));
		btnSimulacionSemi1.setRolloverIcon(new ImageIcon(Simulacion.class.getResource("/img/plei2.png")));
		btnSimulacionSemi1.setFocusTraversalPolicyProvider(true);
		btnSimulacionSemi1.setFocusPainted(false);
		btnSimulacionSemi1.setContentAreaFilled(false);
		btnSimulacionSemi1.setBorderPainted(false);
		btnSimulacionSemi1.setBounds(214, 227, 72, 48);
		contentPane.add(btnSimulacionSemi1);
		
		JButton btnSimulacion2 = new JButton("");
		btnSimulacion2.setRolloverIcon(new ImageIcon(Simulacion.class.getResource("/img/plei2.png")));
		btnSimulacion2.setIcon(new ImageIcon(Simulacion.class.getResource("/img/plei.png")));
		btnSimulacion2.setFocusTraversalPolicyProvider(true);
		btnSimulacion2.setFocusPainted(false);
		btnSimulacion2.setContentAreaFilled(false);
		btnSimulacion2.setBorderPainted(false);
		btnSimulacion2.setBounds(27, 364, 72, 48);
		contentPane.add(btnSimulacion2);
		
		JButton btnSimulacion1 = new JButton("");
		btnSimulacion1.setBorderPainted(false);
		btnSimulacion1.setRolloverIcon(new ImageIcon(Simulacion.class.getResource("/img/plei2.png")));
		btnSimulacion1.setFocusTraversalPolicyProvider(true);
		btnSimulacion1.setFocusPainted(false);
		btnSimulacion1.setContentAreaFilled(false);
		btnSimulacion1.setIcon(new ImageIcon(Simulacion.class.getResource("/img/plei.png")));
		btnSimulacion1.setBounds(27, 96, 72, 48);
		contentPane.add(btnSimulacion1);
		
		
		txtPuntuacion1 = new JTextField();
		txtPuntuacion1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		txtPuntuacion1.setBounds(81, 78, 35, 20);
		contentPane.add(txtPuntuacion1);
		txtPuntuacion1.setColumns(10);
		
		txtPuntuacion2 = new JTextField();
		txtPuntuacion2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		txtPuntuacion2.setBounds(81, 145, 35, 20);
		contentPane.add(txtPuntuacion2);
		txtPuntuacion2.setColumns(10);
		
		txtPuntuacion3 = new JTextField();
		txtPuntuacion3.setBounds(81, 345, 35, 20);
		contentPane.add(txtPuntuacion3);
		txtPuntuacion3.setColumns(10);
		
		txtPuntuacion4 = new JTextField();
		txtPuntuacion4.setBounds(81, 411, 35, 20);
		contentPane.add(txtPuntuacion4);
		txtPuntuacion4.setColumns(10);
		
		txtPuntuacion5 = new JTextField();
		txtPuntuacion5.setBounds(766, 79, 35, 20);
		contentPane.add(txtPuntuacion5);
		txtPuntuacion5.setColumns(10);
		
		txtPuntuacion6 = new JTextField();
		txtPuntuacion6.setBounds(766, 146, 35, 20);
		contentPane.add(txtPuntuacion6);
		txtPuntuacion6.setColumns(10);
		
		txtPuntuacion7 = new JTextField();
		txtPuntuacion7.setBounds(766, 345, 35, 20);
		contentPane.add(txtPuntuacion7);
		txtPuntuacion7.setColumns(10);
		
		txtPuntuacion8 = new JTextField();
		txtPuntuacion8.setBounds(766, 411, 35, 20);
		contentPane.add(txtPuntuacion8);
		txtPuntuacion8.setColumns(10);
		
		txtPuntuacionSemi1 = new JTextField();
		txtPuntuacionSemi1.setColumns(10);
		txtPuntuacionSemi1.setBounds(214, 176, 35, 20);
		contentPane.add(txtPuntuacionSemi1);
		
		txtPuntuacionSemi2 = new JTextField();
		txtPuntuacionSemi2.setColumns(10);
		txtPuntuacionSemi2.setBounds(214, 316, 35, 20);
		contentPane.add(txtPuntuacionSemi2);
		
		txtPuntuacionSemi3 = new JTextField();
		txtPuntuacionSemi3.setColumns(10);
		txtPuntuacionSemi3.setBounds(622, 176, 35, 20);
		contentPane.add(txtPuntuacionSemi3);
		
		txtPuntuacionSemi4 = new JTextField();
		txtPuntuacionSemi4.setColumns(10);
		txtPuntuacionSemi4.setBounds(622, 316, 35, 20);
		contentPane.add(txtPuntuacionSemi4);
		
		txtPuntuacionFinal1 = new JTextField();
		txtPuntuacionFinal1.setBounds(399, 249, 35, 20);
		contentPane.add(txtPuntuacionFinal1);
		txtPuntuacionFinal1.setColumns(10);
		
		txtPuntuacionFinal2 = new JTextField();
		txtPuntuacionFinal2.setBounds(469, 249, 35, 20);
		contentPane.add(txtPuntuacionFinal2);
		txtPuntuacionFinal2.setColumns(10);
		
		btnSimular = new JButton("SIMULAR");
		btnSimular.setBorderPainted(false);
		btnSimular.setBackground(new Color(34, 139, 34));
		btnSimular.setForeground(Color.WHITE);
		btnSimular.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnSimular.setBounds(399, 417, 105, 66);
		contentPane.add(btnSimular);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(new Color(0, 0, 0));
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnVolver.setBounds(0, 586, 909, 35);
		contentPane.add(btnVolver);
		
		btnGenerar = new JButton("GENERAR ENFRENTAMIENTOS");
		btnGenerar.setBorderPainted(false);
		btnGenerar.setBackground(new Color(34, 139, 34));
		btnGenerar.setForeground(Color.WHITE);
		btnGenerar.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnGenerar.setBounds(257, 494, 385, 66);
		contentPane.add(btnGenerar);
		
		lblJugador1 = new JLabel("Jugador 1");
		lblJugador1.setForeground(Color.WHITE);
		lblJugador1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador1.setBounds(81, 49, 83, 18);
		contentPane.add(lblJugador1);
		
		lblJugador2 = new JLabel("Jugador 2");
		lblJugador2.setForeground(Color.WHITE);
		lblJugador2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador2.setBounds(81, 176, 83, 18);
		contentPane.add(lblJugador2);
		
		lblJugador3 = new JLabel("Jugador 3");
		lblJugador3.setForeground(Color.WHITE);
		lblJugador3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador3.setBounds(81, 316, 83, 18);
		contentPane.add(lblJugador3);
		
		lblJugador4 = new JLabel("Jugador 4");
		lblJugador4.setForeground(Color.WHITE);
		lblJugador4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador4.setBounds(81, 442, 83, 18);
		contentPane.add(lblJugador4);
		
		lblJugador5 = new JLabel("Jugador 5");
		lblJugador5.setForeground(Color.WHITE);
		lblJugador5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador5.setBounds(766, 52, 86, 16);
		contentPane.add(lblJugador5);
		
		lblJugador6 = new JLabel("Jugador 6");
		lblJugador6.setForeground(Color.WHITE);
		lblJugador6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador6.setBounds(766, 177, 86, 16);
		contentPane.add(lblJugador6);
		
		lblJugador7 = new JLabel("Jugador 7");
		lblJugador7.setForeground(Color.WHITE);
		lblJugador7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador7.setBounds(766, 318, 86, 16);
		contentPane.add(lblJugador7);
		
		lblJugador8 = new JLabel("Jugador 8");
		lblJugador8.setForeground(Color.WHITE);
		lblJugador8.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador8.setBounds(766, 442, 86, 16);
		contentPane.add(lblJugador8);
		setLocationRelativeTo(null);
		
		lblSemifinalista1 = new JLabel("Semifinalista");
		lblSemifinalista1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblSemifinalista1.setForeground(Color.WHITE);
		lblSemifinalista1.setBounds(214, 146, 114, 18);
		contentPane.add(lblSemifinalista1);
		
		lblSemifinalista2 = new JLabel("Semifinalista");
		lblSemifinalista2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblSemifinalista2.setForeground(Color.WHITE);
		lblSemifinalista2.setBounds(214, 345, 114, 18);
		contentPane.add(lblSemifinalista2);
		
		lblSemifinalista3 = new JLabel("Semifinalista");
		lblSemifinalista3.setForeground(Color.WHITE);
		lblSemifinalista3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblSemifinalista3.setBounds(622, 146, 114, 18);
		contentPane.add(lblSemifinalista3);
		
		lblSemifinalista4 = new JLabel("Semifinalista");
		lblSemifinalista4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblSemifinalista4.setForeground(Color.WHITE);
		lblSemifinalista4.setBounds(622, 345, 114, 18);
		contentPane.add(lblSemifinalista4);
		
		lblFinalista1 = new JLabel("Finalista");
		lblFinalista1.setForeground(Color.WHITE);
		lblFinalista1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblFinalista1.setBounds(312, 249, 76, 18);
		contentPane.add(lblFinalista1);
		
		lblFinalista2 = new JLabel("Finalista");
		lblFinalista2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblFinalista2.setForeground(Color.WHITE);
		lblFinalista2.setBounds(514, 249, 76, 18);
		contentPane.add(lblFinalista2);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Jugadores.class.getResource("/img/fondoSoloNegro.jpg")));
		lblFondo.setBounds(0, 0, 909, 621);
		contentPane.add(lblFondo);
		setLocationRelativeTo(null);
	}
}
