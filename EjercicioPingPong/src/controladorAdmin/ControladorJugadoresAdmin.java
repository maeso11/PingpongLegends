package controladorAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import connection.EstableceConexion;
import modelo.Informacion;
import vista.InformacionJugador;
import vistaAdmin.InformacionJugadorAdmin;
import vistaAdmin.JugadoresAdmin;
import vistaAdmin.MenuAdmin;

public class ControladorJugadoresAdmin implements ActionListener {

	JugadoresAdmin jugadores = new JugadoresAdmin();

	public ControladorJugadoresAdmin(JugadoresAdmin jugadores) {
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
		jugadores.setTitle("Jugadores");
		jugadores.setLocationRelativeTo(null);
		jugadores.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Informacion datos = null;
		InformacionJugadorAdmin info = new InformacionJugadorAdmin();
		ControladorInformacionAdmin cInfo = new ControladorInformacionAdmin(info);
		EstableceConexion conexion = new EstableceConexion();
		if (e.getSource() == jugadores.btnVolver) {
			MenuAdmin mUser = new MenuAdmin();
			ControladorAdmin cUser = new ControladorAdmin(mUser);
			cUser.iniciar();
			jugadores.setVisible(false);

			// Información Carlos
		} else if (e.getSource() == jugadores.btnCarlos) {
			info.lblBandera.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/LILESPAÑA.png")));
			info.lblMarco.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/marcoTierB.png")));
			info.lblTier.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/tierBLIL.png")));
			datosAVista(datos, info, conexion, cInfo, "CARLOS");

			// Información David
		} else if (e.getSource() == jugadores.btnDavid) {
			info.lblBandera.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/Lilcorea.jpg")));
			info.lblMarco.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/marcoTierA.png")));
			info.lblTier.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/tierALIL.png")));
			datosAVista(datos, info, conexion, cInfo, "DAVID");

			// Informacion Jesus
		} else if (e.getSource() == jugadores.btnJesus) {
			info.lblBandera.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/LILESPAÑA.png")));
			info.lblMarco.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/marcoTierA.png")));
			info.lblTier.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/tierALIL.png")));
			datosAVista(datos, info, conexion, cInfo, "JESUS");

			// Informacion Antonio
		} else if (e.getSource() == jugadores.btnMaeso) {
			info.lblBandera.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/LILjamaica.jpg")));
			info.lblMarco.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/marcoTierB.png")));
			info.lblTier.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/tierC.png")));
			datosAVista(datos, info, conexion, cInfo, "ANTONIO");

			// Informacion Manuel
		} else if (e.getSource() == jugadores.btnManuel) {
			info.lblBandera.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/LILwilly2.png")));
			info.lblMarco.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/marcoTierA.png")));
			info.lblTier.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/tierALIL.png")));
			datosAVista(datos, info, conexion, cInfo, "MANUEL");

			// Informacion Paco
		} else if (e.getSource() == jugadores.btnPaco) {
			info.lblBandera.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/LILBRASIL.png")));
			info.lblMarco.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/marcoTierA.png")));
			info.lblTier.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/tierALIL.png")));
			datosAVista(datos, info, conexion, cInfo, "PACO");

			// Informacion Antonio Eduardo
		} else if (e.getSource() == jugadores.btnTony) {
			info.lblBandera.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/lilINDIA.png")));
			info.lblMarco.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/marcoTierB.png")));
			info.lblTier.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/tierBLIL.png")));
			datosAVista(datos, info, conexion, cInfo, "ANTONIO EDUARDO");

			// Informacion Victor
		} else if (e.getSource() == jugadores.btnVictor) {
			info.lblBandera.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/LILPORTUGAL.png")));
			info.lblMarco.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/marcoTierB.png")));
			info.lblTier.setIcon(new ImageIcon(InformacionJugadorAdmin.class.getResource("/img/tierBLIL.png")));
			datosAVista(datos, info, conexion, cInfo, "VICTOR");
		}

	}

	public void datosAVista(Informacion datos, InformacionJugadorAdmin info, EstableceConexion conexion,
			ControladorInformacionAdmin cCarlos, String nombre) {

		try {
			datos = conexion.devuelveDatos(nombre);
			info.txtAlias.setText(datos.getAlias());
			info.txtAtaque.setText(datos.getAtaque());
			info.txtCiudad.setText(datos.getCiudad());
			info.txtDefensa.setText(datos.getDefensa());
			info.txtEdad.setText(String.valueOf(datos.getEdad()));
			info.txtGolpeEstrella.setText(datos.getGolpeEstrella());
			info.txtLateralidad.setText(datos.getLateralidad());
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
