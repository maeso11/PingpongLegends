package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Jugadores;
import vista.MenuUsuario;
import vista.Resultados;

public class ControladorResultados implements ActionListener{
	
	Resultados resultados= new Resultados();
	public ControladorResultados(Resultados resultados) {
		super();
		this.resultados = resultados;
		this.resultados.btnVolver.addActionListener(this);
		this.resultados.btnJugadores.addActionListener(this);
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
		}
	}
}
