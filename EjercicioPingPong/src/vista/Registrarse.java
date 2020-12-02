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

public class Registrarse extends JFrame {

	private JPanel contentPane;
	public JTextField txtUsuario;
	public JTextField txtContraseña;
	public JTextField txtContraseña2;
	public JButton btnCrearUsuario;
	public JButton btnVolver;
	

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		btnCrearUsuario = new JButton("CREAR USUARIO");
		btnCrearUsuario.setForeground(Color.WHITE);
		btnCrearUsuario.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnCrearUsuario.setBorderPainted(false);
		btnCrearUsuario.setBackground(new Color(34, 139, 34));
		btnCrearUsuario.setBounds(62, 188, 350, 20);
		contentPane.add(btnCrearUsuario);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnVolver.setBounds(0, 268, 477, 31);
		contentPane.add(btnVolver);
		
		txtContraseña = new JTextField();
		txtContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(275, 130, 137, 20);
		contentPane.add(txtContraseña);
		
		txtContraseña2 = new JTextField();
		txtContraseña2.setHorizontalAlignment(SwingConstants.CENTER);
		txtContraseña2.setColumns(10);
		txtContraseña2.setBounds(275, 157, 137, 20);
		contentPane.add(txtContraseña2);
		
		txtUsuario = new JTextField();
		txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsuario.setBounds(275, 103, 137, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("CREA UNA CUENTA");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(171, 40, 137, 16);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CONFIRMAR CONTRASE\u00D1A:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(62, 158, 203, 16);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CONTRASE\u00D1A:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(158, 131, 107, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("USUARIO:");
		lblNewLabel_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(196, 104, 69, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registrarse.class.getResource("/img/fondoSoloNegro.jpg")));
		lblNewLabel.setBounds(0, 0, 477, 299);
		contentPane.add(lblNewLabel);
	}
}
