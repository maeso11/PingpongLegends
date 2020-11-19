package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ModeloLogin;
import vista.Clasificacion;
import vista.Jugadores;
import vista.Login;
import vista.MenuUsuario;
import vista.Resultados;
import vista.Simulacion;

public class ControladorUser implements ActionListener{
	MenuUsuario menuUser = new MenuUsuario();
	
	
	public ControladorUser(MenuUsuario menuUser) {
		super();
		this.menuUser = menuUser;
		this.menuUser.btnCerrarSesin.addActionListener(this);
		this.menuUser.btnClasificacin.addActionListener(this);
		this.menuUser.btnInformacin.addActionListener(this);
		this.menuUser.btnResultados.addActionListener(this);
		this.menuUser.btnSimulacin.addActionListener(this);
	}

	public void iniciar() {
		menuUser.setTitle("Menú Usuario");
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

		}else if (e.getSource() == menuUser.btnClasificacin) {
			Clasificacion clasificacion = new Clasificacion();
			ControladorClasificacion cClasificacion = new ControladorClasificacion(clasificacion);
			cClasificacion.iniciar();
			menuUser.setVisible(false);
		
		}else if (e.getSource() == menuUser.btnResultados) {
			Resultados resultados = new Resultados();
			ControladorResultados cResultados = new ControladorResultados(resultados);
			cResultados.iniciar();
			menuUser.setVisible(false);
		
		}else if (e.getSource() == menuUser.btnSimulacin) {
			Simulacion simulacion = new Simulacion();
			ControladorSimulacion cSimulacion = new ControladorSimulacion(simulacion);
			cSimulacion.iniciar();
			menuUser.setVisible(false);
		
		}else if (e.getSource() == menuUser.btnInformacin) {
			Jugadores jugadores = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores(jugadores);
			cJugadores.iniciar();
			menuUser.setVisible(false);
		}
	}
}
