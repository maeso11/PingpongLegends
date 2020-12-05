package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class Registrarse extends JFrame {

	private JPanel contentPane;
	public JTextField txtUsuario;
	public JButton btnCrearUsuario;
	public JButton btnVolver;
	public JPasswordField txtContraseña;
	public JPasswordField txtContraseña2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse frame = new Registrarse();
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
	public Registrarse() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registrarse.class.getResource("/img/palas.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		txtContraseña2 = new JPasswordField();
		txtContraseña2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		txtContraseña2.setBounds(285, 152, 137, 20);
		contentPane.add(txtContraseña2);

		txtContraseña = new JPasswordField();
		txtContraseña.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		txtContraseña.setBounds(285, 125, 137, 20);
		contentPane.add(txtContraseña);

		btnCrearUsuario = new JButton("CREAR USUARIO");
		btnCrearUsuario.setForeground(Color.WHITE);
		btnCrearUsuario.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnCrearUsuario.setBorderPainted(false);
		btnCrearUsuario.setBackground(new Color(34, 139, 34));
		btnCrearUsuario.setBounds(52, 188, 370, 20);
		contentPane.add(btnCrearUsuario);

		btnVolver = new JButton("VOLVER");
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnVolver.setBounds(0, 268, 477, 31);
		contentPane.add(btnVolver);

		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		txtUsuario.setBounds(285, 98, 137, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblNewLabel_1_2 = new JLabel("CREAR CUENTA NUEVA");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(147, 35, 186, 18);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_1_1 = new JLabel("CONFIRMAR CONTRASE\u00D1A:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(52, 153, 223, 18);
		contentPane.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1 = new JLabel("CONTRASE\u00D1A:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(157, 126, 118, 18);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1 = new JLabel("USUARIO:");
		lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(199, 99, 76, 18);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registrarse.class.getResource("/img/fondoSoloNegro.jpg")));
		lblNewLabel.setBounds(0, 0, 477, 299);
		contentPane.add(lblNewLabel);
	}
}
