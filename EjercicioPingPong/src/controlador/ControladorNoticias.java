package controlador;

import vista.Noticias;

public class ControladorNoticias {
	
	Noticias noticias = new Noticias();
	public void iniciar() {
		noticias.setTitle("Noticias");
		noticias.setLocationRelativeTo(null);
		noticias.setVisible(true);
	}
}
