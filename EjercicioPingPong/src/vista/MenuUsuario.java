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
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;

public class MenuUsuario extends JFrame {

	private JPanel contentPane;
	public JButton btnNoticias;
	public JButton btnResultados;
	public JButton btnInformacin;
	public JButton btnSimulacin;
	public JButton btnClasificacin;
	public JButton btnCerrarSesin;
	private JLabel lblNewLabel_2;
	private JTextArea Noticia1;
	private JTextArea Noticia2;

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
		setBounds(100, 100, 920, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/BannerOficial2.JPG")));
		lblNewLabel.setBounds(0, 0, 919, 245);
		contentPane.add(lblNewLabel);

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

		JButton btnNewButton = new JButton("Leer ");
		btnNewButton.setBounds(466, 587, 89, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/noticia2.jpg")));
		lblNewLabel_3.setBounds(466, 297, 184, 313);
		contentPane.add(lblNewLabel_3);

		JButton btnNewButton_1 = new JButton("Leer");
		btnNewButton_1.setBounds(0, 587, 89, 23);
		contentPane.add(btnNewButton_1);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MenuUsuario.class.getResource("/img/noticias1.jpg")));
		lblNewLabel_2.setBounds(0, 297, 224, 313);
		contentPane.add(lblNewLabel_2);

		JScrollPane js = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		js.setToolTipText("left");
		js.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2));
		js.setLocation(223, 297);
		js.setSize(211, 313);
		js.setVisible(true);
		contentPane.add(js);

		Noticia1 = new JTextArea();
		Noticia1.setWrapStyleWord(true);
		Noticia1.setLineWrap(true);
		Noticia1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		Noticia1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Noticia1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Noticia1.setBackground(Color.LIGHT_GRAY);
		Noticia1.setEditable(false);
		Noticia1.setText(
				"F\u00E1brica de medallistas chinos:\r\n\r\nGuo entrena al ping-pong desde hace dos a\u00F1os y acaba de convertirse en un jugador semiprofesional. Bajo esta nueva condici\u00F3n, a partir de ahora le tocar\u00E1 vivir en la residencia de la escuela de deportes de Shichahai, situada en el centro de Pek\u00EDn, donde entrenar\u00E1 casi a diario con otros chicos de su mismo nivel para cumplir su sue\u00F1o: ser campe\u00F3n del mundo. Shichahai es una de las ocho escuelas estatales de formaci\u00F3n de deportistas de \u00E9lite de la capital china. Fundada en 1958, est\u00E1 especializado en ping-pong, boxeo, taekwondo, golf, b\u00E1dminton, esgrima, gimnasia y artes marciales. De sus instalaciones han salido 46 campeones del mundo, siete de ellos oros ol\u00EDmpicos. Sus retratos y logros presiden las salas de entrenamiento, donde decenas de ni\u00F1os y adolescentes se esfuerzan a diario para un d\u00EDa ser como ellos bajo la atenta mirada de los entrenadores.");
		js.setViewportView(Noticia1);

		JScrollPane js2 = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		js2.setViewportBorder(new LineBorder(new Color(0, 0, 0), 2));
		js2.setLocation(656, 297);
		js2.setSize(209, 313);
		contentPane.add(js2);

		Noticia2 = new JTextArea();
		Noticia2.setWrapStyleWord(true);
		Noticia2.setLineWrap(true);
		Noticia2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		Noticia2.setEditable(false);
		Noticia2.setText(
				"Tercera concentraci\u00F3n juvenil en el Centro de Tecnificaci\u00F3n Infanta Cristina\r\n\r\nDel 16 al 21 de noviembre, los deportistas convocados realizar\u00E1n doble sesi\u00F3n de entrenamientos, que servir\u00E1n para continuar evaluando su progreso. Adem\u00E1s, todos los deportistas y t\u00E9cnicos de la RFETM han pasado una prueba serol\u00F3gica previa a su entrada en la concentraci\u00F3n.\r\n\r\nEl grupo juvenil convocado para esta concentraci\u00F3n est\u00E1 formado por los siguientes deportistas: Aimar Chamorro, Aitor Colina, Alberto Pomares, Ander Cepas, Daniel Berzosa, \u00C9ric Cintas, Diego Lillo, H\u00E9ctor Saavedra, Iker Gonz\u00E1lez, Jos\u00E9 Carlos Guillot, Marc Mir\u00F3, Marcos Garc\u00EDa, Mart\u00EDn Reche, Miguel N\u00FA\u00F1ez, Pablo Bobo y Rafael De Las Heras. Como t\u00E9cnicos responsables han acudido Rafa Taboada y Jes\u00FAs Cantero.");
		Noticia2.setBackground(Color.LIGHT_GRAY);
		js2.setViewportView(Noticia2);
		
		

	}
}
