package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorLogin;
import modelo.ModeloLogin;

import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/img/palas.png")));
		setTitle("MENU");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(34, 139, 34));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ModeloLogin mLogin = new ModeloLogin();
				Login login = new Login();
				ControladorLogin cLogin = new ControladorLogin(login, mLogin);
				dispose();
				cLogin.iniciar();
			}
		});

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Menu.class.getResource("/img/logoGrande.png")));
		lblNewLabel_1.setBounds(156, 83, 600, 399);
		contentPane.add(lblNewLabel_1);
		btnLogin.setBounds(156, 449, 600, 59);
		contentPane.add(btnLogin);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/img/fondoSoloNegro.jpg")));
		lblNewLabel.setBounds(0, 0, 909, 625);
		contentPane.add(lblNewLabel);
	}
}
