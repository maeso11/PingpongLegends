package controladorAdmin;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import controlador.ControladorLogin;
import modelo.ModeloLogin;
import vistaAdmin.AdminClasificacion;
import vistaAdmin.JugadoresAdmin;
import vista.Login;
import vistaAdmin.MenuAdmin;
import vistaAdmin.ResultadosAdmin;
import vistaAdmin.SimulacionAdmin;

public class ControladorAdmin implements ActionListener {
	MenuAdmin menuAdmin = new MenuAdmin();

	public ControladorAdmin(MenuAdmin menuAdmin) {
		super();
		this.menuAdmin = menuAdmin;
		this.menuAdmin.btnCerrarSesin.addActionListener(this);
		this.menuAdmin.btnClasificacin.addActionListener(this);
		this.menuAdmin.btnInformacin.addActionListener(this);
		this.menuAdmin.btnResultados.addActionListener(this);
		this.menuAdmin.btnSimulacin.addActionListener(this);
		this.menuAdmin.btnLeer1.addActionListener(this);
		this.menuAdmin.btnLeer2.addActionListener(this);
	}

	public void iniciar() {
		menuAdmin.setTitle("Menú Admin");
		menuAdmin.setLocationRelativeTo(null);
		menuAdmin.setVisible(true);
	}

	@Override
	/**
	 * Funcionalidad botones menú usuario
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuAdmin.btnCerrarSesin) {
			Login login = new Login();
			ModeloLogin mLogin = new ModeloLogin();
			ControladorLogin cLogin = new ControladorLogin(login, mLogin);
			cLogin.iniciar();
			menuAdmin.setVisible(false);
			JOptionPane.showMessageDialog(null, "Has cerrado sesión correctamente");

		} else if (e.getSource() == menuAdmin.btnClasificacin) {
			AdminClasificacion clasificacion = new AdminClasificacion();
			ControladorClasificacionAdmin cClasificacion = new ControladorClasificacionAdmin(clasificacion);
			try {
				cClasificacion.iniciar();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			menuAdmin.setVisible(false);

		} else if (e.getSource() == menuAdmin.btnResultados) {
			ResultadosAdmin resultados = new ResultadosAdmin();
			ControladorResultadosAdmin cResultados = new ControladorResultadosAdmin(resultados);
			cResultados.iniciar();
			menuAdmin.setVisible(false);

		} else if (e.getSource() == menuAdmin.btnSimulacin) {
			SimulacionAdmin simulacion = new SimulacionAdmin();
			ControladorSimulacionAdmin cSimulacion = new ControladorSimulacionAdmin(simulacion);
			cSimulacion.iniciar();
			menuAdmin.setVisible(false);

		} else if (e.getSource() == menuAdmin.btnInformacin) {
			JugadoresAdmin jugadores = new JugadoresAdmin();
			ControladorJugadoresAdmin cJugadores = new ControladorJugadoresAdmin(jugadores);
			cJugadores.iniciar();
			menuAdmin.setVisible(false);
		} else if (e.getSource() == menuAdmin.btnLeer1) {
			try {
				URI uri = new URI("https://www.rfetm.es/");
				Desktop dt = Desktop.getDesktop();
				dt.browse(uri);

			} catch (URISyntaxException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} else if (e.getSource() == menuAdmin.btnLeer2) {
			try {
				URI uri = new URI("https://www.ittf.com/");
				Desktop dt = Desktop.getDesktop();
				dt.browse(uri);

			} catch (URISyntaxException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
