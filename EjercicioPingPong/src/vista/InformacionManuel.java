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

public class InformacionManuel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InformacionManuel frame = new InformacionManuel();
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
	public InformacionManuel() {
		setTitle("MANUEL");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 820, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(24, 35, 104, 14);
		contentPane.add(lblNombre);
		
		JLabel lblAlias = new JLabel("ALIAS:");
		lblAlias.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAlias.setBounds(24, 80, 104, 14);
		contentPane.add(lblAlias);
		
		JLabel lblLiga = new JLabel("LIGA:");
		lblLiga.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLiga.setBounds(24, 213, 104, 14);
		contentPane.add(lblLiga);
		
		JButton btnNewButton = new JButton("GRITO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
					
					Clip sonido = AudioSystem.getClip();
					sonido.open(AudioSystem.getAudioInputStream(new File("src/sonido/AUDIO.wav")));
					
					sonido.start();
					
			        } catch (Exception u) {
			            u.printStackTrace();
			        }
			}
		});
		btnNewButton.setBounds(524, 387, 104, 39);
		contentPane.add(btnNewButton);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jugadores j = new Jugadores();
				j.setVisible(true);
			}
		});
		btnVolver.setBounds(692, 482, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel lblLatelaridad = new JLabel("LATELARIDAD:");
		lblLatelaridad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLatelaridad.setBounds(24, 260, 120, 14);
		contentPane.add(lblLatelaridad);
		
		JLabel lblCiudad = new JLabel("CIUDAD:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCiudad.setBounds(24, 168, 104, 14);
		contentPane.add(lblCiudad);
		
		JLabel lblGolpeEstrella = new JLabel("GOLPE ESTRELLA:");
		lblGolpeEstrella.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGolpeEstrella.setBounds(24, 304, 120, 14);
		contentPane.add(lblGolpeEstrella);
		
		JLabel lblEdad = new JLabel("EDAD:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdad.setBounds(24, 125, 104, 14);
		contentPane.add(lblEdad);
		
		JLabel lblJess = new JLabel("MANUEL");
		lblJess.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJess.setBounds(218, 35, 68, 14);
		contentPane.add(lblJess);
		
		JLabel lblMisil = new JLabel("MANOLAKO");
		lblMisil.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblMisil.setBounds(218, 80, 68, 14);
		contentPane.add(lblMisil);
		
		JLabel label_1 = new JLabel("20");
		label_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		label_1.setBounds(218, 125, 68, 14);
		contentPane.add(label_1);
		
		JLabel lblManzanares = new JLabel("BOLAÑOS");
		lblManzanares.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblManzanares.setBounds(218, 168, 120, 14);
		contentPane.add(lblManzanares);
		
		JLabel lblDiamante = new JLabel("DIAMANTE");
		lblDiamante.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblDiamante.setBounds(218, 213, 120, 14);
		contentPane.add(lblDiamante);
		
		JLabel lblDiestro = new JLabel("DIESTRO");
		lblDiestro.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblDiestro.setBounds(218, 260, 120, 14);
		contentPane.add(lblDiestro);
		
		JLabel lblMisilNoLook = new JLabel("EL FUHRER");
		lblMisilNoLook.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblMisilNoLook.setBounds(218, 304, 144, 14);
		contentPane.add(lblMisilNoLook);
		
		JLabel lblAtaque = new JLabel("ATAQUE:");
		lblAtaque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAtaque.setBounds(24, 356, 81, 14);
		contentPane.add(lblAtaque);
		
		JLabel lblDefensa = new JLabel("DEFENSA:");
		lblDefensa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDefensa.setBounds(24, 397, 81, 14);
		contentPane.add(lblDefensa);
		
		JLabel label = new JLabel("3/5");
		label.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		label.setBounds(218, 358, 68, 14);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("5/5");
		label_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		label_2.setBounds(218, 399, 68, 14);
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InformacionJesus.class.getResource("/gifs/ElBicho.gif")));
		lblNewLabel.setBounds(372, 35, 409, 341);
		contentPane.add(lblNewLabel);
	}
}
