package controlador;

import vista.Resultados;

public class ControladorResultados {
	
	Resultados resultados= new Resultados();
	public void iniciar() {
		resultados.setTitle("Resultados");
		resultados.setLocationRelativeTo(null);
		resultados.setVisible(true);
		
	}
}
