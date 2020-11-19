package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;

public class Simulacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado1;
	private JTextField txtResultado2;
	private JTextField txtResultado3;
	private JTextField txtResultado4;
	private JTextField txtResultado5;
	private JTextField txtResultado6;
	private JTextField txtResultado7;
	private JTextField txtResultado8;
	public JButton btnSimular;
	public JButton btnVolver;

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
		
		
		txtResultado1 = new JTextField();
		txtResultado1.setBounds(71, 79, 86, 20);
		contentPane.add(txtResultado1);
		txtResultado1.setColumns(10);
		
		txtResultado2 = new JTextField();
		txtResultado2.setBounds(71, 146, 86, 20);
		contentPane.add(txtResultado2);
		txtResultado2.setColumns(10);
		
		txtResultado3 = new JTextField();
		txtResultado3.setBounds(71, 354, 86, 20);
		contentPane.add(txtResultado3);
		txtResultado3.setColumns(10);
		
		txtResultado4 = new JTextField();
		txtResultado4.setBounds(71, 424, 86, 20);
		contentPane.add(txtResultado4);
		txtResultado4.setColumns(10);
		
		txtResultado5 = new JTextField();
		txtResultado5.setBounds(779, 79, 86, 20);
		contentPane.add(txtResultado5);
		txtResultado5.setColumns(10);
		
		txtResultado6 = new JTextField();
		txtResultado6.setBounds(779, 146, 86, 20);
		contentPane.add(txtResultado6);
		txtResultado6.setColumns(10);
		
		txtResultado7 = new JTextField();
		txtResultado7.setBounds(779, 354, 86, 20);
		contentPane.add(txtResultado7);
		txtResultado7.setColumns(10);
		
		txtResultado8 = new JTextField();
		txtResultado8.setBounds(779, 424, 86, 20);
		contentPane.add(txtResultado8);
		txtResultado8.setColumns(10);
		
		btnSimular = new JButton("SIMULAR");
		btnSimular.setBounds(337, 494, 227, 66);
		contentPane.add(btnSimular);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(717, 543, 97, 25);
		contentPane.add(btnVolver);
		
		JButton btnGenerar = new JButton("GENERAR ENFRENTAMIENTOS");
		btnGenerar.setBounds(39, 494, 227, 66);
		contentPane.add(btnGenerar);
		
		JLabel lblJugador1 = new JLabel("");
		lblJugador1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJugador1.setBounds(71, 44, 86, 16);
		contentPane.add(lblJugador1);
		
		JLabel lblJugador2 = new JLabel("");
		lblJugador2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJugador2.setBounds(71, 181, 86, 16);
		contentPane.add(lblJugador2);
		
		JLabel lblJugador3 = new JLabel("");
		lblJugador3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJugador3.setBounds(71, 317, 86, 16);
		contentPane.add(lblJugador3);
		
		JLabel lblJugador4 = new JLabel("");
		lblJugador4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJugador4.setBounds(71, 457, 86, 16);
		contentPane.add(lblJugador4);
		
		JLabel lblJugador5 = new JLabel("");
		lblJugador5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJugador5.setBounds(779, 44, 86, 16);
		contentPane.add(lblJugador5);
		
		JLabel lblJugador6 = new JLabel("");
		lblJugador6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJugador6.setBounds(779, 181, 86, 16);
		contentPane.add(lblJugador6);
		
		JLabel lblJugador7 = new JLabel("");
		lblJugador7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJugador7.setBounds(779, 317, 86, 16);
		contentPane.add(lblJugador7);
		
		JLabel lblJugador8 = new JLabel("");
		lblJugador8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblJugador8.setBounds(779, 457, 86, 16);
		contentPane.add(lblJugador8);
		setLocationRelativeTo(null);
	}
}
