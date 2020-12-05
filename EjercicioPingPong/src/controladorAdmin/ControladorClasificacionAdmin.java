package controladorAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.EstableceConexion;
import vistaAdmin.AdminClasificacion;
import vista.Clasificacion;
import vistaAdmin.MenuAdmin;

public class ControladorClasificacionAdmin implements ActionListener {

	AdminClasificacion cAdmin = new AdminClasificacion();
	Clasificacion c = new Clasificacion();
	EstableceConexion conn = new EstableceConexion();

	public ControladorClasificacionAdmin(AdminClasificacion clasificacion) {
		super();
		this.cAdmin = clasificacion;
		this.cAdmin.btnVolver.addActionListener(this);
		this.cAdmin.btnActualizar.addActionListener(this);
	}

	public void iniciar() throws Exception {
		cAdmin.setTitle("Clasificación");
		cAdmin.setLocationRelativeTo(null);
		asignaPuntos();
		cAdmin.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cAdmin.btnVolver) {
			MenuAdmin menuAdmin = new MenuAdmin();
			ControladorAdmin ca = new ControladorAdmin(menuAdmin);
			ca.iniciar();
			cAdmin.setVisible(false);
		} else if (e.getSource() == cAdmin.btnActualizar) {
			try {
				actualizaPuntos();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

	}

	/**
	 * Asigna los puntos a la vista Clasificacion
	 * 
	 * @throws Exception
	 */
	public void asignaPuntos() throws Exception {
		try {
			cAdmin.txtPuntos1.setText(String.valueOf(conn.devuelvePuntos("JESUS")));
			cAdmin.txtPuntos2.setText(String.valueOf(conn.devuelvePuntos("MANUEL")));
			cAdmin.txtPuntos3.setText(String.valueOf(conn.devuelvePuntos("DAVID")));
			cAdmin.txtPuntos4.setText(String.valueOf(conn.devuelvePuntos("PACO")));
			cAdmin.txtPuntos5.setText(String.valueOf(conn.devuelvePuntos("MAESO")));
			cAdmin.txtPuntos6.setText(String.valueOf(conn.devuelvePuntos("VICTOR")));
			cAdmin.txtPuntos7.setText(String.valueOf(conn.devuelvePuntos("CARLOS")));
			cAdmin.txtPuntos8.setText(String.valueOf(conn.devuelvePuntos("TONY")));
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * Actualiza los puntos en la bbdd
	 * 
	 * @throws Exception
	 */
	public void actualizaPuntos() throws Exception {
		try {
			conn.actualizaPuntos((Integer.valueOf(cAdmin.txtPuntos1.getText())), "JESUS");
			conn.actualizaPuntos((Integer.valueOf(cAdmin.txtPuntos2.getText())), "MANUEL");
			conn.actualizaPuntos((Integer.valueOf(cAdmin.txtPuntos3.getText())), "DAVID");
			conn.actualizaPuntos((Integer.valueOf(cAdmin.txtPuntos4.getText())), "PACO");
			conn.actualizaPuntos((Integer.valueOf(cAdmin.txtPuntos5.getText())), "MAESO");
			conn.actualizaPuntos((Integer.valueOf(cAdmin.txtPuntos6.getText())), "VICTOR");
			conn.actualizaPuntos((Integer.valueOf(cAdmin.txtPuntos7.getText())), "CARLOS");
			conn.actualizaPuntos((Integer.valueOf(cAdmin.txtPuntos8.getText())), "TONY");
			JOptionPane.showMessageDialog(null, "Los datos se han actualizado.");
		} catch (NumberFormatException | ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
			throw e;
		}

	}
}
