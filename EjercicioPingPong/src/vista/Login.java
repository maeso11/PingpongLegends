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

public class Login extends JFrame {

	public JPanel contentPane;
	public JTextField txtUser;
	public JPasswordField txtPassword;
	public JButton btnEntrar;
	public JButton btnVolver;
	

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
		setResizable(false);
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 702);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(206, 135, 173, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(206, 222, 173, 20);
		contentPane.add(txtPassword);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(44, 138, 76, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setBounds(44, 225, 96, 14);
		contentPane.add(lblContrasea);
		
		btnEntrar = new JButton("ENTRAR");
		
		btnEntrar.setBounds(434, 607, 89, 23);
		contentPane.add(btnEntrar);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(223, 607, 89, 23);
		contentPane.add(btnVolver);
	}
}
