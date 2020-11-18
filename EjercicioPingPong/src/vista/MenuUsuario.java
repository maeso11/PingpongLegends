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
import java.awt.Toolkit;
import java.awt.Label;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Scrollbar;
import java.awt.Button;
import java.awt.event.AdjustmentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class MenuUsuario extends JFrame {

	private JPanel contentPane;
	public JButton btnNoticias;
	public JButton btnResultados;
	public JButton btnInformacin;
	public JButton btnSimulacin;
	public JButton btnClasificacin;
	public JButton btnCerrarSesin;
	private JLabel lblNewLabel_2;
	
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuUsuario.class.getResource("/img/palas.png")));
		setTitle("MENU");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 650);
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
		btnCerrarSesin.setBounds(767, 243, 142, 39);
		contentPane.add(btnCerrarSesin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/BannerOficial2.JPG")));
		lblNewLabel.setBounds(0, 0, 919, 245);
		contentPane.add(lblNewLabel);
		
		Label label_1 = new Label("New label");
		label_1.setBounds(0, 0, 62, 22);
		contentPane.add(label_1);
		
		JTextPane txtpnFabricaDeMedallistas = new JTextPane();
		txtpnFabricaDeMedallistas.setBackground(new Color(192, 192, 192));
		txtpnFabricaDeMedallistas.setEditable(false);
		txtpnFabricaDeMedallistas.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 12));
		txtpnFabricaDeMedallistas.setText("Fabrica de medallistas chinos: Guo entrena al ping-pong desde hace dos a\u00F1os y acaba de convertirse en un jugador semiprofesional. Bajo esta nueva condici\u00F3n, a partir de ahora le tocar\u00E1 vivir en la residencia de la escuela de deportes de Shichahai, situada en el centro de Pek\u00EDn, donde entrenar\u00E1 casi a diario con otros chicos de su mismo nivel para cumplir su sue\u00F1o: ser campe\u00F3n del mundo. \r\n\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		txtpnFabricaDeMedallistas.setBounds(268, 331, 167, 290);
		contentPane.add(txtpnFabricaDeMedallistas);
		
		JTextPane txtpnTerceraConcentracinJuvenil = new JTextPane();

		txtpnTerceraConcentracinJuvenil.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 12));
		txtpnTerceraConcentracinJuvenil.setBackground(Color.LIGHT_GRAY);
		txtpnTerceraConcentracinJuvenil.setEditable(false);
		txtpnTerceraConcentracinJuvenil.setText("Tercera concentraci\u00F3n juvenil en el Centro de Tecnificaci\u00F3n Infanta Cristina:\r\n\r\nEl grupo juvenil regresa esta semana al Centro de Tecnificaci\u00F3n Infanta Cristina (Los Alc\u00E1zares, Murcia) para realizar una nueva concentraci\u00F3n de entrenamientos, continuando con la planificaci\u00F3n deportiva, elaborada espec\u00EDficamente para suplir la inactividad de competici\u00F3n internacional.\r\n\r\nDel 16 al 21 de noviembre, los deportistas convocados realizar\u00E1n doble sesi\u00F3n de entrenamientos, que servir\u00E1n para continuar evaluando su progreso. Adem\u00E1s, todos los deportistas y t\u00E9cnicos de la RFETM han pasado una prueba serol\u00F3gica previa a su entrada en la concentraci\u00F3n.");
		txtpnTerceraConcentracinJuvenil.setBounds(692, 331, 185, 290);
		contentPane.add(txtpnTerceraConcentracinJuvenil);
		
		JButton btnNewButton = new JButton("Leer");
		btnNewButton.setBounds(632, 599, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setLabelFor(txtpnTerceraConcentracinJuvenil);
		lblNewLabel_3.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/noticia2.jpg")));
		lblNewLabel_3.setBounds(513, 331, 200, 290);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Leer");
		btnNewButton_1.setBounds(180, 598, 89, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/noticias1.jpg")));
		lblNewLabel_2.setBounds(0, 331, 269, 290);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("ULTIMAS NOTICIAS!!");
		lblNewLabel_1_1.setForeground(Color.GREEN);
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(608, 276, 167, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				txtpnFabricaDeMedallistas.setText("Fabrica de medallistas chinos: Guo entrena al ping-pong desde hace dos a\u00F1os y acaba de convertirse en un jugador semiprofesional. Bajo esta nueva condici\u00F3n, a partir de ahora le tocar\u00E1 vivir en la residencia de la escuela de deportes de Shichahai, situada en el centro de Pek\u00EDn, donde entrenar\u00E1 casi a diario con otros chicos de su mismo nivel para cumplir su sue\u00F1o: ser campe\u00F3n del mundo. \r\n\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

			}
		});
		scrollBar.setBounds(434, 331, 23, 290);
		contentPane.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(882, 331, 17, 290);
		contentPane.add(scrollBar_1);
		setLocationRelativeTo(null);
		
		
	}

	
}
