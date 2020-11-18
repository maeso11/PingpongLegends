package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Window.Type;
import java.awt.Toolkit;

public class Clasificacion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clasificacion frame = new Clasificacion();
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
	public Clasificacion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Clasificacion.class.getResource("/img/palas.png")));
		setTitle("CLASIFICACI\u00D3N");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(361, 559, 90, 25);
		contentPane.add(btnVolver);
		
		JTable table = new JTable();
		table.setEnabled(false);
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"JUGADOR", "PARTIDOS GANADOS", "PUNTOS"},
				{"Carlos", "3", "15"},
				{"David", "4", "20"},
				{"Jesus", "6", "40"},
				{"Maeso", "1", "12"},
				{"Manuel", "4", "52"},
				{"Paco", "0", "34"},
				{"Tony", "2", "14"},
				{"V\u00EDctor", "3", "26"},
			},
			new String[] {
				"Jugador", "Partidos Ganados", "Puntos"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(21);
		table.getColumnModel().getColumn(1).setPreferredWidth(129);
		table.setRowHeight(25);
		table.setBounds(49, 92, 497, 225);
		contentPane.add(table);
		
	}
}


