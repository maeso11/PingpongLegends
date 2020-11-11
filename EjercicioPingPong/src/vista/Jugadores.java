package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Jugadores extends JFrame {

	public JButton btnVolver;
	public JButton btnManuel;
	public JButton btnPaco;
	public JButton btnVictor;
	public JButton btnDavid;
	public JButton btnJesus;
	public JButton btnMaeso;
	public JButton btnTony;
	public JButton btnCarlos;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jugadores frame = new Jugadores();
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
	public Jugadores() {
		setTitle("JUGADORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1041, 691);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(926, 607, 89, 34);
		contentPane.add(btnVolver);
		
		JLabel lblManuel = new JLabel("MANUEL");
		lblManuel.setBounds(69, 32, 65, 23);
		contentPane.add(lblManuel);
		
		JLabel lblPaco = new JLabel("PACO");
		lblPaco.setBounds(304, 36, 46, 14);
		contentPane.add(lblPaco);
		
		JLabel lblVictor = new JLabel("VICTOR");
		lblVictor.setBounds(539, 36, 46, 14);
		contentPane.add(lblVictor);
		
		JLabel lblDavid = new JLabel("DAVID");
		lblDavid.setBounds(801, 36, 46, 14);
		contentPane.add(lblDavid);
		
		JLabel lblCarlos = new JLabel("CARLOS");
		lblCarlos.setBounds(69, 361, 65, 14);
		contentPane.add(lblCarlos);
		
		JLabel lblTony = new JLabel("TONY");
		lblTony.setBounds(304, 361, 46, 14);
		contentPane.add(lblTony);
		
		JLabel lblAlejandro = new JLabel("MAESO");
		lblAlejandro.setBounds(539, 361, 144, 14);
		contentPane.add(lblAlejandro);
		
		JLabel lblJesus = new JLabel("JESUS");
		lblJesus.setBounds(801, 361, 46, 14);
		contentPane.add(lblJesus);
		
		btnManuel = new JButton("INFORMACI\u00D3N");	
		btnManuel.setBounds(20, 270, 144, 40);
		contentPane.add(btnManuel);
		
		btnPaco = new JButton("INFORMACI\u00D3N");
		btnPaco.setBounds(250, 270, 156, 40);
		contentPane.add(btnPaco);
		
		btnVictor = new JButton("INFORMACI\u00D3N");
		btnVictor.setBounds(489, 270, 156, 40);
		contentPane.add(btnVictor);
		
		btnDavid = new JButton("INFORMACI\u00D3N");
		btnDavid.setBounds(741, 270, 155, 40);
		contentPane.add(btnDavid);
		
		btnJesus = new JButton("INFORMACI\u00D3N");
		btnJesus.setBounds(741, 589, 155, 40);
		contentPane.add(btnJesus);
		
		btnMaeso = new JButton("INFORMACI\u00D3N");
		btnMaeso.setBounds(489, 589, 156, 40);
		contentPane.add(btnMaeso);
		
		btnTony = new JButton("INFORMACI\u00D3N");
		btnTony.setBounds(250, 589, 156, 40);
		contentPane.add(btnTony);
		
		btnCarlos = new JButton("INFORMACI\u00D3N");
		btnCarlos.setBounds(20, 589, 144, 40);
		contentPane.add(btnCarlos);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Jugadores.class.getResource("/img/manuelTop.jpeg")));
		lblNewLabel.setBounds(20, 66, 144, 204);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Jugadores.class.getResource("/img/pacoTop.jpeg")));
		lblNewLabel_1.setBounds(250, 61, 205, 215);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Jugadores.class.getResource("/img/victorTop.jpeg")));
		lblNewLabel_2.setBounds(489, 65, 205, 207);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Jugadores.class.getResource("/img/DAVIDITOP.jpg")));
		lblNewLabel_3.setBounds(741, 63, 155, 207);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Jugadores.class.getResource("/img/carlosTop.jpeg")));
		lblNewLabel_4.setBounds(20, 386, 144, 207);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Jugadores.class.getResource("/img/tonyTop.jpeg")));
		lblNewLabel_5.setBounds(250, 386, 155, 207);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Jugadores.class.getResource("/img/maesoTOP.jpeg")));
		lblNewLabel_6.setBounds(489, 386, 155, 207);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Jugadores.class.getResource("/img/jesusTop.jpeg")));
		lblNewLabel_7.setBounds(741, 386, 155, 207);
		contentPane.add(lblNewLabel_7);
		setLocationRelativeTo(null);
	}
}
