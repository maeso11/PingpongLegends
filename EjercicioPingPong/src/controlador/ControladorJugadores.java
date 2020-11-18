package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import connection.EstableceConexion;
import modelo.Informacion;
import vista.InformacionJugador;
import vista.Jugadores;
import vista.MenuUsuario;

public class ControladorJugadores implements ActionListener {

	Jugadores jugadores = new Jugadores();

	public ControladorJugadores(Jugadores jugadores) {
		super();
		this.jugadores = jugadores;
		this.jugadores.btnVolver.addActionListener(this);
		this.jugadores.btnCarlos.addActionListener(this);
		this.jugadores.btnDavid.addActionListener(this);
		this.jugadores.btnJesus.addActionListener(this);
		this.jugadores.btnMaeso.addActionListener(this);
		this.jugadores.btnManuel.addActionListener(this);
		this.jugadores.btnPaco.addActionListener(this);
		this.jugadores.btnTony.addActionListener(this);
		this.jugadores.btnVictor.addActionListener(this);
	}

	public void iniciar() {
		jugadores.setTitle("Equipos");
		jugadores.setLocationRelativeTo(null);
		jugadores.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Informacion datos = null;
		InformacionJugador info = new InformacionJugador();
		ControladorInformacion cInfo = new ControladorInformacion(info);
		EstableceConexion conexion = new EstableceConexion();
		if (e.getSource() == jugadores.btnVolver) {
			MenuUsuario mUser = new MenuUsuario();
			ControladorUser cUser = new ControladorUser(mUser);
			cUser.iniciar();
			jugadores.setVisible(false);

			// Información Carlos
		} else if (e.getSource() == jugadores.btnCarlos) {

			datosAVista(datos, info, conexion, cInfo, "CARLOS");

			// Información David
		} else if (e.getSource() == jugadores.btnDavid) {

			datosAVista(datos, info, conexion, cInfo, "DAVID");

			// Informacion Jesus
		} else if (e.getSource() == jugadores.btnJesus) {
			datosAVista(datos, info, conexion, cInfo, "JESUS");

			// Informacion Antonio
		} else if (e.getSource() == jugadores.btnMaeso) {
			datosAVista(datos, info, conexion, cInfo, "ANTONIO");

			// Informacion Manuel
		} else if (e.getSource() == jugadores.btnManuel) {
			datosAVista(datos, info, conexion, cInfo, "MANUEL");

			// Informacion Paco
		} else if (e.getSource() == jugadores.btnPaco) {
			datosAVista(datos, info, conexion, cInfo, "PACO");

			// Informacion Antonio Eduardo
		} else if (e.getSource() == jugadores.btnTony) {
			datosAVista(datos, info, conexion, cInfo, "ANTONIO EDUARDO");

			// Informacion Victor
		} else if (e.getSource() == jugadores.btnVictor) {
			datosAVista(datos, info, conexion, cInfo, "VICTOR");
		}

	}

	public void datosAVista(Informacion datos, InformacionJugador info, EstableceConexion conexion,
			ControladorInformacion cCarlos, String nombre) {

		try {
			datos = conexion.devuelveDatos(nombre);
			info.lblAlias.setText(datos.getAlias());
			info.lblAtaque.setText(datos.getAtaque());
			info.lblCiudad.setText(datos.getCiudad());
			info.lblDefensa.setText(datos.getDefensa());
			info.lblEdad.setText(String.valueOf(datos.getEdad()));
			info.lblGolpeEstrella.setText(datos.getGolpeEstrella());
			info.lblLateralidad.setText(datos.getLateralidad());
			info.lblLiga.setText(datos.getLiga());
			info.lblNombre.setText(datos.getNombre());
			info.lblGif.setIcon(new ImageIcon(InformacionJugador.class.getResource(datos.getGif())));

		} catch (ClassNotFoundException | SQLException | IOException e1) {
			e1.printStackTrace();
		}

		cCarlos.iniciar();
		jugadores.setVisible(false);
	}

}
