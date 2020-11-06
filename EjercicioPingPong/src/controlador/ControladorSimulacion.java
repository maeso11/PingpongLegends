package controlador;

import vista.Simulación;

public class ControladorSimulacion {
	
	Simulación simulacion = new Simulación();
	
	public void iniciar() {
		simulacion.setTitle("Ver Partido");
		simulacion.setLocationRelativeTo(null);
		simulacion.setVisible(true);
		
	}
}
