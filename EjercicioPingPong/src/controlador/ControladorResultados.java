package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Clasificacion;
import vista.Jugadores;
import vista.MenuUsuario;
import vista.Resultados;
import vista.Simulacion;

public class ControladorResultados implements ActionListener{
	
	Resultados resultados= new Resultados();
	public ControladorResultados(Resultados resultados) {
		super();
		this.resultados = resultados;
		this.resultados.btnVolver.addActionListener(this);
		this.resultados.btnJugadores.addActionListener(this);
		this.resultados.btnClasificacion.addActionListener(this);
		this.resultados.btnSimulacion.addActionListener(this);
		this.resultados.btnActualizar.addActionListener(this);
	}
	public void iniciar() {
		resultados.setTitle("Resultados");
		resultados.setLocationRelativeTo(null);
		resultados.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == resultados.btnVolver) {
			MenuUsuario mUsuario = new MenuUsuario();
			ControladorUser cUser = new ControladorUser(mUsuario);
			cUser.iniciar();
			resultados.setVisible(false);
		}else if (e.getSource() == resultados.btnJugadores) {
			Jugadores jugadores = new Jugadores();
			ControladorJugadores cJugadores = new ControladorJugadores(jugadores);
			cJugadores.iniciar();
		}else if (e.getSource() == resultados.btnClasificacion) {
			Clasificacion clasificacion = new Clasificacion();
			ControladorClasificacion cClas = new ControladorClasificacion(clasificacion);
			cClas.iniciar();
		}else if (e.getSource() == resultados.btnSimulacion) {
			Simulacion simulacion = new Simulacion();
			ControladorSimulacion cSimulacion = new ControladorSimulacion(simulacion);
			cSimulacion.iniciar();
		}else if (e.getSource() == resultados.btnActualizar) {
			
		}
	}
}
