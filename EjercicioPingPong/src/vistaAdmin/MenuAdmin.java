package vistaAdmin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import vista.MenuUsuario;

public class MenuAdmin extends JFrame {

	private JPanel contentPane;
	public JButton btnResultados;
	public JButton btnInformacin;
	public JButton btnSimulacin;
	public JButton btnClasificacin;
	public JButton btnCerrarSesin;
	public JButton btnLeer1;
	public JButton btnLeer2;
	private JLabel lblNewLabel_2;
	private JTextArea noticia1;
	private JTextArea noticia2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin frame = new MenuAdmin();
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
	public MenuAdmin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuUsuario.class.getResource("/img/palas.png")));
		setTitle("MENU");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		btnCerrarSesin = new JButton("CERRAR SESI\u00D3N");
		btnCerrarSesin.setBorderPainted(false);
		btnCerrarSesin.setForeground(new Color(255, 255, 255));
		btnCerrarSesin.setBackground(new Color(34, 139, 34));
		btnCerrarSesin.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnCerrarSesin.setBounds(736, 243, 178, 39);
		contentPane.add(btnCerrarSesin);

		btnResultados = new JButton("ESTAD\u00CDSTICAS");
		btnResultados.setBorderPainted(false);
		btnResultados.setForeground(new Color(255, 255, 255));
		btnResultados.setBackground(new Color(34, 139, 34));
		btnResultados.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnResultados.setBounds(0, 243, 174, 39);
		contentPane.add(btnResultados);

		btnSimulacin = new JButton("SIMULACI\u00D3N ");
		btnSimulacin.setBorderPainted(false);
		btnSimulacin.setForeground(new Color(255, 255, 255));
		btnSimulacin.setBackground(new Color(34, 139, 34));
		btnSimulacin.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnSimulacin.setBounds(368, 243, 174, 39);
		contentPane.add(btnSimulacin);

		btnClasificacin = new JButton("CLASIFICACI\u00D3N");
		btnClasificacin.setBorderPainted(false);
		btnClasificacin.setForeground(new Color(255, 255, 255));
		btnClasificacin.setBackground(new Color(34, 139, 34));
		btnClasificacin.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnClasificacin.setBounds(184, 243, 174, 39);
		contentPane.add(btnClasificacin);

		btnInformacin = new JButton("JUGADORES");
		btnInformacin.setBorderPainted(false);
		btnInformacin.setForeground(new Color(255, 255, 255));
		btnInformacin.setBackground(new Color(34, 139, 34));
		btnInformacin.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnInformacin.setBounds(552, 243, 174, 39);
		contentPane.add(btnInformacin);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/BannerOficial2.JPG")));
		lblNewLabel.setBounds(0, 0, 914, 245);
		contentPane.add(lblNewLabel);

		btnLeer2 = new JButton("Leer ");
		btnLeer2.setBorderPainted(false);
		btnLeer2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		btnLeer2.setForeground(new Color(255, 255, 255));
		btnLeer2.setBackground(new Color(34, 139, 34));
		btnLeer2.setBounds(466, 587, 89, 23);
		contentPane.add(btnLeer2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/noticia1.jpg")));
		lblNewLabel_3.setBounds(466, 297, 190, 313);
		contentPane.add(lblNewLabel_3);

		btnLeer1 = new JButton("Leer");
		btnLeer1.setBorderPainted(false);
		btnLeer1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		btnLeer1.setForeground(new Color(255, 255, 255));
		btnLeer1.setBackground(new Color(34, 139, 34));
		btnLeer1.setBounds(0, 587, 89, 23);
		contentPane.add(btnLeer1);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/noticias1.jpg")));
		lblNewLabel_2.setBounds(0, 297, 224, 313);
		contentPane.add(lblNewLabel_2);

		JScrollPane js = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		js.setToolTipText("left");
		js.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2));
		js.setLocation(223, 297);
		js.setSize(233, 313);
		js.setVisible(true);
		contentPane.add(js);
		
				noticia1 = new JTextArea();
				js.setViewportView(noticia1);
				noticia1.setLineWrap(true);
				noticia1.setWrapStyleWord(true);
				noticia1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				noticia1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
				noticia1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
				noticia1.setBackground(Color.LIGHT_GRAY);
				noticia1.setEditable(false);
				noticia1.setText(
						"FÁBRICA DE MEDALLISTAS CHINOS:\r\n\r\nGuo entrena al ping-pong desde "
						+ "hace dos a\u00F1os y acaba de convertirse en un  jugador semiprofesional. "
						+ "Bajo esta nueva condici\u00F3n, a partir de ahora le tocar\u00E1 vivir en la"
						+ " residencia de la escuela de deportes de Shichahai, situada en el centro de "
						+ "Pek\u00EDn, donde entrenar\u00E1 casi a diario con otros chicos de su mismo "
						+ "nivel para cumplir su sue\u00F1o: ser campe\u00F3n del mundo. Shichahai es "
						+ "una de las ocho escuelas estatales de formaci\u00F3n de deportistas de "
						+ "\u00E9lite de la capital china. Fundada en 1958, est\u00E1 especializado en "
						+ "ping-pong, boxeo, taekwondo, golf, b\u00E1dminton, esgrima, gimnasia y artes "
						+ "marciales. De sus instalaciones han salido 46 campeones del mundo, siete de "
						+ "ellos oros ol\u00EDmpicos. Sus retratos y logros presiden las salas de "
						+ "entrenamiento, donde decenas de ni\u00F1os y adolescentes se esfuerzan a "
						+ "diario para un d\u00EDa ser como ellos bajo la atenta mirada de los entrenadores.");

		JScrollPane js2 = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		js2.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2));
		js2.setLocation(656, 297);
		js2.setSize(248, 313);
		contentPane.add(js2);

		noticia2 = new JTextArea();
		noticia2.setWrapStyleWord(true);
		noticia2.setLineWrap(true);
		noticia2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		noticia2.setEditable(false);
		noticia2.setText(
				"TERCERA CONCENTRACIÓN JUVENIL EN EL CENTRO DE TECNIFICACIÓN INFANTA CRISTINA\r\n\r\nDel 16 al 21 de noviembre, los deportistas convocados realizar\u00E1n doble sesi\u00F3n de entrenamientos, que servir\u00E1n para continuar evaluando su progreso. Adem\u00E1s, todos los deportistas y t\u00E9cnicos de la RFETM han pasado una prueba serol\u00F3gica previa a su entrada en la concentraci\u00F3n.\r\n\r\nEl grupo juvenil convocado para esta concentraci\u00F3n est\u00E1 formado por los siguientes deportistas: Aimar Chamorro, Aitor Colina, Alberto Pomares, Ander Cepas, Daniel Berzosa, \u00C9ric Cintas, Diego Lillo, H\u00E9ctor Saavedra, Iker Gonz\u00E1lez, Jos\u00E9 Carlos Guillot, Marc Mir\u00F3, Marcos Garc\u00EDa, Mart\u00EDn Reche, Miguel N\u00FA\u00F1ez, Pablo Bobo y Rafael De Las Heras. Como t\u00E9cnicos responsables han acudido Rafa Taboada y Jes\u00FAs Cantero.");
		noticia2.setBackground(Color.LIGHT_GRAY);
		js2.setViewportView(noticia2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/fondoSoloNegro.jpg")));
		lblNewLabel_1.setBounds(0, 243, 914, 378);
		contentPane.add(lblNewLabel_1);
	}
}
