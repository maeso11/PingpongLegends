package vistaAdmin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;

public class JugadoresAdmin extends JFrame {

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
					JugadoresAdmin frame = new JugadoresAdmin();
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
	public JugadoresAdmin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JugadoresAdmin.class.getResource("/img/palas.png")));
		setTitle("JUGADORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		btnVolver = new JButton("VOLVER");
		btnVolver.setBorderPainted(false);
		btnVolver.setForeground(new Color(0, 0, 0));
		btnVolver.setBackground(new Color(255, 165, 0));
		btnVolver.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		btnVolver.setBounds(0, 586, 909, 35);
		contentPane.add(btnVolver);

		JLabel lblManuel = new JLabel("MANUEL");
		lblManuel.setForeground(Color.WHITE);
		lblManuel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblManuel.setBounds(71, 12, 114, 19);
		contentPane.add(lblManuel);

		JLabel lblPaco = new JLabel("PACO");
		lblPaco.setForeground(Color.WHITE);
		lblPaco.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblPaco.setBounds(315, 12, 102, 19);
		contentPane.add(lblPaco);

		JLabel lblVictor = new JLabel("VICTOR");
		lblVictor.setForeground(Color.WHITE);
		lblVictor.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblVictor.setBounds(543, 12, 111, 19);
		contentPane.add(lblVictor);

		JLabel lblDavid = new JLabel("DAVID");
		lblDavid.setForeground(Color.WHITE);
		lblDavid.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblDavid.setBounds(780, 12, 104, 19);
		contentPane.add(lblDavid);

		JLabel lblCarlos = new JLabel("CARLOS");
		lblCarlos.setForeground(Color.WHITE);
		lblCarlos.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblCarlos.setBounds(305, 300, 112, 19);
		contentPane.add(lblCarlos);

		JLabel lblTony = new JLabel("TONY");
		lblTony.setForeground(Color.WHITE);
		lblTony.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblTony.setBounds(84, 300, 48, 19);
		contentPane.add(lblTony);

		JLabel lblAlejandro = new JLabel("MAESO");
		lblAlejandro.setForeground(Color.WHITE);
		lblAlejandro.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblAlejandro.setBounds(545, 300, 61, 19);
		contentPane.add(lblAlejandro);

		JLabel lblJesus = new JLabel("JESUS");
		lblJesus.setForeground(Color.WHITE);
		lblJesus.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		lblJesus.setBounds(783, 300, 101, 19);
		contentPane.add(lblJesus);

		btnManuel = new JButton("INFORMACI\u00D3N");
		btnManuel.setBorderPainted(false);
		btnManuel.setBackground(new Color(34, 139, 34));
		btnManuel.setForeground(Color.WHITE);
		btnManuel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnManuel.setBounds(30, 234, 155, 40);
		contentPane.add(btnManuel);

		btnPaco = new JButton("INFORMACI\u00D3N");
		btnPaco.setBorderPainted(false);
		btnPaco.setBackground(new Color(34, 139, 34));
		btnPaco.setForeground(Color.WHITE);
		btnPaco.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnPaco.setBounds(261, 234, 156, 40);
		contentPane.add(btnPaco);

		btnVictor = new JButton("INFORMACI\u00D3N");
		btnVictor.setBorderPainted(false);
		btnVictor.setBackground(new Color(34, 139, 34));
		btnVictor.setForeground(Color.WHITE);
		btnVictor.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnVictor.setBounds(498, 234, 156, 40);
		contentPane.add(btnVictor);

		btnDavid = new JButton("INFORMACI\u00D3N");
		btnDavid.setBorderPainted(false);
		btnDavid.setBackground(new Color(34, 139, 34));
		btnDavid.setForeground(Color.WHITE);
		btnDavid.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnDavid.setBounds(729, 234, 156, 40);
		contentPane.add(btnDavid);

		btnJesus = new JButton("INFORMACI\u00D3N");
		btnJesus.setBorderPainted(false);
		btnJesus.setBackground(new Color(34, 139, 34));
		btnJesus.setForeground(Color.WHITE);
		btnJesus.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnJesus.setBounds(729, 523, 155, 40);
		contentPane.add(btnJesus);

		btnMaeso = new JButton("INFORMACI\u00D3N");
		btnMaeso.setBorderPainted(false);
		btnMaeso.setBackground(new Color(34, 139, 34));
		btnMaeso.setForeground(Color.WHITE);
		btnMaeso.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnMaeso.setBounds(498, 523, 156, 40);
		contentPane.add(btnMaeso);

		btnTony = new JButton("INFORMACI\u00D3N");
		btnTony.setBorderPainted(false);
		btnTony.setBackground(new Color(34, 139, 34));
		btnTony.setForeground(Color.WHITE);
		btnTony.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnTony.setBounds(30, 523, 156, 40);
		contentPane.add(btnTony);

		btnCarlos = new JButton("INFORMACI\u00D3N");
		btnCarlos.setBorderPainted(false);
		btnCarlos.setBackground(new Color(34, 139, 34));
		btnCarlos.setForeground(Color.WHITE);
		btnCarlos.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 14));
		btnCarlos.setBounds(261, 523, 155, 40);
		contentPane.add(btnCarlos);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JugadoresAdmin.class.getResource("/img/manuelTop.jpeg")));
		lblNewLabel.setBounds(30, 39, 155, 204);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(JugadoresAdmin.class.getResource("/img/pacoTop.jpeg")));
		lblNewLabel_1.setBounds(261, 39, 156, 204);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(JugadoresAdmin.class.getResource("/img/victorTop.jpeg")));
		lblNewLabel_2.setBounds(498, 39, 156, 207);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(JugadoresAdmin.class.getResource("/img/DAVIDITOP.jpg")));
		lblNewLabel_3.setBounds(729, 39, 155, 207);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(JugadoresAdmin.class.getResource("/img/carlosTop.jpeg")));
		lblNewLabel_4.setBounds(261, 325, 156, 204);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(JugadoresAdmin.class.getResource("/img/tonyTop.jpeg")));
		lblNewLabel_5.setBounds(30, 325, 155, 204);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(JugadoresAdmin.class.getResource("/img/maesoTOP.jpeg")));
		lblNewLabel_6.setBounds(498, 325, 155, 204);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(JugadoresAdmin.class.getResource("/img/jesusTop.jpeg")));
		lblNewLabel_7.setBounds(729, 325, 155, 204);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(JugadoresAdmin.class.getResource("/img/fondoSoloNegro.jpg")));
		lblNewLabel_8.setBounds(0, 0, 909, 621);
		contentPane.add(lblNewLabel_8);
		setLocationRelativeTo(null);
	}
}
