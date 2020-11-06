package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MenuUsuario extends JFrame {

	private JPanel contentPane;
	public JButton btnNoticias;
	public JButton btnResultados;
	public JButton btnInformacin;
	public JButton btnSimulacin;
	public JButton btnClasificacin;
	public JButton btnCerrarSesin;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuUsuario frame = new MenuUsuario();
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
	public MenuUsuario() {
		setTitle("MENU");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		btnNoticias = new JButton("NOTICIAS");
		btnNoticias.setBounds(0, 243, 142, 39);
		contentPane.add(btnNoticias);
		
		btnResultados = new JButton("RESULTADOS");
		btnResultados.setBounds(152, 243, 142, 39);
		contentPane.add(btnResultados);
		
		btnInformacin = new JButton("EQUIPOS");
		btnInformacin.setBounds(608, 243, 142, 39);
		contentPane.add(btnInformacin);
		
		btnSimulacin = new JButton("SIMULACI\u00D3N ");
		btnSimulacin.setBounds(456, 243, 142, 39);
		contentPane.add(btnSimulacin);
		
		btnClasificacin = new JButton("CLASIFICACI\u00D3N");
		btnClasificacin.setBounds(304, 243, 142, 39);
		contentPane.add(btnClasificacin);
		
		btnCerrarSesin = new JButton("CERRAR SESI\u00D3N");
		btnCerrarSesin.setBounds(760, 243, 142, 39);
		contentPane.add(btnCerrarSesin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/BannerOficial2.JPG")));
		lblNewLabel.setBounds(0, 0, 914, 245);
		contentPane.add(lblNewLabel);
		setLocationRelativeTo(null);
	}
}
