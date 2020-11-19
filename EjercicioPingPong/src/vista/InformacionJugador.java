
package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;

public class InformacionJugador extends JFrame {

	private JPanel contentPane;
	public JButton btnVolver;
	public JButton btnGrito;
	public JLabel lblNombre;
	public JLabel lblAlias;
	public JLabel lblEdad;
	public JLabel lblLiga;
	public JLabel lblLateralidad;
	public JLabel lblGolpeEstrella;
	public JLabel lblCiudad;
	public JLabel lblAtaque;
	public JLabel lblDefensa;
	public JLabel lblGif;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacionJugador frame = new InformacionJugador();
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
	public InformacionJugador() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(InformacionJugador.class.getResource("/img/palas.png")));
		setTitle("INFORMACIÓN JUGADOR");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 915, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		// Defensa
		lblDefensa = new JLabel("");
		lblDefensa.setForeground(new Color(34, 139, 34));
		lblDefensa.setBackground(new Color(34, 139, 34));
		lblDefensa.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblDefensa.setBounds(255, 399, 68, 14);
		contentPane.add(lblDefensa);
		// Edad
		lblEdad = new JLabel("");
		lblEdad.setForeground(new Color(34, 139, 34));
		lblEdad.setBackground(new Color(34, 139, 34));
		lblEdad.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblEdad.setBounds(255, 143, 98, 14);
		contentPane.add(lblEdad);

		JLabel lbl1 = new JLabel("NOMBRE:");
		lbl1.setForeground(Color.WHITE);
		lbl1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lbl1.setBounds(71, 55, 183, 14);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel("ALIAS:");
		lbl2.setForeground(Color.WHITE);
		lbl2.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lbl2.setBounds(71, 100, 183, 14);
		contentPane.add(lbl2);

		JLabel lbl5 = new JLabel("LIGA:");
		lbl5.setForeground(Color.WHITE);
		lbl5.setBackground(Color.BLACK);
		lbl5.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lbl5.setBounds(71, 279, 183, 14);
		contentPane.add(lbl5);

		btnGrito = new JButton("GRITO");
		btnGrito.setForeground(new Color(255, 255, 255));
		btnGrito.setBackground(new Color(34, 139, 34));
		btnGrito.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnGrito.setBounds(481, 429, 352, 39);
		contentPane.add(btnGrito);

		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setForeground(new Color(0, 0, 0));
		btnVolver.setBounds(0, 582, 909, 39);
		contentPane.add(btnVolver);

		JLabel lbl6 = new JLabel("LATELARIDAD:");
		lbl6.setForeground(Color.WHITE);
		lbl6.setBackground(Color.BLACK);
		lbl6.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lbl6.setBounds(71, 230, 174, 19);
		contentPane.add(lbl6);

		JLabel lbl4 = new JLabel("CIUDAD:");
		lbl4.setForeground(Color.WHITE);
		lbl4.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lbl4.setBounds(71, 184, 183, 14);
		contentPane.add(lbl4);

		JLabel lbl8 = new JLabel("ATAQUE:");
		lbl8.setForeground(Color.WHITE);
		lbl8.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lbl8.setBounds(71, 358, 183, 14);
		contentPane.add(lbl8);

		JLabel lbl9 = new JLabel("DEFENSA:");
		lbl9.setForeground(Color.WHITE);
		lbl9.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lbl9.setBounds(71, 394, 183, 19);
		contentPane.add(lbl9);

		JLabel lbl3 = new JLabel("EDAD:");
		lbl3.setForeground(Color.WHITE);
		lbl3.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lbl3.setBounds(71, 143, 183, 14);
		contentPane.add(lbl3);

		JLabel lbl7 = new JLabel("GOLPE ESTRELLA:");
		lbl7.setForeground(Color.WHITE);
		lbl7.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 15));
		lbl7.setBounds(71, 317, 202, 19);
		contentPane.add(lbl7);

		// Información de la bbdd

		// Nombre
		lblNombre = new JLabel("");
		lblNombre.setForeground(new Color(34, 139, 34));
		lblNombre.setBackground(new Color(34, 139, 34));
		lblNombre.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNombre.setBounds(255, 55, 183, 14);
		contentPane.add(lblNombre);
		// Alias
		lblAlias = new JLabel("");
		lblAlias.setForeground(new Color(34, 139, 34));
		lblAlias.setBackground(new Color(34, 139, 34));
		lblAlias.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblAlias.setBounds(255, 100, 149, 14);
		contentPane.add(lblAlias);
		// Liga
		lblLiga = new JLabel("");
		lblLiga.setForeground(new Color(34, 139, 34));
		lblLiga.setBackground(new Color(34, 139, 34));
		lblLiga.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblLiga.setBounds(255, 279, 149, 14);
		contentPane.add(lblLiga);
		// Lateralidad
		lblLateralidad = new JLabel("");
		lblLateralidad.setForeground(new Color(34, 139, 34));
		lblLateralidad.setBackground(new Color(34, 139, 34));
		lblLateralidad.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblLateralidad.setBounds(255, 235, 149, 14);
		contentPane.add(lblLateralidad);
		// Golpe Estrella
		lblGolpeEstrella = new JLabel("");
		lblGolpeEstrella.setForeground(new Color(34, 139, 34));
		lblGolpeEstrella.setBackground(new Color(34, 139, 34));
		lblGolpeEstrella.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblGolpeEstrella.setBounds(255, 320, 191, 14);
		contentPane.add(lblGolpeEstrella);
		// Ciudad
		lblCiudad = new JLabel("");
		lblCiudad.setForeground(new Color(34, 139, 34));
		lblCiudad.setBackground(new Color(34, 139, 34));
		lblCiudad.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblCiudad.setBounds(255, 184, 149, 14);
		contentPane.add(lblCiudad);
		// Ataque
		lblAtaque = new JLabel("");
		lblAtaque.setForeground(new Color(34, 139, 34));
		lblAtaque.setBackground(new Color(34, 139, 34));
		lblAtaque.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblAtaque.setBounds(255, 358, 68, 14);
		contentPane.add(lblAtaque);
		// Gif
		lblGif = new JLabel("");
		lblGif.setIcon(new ImageIcon(InformacionJugador.class.getResource("")));
		lblGif.setBounds(481, 55, 352, 376);
		contentPane.add(lblGif);

		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InformacionJugador.class.getResource("/img/fondoSoloNegro.jpg")));
		lblNewLabel.setBounds(0, 0, 909, 621);
		contentPane.add(lblNewLabel);
	}
}
