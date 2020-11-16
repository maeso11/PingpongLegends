package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import java.awt.Toolkit;

public class Noticias extends JFrame {

	private JPanel contentPane;
	public JButton Volver;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Noticias frame = new Noticias();
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
	public Noticias() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Noticias.class.getResource("/img/palas.png")));
		setTitle("NOTICIAS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Volver = new JButton("Volver");
		Volver.setBounds(751, 484, 89, 23);
		contentPane.add(Volver);
		
		JLabel lblNewLabel = new JLabel("noticiaClasificacion");
		lblNewLabel.setBounds(26, 99, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("noticiaJugadores");
		lblNewLabel_1.setBounds(26, 305, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("noticiaResultados");
		lblNewLabel_2.setBounds(459, 99, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NoticiaSimulacion");
		lblNewLabel_3.setBounds(459, 305, 114, 14);
		contentPane.add(lblNewLabel_3);
		setLocationRelativeTo(null);
	}
}
