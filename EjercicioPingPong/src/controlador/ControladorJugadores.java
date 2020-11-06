package controlador;

import vista.Jugadores;

public class ControladorJugadores {

	Jugadores equipos = new Jugadores();

	public void iniciar() {
		equipos.setTitle("Equipos");
		equipos.setLocationRelativeTo(null);
		equipos.setVisible(true);

	}

}
