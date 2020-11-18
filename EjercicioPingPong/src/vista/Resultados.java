package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Resultados extends JFrame {

	private JPanel contentPane;
	public JButton btnVolver;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultados frame = new Resultados();
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
	public Resultados() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Resultados.class.getResource("/img/palas.png")));
		setTitle("RESULTADOS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuUsuario menuusuario = new MenuUsuario();
				menuusuario.setVisible(true);
			}
		});
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(446, 313, 0, 0);
		contentPane.add(label_3);
		btnVolver.setBounds(793, 569, 106, 41);
		contentPane.add(btnVolver);
		
		JLabel lblResultados = new JLabel("RESULTADOS");
		lblResultados.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		lblResultados.setBounds(349, 11, 194, 24);
		contentPane.add(lblResultados);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Resultados.class.getResource("/img/LogoPEQUE\u00D1O.png")));
		lblNewLabel.setBounds(0, 11, 210, 133);
		contentPane.add(lblNewLabel);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					
				
			}
		});
		btnActualizar.setBounds(377, 517, 122, 56);
		contentPane.add(btnActualizar);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE JUGADR");
		lblNewLabel_1.setBounds(33, 230, 94, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblVs = new JLabel("VS");
		lblVs.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblVs.setBounds(164, 239, 46, 14);
		contentPane.add(lblVs);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(241, 224, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(33, 389, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(252, 328, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(497, 258, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(497, 313, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(690, 258, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(690, 313, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel label = new JLabel("VS");
		label.setFont(new Font("Stencil", Font.PLAIN, 15));
		label.setBounds(164, 328, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("VS");
		label_1.setFont(new Font("Stencil", Font.PLAIN, 15));
		label_1.setBounds(602, 258, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("VS");
		label_2.setFont(new Font("Stencil", Font.PLAIN, 15));
		label_2.setBounds(602, 313, 46, 14);
		contentPane.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(349, 124, 169, 20);
		contentPane.add(comboBox);
		comboBox.addItem("TORNEO INICIAL");
		comboBox.addItem("TORNEO INVIERNO");
		
		
		
		textField = new JTextField();
		textField.setBounds(139, 235, 15, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 235, 15, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 364, 15, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(195, 325, 15, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(573, 255, 15, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(633, 255, 15, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(573, 310, 15, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(633, 310, 15, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Resultados.class.getResource("/img/ESPA\u00D1A.png")));
		lblNewLabel_9.setBounds(441, 267, 46, 24);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Resultados.class.getResource("/img/ESPA\u00D1A.png")));
		lblNewLabel_10.setBounds(446, 313, 84, 24);
		contentPane.add(lblNewLabel_10);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(780, 258, 46, 24);
		contentPane.add(label_4);
		setLocationRelativeTo(null);
	}
}
