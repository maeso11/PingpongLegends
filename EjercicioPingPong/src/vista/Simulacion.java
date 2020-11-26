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
	private JTextField txtPuntuacion9;
	private JTextField txtPuntuacion10;
	private JTextField txtPuntuacion11;
	private JTextField txtPuntuacion12;
	private JTextField txtPuntuacion13;
	private JTextField txtPuntuacion14;
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
		
		
		txtPuntuacion1 = new JTextField();
		txtPuntuacion1.setBounds(71, 79, 86, 20);
		contentPane.add(txtPuntuacion1);
		txtPuntuacion1.setColumns(10);
		
		txtPuntuacion2 = new JTextField();
		txtPuntuacion2.setBounds(71, 146, 86, 20);
		contentPane.add(txtPuntuacion2);
		txtPuntuacion2.setColumns(10);
		
		txtPuntuacion3 = new JTextField();
		txtPuntuacion3.setBounds(71, 352, 86, 20);
		contentPane.add(txtPuntuacion3);
		txtPuntuacion3.setColumns(10);
		
		txtPuntuacion4 = new JTextField();
		txtPuntuacion4.setBounds(71, 425, 86, 20);
		contentPane.add(txtPuntuacion4);
		txtPuntuacion4.setColumns(10);
		
		txtPuntuacion5 = new JTextField();
		txtPuntuacion5.setBounds(779, 79, 86, 20);
		contentPane.add(txtPuntuacion5);
		txtPuntuacion5.setColumns(10);
		
		txtPuntuacion6 = new JTextField();
		txtPuntuacion6.setBounds(779, 146, 86, 20);
		contentPane.add(txtPuntuacion6);
		txtPuntuacion6.setColumns(10);
		
		txtPuntuacion7 = new JTextField();
		txtPuntuacion7.setBounds(779, 352, 86, 20);
		contentPane.add(txtPuntuacion7);
		txtPuntuacion7.setColumns(10);
		
		txtPuntuacion8 = new JTextField();
		txtPuntuacion8.setBounds(779, 425, 86, 20);
		contentPane.add(txtPuntuacion8);
		txtPuntuacion8.setColumns(10);
		
		txtPuntuacion9 = new JTextField();
		txtPuntuacion9.setColumns(10);
		txtPuntuacion9.setBounds(200, 112, 86, 20);
		contentPane.add(txtPuntuacion9);
		
		txtPuntuacion10 = new JTextField();
		txtPuntuacion10.setColumns(10);
		txtPuntuacion10.setBounds(200, 385, 86, 20);
		contentPane.add(txtPuntuacion10);
		
		txtPuntuacion11 = new JTextField();
		txtPuntuacion11.setColumns(10);
		txtPuntuacion11.setBounds(650, 112, 86, 20);
		contentPane.add(txtPuntuacion11);
		
		txtPuntuacion12 = new JTextField();
		txtPuntuacion12.setColumns(10);
		txtPuntuacion12.setBounds(650, 384, 86, 20);
		contentPane.add(txtPuntuacion12);
		
		txtPuntuacion13 = new JTextField();
		txtPuntuacion13.setBounds(329, 249, 86, 20);
		contentPane.add(txtPuntuacion13);
		txtPuntuacion13.setColumns(10);
		
		txtPuntuacion14 = new JTextField();
		txtPuntuacion14.setBounds(521, 249, 86, 20);
		contentPane.add(txtPuntuacion14);
		txtPuntuacion14.setColumns(10);
		
		btnSimular = new JButton("SIMULAR");
		btnSimular.setBackground(new Color(34, 139, 34));
		btnSimular.setForeground(Color.WHITE);
		btnSimular.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnSimular.setBounds(337, 494, 227, 66);
		contentPane.add(btnSimular);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(new Color(0, 0, 0));
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnVolver.setBounds(0, 586, 909, 35);
		contentPane.add(btnVolver);
		
		btnGenerar = new JButton("GENERAR ENFRENTAMIENTOS");
		btnGenerar.setBackground(new Color(34, 139, 34));
		btnGenerar.setForeground(Color.WHITE);
		btnGenerar.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnGenerar.setBounds(39, 494, 227, 66);
		contentPane.add(btnGenerar);
		
		lblJugador1 = new JLabel("Jugador 1");
		lblJugador1.setForeground(Color.WHITE);
		lblJugador1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador1.setBounds(71, 44, 86, 20);
		contentPane.add(lblJugador1);
		
		lblJugador2 = new JLabel("Jugador 2");
		lblJugador2.setForeground(Color.WHITE);
		lblJugador2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador2.setBounds(71, 181, 86, 20);
		contentPane.add(lblJugador2);
		
		lblJugador3 = new JLabel("Jugador 3");
		lblJugador3.setForeground(Color.WHITE);
		lblJugador3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador3.setBounds(71, 317, 86, 20);
		contentPane.add(lblJugador3);
		
		lblJugador4 = new JLabel("Jugador 4");
		lblJugador4.setForeground(Color.WHITE);
		lblJugador4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador4.setBounds(71, 460, 86, 20);
		contentPane.add(lblJugador4);
		
		lblJugador5 = new JLabel("Jugador 5");
		lblJugador5.setForeground(Color.WHITE);
		lblJugador5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador5.setBounds(779, 44, 86, 16);
		contentPane.add(lblJugador5);
		
		lblJugador6 = new JLabel("Jugador 6");
		lblJugador6.setForeground(Color.WHITE);
		lblJugador6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador6.setBounds(779, 181, 86, 16);
		contentPane.add(lblJugador6);
		
		lblJugador7 = new JLabel("Jugador 7");
		lblJugador7.setForeground(Color.WHITE);
		lblJugador7.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador7.setBounds(779, 317, 86, 16);
		contentPane.add(lblJugador7);
		
		lblJugador8 = new JLabel("Jugador 8");
		lblJugador8.setForeground(Color.WHITE);
		lblJugador8.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblJugador8.setBounds(779, 460, 86, 16);
		contentPane.add(lblJugador8);
		setLocationRelativeTo(null);
		
		lblSemifinalista1 = new JLabel("Semifinalista 1");
		lblSemifinalista1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblSemifinalista1.setForeground(Color.WHITE);
		lblSemifinalista1.setBounds(200, 77, 86, 20);
		contentPane.add(lblSemifinalista1);
		
		lblSemifinalista2 = new JLabel("Semifinalista 2");
		lblSemifinalista2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblSemifinalista2.setForeground(Color.WHITE);
		lblSemifinalista2.setBounds(200, 350, 86, 20);
		contentPane.add(lblSemifinalista2);
		
		lblSemifinalista3 = new JLabel("Semifinalista 3");
		lblSemifinalista3.setForeground(Color.WHITE);
		lblSemifinalista3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblSemifinalista3.setBounds(650, 77, 86, 20);
		contentPane.add(lblSemifinalista3);
		
		lblSemifinalista4 = new JLabel("Semifinalista 4");
		lblSemifinalista4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblSemifinalista4.setForeground(Color.WHITE);
		lblSemifinalista4.setBounds(650, 350, 86, 20);
		contentPane.add(lblSemifinalista4);
		
		lblFinalista1 = new JLabel("Finalista 1");
		lblFinalista1.setForeground(Color.WHITE);
		lblFinalista1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblFinalista1.setBounds(329, 214, 86, 20);
		contentPane.add(lblFinalista1);
		
		lblFinalista2 = new JLabel("Finalista 2");
		lblFinalista2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblFinalista2.setForeground(Color.WHITE);
		lblFinalista2.setBounds(521, 214, 86, 20);
		contentPane.add(lblFinalista2);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Jugadores.class.getResource("/img/fondoSoloNegro.jpg")));
		lblFondo.setBounds(0, 0, 909, 621);
		contentPane.add(lblFondo);
		setLocationRelativeTo(null);
	}
}
