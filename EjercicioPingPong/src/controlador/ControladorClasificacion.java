package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import connection.EstableceConexion;
import vista.Clasificacion;
import vista.MenuUsuario;

public class ControladorClasificacion implements ActionListener{
	
	Clasificacion clasificacion = new Clasificacion();
	
	public ControladorClasificacion(Clasificacion clasificacion) {
		super();
		this.clasificacion = clasificacion;
		this.clasificacion.btnVolver.addActionListener(this);
	}

	public void iniciar() throws Exception {
		clasificacion.setTitle("Clasificación");
		clasificacion.setLocationRelativeTo(null);
		asignaPuntos();
		clasificacion.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		MenuUsuario menuUser = new MenuUsuario();
		ControladorUser cUser = new ControladorUser(menuUser);
		cUser.iniciar();
		clasificacion.setVisible(false);
	}
	
	/**
	 * Asigna los puntos a la vista Clasificacion
	 * @throws Exception
	 */
	public void asignaPuntos() throws Exception {
		EstableceConexion conn = new EstableceConexion();
		try {
			clasificacion.lblPuntos1.setText(conn.devuelvePuntos("JESUS")+" PUNTOS");
			clasificacion.lblPuntos2.setText(conn.devuelvePuntos("MANUEL")+" PUNTOS");
			clasificacion.lblPuntos3.setText(conn.devuelvePuntos("DAVID")+" PUNTOS");
			clasificacion.lblPuntos4.setText(conn.devuelvePuntos("PACO")+" PUNTOS");
			clasificacion.lblPuntos5.setText(conn.devuelvePuntos("MAESO")+" PUNTOS");
			clasificacion.lblPuntos6.setText(conn.devuelvePuntos("VICTOR")+" PUNTOS");
			clasificacion.lblPuntos7.setText(conn.devuelvePuntos("CARLOS")+" PUNTOS");
			clasificacion.lblPuntos8.setText(conn.devuelvePuntos("TONY")+" PUNTOS");
		}catch(ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
			throw e;
		}
		
	}
}
