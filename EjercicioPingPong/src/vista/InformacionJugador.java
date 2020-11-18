
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
		// Edad
		lblEdad = new JLabel("");
		lblEdad.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblEdad.setBounds(218, 125, 98, 14);
		contentPane.add(lblEdad);

		JLabel lbl1 = new JLabel("NOMBRE:");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl1.setBounds(24, 35, 104, 14);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel("ALIAS:");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl2.setBounds(24, 80, 104, 14);
		contentPane.add(lbl2);

		JLabel lbl5 = new JLabel("LIGA:");
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl5.setBounds(24, 213, 104, 14);
		contentPane.add(lbl5);

		btnGrito = new JButton("GRITO");
		btnGrito.setBounds(581, 434, 104, 39);
		contentPane.add(btnGrito);

		btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(786, 568, 89, 23);
		contentPane.add(btnVolver);

		JLabel lbl6 = new JLabel("LATELARIDAD:");
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl6.setBounds(24, 260, 120, 14);
		contentPane.add(lbl6);

		JLabel lbl4 = new JLabel("CIUDAD:");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl4.setBounds(24, 168, 104, 14);
		contentPane.add(lbl4);

		JLabel lbl8 = new JLabel("ATAQUE:");
		lbl8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl8.setBounds(24, 356, 81, 14);
		contentPane.add(lbl8);

		JLabel lbl9 = new JLabel("DEFENSA:");
		lbl9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl9.setBounds(24, 397, 81, 14);
		contentPane.add(lbl9);

		JLabel lbl3 = new JLabel("EDAD:");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl3.setBounds(24, 125, 104, 14);
		contentPane.add(lbl3);

		JLabel lbl7 = new JLabel("GOLPE ESTRELLA:");
		lbl7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl7.setBounds(24, 304, 120, 14);
		contentPane.add(lbl7);

		// Información de la bbdd

		// Nombre
		lblNombre = new JLabel("");
		lblNombre.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblNombre.setBounds(218, 35, 149, 14);
		contentPane.add(lblNombre);
		// Alias
		lblAlias = new JLabel("");
		lblAlias.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblAlias.setBounds(218, 80, 149, 14);
		contentPane.add(lblAlias);
		// Liga
		lblLiga = new JLabel("");
		lblLiga.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblLiga.setBounds(218, 213, 149, 14);
		contentPane.add(lblLiga);
		// Lateralidad
		lblLateralidad = new JLabel("");
		lblLateralidad.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblLateralidad.setBounds(218, 260, 149, 14);
		contentPane.add(lblLateralidad);
		// Golpe Estrella
		lblGolpeEstrella = new JLabel("");
		lblGolpeEstrella.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblGolpeEstrella.setBounds(218, 304, 191, 14);
		contentPane.add(lblGolpeEstrella);
		// Ciudad
		lblCiudad = new JLabel("");
		lblCiudad.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblCiudad.setBounds(218, 168, 149, 14);
		contentPane.add(lblCiudad);
		// Ataque
		lblAtaque = new JLabel("");
		lblAtaque.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblAtaque.setBounds(218, 358, 68, 14);
		contentPane.add(lblAtaque);
		// Defensa
		lblDefensa = new JLabel("");
		lblDefensa.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblDefensa.setBounds(218, 399, 68, 14);
		contentPane.add(lblDefensa);
		// Gif
		lblGif = new JLabel("");
		lblGif.setIcon(new ImageIcon(InformacionJugador.class.getResource("")));
		lblGif.setBounds(441, 35, 387, 376);
		contentPane.add(lblGif);
	}
}
