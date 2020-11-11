package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.MenuUsuario;
import vista.Noticias;

public class ControladorNoticias implements ActionListener{

	Noticias noticias = new Noticias();
	public ControladorNoticias(Noticias noticias) {
		this.noticias=noticias;
		this.noticias.Volver.addActionListener(this);
	}
	
	
	public void iniciar() {
		noticias.setTitle("Noticias");
		noticias.setLocationRelativeTo(null);
		noticias.setVisible(true);
	}

	/**
	 * Vuelve al menú usuario
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		MenuUsuario m = new MenuUsuario();
		ControladorUser c = new ControladorUser(m);
		c.iniciar();
		noticias.setVisible(false);
		
	}
	
}
