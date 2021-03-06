package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Login extends JFrame {

	public JPanel contentPane;
	public JTextField txtUser;
	public JPasswordField txtPassword;
	public JButton btnEntrar;
	public JButton btnVolver;
	public JButton btnRegistrarme;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/palas.png")));
		setResizable(false);
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		btnRegistrarme = new JButton("CREAR CUENTA");
		btnRegistrarme.setForeground(Color.WHITE);
		btnRegistrarme.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnRegistrarme.setBorderPainted(false);
		btnRegistrarme.setBackground(new Color(34, 139, 34));
		btnRegistrarme.setBounds(351, 464, 173, 23);
		contentPane.add(btnRegistrarme);

		JLabel lblNewLabel_2 = new JLabel("\u00BFEres nuevo en Ping Pong League?");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(284, 424, 309, 19);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/img/logoPeque\u00F1o2.png")));
		lblNewLabel_1.setBounds(41, 38, 200, 133);
		contentPane.add(lblNewLabel_1);

		txtUser = new JTextField();
		txtUser.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		txtUser.setBounds(442, 238, 173, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		txtPassword.setBounds(442, 298, 173, 20);
		contentPane.add(txtPassword);

		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(257, 236, 96, 20);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(257, 296, 135, 20);
		contentPane.add(lblContrasea);

		btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBorderPainted(false);
		btnEntrar.setBackground(new Color(34, 139, 34));
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));

		btnEntrar.setBounds(442, 354, 173, 23);
		contentPane.add(btnEntrar);

		btnVolver = new JButton("VOLVER");
		btnVolver.setBorderPainted(false);
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setForeground(new Color(0, 0, 0));
		btnVolver.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnVolver.setBounds(0, 582, 909, 39);
		contentPane.add(btnVolver);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/img/fondoPalas.jpg")));
		lblNewLabel.setBounds(-37, -27, 946, 648);
		contentPane.add(lblNewLabel);
	}
}
