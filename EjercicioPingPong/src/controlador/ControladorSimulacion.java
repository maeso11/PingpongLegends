package controlador;

import vista.Simulaci�n;

public class ControladorSimulacion {
	
	Simulaci�n simulacion = new Simulaci�n();
	
	public void iniciar() {
		simulacion.setTitle("Ver Partido");
		simulacion.setLocationRelativeTo(null);
		simulacion.setVisible(true);
		
	}
}
