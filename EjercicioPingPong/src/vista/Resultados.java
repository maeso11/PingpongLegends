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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

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
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuUsuario menuusuario = new MenuUsuario();
				menuusuario.setVisible(true);
			}
		});
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(446, 313, 0, 0);
		contentPane.add(label_3);
		btnVolver.setBounds(793, 569, 106, 41);
		contentPane.add(btnVolver);
		
		JLabel lblResultados = new JLabel("RESULTADOS");
		lblResultados.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		lblResultados.setBounds(349, 11, 194, 24);
		contentPane.add(lblResultados);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Resultados.class.getResource("/img/LogoPEQUE\u00D1O.png")));
		lblNewLabel.setBounds(0, 11, 210, 133);
		contentPane.add(lblNewLabel);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					
				
			}
		});
		btnActualizar.setBounds(378, 542, 122, 56);
		contentPane.add(btnActualizar);
		
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
		
		JLabel lblNewLabel_3 = new JLabel("JES\u00DAS");
		lblNewLabel_3.setBounds(89, 444, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MANUEL");
		lblNewLabel_4.setBounds(282, 444, 57, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CARLOS");
		lblNewLabel_5.setBounds(533, 328, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("V\u00CDCTOR");
		lblNewLabel_6.setBounds(533, 444, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("PACO");
		lblNewLabel_7.setBounds(743, 328, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("MAESO");
		lblNewLabel_8.setBounds(743, 444, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel label = new JLabel("VS");
		label.setFont(new Font("Stencil", Font.PLAIN, 15));
		label.setBounds(186, 445, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("VS");
		label_1.setFont(new Font("Stencil", Font.PLAIN, 15));
		label_1.setBounds(644, 329, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("VS");
		label_2.setFont(new Font("Stencil", Font.PLAIN, 15));
		label_2.setBounds(644, 445, 46, 14);
		contentPane.add(label_2);
		
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(145, 325, 15, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(228, 325, 15, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(149, 441, 15, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(228, 441, 15, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(608, 325, 15, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(689, 325, 15, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(608, 441, 15, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(689, 441, 15, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Resultados.class.getResource("/img/ESPA\u00D1A.png")));
		lblNewLabel_9.setBounds(21, 319, 50, 33);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Resultados.class.getResource("/img/ESPA\u00D1A.png")));
		lblNewLabel_10.setBounds(446, 319, 50, 33);
		contentPane.add(lblNewLabel_10);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(780, 258, 46, 24);
		contentPane.add(label_4);
		
		JButton btnTorneoPrimavera = new JButton("TORNEO PRIMAVERA 2021");
		btnTorneoPrimavera.setBounds(663, 94, 185, 50);
		contentPane.add(btnTorneoPrimavera);
		
		JLabel lblMsTorneos = new JLabel("M\u00C1S TORNEOS");
		lblMsTorneos.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblMsTorneos.setBounds(697, 66, 151, 32);
		contentPane.add(lblMsTorneos);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Resultados.class.getResource("/img/ESPA\u00D1A.png")));
		lblNewLabel_11.setBounds(349, 433, 50, 33);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Resultados.class.getResource("/img/ESPA\u00D1A.png")));
		lblNewLabel_12.setBounds(21, 433, 100, 33);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNovedades = new JLabel("NOVEDADES");
		lblNovedades.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNovedades.setBounds(465, 75, 106, 14);
		contentPane.add(lblNovedades);
		
		JButton btnNewButton = new JButton("NOTICIAS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuUsuario menuusuario= new MenuUsuario();
				menuusuario.setVisible(true);
			}
		});
		btnNewButton.setBounds(431, 94, 171, 50);
		contentPane.add(btnNewButton);
		
		JButton btnJugadores = new JButton("JUGADORES");
		btnJugadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jugadores jugadores = new Jugadores();
				jugadores.setVisible(true);
			}
		});
		btnJugadores.setBounds(220, 95, 157, 48);
		contentPane.add(btnJugadores);
		
		JLabel lblInformacin = new JLabel("INFORMACI\u00D3N");
		lblInformacin.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblInformacin.setBounds(236, 71, 122, 23);
		contentPane.add(lblInformacin);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(349, 328, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(Resultados.class.getResource("/img/INIDA.png")));
		lblNewLabel_14.setBounds(349, 319, 50, 33);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(Resultados.class.getResource("/img/PORTUGAL.png")));
		lblNewLabel_15.setBounds(450, 433, 50, 33);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(Resultados.class.getResource("/img/descarga.png")));
		lblNewLabel_16.setBounds(798, 317, 50, 35);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(Resultados.class.getResource("/img/ESPA\u00D1A.png")));
		lblNewLabel_17.setBounds(798, 433, 50, 33);
		contentPane.add(lblNewLabel_17);
		setLocationRelativeTo(null);
	}
}
