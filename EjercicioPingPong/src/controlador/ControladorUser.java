package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ModeloLogin;
import vista.Clasificacion;
import vista.Jugadores;
import vista.Login;
import vista.MenuUsuario;
import vista.Noticias;
import vista.Resultados;
import vista.Simulación;

public class ControladorUser implements ActionListener{
	MenuUsuario menuUser = new MenuUsuario();
	
	
	public ControladorUser(MenuUsuario menuUser) {
		super();
		this.menuUser = menuUser;
		this.menuUser.btnCerrarSesin.addActionListener(this);
		this.menuUser.btnNoticias.addActionListener(this);
		this.menuUser.btnClasificacin.addActionListener(this);
		this.menuUser.btnInformacin.addActionListener(this);
		this.menuUser.btnResultados.addActionListener(this);
		this.menuUser.btnSimulacin.addActionListener(this);
	}

	public void iniciar() {
		menuUser.setTitle("Menú Administrador");
		menuUser.setLocationRelativeTo(null);
		menuUser.setVisible(true);
	}

	@Override
	/**
	 * Funcionalidad botones menú usuario
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuUser.btnCerrarSesin) {
			Login login = new Login();
			ModeloLogin mLogin = new ModeloLogin();
			ControladorLogin cLogin = new ControladorLogin(login, mLogin);
			cLogin.iniciar();
			menuUser.setVisible(false);
			JOptionPane.showMessageDialog(null, "Has cerrado sesión correctamente");

		}else if (e.getSource() == menuUser.btnNoticias) {
			Noticias noticias = new Noticias();
			ControladorNoticias cNoticias = new ControladorNoticias();
			cNoticias.iniciar();
			menuUser.setVisible(false);

		}else if (e.getSource() == menuUser.btnClasificacin) {
			Clasificacion clasificacion = new Clasificacion();
			ControladorClasificacion cClasificacion = new ControladorClasificacion(clasificacion);
			cClasificacion.iniciar();
			menuUser.setVisible(false);
		
		}else if (e.getSource() == menuUser.btnResultados) {
			Resultados resultados = new Resultados();
			ControladorResultados cResultados = new ControladorResultados();
			cResultados.iniciar();
			menuUser.setVisible(false);
		
		}else if (e.getSource() == menuUser.btnSimulacin) {
			Simulación simulacion = new Simulación();
			ControladorSimulacion cSimulacion = new ControladorSimulacion();
			cSimulacion.iniciar();
			menuUser.setVisible(false);
		
		}else if (e.getSource() == menuUser.btnInformacin) {
			Jugadores equipos = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores();
			cJugadores.iniciar();
			menuUser.setVisible(false);
		}
	}
}
